package tests;

import org.junit.jupiter.api.Test;
import pages.RegistrationPage;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class TextBoxWithPageObjectsTests extends TestBase  {

RegistrationPage registrationPage = new RegistrationPage();


    @Test
    void fillFormTest() {
        registrationPage.openPage()
                .setFirstName("Albina")
                .setLastName("Dobrova")
                .setUserEmail("rezolventa86@rambler.ru")
                .setGender("Female")
                .setUserNumber("9872552206")
                .setDateOfBirth("2", "January", "1986");





    }


}