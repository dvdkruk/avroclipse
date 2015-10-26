# Avroclipse [![Build Status](https://travis-ci.org/dvdkruk/avroclipse.svg)](https://travis-ci.org/dvdkruk/avroclipse)
An Eclipse editor plugin for defining Apache Avro IDL files.

Current version: 0.0.1
Development version: 0.0.2

Used techniques/tools:
- Eclipse 4.5.1 (Mars)
- Xtext 2.8.4
- Java 1.8
- Apache Maven 3.3

License: Apache License, Version 2.0

## Install Avroclipse
The easiest way to install Avroclipse is to use the update site:
````
http://dvdkruk.github.io/avroclipse/updatesite/latest/
````
To add the Avroclipse update site:
1. Go in your Eclipse instance to **Help > Install New Software...**. 
2. In the "Work with" section, click the **Add...** button. The "Add Repository" dialog box appears.
3. Fill the update site link shown above, in the location field and click **OK**.
4. Select the Avoclipse checkbox and click **Finish**.
5. After installation and restarting Eclipse, Avroclipse is ready to use.

## Getting Started (Development)
1. Download and install [Eclipse IDE for Java and DSL Developers](http://www.eclipse.org/downloads/packages/eclipse-ide-java-and-dsl-developers/marsr) for your OS.
2. Clone this repository.
3. Go to the **avroclipse.relang** directory and execute the following maven command:````mvn clean install````
4. Launch Eclipse and set the directory where you cloned the repository as workspace.
5. [Import existing  projects into your workspace](http://help.eclipse.org/juno/index.jsp?topic=%2Forg.eclipse.platform.doc.user%2Ftasks%2Ftasks-importproject.htm).
6. The six projects of Avroclipse should now be in your workspace ready to be edited.
7. To launch an Eclipse instance with Avroclipse; right click on the **avroclipse.ui** project and select **Run As > Eclipse Application**.

### Alternatives/links
* [eclipse-avro](https://github.com/LangleyStudios/eclipse-avro)
* [INAETICS](http://www.inaetics.org/)
