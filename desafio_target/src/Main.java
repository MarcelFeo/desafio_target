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

    public static void ex03(double[] dados) {
        double menor = Double.MAX_VALUE;
        double maior = Double.MIN_VALUE;
        double soma = 0.0;
        int dias = 0;

        for (double dado : dados) {
            if (dado > 0) {
                if (dado < menor) {
                    menor = dado;
                }
                if (dado > maior) {
                    maior = dado;
                }
                soma += dado;
                dias++;
            }
        }

        double mediaMensal = soma / dias;
        int diasFaturamentoAcima = 0;

        for (double dado : dados) {
            if (dado > mediaMensal) {
                diasFaturamentoAcima++;
            }
        }

        System.out.println("Menor valor de faturamento: " + menor);
        System.out.println("Maior valor de faturamento: " + maior);
        System.out.println("Número de dias com faturamento acima da média: " + diasFaturamentoAcima);
    }

    public static void ex04(double sp, double rj, double mg, double es, double outros) {
        double total = sp + rj + mg + es + outros;

        System.out.printf("Percentual de SP: %.2f%%\n", (sp / total) * 100);
        System.out.printf("Percentual de RJ: %.2f%%\n", (rj / total) * 100);
        System.out.printf("Percentual de MG: %.2f%%\n", (mg / total) * 100);
        System.out.printf("Percentual de ES: %.2f%%\n", (es / total) * 100);
        System.out.printf("Percentual de Outros: %.2f%%\n", (outros / total) * 100);
    }

    public static String ex05(String str) {
        char[] letras = str.toCharArray();
        int inicioStr = 0;
        int fimStr = letras.length - 1;

        while (inicioStr < fimStr) {
            char temp = letras[inicioStr];
            letras[inicioStr] = letras[fimStr];
            letras[fimStr] = temp;

            inicioStr++;
            fimStr--;
        }

        return new String(letras);
    }

    public static void main(String[] args) {

        // Não foi disponibilizado o arquivo xml ou json, então criei esse vetor para simular os dados
        double[] dados = {
                200.0, 300.0, 250.0, 400.0, 100.0, 0.0, 350.0, 600.0, 700.0, 500.0, 0.0, 650.0, 450.0, 300.0,
                200.0, 100.0, 50.0, 0.0, 150.0, 300.0, 400.0, 500.0, 600.0, 800.0, 0.0, 0.0, 450.0, 550.0, 500.0, 400.0
        };

        // Dados do exercício 04
        double sp = 67836.43;
        double rj = 36678.66;
        double mg = 29229.88;
        double es = 27165.48;
        double outros = 19849.53;

        Scanner scanner = new Scanner(System.in);
        int opcao, n;
        String str;

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
                    System.out.println("Exercício 01:");
                    ex01();
                    break;
                case 2:
                    System.out.println("Exercício 02:");

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
                    System.out.println("Exercício 03:");

                    ex03(dados);

                    break;
                case 4:
                    System.out.println("Exercício 04:");

                    ex04(sp, rj, mg, es, outros);

                    break;
                case 5:
                    System.out.println("Exercício 05:");

                    scanner.nextLine(); // limpar o buffer

                    System.out.print("Digite uma string para inverter ela: ");
                    str = scanner.nextLine();

                    String novaStr = ex05(str);

                    System.out.println(str + " -> " + novaStr);

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