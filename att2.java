package att_Java06;

import java.util.Scanner;

public class att2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pares = 0, impares = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int numero = scanner.nextInt();

            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("\nTotal de números pares: " + pares);
        System.out.println("Total de números ímpares: " + impares);

        scanner.close();
    }
}
