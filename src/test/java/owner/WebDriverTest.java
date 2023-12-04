//package owner;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import owner.config.WebDriverProvider;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//public class WebDriverTest {
//    private WebDriver driver;
//
//    @BeforeEach
//    public void startDriver() {
//        driver = new WebDriverProvider().get();
//    }
//
////    private WebDriver getWebDriver() {
////        WebDriverManager.chromedriver().setup();
////        WebDriver driver = new ChromeDriver();
////        driver.get("https://github.com");
////        return driver;
////    }
//
////    private WebDriver getWebDriver(String nameDriver) {
////        if (nameDriver.equals("chrome")) {
////            WebDriverManager.chromedriver().setup();
////            WebDriver driver = new ChromeDriver();
////            driver.get("https://github.com");
////            return driver;
////        }
////        if (nameDriver.equals("firefox")) {
////            WebDriverManager.firefoxdriver().setup();
////            return new FirefoxDriver();
////        }
////        return null;
////    }
//
//    @AfterEach
//    public void quitDriver() {
//        driver.quit();
//    }
//
//    @Test
//    public void testGitHub() {
//
//        //driver = getWebDriver("chrome");
//
//        //assert driver != null;
//        //driver.get("https://github.com");
//
//        String title = driver.getTitle();
//        String expected = "GitHub: Let’s build from here · GitHub";
//
//        assertEquals(expected, title);
//    }
//
//    @Test
//    public void testGitHub2() {
//
//        //driver = getWebDriver("firefox");
//
//        //driver.get("https://github.com");
//
//        String title = driver.getTitle();
//        String expected = "GitHub: Let’s build from here · GitHub";
//
//        assertEquals(expected, title);
//    }
//}
