package ex03;

import java.util.Scanner;

public class CalculoHipotenusa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o comprimento do primeiro cateto: ");
        double cateto1 = scanner.nextDouble();
        
        System.out.print("Digite o comprimento do segundo cateto: ");
        double cateto2 = scanner.nextDouble();

        double hipotenusa = calcularHipotenusa(cateto1, cateto2);

        System.out.println("A hipotenusa do triângulo retângulo é: " + hipotenusa);

        scanner.close();
    }

    public static double calcularHipotenusa(double cateto1, double cateto2) {
        return Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
    }
}
