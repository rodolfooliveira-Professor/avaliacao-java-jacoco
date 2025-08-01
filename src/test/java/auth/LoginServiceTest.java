package auth;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoginServiceTest {

    private final LoginService login = new LoginService();

    @Test
    public void testLoginCorreto() {
        assertTrue(login.autenticar("admin", "1234"), "Deve autenticar com usuário e senha corretos");
    }

    @Test
    public void testLoginIncorretoSenha() {
        assertFalse(login.autenticar("admin", "senhaErrada"), "Não deve autenticar com senha incorreta");
    }

    @Test
    public void testLoginIncorretoUsuario() {
        assertFalse(login.autenticar("usuarioErrado", "1234"), "Não deve autenticar com usuário incorreto");
    }

    @Test
    public void testLoginNulo() {
        assertFalse(login.autenticar(null, "1234"), "Não deve autenticar com usuário nulo");
        assertFalse(login.autenticar("admin", null), "Não deve autenticar com senha nula");
        assertFalse(login.autenticar(null, null), "Não deve autenticar com usuário e senha nulos");
    }
}
