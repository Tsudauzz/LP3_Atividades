package ex05;

import java.util.Scanner;
import java.util.Calendar;

public class AdicionarDias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a data (Ano Mês Dia): ");
        int ano = scanner.nextInt();
        int mes = scanner.nextInt() - 1;
        int dia = scanner.nextInt();

        System.out.print("Digite o número de dias a adicionar: ");
        int dias = scanner.nextInt();

        Calendar cal = Calendar.getInstance();
        cal.set(ano, mes, dia);

        adicionarDias(cal, dias);
        System.out.println("Nova data: " + cal.get(Calendar.YEAR) + "-" + (cal.get(Calendar.MONTH) + 1) + "-" + cal.get(Calendar.DAY_OF_MONTH));

        scanner.close();
    }

    public static void adicionarDias(Calendar cal, int dias) {
        cal.add(Calendar.DAY_OF_MONTH, dias);
    }
}
