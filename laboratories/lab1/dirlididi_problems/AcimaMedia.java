import java.util.Scanner;

/**
 * Laboratório de Programação 2 - Lab 1
 *
 * Problem: PoFnkEzvk
 *
 * @author Stenio Elson
 */
public class AcimaMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int qnt = line.split(" ").length;
        float media = 0;

        sc = new Scanner(line);
        while (sc.hasNextInt()) {
        	float number = sc.nextFloat();
        	media += number / qnt;
        }

        sc = new Scanner(line);
        while (sc.hasNextInt()) {
        	int number = sc.nextInt();
        	if (number > media) {
        		System.out.print(number + " ");
        	}
        }
    }
}
