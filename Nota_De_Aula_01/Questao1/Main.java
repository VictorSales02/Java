import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Aluno a = new Aluno();

        System.out.println("Insira seu nome: ");
        a.setNome(sc2.next());
        System.out.println("Insira sua primeira nota: ");
        a.setN1(sc.nextDouble());
        System.out.println("Insira sua segunda nota: ");
        a.setN2(sc.nextDouble());
        System.out.println("Insira sua terceira nota: ");
        a.setN3(sc.nextDouble());
        a.CalculaMedia();
        a.SituacaoAcademica();


    }
}