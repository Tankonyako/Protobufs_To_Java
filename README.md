## Protobufs To Java
**🌟 Allows you to convert Protobuf from CS:GO, Steam, TF2 to Java format for use.**
You need https://mvnrepository.com/artifact/com.google.protobuf/protobuf-java for use.
## Maven
#### Add JitPack repository
```xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>
```
#### Add package
```xml
<dependency>
    <groupId>com.github.Tankonyako</groupId>
    <artifactId>Protobufs_To_Java</artifactId>
    <version>-036ec0d698-1</version>
</dependency>
```
### If without maven (importing directly source code)

```xml
<dependency>
    <groupId>com.google.protobuf</groupId>
    <artifactId>protobuf-java</artifactId>
    <version>3.17.3</version>
</dependency>
```

There are already generated Protobufs, but you can also use your own ones or generate them yourself.

**⚠️To use Powershell scripts, you need to register `Set-ExecutionPolicy -ExecutionPolicy RemoteSigned -Scope CurrentUser` before using it in the **PowerShell** console from the admin.**

**📙 Execution order:**
1. Upload your protobufs.
2. Run prepare. ps1 (To install the Protobuf compiler)
3. Run fix_imports. ps1 (Fixes your. proto files)
4. Configure and run to_java. ps1 (If necessary, you need to change the $ JavaPackage variable)
5. Move files from the output folder to your project!