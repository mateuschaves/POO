
package repositorios;

import java.util.ArrayList;

import classes.Usuario;
import interfaces.UsuarioRepositorioInterface;;

public class Usuarios implements UsuarioRepositorioInterface{

    private ArrayList<Usuario> usuarios = new ArrayList();

    public Boolean logar(String login, String senha){
        for (Usuario usuario : this.usuarios) { 		      
            if(usuario.getLogin() == login && usuario.getSenha() == senha){
                return true;
            }
        }
        return false;
    }

    public Boolean cadastrar(Usuario usuario){
        this.usuarios.add(usuario);
        return true;
    }
}