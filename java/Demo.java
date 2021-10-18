/*
--- Demo (Java) ---
*/

/* Importing packages */
import java.util.*;
import java.security.*;
import java.util.ArrayList;
import java.util.Scanner;

/* Import custom classes */

/* Defining classes */
public class Demo {

  /* Defining methods */
  public static void main(String[] args) {
    /* Print STDIN */
    for (int i = 0; i < args.length; i++) {
      System.out.println(args[i]);
    }
    /* Make a sample request (from Request.java) */
    try {
      System.out.println(Request.get("https://jsonplaceholder.typicode.com/posts"));
    } catch (Exception exception) {
      exception.printStackTrace();
    }
  }
}
