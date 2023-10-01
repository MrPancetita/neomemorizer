# Neomemorizer Project for CONTOSO-HR 

ITIL Change Enablement powered by DevOps. Proof of Concept

Note about dev config.

{
    // Use IntelliSense to learn about possible attributes.
    // Hover to view descriptions of existing attributes.
    // For more information, visit: https://go.microsoft.com/fwlink/?linkid=830387
    "version": "0.2.0",
    "configurations": [
        {
            "type": "java",
            "name": "Current File",
            "request": "launch",
            "mainClass": "${file}"
        },
        {
            "type": "java",
            "name": "NeoMemorizer",
            "request": "launch",
            "mainClass": "com.contoso.neomemorizer.NeoMemorizerApplication",
            "projectName": "neomemorizer", 
            "vmArgs": "-Dfile.encoding=UTF-8"
        }

    ]
}

Note about dev config.

{
    // Use IntelliSense to learn about possible attributes.
    // Hover to view descriptions of existing attributes.
    // For more information, visit: https://go.microsoft.com/fwlink/?linkid=830387
    "version": "0.2.0",
    "configurations": [
        {
            "type": "java",
            "name": "Current File",
            "request": "launch",
            "mainClass": "${file}"
        },
        {
            "type": "java",
            "name": "NeoMemorizer",
            "request": "launch",
            "mainClass": "com.contoso.neomemorizer.NeoMemorizerApplication",
            "projectName": "neomemorizer", 
            "vmArgs": "-Dfile.encoding=UTF-8"
        }

    ]
}

Default config for launch.json:
{
    // Use IntelliSense to learn about possible attributes.
    // Hover to view descriptions of existing attributes.
    // For more information, visit: https://go.microsoft.com/fwlink/?linkid=830387
    "version": "0.2.0",
    "configurations": [
        {
            "type": "java",
            "name": "Current File",
            "request": "launch",
            "mainClass": "${file}"
        },
        {
            "type": "java",
            "name": "NeoMemorizerApplication",
            "request": "launch",
            "mainClass": "com.contoso.neomemorizer.NeoMemorizerApplication",
            "projectName": "neomemorizer"
        }
    ]
}