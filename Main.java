import java.util.Scanner;
class Main {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] tens = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000};
    String[] Roman = {"I", "V", "X", "L", "C", "D", "M"};
    String[] RomanOnes = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
    String[] RomanTens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
    String[] RomanHundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
    String[] RomanThousands = {"", "M", "MM"};
    String displayedRoman = "Nulla";
    System.out.println("Put in a number from 0-2000 to turn it into a Roman Numeral!");
    int userNumber = sc.nextInt();
    for (int i = 0; i < (Roman.length / 2); i++) {
      int (Roman[i] + "Digit") = ((userNumber / tens[i]) % 10); //Try to assign variable name to the Roman array elements.
      if ((userNumber) < (tens[i + 1]) && (userNumber > 0)) {
        displayedRoman = (RomanOnes[i + 1]);
      }
    }
    int onesDigit = (userNumber % 10);
    int tensDigit = ((userNumber / 10) % 10);
    int hundredsDigit = ((userNumber / 100) % 10);
    int thousandsDigit = ((userNumber / 1000) % 10);
    if ((userNumber) < 10 && (userNumber > 0)) {
      displayedRoman = (RomanOnes[onesDigit]);
      } else if ((userNumber < 100) && (userNumber > 0)) {
      displayedRoman = (RomanTens[tensDigit] + RomanOnes[onesDigit]);
      } else if ((userNumber < 1000) && (userNumber > 0)) {
      displayedRoman = (RomanHundreds[hundredsDigit] + RomanTens[tensDigit] + RomanOnes[onesDigit]);
      } else if ((userNumber <= 2000) && (userNumber > 0)) {
      displayedRoman = (RomanThousands[thousandsDigit] + RomanHundreds[hundredsDigit] + RomanTens[tensDigit] + RomanOnes[onesDigit]);
    }
    System.out.println(displayedRoman);
  }
}