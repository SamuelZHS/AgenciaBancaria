package com.havenbank.agenciabancaria.Clientes;

import java.util.Scanner;

public class Cliente {

    Scanner  inputDate = new Scanner(System.in);
    private String nomeCompleto;
    private String emailCl;
    private String CPF;

    private int password;
    private int confirmPassword;


    public void cadastrar(){
        System.out.print("Nome completo:");
        nomeCompleto = inputDate.nextLine();
        System.out.print("Email:");
        emailCl = inputDate.nextLine();
        System.out.print("CPF:");
        CPF = inputDate.next();
        System.out.print("Senha:");
        password = inputDate.nextInt();
        System.out.print("Confirmar Senha:");
        confirmPassword = inputDate.nextInt();

        if (confirmPassword == password){
            System.out.println("Conta cadastrada com sucesso");
        }else {
            System.out.println("As duas senhas precisam ser iguais!");
        }

    }

    public void depositar (){

        System.out.println("Qual valor deseja depositar? ");
        double addValue = inputDate.nextDouble();
        double ammount =+ addValue;

        if (addValue < 0){
            System.out.println("O valor mínimo para deposito é 1$SS");
        }else {
            System.out.println("Deposito no valor de $" +ammount+ " foi concluido com sucesso!!");
        }
    }
    public void mostrarAmmount(double ammount){
        return;
    }


}
