/*
--- Make a request (HTTP) ---
*/

// Import libraries
import java.io.*;
import java.net.*;
import java.util.*;

public class Request {

  // Define a method get() for sending HTTP requests
  public static Stack<String> get(String url) throws Exception {
    // Create a new URL reader
    URL requestUrl = new URL(url);
    // Use the openConnection() method to create a connection
    URLConnection requestConnection = requestUrl.openConnection();
    // Create an input buffer (read) to receive and parse data from your response
    BufferedReader inputStream = new BufferedReader(
      new InputStreamReader(requestConnection.getInputStream())
    );
    // Push JSON to output stack until exhausted
    String inputLine;
    Stack<String> outputArray = new Stack<String>();
    while ((inputLine = inputStream.readLine()) != null) {
      outputArray.push(inputLine);
    }
    inputStream.close();
    return outputArray;
  }
}
