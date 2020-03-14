package classes;

import java.lang.System;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        User login = new User();
        while (true) {
            System.out.println("\n\n1 - Logar");
            System.out.println("2 - Cadastrar");
            System.out.println("3 - Sair");

            System.out.print("Escolha uma opção: ");
            int menu = reader.nextInt();
            System.out.println("");
            switch (menu) {
                case 1:
                    login.singIn();
                    break;
                case 2:
                    login.singUp();
                    break;
                default:
                    break;
            }
        }
    }
}