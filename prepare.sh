#!/bin/bash

# Set-ExecutionPolicy -ExecutionPolicy RemoteSigned -Scope CurrentUser (Not applicable in Bash)

protoc="https://github.com/protocolbuffers/protobuf/releases/download/v25.2/protoc-25.2-osx-universal_binary.zip"
protocarchive="protoc.zip"

# Download the protoc zip file using curl
curl -L "$protoc" -o "$protocarchive"

# Create a directory for protoc
mkdir -p "protoc"

# Extract the contents of the zip file to the protoc directory
unzip -o "$protocarchive" -d "protoc"

# Remove the downloaded zip file
rm -f "$protocarchive"