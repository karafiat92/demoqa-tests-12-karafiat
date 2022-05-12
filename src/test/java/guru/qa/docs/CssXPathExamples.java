package guru.qa.docs;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class CssXPathExamples {
    void cssXPathExamples() {
//        <input autocomplete="off" placeholder="name@example.com" name="email" type="email" id="userEmail" class="mr-sm-2 form-control">
        $("#userEmail").setValue("123");
        $(byId("#userEmail")).setValue("123");
        $x("//*[@id='userEmail']").setValue("123");
        $(byXpath("//*[@id='userEmail']")).setValue("123");

//        <input type="email" class="mr-sm-2 form-control" name="email">
        $("[name=email]").setValue("123");
        $(byName("userEmail")).setValue("123");

//        <input type="email" class="mr-sm-2 form-control">
        $("[class=mr-sm-2 form-control]").setValue("123");
        $(".form-control").setValue("123");
        $("input.mr-sm-2.form-control").setValue("123");
        $(".mr-sm-2.form-control").setValue("123");
        $(byClassName("form-control")).setValue("123");
        $x("//*[@id='userEmail']").setValue("123");
        $(byXpath("//input[@class='mr-sm-2'][@class='form-control']")).setValue("123");

//        <div class="mr-sm-2">
//                <input type="email" class="form-control">
//        </div>
        $(".mr-sm-2 .form-control").setValue("123");

//        <input autocomplete="off" placeholder="name@example.com" name="email" type="email" id="userEmail" class="mr-sm-2 form-control">
        $("input.mr-sm-2.form-control#userEmail[name=email]");

//        <div>Hello world!</div>
        $x("//div[text()='Hello world!']");
        $x("//div[contains(text(), 'ello worl')]");
        $x("//div[text()[contains(., 'ello worl')]]");
        $(byText("Hello world!"));
        $(withText("ello worl"));
    }
}
