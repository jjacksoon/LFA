import java.util.Scanner;

//ALUNO: JACKSON SILVA NASCIMENTO
//CURSO: CIÊNCIA DA COMPUTAÇÃO
//DISCIPLINA: LINGUAGENS FORMAIS E AUTOMATOS

public class Aut {
    int cont;
    char[] palavra;

    public static void main(String[] args) {
        Aut Automato = new Aut();
        String sentenca;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Entre com a palavra: ");
        sentenca = entrada.nextLine();
        Automato.palavra = sentenca.toCharArray();
        Automato.Iniciar();
    }

    public void Iniciar() {
        cont = 0;
        q0();
    }

    public void q0() {
        if (cont < palavra.length) {
            if (palavra[cont] == 'b') {
                cont++;
                q1();
            } else if (palavra[cont] == 'a') {
                cont++;
                q0();
            } else {
                qErro();
            }
        } else {
            qErro();
        }
    }

    public void q1() {
        if (cont < palavra.length) {
            if (palavra[cont] == 'b') {
                cont++;
                q2();
            } else {
                qErro();
            }
        } else {
            qErro();
        }
    }

    public void q2() {
        if (cont < palavra.length) {
            if (palavra[cont] == 'c') {
                cont++;
                q1();
            } else {
                qErro();
            }
        } else {
            System.err.println("Palavra aceita pelo automato");
        }
    }

    public void qErro() {
        System.err.println("Palavra rejeitada pelo automato");

    }
}
