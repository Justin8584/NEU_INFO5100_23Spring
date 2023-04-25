import java.io.FileWriter;
import java.io.IOException;
import org.json.JSONArray;
import org.json.JSONObject;

public class JSONParser {
    public static void main(String[] args) {
        try {
            // Read the JSON data
            JSONObject data = new JSONObject("{\"BookShelf\":{\"Book\":[{\"title\":\"The Catcher in the Rye\",\"publishedYear\":\"1951\",\"numberOfPages\":\"224\",\"authors\":{\"author\":\"J. D. Salinger\"}},{\"title\":\"To Kill a Mockingbird\",\"publishedYear\":\"1960\",\"numberOfPages\":\"281\",\"authors\":{\"author\":\"Harper Lee\"}},{\"title\":\"The Great Gatsby\",\"publishedYear\":\"1925\",\"numberOfPages\":\"180\",\"authors\":{\"author\":\"F. Scott Fitzgerald\"}}]}}");

            // Get the list of Book elements
            JSONArray books = data.getJSONObject("BookShelf").getJSONArray("Book");

            // Loop through the books and print their title and author
            for (int i = 0; i < books.length(); i++) {
                JSONObject book = books.getJSONObject(i);
                String title = book.getString("title");
                String author = book.getJSONObject("authors").getString("author");
                System.out.println("Title: " + title + ", Author: " + author);
            }

            // Add a new book programmatically
            JSONObject newBook = new JSONObject();
            newBook.put("title", "The Old Man and the Sea");
            newBook.put("publishedYear", "1952");
            newBook.put("numberOfPages", "127");
            JSONObject newAuthors = new JSONObject();
            JSONArray newAuthorArray = new JSONArray();
            newAuthorArray.put("Ernest Hemingway");
            newAuthors.put("author", newAuthorArray);
            newBook.put("authors", newAuthors);
            books.put(newBook);

            // Print the updated JSON data
            System.out.println(data.toString());

            // Write the updated JSON data to a file
            FileWriter fileWriter = new FileWriter("books.json");
            fileWriter.write(data.toString());
            fileWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
