# YOU NEED TO WRITE IN POWERSHELL WINDOW CODE DOWN BELOW:
# Set-ExecutionPolicy -ExecutionPolicy RemoteSigned -Scope CurrentUser

$SRC_DIR = (Resolve-Path .\).Path
$OUT_DIR = "output"

$JavaPackage = "in.dragonbra.javasteam.protobufs"

$protoc = "protoc\bin\protoc.exe"

Remove-Item -Path $OUT_DIR -Recurse -Force -Confirm:$false
New-Item -ItemType Directory -path $OUT_DIR

$OUT_DIR_PACKaGE = $OUT_DIR + "\" + $JavaPackage.replace('.','\')

$games = @("artifact", "csgo", "dota2", "steam", "tf2", "underlords", "webui")
For ($i=0; $i -lt $games.Length; $i++)
{
    if (Test-Path -Path $games[$i])
    {
        $game = $games[$i]

        "------------------------------------------------"
        "Compiling " + $game + "..."

        $out_dir_game = $OUT_DIR_PACKaGE + "\" + $game

        New-Item -ItemType Directory -path $out_dir_game

        Get-ChildItem -Path $game -Filter *.proto -Recurse -File -Name| ForEach-Object {
            $file = $_
            $fileName = [System.IO.Path]::GetFileName($file)
            $fullpath = $game + "\" + $file

            & $protoc --proto_path=. --java_out=$out_dir_game $fullpath
        }
    }
}

"------------------------------------------------"
"Fixing java files..."
Get-ChildItem -Path $OUT_DIR -Filter *.java -Recurse -File -Name| ForEach-Object {
    $file = $_
    $fileName = [System.IO.Path]::GetFileName($file)

    $game = $file.replace(($JavaPackage.replace('.','\')),'')
    $game = $game.replace(("\" + $fileName),'')
    $game = $game.replace(("\"),'')

    $content = (Get-Content -path ($OUT_DIR + "\" + $file))

    $contentNew = "package " + $JavaPackage + "." + $game + ";`n"

    Set-Content ($OUT_DIR + "\" + $file) -value $contentNew, $content
}
"------------------------------------------------"
"All done!"