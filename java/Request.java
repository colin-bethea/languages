/*
--- Make a request (HTTP) ---
*/

import java.io.*;
import java.net.*;
import java.util.*;

public class Request {
	public static Stack<String> get(String url) throws Exception {
		URL requestUrl = new URL(url);
		URLConnection requestConnection = requestUrl.openConnection();
		BufferedReader inputStream = new BufferedReader(new InputStreamReader(requestConnection.getInputStream()));
		String inputLine;
		Stack<String> outputArray = new Stack<String>();
		while ((inputLine = inputStream.readLine()) != null) {
			outputArray.push(inputLine);
		}
		inputStream.close();
		return outputArray;
	}
}
