package ex01;
import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        System.out.print("Digite uma string: ");
        String str = scanner.nextLine();
        

        if (checarPalindromo(str)) {
            System.out.println("A string é um palíndromo.");
        } else {
            System.out.println("A string não é um palíndromo.");
        }
        
        scanner.close();
    }

    public static boolean checarPalindromo(String str) {

        String reverseStr = new StringBuilder(str).reverse().toString();
        return str.equals(reverseStr);
    }
}
