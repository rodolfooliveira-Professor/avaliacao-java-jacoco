// src/test/java/auth/LoginServiceTest.java
package auth;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoginServiceTest {
    LoginService login = new LoginService();

    @Test
    public void testLoginCorreto() {
        assertTrue(login.autenticar("admin", "1234"));
    }

    // TODO: Testes que o aluno deve implementar:
    // testLoginIncorreto
    // testUsuarioNulo
    // testSenhaNula
}
