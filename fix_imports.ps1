$games = @("artifact", "steam", "csgo", "dota2", "google", "tf2", "underlords", "webui")

For ($i=0; $i -lt $games.Length; $i++)
{
    if (Test-Path -Path $games[$i])
    {
        $game = $games[$i]

        "------------------------------------------------"
        "Fixing imports " + $game + "..."

        Get-ChildItem -Path $game -Filter *.proto -Recurse -File -Name| ForEach-Object {
            $file = $_

            $fullpath = $game + "\" + $file

            $content = (Get-Content -path $fullpath)
            
            $content = $content.replace('import "steammessages','import "steam/steammessages')
            $content = $content.replace('import "steamnetworking','import "steam/steamnetworking')
            $content = $content.replace('import "steamdatagram','import "steam/steamdatagram')
            
            $syntaxadded = 0

            ForEach ($line in $($content -split "`n"))
            {
                if ($line.StartsWith('syntax'))
                {
                    $syntaxadded = 1
                }

                if ($line.StartsWith('import "') -And !$line.StartsWith('import "' + $game + "/") -And !$line.StartsWith('import "steam') -And !$line.StartsWith('import "google'))
                {
                    $line1 = $line.replace('import "','import "' + $game + "/")

                    $content = $content.replace($line, $line1)
                }
            }

            if ($syntaxadded -Eq 0)
            {
                $contentNew = "syntax = `"proto2`";`n`n"
                ForEach ($line in $($content -split "`n"))
                {
                    $contentNew += $line + "`n"
                }

                $content = $contentNew
            }

            $content | Set-Content -Path $fullpath
        }
    }
}