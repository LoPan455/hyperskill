package info.tjohander;

import java.util.*;

/*
Sample Input 1:

https://target.com/index.html?pass=12345&port=8080&cookie=&host=localhost
Sample Output 1:

pass : 12345
port : 8080
cookie : not found
host : localhost
password : 12345
*/

class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    //String url = "https://target.com/index.html?pass=12345&port=8080&cookie=&host=localhost";
    String url = scanner.nextLine();
    String[] urlParts = url.split("\\?");
    String[] parameters = urlParts[1].split("&");
    String password = "";
    for (String parameter: parameters) {
      String[] pair = parameter.split("=");
      String key = pair[0];
      if (key.equals("pass") && pair.length > 1) {
        password = pair[1];
      }
      String value = "not found";
      if (pair.length > 1) {
        value = pair[1];
      }
      System.out.println(key + " : " + value);
    }
    if (!password.equals("")) {
      System.out.println("password : " + password);
    }
  }
}
