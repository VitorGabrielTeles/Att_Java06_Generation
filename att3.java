package att_Java06;

import java.util.Scanner;


public class att3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idade;
        int menoresDe21 = 0;
        int maioresDe50 = 0;

        System.out.println("Digite as idades das pessoas. Digite um número negativo para encerrar:");

        while (true) {
            System.out.print("Digite uma idade: ");
            idade = scanner.nextInt();

            if (idade < 0) {
                break;
            }

            if (idade < 21) {
                menoresDe21++;
            } else if (idade > 50) {
                maioresDe50++;
            }
        }

        System.out.println("Total de pessoas menores de 21 anos: " + menoresDe21);
        System.out.println("Total de pessoas maiores de 50 anos: " + maioresDe50);

        scanner.close();
    }
}
