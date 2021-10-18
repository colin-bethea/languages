/*
--- Demo (Java) ---
*/

// Import libraries
import java.security.*;
import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;

// Define a "Demo" class (same as classpath Demo.java)
public class Demo {

  // Define main() method as entry-point
  public static void main(String[] args) {
    // Loop through and print stdin (command-line arguments)
    for (int i = 0; i < args.length; i++) {
      System.out.println(args[i]);
    }
    // Make a sample request (from Request.java)
    try {
      System.out.println(
        Request.get("https://jsonplaceholder.typicode.com/posts")
      );
    } catch (Exception exception) {
      exception.printStackTrace();
    }
  }
}
