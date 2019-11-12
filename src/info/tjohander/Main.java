package info.tjohander;

import static java.lang.Integer.valueOf;

import java.util.*;

class Main {

  /*
  The password is hard to crack if it contains at least A uppercase letters, at least B lowercase letters, at least C digits and includes exactly N symbols. Also, a password cannot contain two or more same characters coming one after another. For a given numbers A, B, C, N you should output password that matches these requirements.
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String startingPassword = "password";
    int numberOfUpperCase = scanner.nextInt();
    int numberOfLowerCase = scanner.nextInt();
    int numberOfDigits = scanner.nextInt();
    int numberOfSymbols = scanner.nextInt();

    String password = "password";
    String result = "";

    for (int i = 0; i < password.length() ; i++) {
      char current = password.charAt(i);
      char next = password.charAt(i + 1);
      char prev = password.charAt(i - 1);
      if (numberOfUpperCase > 0 && !Character.isUpperCase(current) && !Character.isUpperCase(next) && ) {
        result = result.concat(Character.toString(Character.toUpperCase(current)));
        numberOfUpperCase--;
        continue;
      }

      if (numberOfLowerCase > 0 && !Character.isUpperCase(current) && !Character.isUpperCase(next)) {
        current = Character.toLowerCase(current);
        numberOfLowerCase--;
      }

      if (numberOfDigits > 0) {
        current = Character.forDigit(0, 10);
        numberOfDigits --;
      }
      // fill on the rest of the required length of a string with the required number of characters
    }
    // mutate the first char based on count of upper case
    // move on to next char
    // mutate based on lower case
    // move on to next char
    System.out.println(result);


  }
}
