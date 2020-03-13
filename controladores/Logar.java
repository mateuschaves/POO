
package controladores;


import interfaces.UsuarioRepositorioInterface;

import interfaces.LogarInterface;
import repositorios.Usuarios;

public class Logar implements LogarInterface{

    public Logar(){

    }
    
    public Boolean entrar(String login, String senha){
        UsuarioRepositorioInterface usuarios = new Usuarios();
        return usuarios.logar(login, senha);
    }
}