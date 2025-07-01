package co.edu.udea.calidad.Automation.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {

    // Botón 'Signup / Login' en la página de inicio
    public static final Target SIGNUP_LOGIN_BUTTON = Target.the("Boton de Signup / Login")
            .located(By.cssSelector("a[href='/login']"));

    // Título 'Login to your account' en la página de login
    public static final Target LOGIN_TO_ACCOUNT_TEXT = Target.the("Titulo 'Login to your account'")
            .located(By.xpath("//h2[text()='Login to your account']"));

    // Campo de texto para el email
    public static final Target EMAIL_INPUT = Target.the("Campo de entrada para el email")
            .located(By.cssSelector("input[data-qa='login-email']"));

    // Campo de texto para la contraseña
    public static final Target PASSWORD_INPUT = Target.the("Campo de entrada para la contraseña")
            .located(By.name("password")); // Usamos 'name' como alternativa a data-qa

    // Botón final de 'login'
    public static final Target LOGIN_BUTTON = Target.the("Boton final de Login")
            .located(By.cssSelector("button[data-qa='login-button']"));

    // Mensaje de error para credenciales incorrectas
    public static final Target ERROR_MESSAGE = Target.the("Mensaje de error de credenciales incorrectas")
            .located(By.xpath("//p[contains(text(),'Your email or password is incorrect!')]"));

}