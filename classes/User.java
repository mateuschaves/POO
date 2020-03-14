package classes;

import java.util.Scanner;

import controladores.Cadastrar;
import controladores.Logar;

public class User {

    private String nome;
    private String login;
    private String senha;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return this.login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return this.senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Boolean singIn() {
        Scanner reader = new Scanner(System.in);

        System.out.print("login: ");
        this.setLogin(reader.nextLine());

        System.out.print("senha: ");
        this.setSenha(reader.nextLine());

        Logar login = new Logar();
        if (login.entrar(this.getLogin(), this.getSenha())) {
            System.out.println("Bem vindo jovem.");
        } else {
            System.out.println("Usuario não encontrado.");
        }

        return true;
    }

    public Boolean singUp() {
        Scanner reader = new Scanner(System.in);

        System.out.print("nome: ");
        this.setNome(reader.nextLine());

        System.out.print("login: ");
        this.setLogin(reader.nextLine());

        System.out.print("senha: ");
        this.setSenha(reader.nextLine());

        Cadastrar cadastrar = new Cadastrar();

        if (cadastrar.registrar(this)) {
            System.out.print("Usuario cadastrado !");
        } else {
            System.out.print("Erro ao cadastrar usuario !");
        }
        return true;
    }

}