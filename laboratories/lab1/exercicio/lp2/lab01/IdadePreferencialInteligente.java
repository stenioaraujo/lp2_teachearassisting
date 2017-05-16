package lp2.lab01;
// Packages help you organize your software in an hierarchical way.
// When using packages the notion of classpath needs to be clear.
// More about classpath: http://kevinboone.net/classpath.html

// The name of the file needs to match exactly the class name (remember that Java is case sensitive)
// If you change the class name, pay attention to change the file name
public class IdadePreferencialInteligente {
    public static void main(String[] args) { // Definindo uma funcao
        int anoNascimento = 1993;
        int anoAtual = 2017;
        int idade = anoAtual - anoNascimento;
        
        if (idade >= 60) {
            System.out.println("Voce tem "+ idade + " anos. Voce pode usar o atendimento especial.");
        } else {
            System.out.println("Voce tem "+ idade + " anos. Voce nao pode ainda usar o atendimento especial.");
        }
    }
}
