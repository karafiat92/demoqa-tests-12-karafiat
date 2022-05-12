package guru.qa.tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestBoxTests {

    @BeforeAll
    static void setUp() {
//        Configuration.holdBrowserOpen = true;
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1600x1000";
    }

    @Test
    void fillFormTest() {
        String name = "Pavlikov Danil";
        String email = "Pavlikov@Danil.com";
        String currentAddress = "Some street 1";
        String permanentAddress = "Some city 2";

        open("/text-box");
        $("#userName").setValue(name);
        $("#userEmail").setValue(email);
        $("#currentAddress").setValue(currentAddress);
        $("#permanentAddress").setValue(permanentAddress);
        $("#submit").click();

        //Asserts
        $("#output").shouldHave(
                text(name),
                text(email),
                text(currentAddress),
                text(permanentAddress)
        );
//        $("#output #name").shouldHave(text(name));
//        $("#output").$("#email").shouldHave(text(email));
//        //$("#output #currentAddress").shouldHave(text(currentAddress));
//        $("[id=permanentAddress]").shouldHave(text("Permananet Address :Some city 2")); //wrong
//        $("#output").$("[id=permanentAddress]").shouldHave(text("Permananet Address :Some city 2"));
//        $("[id=permanentAddress]", 1).shouldHave(text("Permananet Address :Some city 2"));
//        $("p[id=permanentAddress]").shouldHave(text("Permananet Address :Some city 2"));
    }
}
