
package SeuNome;

public class LoginService {
    public boolean autenticar(String usuario, String senha) {
        if (usuario == null || senha == null) {
            return false;
        }
        if (usuario.equals("admin") && senha.equals("1234")) {
            return true;
        } else {
            return false;
        }
    }
}
