import java.util.Scanner;

/**
 * Laboratório de Programação 2 - Lab 1
 *
 * Problem: QN9tFkXbc
 *
 * @author Stenio Elson
 */
public class PassouMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float first = sc.nextFloat();
        float second = sc.nextFloat();
        float media = (first + second) / 2;

        String resultado = "False";
        if (media >= 7) {
            resultado = "True";
        }

        System.out.println("pass: " + resultado + "!");
    }
}
