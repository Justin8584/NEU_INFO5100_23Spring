# INFO5100 Final Project - ImageManager
ImageManager is a Java application that allows you to view image metadata and convert images to different formats.
This is also the Final Project for INFO5100 course Spring2023. 

## Getting Started
These instructions will get you a copy of the project up and running on your local machine.

## Prerequisites
Before you run the application, make sure you have the following installed on your computer:

* Java Development Kit (JDK) 8 or later
* Apache Maven 3.6.3 or later
* imageMagick
### Installing
To install the application, follow these steps:
1. install imageMagick
```
brew install imagemagick
```

2. Clone the repository: 
```
git clone https://github.com/<username>/imagemanager.git
```

3. Build the application:

```
cd imagemanager
mvn clean package
```

4. Run the application:

```
java --module-path ./javafx-sdk-17.0.7/lib --add-modules javafx.controls,javafx.fxml -jar target/ImageManager-1.0-SNAPSHOT.jar
```
The application window should appear.

### Note

There are some alternative methods to run the project:
- Run with Intellij or Vscode
  - Open the file `ImageManager/src/main/java/info5100/imagemanager/ImageManager.java`
  - You should find a "Run" button
- Use [javafx-maven-plugin](https://github.com/openjfx/javafx-maven-plugin)
  - download the source code of javafx-maven-plugin
  - Run the command `mvn install`
  - Compile the project with `mvn compile`
  - Run the project `mvn javafx:run`

## Usage
### Open an Image
To open an image, click the "Open" button and select an image file from your computer.

### View Image Metadata
After opening an image, you can view the image width and height, and image metadata in the "Camera" and "Location" text fields.

### Convert an Image
* To convert an image to a different format, select the desired format from the drop-down list, and click the "Convert" button.
* Support image format (.jpeg, .png, .bmp, .gif, .tiff)

### Save an Image
To save an image, click the "Save" button and select a location on your computer to save the image.

## Built With
* JavaFX - The UI framework used
* ImageMagick - Tool used for image processing
* Metadata Extractor - Library used for reading metadata info (location and camera) from images

## Authors
* Jingyi Chen 
  - Generate the structure of JavaFx GUI
  - ImplementImageManager.java for generate JavaFx Scene
  - Developer Tests in screenshots 
  - Implement ImageMangerController.java for load, convert, and save methods with load image info (width, height, camera, location)
  - Package the project to .jar file for running directly
* Jiading Zhou 
  - Generate the interface ImageManage Interface
  - Add MVC Design Pattern structure
  - Developer Tests in screenshots 
  - Update changes in JavaFx GUI, import more supported Image formats
  - Generate the .jar file for easily run.
  
## License
This project is licensed under the MIT License - see the LICENSE.md file for details.
