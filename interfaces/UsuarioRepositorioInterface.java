package interfaces;

import classes.Usuario;

public interface UsuarioRepositorioInterface {
    public Boolean cadastrar(Usuario usuario);
    public Boolean logar(String login, String senha);
}