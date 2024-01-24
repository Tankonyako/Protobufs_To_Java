#!/bin/bash

# YOU MAY NEED TO ADD YOUR EXECUTION PERMISSIONS CODE HERE

SRC_DIR=$(pwd)
OUT_DIR="output"

JavaPackage="in.dragonbra.javasteam.protobufs"

protoc="protoc/bin/protoc"

rm -rf $OUT_DIR
mkdir $OUT_DIR

OUT_DIR_PACKAGE=$(echo $OUT_DIR/$JavaPackage | tr '.' '/')

games=("artifact" "csgo" "dota2" "steam" "tf2" "underlords" "webui")

for game in "${games[@]}"
do
    if [[ -d $game ]]
    then
        echo "------------------------------------------------"
        echo "Compiling $game..."

        out_dir_game="$OUT_DIR_PACKAGE/$game"

        mkdir -p $out_dir_game

        for file in $(find $game -name '*.proto')
        do
            $protoc --proto_path=. --java_out=$out_dir_game $file
        done
    fi
done
echo "------------------------------------------------"
echo "Fixing java files..."

for file in $(find $OUT_DIR -name '*.java')
do
    fileName=$(basename $file)
    gameName=$(dirname "${file#"$OUT_DIR/"}")
    gameName=$(echo $gameName|tr '/' '.')
    # split $nameName . and get the last element
    gameName=${gameName##*.}

    echo "Processing : $file"
    echo "Game Name : $gameName"
    echo "FileName  : $fileName"

    echo "package $JavaPackage.$gameName;\n\n" | cat - "$file" > temp && mv temp "$file"
done

echo "------------------------------------------------"
echo "All done!"