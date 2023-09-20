// Import libraries here
// Lyam Perez
import java.util.Scanner;

public class Assignment1 {
  public static void main(String[] args) {

    //declaring all my variables
    double Celsius;
    int Fahrenheit;
    int Base = 32;
    double Conversion =5.0/9.0;

    //variables for string
    String Word;
    String newWord = ("");

    //allowing keyboard input
    Scanner Scan = new Scanner(System.in);

    // My initials
    System.out.println("LLL            PP PPP PPP PP");
    System.out.println("LLL            PPP          PP");
    System.out.println("LLL            PPP          PP");
    System.out.println("LLL            PP PPP PPP PP");
    System.out.println("LLL            PPP");
    System.out.println("LL LLL LLL     PPP");
    System.out.println("LL LLL LLL     PPP");
    System.out.println("                              ");

    //asking the user for a string
    System.out.println("please enter a 5-character string");
    Word = Scan.nextLine();

    for(int i = Word.length() - 1; i >=0; i--)
    {
    newWord = newWord + Word.charAt(i);
    }
    System.out.println(newWord);

    //Asking the user for a temperature
    System.out.println("please enter a number in Fahrenheit");
    Fahrenheit = Scan.nextInt();

    //equation that allows me to convert fahrenheit to celsius
    Celsius = Conversion * (Fahrenheit - Base);


    Scan.close();
  }
}
