package _lesson.drivers;

import _lesson.config.AuthConfig;
import _lesson.config.MobileConfig;
import _lesson.config.ProjectConfig;
import com.codeborne.selenide.WebDriverProvider;
import io.appium.java_client.android.AndroidDriver;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import javax.annotation.Nonnull;
import java.net.MalformedURLException;
import java.net.URL;

public class BrowserstackMobileDriver implements WebDriverProvider {

    static AuthConfig authConfig = ConfigFactory.create(AuthConfig.class, System.getProperties());
    static MobileConfig mobileConfig = ConfigFactory.create(MobileConfig.class, System.getProperties());
    static ProjectConfig projectConfig = ConfigFactory.create(ProjectConfig.class, System.getProperties());


    @Nonnull
    @Override
    public WebDriver createDriver(@Nonnull Capabilities capabilities) {

        MutableCapabilities caps = new MutableCapabilities();
        caps.merge(capabilities);
        // Set your access credentials
        caps.setCapability("browserstack.user", authConfig.getUser());
        caps.setCapability("browserstack.key", authConfig.getPassword());

        // Set URL of the application under test
        caps.setCapability("app", mobileConfig.getApp());

        // Specify device and os_version for testing
        caps.setCapability("device", mobileConfig.getDeviceName());
        caps.setCapability("os_version", mobileConfig.getPlatformVersion());

        // Set other BrowserStack capabilities
        caps.setCapability("project", projectConfig.getProject());
        caps.setCapability("build", projectConfig.getBuild());
        caps.setCapability("name", projectConfig.getName());

        // Initialise the remote Webdriver using BrowserStack remote URL
        // and desired capabilities defined above
        try {
            return new RemoteWebDriver(new URL(projectConfig.getRemoteUrl()), caps);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}
