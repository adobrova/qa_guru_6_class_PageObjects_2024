import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class TextBoxWithPageObjectsTests {


    @Test
    void fillFormTest() {

registrationPage.open()

.setFirstName("Albina")
.setGender("Female")
.setBirthDay("02", "January", "1986")
 .checkResult("FullName")





    }


}