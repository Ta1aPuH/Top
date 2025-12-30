import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class FormaTests {
    @Test
    void testRegistr01(){
        open ("https://slqamsk.github.io/cases/simple-pages/page04.html");
        $(By.name("username")).setValue("Sveta");
        $(By.name("email")).setValue("Sveta@mail.ru");
        $(By.name("password")).setValue("12345");
        $(By.tagName("button")).click();
        $(By.id("username")).shouldHave(text("Sveta"));
        $(By.id("email")).shouldHave(text("Sveta@mail.ru"));
        $(By.id("password")).shouldHave(text("12345"));
    }

}
