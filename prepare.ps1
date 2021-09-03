# YOU NEED TO WRITE IN POWERSHELL WINDOW CODE DOWN BELOW:
# Set-ExecutionPolicy -ExecutionPolicy RemoteSigned -Scope CurrentUser

$protoc = "https://github.com/protocolbuffers/protobuf/releases/download/v3.18.0-rc2/protoc-3.18.0-rc-2-win32.zip"

$protocarchive = "protoc.zip"

Invoke-WebRequest $protoc -OutFile $protocarchive
New-Item -ItemType Directory -path "protoc"
Expand-Archive -LiteralPath $protocarchive -DestinationPath "protoc"
Remove-Item -Path $protocarchive -Force