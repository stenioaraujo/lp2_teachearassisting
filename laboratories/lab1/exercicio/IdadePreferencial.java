// The name of the file needs to match exactly the class name (remember that Java is case sensitive)
// If you change the class name, pay attention to change the file name
public class IdadePreferencial {
    public static void main(String[] args) { // Definindo uma funcao
        int idade = 20;
        if (idade >= 60) {
            System.out.println("Voce tem "+ idade + " anos. Voce pode usar o atendimento especial.");
        } else {
            System.out.println("Voce tem "+ idade + " anos. Voce nao pode ainda usar o atendimento especial.");
        }
    }
}
