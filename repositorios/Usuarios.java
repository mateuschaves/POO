
package repositorios;

import java.util.ArrayList;

import classes.User;
import interfaces.UsuarioRepositorioInterface;;

public class Usuarios implements UsuarioRepositorioInterface {

    private ArrayList<User> usuarios = new ArrayList();

    public Boolean logar(String login, String senha) {
        for (User usuario : this.usuarios) {
            System.out.println(usuario.getNome());
            if (usuario.getLogin() == login && usuario.getSenha() == senha) {
                return true;
            }
        }
        return false;
    }

    public Boolean cadastrar(User usuario) {
        this.usuarios.add(usuario);
        return true;
    }
}