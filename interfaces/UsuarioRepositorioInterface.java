package interfaces;

import classes.User;

public interface UsuarioRepositorioInterface {
    public Boolean cadastrar(User usuario);

    public Boolean logar(String login, String senha);
}