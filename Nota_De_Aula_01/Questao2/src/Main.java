import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Produto p = new Produto();
        int seleciona;
        double novovalor;
        double novovalorcredito;
        int troco;
        double valortroco;
        double especie;

        System.out.println("Insira o nome do produto: ");
        p.setNome(sc2.nextLine());
        System.out.println("Insira o código do produto: ");
        p.setCodigo(sc.nextInt());
        System.out.println("Insira a cor dele: ");
        p.setCor(sc.next());
        System.out.println("Insira o quantidade em estoque: ");
        p.setEstoque(sc.nextInt());
        System.out.println("Insira o tamanho(em cm): ");
        p.setTamanho(sc.nextDouble());
        System.out.println("Insira o peso(em kg) do produto: ");
        p.setPeso(sc.nextDouble());
        System.out.println("Insira o valor do produto: ");
        p.setValor(sc.nextDouble());
        System.out.println("O nome do seu produto é: " + p.getNome());
        System.out.println("Seu código é: " + p.getCodigo());
        System.out.println("Sua cor é " + p.getCor());
        System.out.println("Temos " + p.getEstoque() + " Em estoque");
        System.out.println("Seu tamanho é " + p.getTamanho() + "cm");
        System.out.println("Seu peso é " + p.getPeso() + "kg");
        System.out.println("Valor: R$" + p.getValor());

        System.out.println("Qual será a forma de pagamento? ");
        System.out.println("0 para Pix, 1 para espécie, 2 para transferência,");
        System.out.println("3 para débito e 4 para débito.");
        seleciona = sc.nextInt();

        novovalor = p.getValor() * 0.05;
        novovalorcredito = p.getValor() / 3;

        switch (seleciona) {
            case(0):
            case(2):
            case(4):
                System.out.println("Com o desconto, seu produto ficou por R$" + novovalor);
                break;

            case(1):
                System.out.println("Com o desconto, o produto ficou por R$" + novovalor);
                System.out.println("O cliente precisará de troco? (0 pra não, 1 para sim)");
                troco = sc.nextInt();
                if (troco == 0){
                    System.out.println("Muito obrigado e volte sempre <3");
                }else if(troco == 1){
                    System.out.println("Quanto o cliente irá pagar? ");
                    especie = sc.nextDouble();
                    valortroco = especie - novovalor;
                    System.out.println("O troco é R$: " + valortroco + " , Muito obrigado e volte sempre <3");
                }
                break;
            case(3):
                System.out.println("O produto parcelado em 3 vezes fica por R$" + novovalorcredito);
                break;

        }

    }
}