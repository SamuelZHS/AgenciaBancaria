package com.havenbank.agenciabancaria.Clientes;

import java.util.Scanner;

public class Cliente {

    Scanner  inputDate = new Scanner(System.in);
    private String nomeCompleto;
    private String emailCl;
    private int CPF;

    public double ammount;
    private int password;
    private int confirmPassword;


    public Cliente(String nomeCompleto, String emailCl, int CPF) {
        this.nomeCompleto = nomeCompleto;
        this.emailCl = emailCl;
        this.CPF = CPF;
    }

    public void cadastrar(){
        System.out.print("Nome completo:");
        nomeCompleto = inputDate.nextLine();
        System.out.print("Email:");
        emailCl = inputDate.nextLine();
        System.out.print("CPF:");
        CPF = inputDate.nextInt();
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

    public String depositar (){

        Double addValue = inputDate.nextDouble();
        ammount =+ addValue;

        return "Deposito no valor de" +ammount+ "foi concluido com sucesso!!";
    }


}
