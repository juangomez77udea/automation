## **Taller de Automatización**


Para iniciar el proyecto creamos el el archvio `buil.gradle` con el siguiente comando:

```diff
+ echo "plugins {
+   id \"io.github.jumosqu12.screenplayarchitecture\" version \"1.1.2\"
+ }" > build.gradle
```

Posteriormente se crea el proyecto `Gradle` cpn el siguiente comando:

    `gradle spa --projectName=TallerAutomatizacion --groupId=co.edu.udea.calidad --principalPackage=Automation --type=UX`

## Se realizaron las pruebas 3, 22:
### Test Automation Practice – AutomationExercise
      https://automationexercise.com/

## Test Case 3: Login User with incorrect email and password
    1. Launch browser
    2. Navigate to url 'http://automationexercise.com'
    3. Verify that home page is visible successfully
    4. Click on 'Signup / Login' button
    5. Verify 'Login to your account' is visible
    6. Enter incorrect email address and password
    7. Click 'login' button
    8. Verify error 'Your email or password is incorrect!' is visible

## Test Case 22: Add to cart from Recommended items
    1. Launch browser
    2. Navigate to url 'http://automationexercise.com'
    3. Scroll to bottom of page
    4. Verify 'RECOMMENDED ITEMS' are visible
    5. Click on 'Add To Cart' on Recommended product
    6. Click on 'View Cart' button
    7. Verify that product is displayed in cart page
