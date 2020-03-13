
package controladores;

import interfaces.UsuarioRepositorioInterface;
import interfaces.CadastrarInterface;

import classes.User;
import repositorios.Usuarios;


public class Cadastrar implements CadastrarInterface{

    public Cadastrar(){

    }
    public Boolean registrar(User usuario){
        UsuarioRepositorioInterface usuarios = new Usuarios();
        return usuarios.cadastrar(usuario);
    }
}