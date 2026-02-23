package Exercicio1;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta();
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        System.out.println("qual o nome do correntista");
        conta.correntista = sc.next();
        conta.Numero_da_conta = rd.nextInt(1000, 9999);
        System.out.println(conta.saldo);
        conta.depositar(8500);
        System.out.println(conta.saldo);
        conta.sacar(6000);
        System.out.println(conta.saldo);

    }
}
