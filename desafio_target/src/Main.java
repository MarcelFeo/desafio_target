import java.util.Scanner;

public class Main {
    public static void ex01() {
        int indice = 13;
        int soma = 0;
        int k = 0;

        while (k < indice) {
            k += 1;
            soma = soma + k;
        }

        System.out.println("Resultado da soma: " + soma);
    }

    public static boolean ex02(int a, int b, int n) {
        if (a == n || b == n) {
            return true;
        } else if (b > n) {
            return false;
        } else {
            return ex02(b, a + b, n);
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcao, n;

        do {
            System.out.println("===== MENU =====");
            System.out.println("(1) Exercício 1");
            System.out.println("(2) Exercício 2");
            System.out.println("(3) Exercício 3");
            System.out.println("(4) Exercício 4");
            System.out.println("(5) Exercício 5");
            System.out.println("(6) Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Exercício 01: ");
                    ex01();
                    break;
                case 2:
                    System.out.println("Exercício 2: ");

                    System.out.println("Digite um número: ");
                    n = scanner.nextInt();

                    boolean resultado = ex02(0, 1, n);

                    if (resultado) {
                        System.out.println(n + " pertence à sequência de fibonacci!");
                    } else {
                        System.out.println(n + " não pertence à sequência de fibonacci!");
                    }

                    break;
                case 3:
                    System.out.println("Exercício 3: ");

                    

                    break;
                case 4:
                    System.out.println("Você escolheu a Opção 4");
                    break;
                case 5:
                    System.out.println("Saindo do programa...");
                    break;
                case 6:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Digite uma opção válida.");
            }

        } while (opcao != 6);

        scanner.close();
    }
}