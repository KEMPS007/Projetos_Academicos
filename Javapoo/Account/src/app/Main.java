package app;

import entities.Conta;
import entities.Erros;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main (String[]args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

            System.out.println("Entre com os dados da conta: ");
            System.out.print("Numero: ");
            int numero = sc.nextInt();
            System.out.print("titular: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Saldo: ");
            double saldo = sc.nextDouble();
            System.out.print("limite de saque: ");
            double limiteSaque = sc.nextDouble();

            Conta conta = new Conta(numero, nome, saldo, limiteSaque);

            System.out.println();
            System.out.print("entre com o valor para o saque: ");
            double valor = sc.nextDouble();

        try { conta.saque(valor);
            System.out.print(conta);
        }
        catch (Erros e){
            System.out.println(e.getMessage());
        }







    }
}
