public class Aluno {
    private String nome;
    private double n1, n2, n3, media;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public double getN3() {
        return n3;
    }

    public void setN3(double n3) {
        this.n3 = n3;
    }

    public double getMedia() {
        return media;
    }

    public void CalculaMedia(){
        media = (n1 + n2 + n3)/ 3;
    }

    public void SituacaoAcademica(){
        System.out.println("Nome: " + nome);
        System.out.println("Média: " + media);
        if (media >= 70) {
            System.out.println("Aprovado");
        }else if (media < 40){
            System.out.println("Reprovado");
        }else{
            System.out.println("Recuperação");
        }
    }



}
