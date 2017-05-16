import java.util.Scanner;

/**
 * Laboratório de Programação 2 - Lab 1
 *
 * Problem: NIGzVIuci
 *
 * @author Stenio Elson
 */
public class Professor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String notas = "";
        float media = 0;
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int acima = 0;

        while (true) {
            String line = sc.nextLine();
            if (line.equals("-")) break;

            notas += line.split(" ")[1] + " ";
        }

        sc = new Scanner(notas);

        int qnt = notas.split(" ").length;
        while (sc.hasNextInt()) {
            int nota = sc.nextInt();
            media += (nota * 1.0) / qnt;

            if (nota > maior) maior = nota;
            if (nota < menor) menor = nota;
            if (nota >= 700) acima += 1;
        }

        System.out.println("maior: " + maior);
        System.out.println("menor: " + menor);
        System.out.println("media: " + (int)media);
        System.out.println("acima: " + acima);
        System.out.println("abaixo: " + (qnt - acima));
    }
}
