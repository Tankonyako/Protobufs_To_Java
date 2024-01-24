#!/bin/bash

games=("artifact" "steam" "csgo" "dota2" "google" "tf2" "underlords" "webui")

for game in "${games[@]}"
do
  if [ -d "$game" ]
  then
    echo "------------------------------------------------"
    echo "Fixing imports $game..."

    for file in $(find $game -type f -name '*.proto')
    do
        sed -i "" -e "s|import \"steamdatagram_auth_messages|import \"$game/steamdatagram_auth_messages|g" $file
        sed -i "" -e "s|import \"steammessages|import \"$game/steammessages|g" $file
        sed -i "" -e "s|import \"steamnetworking|import \"steam/steamnetworking|g" $file
        sed -i "" -e "s|import \"steamdatagram|import \"steam/steamdatagram|g" $file

        syntaxadded=0
        while read -r line
        do
            if [[ $line == syntax* ]]; then
                syntaxadded=1
            fi

            if [[ $line == import* && $line != import\ \"$game/* && $line != import\ \"steam* && $line != import\ \"google* ]]; then
                line1=${line/import \"/import \"$game/}
                sed -i "" -e "s|$line|$line1|g" $file
            fi
        done < $file

        if [ $syntaxadded -eq 0 ]; then
            sed -i "" "1s|^|syntax = \"proto2\";\n\n|" $file
        fi
    done
  fi
done