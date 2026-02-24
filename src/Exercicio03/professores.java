package Exercicio03;

public class professores {
    String Nome;
    double valor_Aula;
    int Numero_aula;

    public double Salario_base(){
        double salarioBase;
        double horaAtividade;
        double descansoSemanal;

        salarioBase = Numero_aula * valor_Aula * (4.5);
        horaAtividade = salarioBase * 5 / 100;

        descansoSemanal = (salarioBase + horaAtividade) / 6;

        return salarioBase + horaAtividade + descansoSemanal;
    }



}
