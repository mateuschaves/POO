package classes;

import java.lang.System;
import java.util.Scanner;

import classes.Usuario;

public class Main  {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);

        System.out.println("1 - Logar");
        System.out.println("2 - Cadastrar");
        System.out.println("3 - Sair");

        System.out.print("Escolha uma opção: ");
        int menu = reader.nextInt(); 
        Usuario login = new Usuario();
        switch(menu){
            case 1: 
                login.singIn();
                break;
            case 2:
                login.singUp();
        }
    }
}