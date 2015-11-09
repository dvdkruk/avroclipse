# Avroclipse [![Drag to your running Eclipse workspace to install Avroclipse](https://marketplace.eclipse.org/sites/all/themes/solstice/_themes/solstice_marketplace/public/images/btn-install.png)](http://marketplace.eclipse.org/marketplace-client-intro?mpc_install=2600501) [![Build Status](https://travis-ci.org/dvdkruk/avroclipse.svg)](https://travis-ci.org/dvdkruk/avroclipse)
An Eclipse editor plugin for defining [Apache Avro IDL](https://avro.apache.org/docs/1.7.7/idl.html) files. 

Current version: [0.0.2](https://github.com/dvdkruk/avroclipse/releases/tag/0.0.2) (0.0.3 in dev)

Used techniques/tools:
- [Eclipse 4.5.1 (Mars)](http://www.eclipse.org/home/index.php)
- [Xtext 2.8.4](https://eclipse.org/Xtext/)
- Java 1.8
- [Apache Maven 3.3.3](https://maven.apache.org/)

License: [Apache License, Version 2.0](https://github.com/dvdkruk/avroclipse/blob/master/LICENSE)

## Install Avroclipse
The easiest way to install Avroclipse is to use the update site:
````
http://dvdkruk.github.io/avroclipse/updatesite/latest
````
To add the Avroclipse update site:

1. Go in your Eclipse instance to **Help > Install New Software...**. 
2. In the "Work with" section, click the **Add...** button. The "Add Repository" dialog box appears.
3. Fill the update site link shown above, in the location field and click **OK**.
4. Select the Avoclipse checkbox and click **Finish**.
5. After installation and restarting Eclipse, Avroclipse is ready to use. Avroclipse editor will automatically be shown when creating or opening a file with the *".avdl"* extension.

Another way to install Avroclipse is to use the Avroclipse updatesite zip file. [Click here](https://github.com/dvdkruk/avroclipse/releases) how to do this.

## Features
Here are some features of Avroclipse shown.
### Syntax Highlighting
![Syntax Highlighting](https://github.com/dvdkruk/avroclipse/blob/master/avroclipse.releng/syntax_highlighting.gif)
### Error Highlighting
![Error Highlighting](https://github.com/dvdkruk/avroclipse/blob/master/avroclipse.releng/error_highlighting.gif)
### Code Completion 
![Code Completion](https://github.com/dvdkruk/avroclipse/blob/master/avroclipse.releng/code_completion.gif)

## Getting Started (Development)
1. Download and install [Eclipse IDE for Java and DSL Developers](http://www.eclipse.org/downloads/packages/eclipse-ide-java-and-dsl-developers/marsr) for your OS.
2. Clone this repository.
3. Go to the **avroclipse.relang** directory and execute the following maven command:````mvn clean install````
4. Launch Eclipse and set the directory where you cloned the repository as workspace.
5. [Import existing  projects into your workspace](http://help.eclipse.org/juno/index.jsp?topic=%2Forg.eclipse.platform.doc.user%2Ftasks%2Ftasks-importproject.htm).
6. The six projects of Avroclipse should now be in your workspace ready to be edited.
7. To launch an Eclipse instance with Avroclipse; right click on the **avroclipse.ui** project and select **Run As > Eclipse Application**.

Note: Tycho Project Configurators 0.8.0.201409231215 plugin is needed to use the maven pom.xml file correctly in Eclipse.

### Alternatives/links
* [eclipse-avro](https://github.com/LangleyStudios/eclipse-avro)
* [INAETICS](http://www.inaetics.org/)
