import java.io.*;

public class SerializationTest {
    public static void main(String[] args) {
        // create some shapes
        Shape triangle = new Triangle("red", 3, 4, 5, 5, 5);
        Shape rectangle = new Rectangle("green", 5, 6);
        Shape circle = new Circle("blue", 2.5);
        Shape square = new Square("yellow", 4);

        // serialize the shapes to a file
        try {
            FileOutputStream fileOut = new FileOutputStream("shapes.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(triangle);
            out.writeObject(rectangle);
            out.writeObject(circle);
            out.writeObject(square);
            out.close();
            fileOut.close();
            System.out.println("Shapes were serialized to shapes.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }

        // deserialize the shapes from the file
        try {
            FileInputStream fileIn = new FileInputStream("shapes.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Shape deserializedTriangle = (Shape) in.readObject();
            Shape deserializedRectangle = (Shape) in.readObject();
            Shape deserializedCircle = (Shape) in.readObject();
            Shape deserializedSquare = (Shape) in.readObject();
            in.close();
            fileIn.close();
            System.out.println("Shapes were deserialized from shapes.ser");

            // print the deserialized shapes
            System.out.println("Deserialized Triangle: " + deserializedTriangle);
            System.out.println("Deserialized Rectangle: " + deserializedRectangle);
            System.out.println("Deserialized Circle: " + deserializedCircle);
            System.out.println("Deserialized Square: " + deserializedSquare);
        } catch (IOException i) {
            i.printStackTrace();
        } catch (ClassNotFoundException c) {
            System.out.println("Shape class not found");
            c.printStackTrace();
        }
    }
}
