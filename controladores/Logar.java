
package controladores;

import interfaces.UsuarioRepositorioInterface;

import interfaces.LogarInterface;
import repositorios.Usuarios;

public class Logar implements LogarInterface {

    public Boolean entrar(String login, String senha) {
        UsuarioRepositorioInterface usuarios = new Usuarios();
        return usuarios.logar(login, senha);
    }
}