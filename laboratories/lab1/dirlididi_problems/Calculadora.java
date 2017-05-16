import java.util.Scanner;

/**
 * Laboratório de Programação 2 - Lab 1
 *
 * Problem: R7qL9alKS
 *
 * @author Stenio Elson
 */
public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String op = sc.next();

        if (op.equals("/") || op.equals("+") ||
        	op.equals("-") || op.equals("*")) {
        	float n1 = sc.nextFloat();
        	float n2 = sc.nextFloat();
        	String result = "RESULTADO: ";

        	if (op.equals("/")) {
        		if (n2 == 0.0) {
        			result = "ERRO";
        		} else {
        			result += n1 / n2;
        		}
        	} else if (op.equals("+")) {
        		result += n1 + n2;
        	} else if (op.equals("-")) {
        		result += n1 - n2;
        	} else {
        		result += n1 * n2;
        	}

        	System.out.println(result);
        } else {
        	System.out.println("ENTRADA INVALIDA");
        }
    }
}
