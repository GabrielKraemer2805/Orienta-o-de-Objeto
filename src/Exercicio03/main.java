package Exercicio03;

public class main {
    public static void main(String[] args) {
        professores Professores = new professores();
        Professores.Numero_aula = 40;
        Professores.valor_Aula = 220;

        System.out.println(Professores.Salario_base());
    }
}
