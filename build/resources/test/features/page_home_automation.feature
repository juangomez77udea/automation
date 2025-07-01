# language: en

Feature: Proceso de Login en Automation Exercise

  As a website user,
  I want to verify the login functionality
  to ensure the system correctly handles invalid credentials.

  @LoginIncorrecto
  Scenario: Intento de inicio de sesión con credenciales incorrectas
    Given que el usuario se encuentra en la página de inicio de sesión de Automation Exercise
    When hace clic en el boton "Signup / Login"
    Then verifica que 'Login to your account' está visible
    When ingresa el correo electrónico incorrecto "juangomeez88@gmail.com" y la contraseña "password12345"
    Then el mensaje de error "Your email or password is incorrect!" está visible