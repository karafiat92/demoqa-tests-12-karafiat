package guru.qa.tests;

import org.junit.jupiter.api.*;

public class JUnit5Tests {

    @BeforeAll
    static void initDB () {
        System.out.println("### @BeforeAll");
    }

    @BeforeEach
    void openYaPage() {
        System.out.println("###     @BeforeEach");
        //Selenide.open("https://ya.ru");
    }
    @AfterEach
    void closePage() {
        System.out.println("###     @AfterEach");
        //WebDriverRunner.closeWindow();
    }

    @AfterAll
    static void cleanDB () {
        System.out.println("### @AfterAll");
    }

    @Test
    void assertTest() {
        System.out.println("###         @Test0");
        Assertions.assertTrue(5 <= 5);
    }

    @Test
    void assertTest2() {
        System.out.println("###         @Test1");
        Assertions.assertTrue(10 < 11);
    }

}

