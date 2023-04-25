import java.io.File;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class XMLParser {
    public static void main(String[] args) {
        try {
            // Read the XML file
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            File inputFile = new File("/ex8/src/bookShelf.xml");
            Document doc = builder.parse(inputFile);

            // Loop through the books and print their title and author
            NodeList bookList = doc.getElementsByTagName("book");
            for (int i = 0; i < bookList.getLength(); i++) {
                Element book = (Element) bookList.item(i);
                String title = book.getElementsByTagName("title").item(0).getTextContent();
                String author = book.getElementsByTagName("author").item(0).getTextContent();
                System.out.println("Title: " + title + ", Author: " + author);
            }

            // Add a new book programmatically
            Element newBook = doc.createElement("book");
            Element newTitle = doc.createElement("title");
            newTitle.setTextContent("The Old Man and the Sea");
            Element newPublishedYear = doc.createElement("publishedYear");
            newPublishedYear.setTextContent("1952");
            Element newNumberOfPages = doc.createElement("numberOfPages");
            newNumberOfPages.setTextContent("127");
            Element newAuthors = doc.createElement("authors");
            Element newAuthor = doc.createElement("author");
            newAuthor.setTextContent("Ernest Hemingway");
            newAuthors.appendChild(newAuthor);
            newBook.appendChild(newTitle);
            newBook.appendChild(newPublishedYear);
            newBook.appendChild(newNumberOfPages);
            newBook.appendChild(newAuthors);
            Element root = doc.getDocumentElement();
            root.appendChild(newBook);

            // Print the updated XML data
            bookList = doc.getElementsByTagName("book");
            for (int i = 0; i < bookList.getLength(); i++) {
                Element book = (Element) bookList.item(i);
                String title = book.getElementsByTagName("title").item(0).getTextContent();
                String author = book.getElementsByTagName("author").item(0).getTextContent();
                System.out.println("Title: " + title + ", Author: " + author);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
