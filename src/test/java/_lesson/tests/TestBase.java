package _lesson.tests;

import _lesson.drivers.BrowserstackMobileDriver;
import _lesson.drivers.EmulationMobileDriver;
import _lesson.helpers.Attach;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class TestBase {

    public static String deviceHost = System.getProperty("deviceHost");

    @BeforeAll
    static void beforeAll() {
        if (deviceHost.equals("emulation")) {
            Configuration.browser = EmulationMobileDriver.class.getName();
        } else {
            if (deviceHost.equals("browserstack")) {
                Configuration.browser = BrowserstackMobileDriver.class.getName();
            }
        }
        Configuration.browserSize = null;
        Configuration.timeout = 30000;
    }

    @BeforeEach
    void addListener() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        open();
    }

    @AfterEach
    void afterEach() {
        //String sessionId = Selenide.sessionId().toString();
        //Attach.addVideo(sessionId);

        Attach.pageSource();

        closeWebDriver();
    }
}
