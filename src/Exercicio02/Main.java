package Exercicio02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Paciente paciente = new Paciente();
        Scanner sc = new Scanner(System.in);
        double[] alvo;

        System.out.println("nome: ");
        paciente.nome = sc.next();
        System.out.println("Idade: ");
        paciente.idade = sc.nextInt();

        System.out.println("Frencia maxima: " + paciente.frequenciaMaxima() );
        alvo = paciente.frequenciaAlvo();
        System.out.println("inicio da frquencia alvo: " + alvo[0]);
        System.out.println("fim da frequencia alvo: " + alvo[1]);

    }
}
