package com.havenbank.agenciabancaria;

import com.havenbank.agenciabancaria.Clientes.Cliente;

import java.util.Scanner;

public class Main {
    public static void main(String[]args) {

        Scanner input = new Scanner(System.in);
        Cliente novo = new Cliente();
        boolean continuar = true;


            System.out.println("========= MENU ========");
            System.out.println("1 - Cadastrar Conta");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Mostrar Saldo");
            System.out.println("5 - Sair");
            System.out.print("Selecione a opção: ");
            int select = input.nextInt();

            switch (select){
                case 1:
                    novo.cadastrar();

                    break;
                case 2:
                    novo.depositar();

                    break;
                case 3:

                    break;
                case 4:


                    break;
                case 5:
                    System.out.println("Deseja realmente sair do programa? (S/N)");
                    String resposta = input.next();
                    if (resposta.equalsIgnoreCase("S")) {
                        continuar = false;
                        System.out.println("Programa encerrado. Obrigado!");
                    }
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                    break;
            }




    }
}
