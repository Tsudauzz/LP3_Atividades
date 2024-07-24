package ex05;

import java.util.Scanner;
import java.util.Calendar;

public class AntesOuDepois {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira data (Ano Mês Dia): ");
        int ano1 = scanner.nextInt();
        int mes1 = scanner.nextInt() - 1;
        int dia1 = scanner.nextInt();

        System.out.print("Digite a segunda data (Ano Mês Dia): ");
        int ano2 = scanner.nextInt();
        int mes2 = scanner.nextInt() - 1;
        int dia2 = scanner.nextInt();

        Calendar cal1 = Calendar.getInstance();
        cal1.set(ano1, mes1, dia1);

        Calendar cal2 = Calendar.getInstance();
        cal2.set(ano2, mes2, dia2);

        if (cal1.before(cal2)) {
            System.out.println("A primeira data é antes da segunda data.");
        } else if (cal1.after(cal2)) {
            System.out.println("A primeira data é depois da segunda data.");
        } else {
            System.out.println("As duas datas são iguais.");
        }

        scanner.close();
    }
}
