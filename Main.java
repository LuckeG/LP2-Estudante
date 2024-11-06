import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Estudante estudante1 = new Estudante("Lucas", 21, "12", 908734638 );


        System.out.println("Estudante 1: " +estudante1.getNome());
        System.out.println("Estudante 1: " +estudante1.getIdade());
        System.out.println("Estudante 1: " +estudante1.getMatricula());
        System.out.println("Estudante 1: " +estudante1.getCpf());

        estudante1.setNome("Camily");

        System.out.println("Estudante 1 Modificada: " +estudante1.getNome());
    }
}
