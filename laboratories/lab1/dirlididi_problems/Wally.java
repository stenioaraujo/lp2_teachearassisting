import java.util.Scanner;

/**
 * Laboratório de Programação 2 - Lab 1
 *
 * Problem: SlfR6pBmC
 *
 * @author Stenio Elson
 */
public class Wally {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String line = sc.nextLine();
            if (line.equals("wally")) {
                break;
            }

            String possivelWally = "?";
            for (String nome: line.split(" ")) {
                if (nome.length() == 5) {
                    possivelWally = nome;
                }
            }
            System.out.println(possivelWally);
        }
    }
}
