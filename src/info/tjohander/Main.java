package info.tjohander;

import java.util.*;

class Main {

  /*
  The password is hard to crack if it contains at least A uppercase letters, at least B lowercase letters, at least C digits and includes exactly N symbols. Also, a password cannot contain two or more same characters coming one after another. For a given numbers A, B, C, N you should output password that matches these requirements.
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numberOfUpperCase = scanner.nextInt();
    int numberOfLowerCase = scanner.nextInt();
    int numberOfDigits = scanner.nextInt();
    int numberOfSymbols = scanner.nextInt();

    String password = "password";
    char[] charArray = password.toCharArray();
    String result = "";

    for (int i = 0; i < charArray.length - 1; i++) {
      char current = charArray[i];
      char next = charArray[i + 1];
      if (numberOfUpperCase > 0 && !Character.isUpperCase(current) && !Character.isUpperCase(next)) {
        charArray[i] = Character.toUpperCase(charArray[i]);
        numberOfUpperCase--;
        i++;
      }
      if (numberOfDigits > 0 && Character.toLowerCase(charArray[i]) == 'o') {
        charArray[i] = '0';
        numberOfDigits --;
      }
      // fill on the rest of the required length of a string with the required number of characters
    }
    for (int i = 0; i <= numberOfSymbols ; i++) {
      result = result.concat(Character.toString(charArray[i]));
    }
    System.out.println(result);
  }
}
