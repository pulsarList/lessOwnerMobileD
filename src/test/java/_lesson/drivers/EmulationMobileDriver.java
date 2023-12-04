package _lesson.drivers;

import _lesson.config.MobileConfig;
import com.codeborne.selenide.WebDriverProvider;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;

import javax.annotation.Nonnull;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import static io.appium.java_client.remote.AutomationName.ANDROID_UIAUTOMATOR2;
import static io.appium.java_client.remote.MobileBrowserType.ANDROID;
import static org.apache.commons.io.FileUtils.copyInputStreamToFile;

public class EmulationMobileDriver implements WebDriverProvider {

    static MobileConfig mobileConfig = ConfigFactory.create(MobileConfig.class, System.getProperties());

    public static URL getAppiumServer() {
        try {
            return new URL(mobileConfig.getDeviceUrl());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    @Nonnull
    @Override
    public WebDriver createDriver(@Nonnull Capabilities capabilities) {

        UiAutomator2Options caps = new UiAutomator2Options();
        caps.merge(capabilities);

        caps.setAutomationName(ANDROID_UIAUTOMATOR2)
                .setPlatformName(ANDROID)
                .setDeviceName(mobileConfig.getDeviceName())
                .setPlatformVersion(mobileConfig.getPlatformVersion())
//                .setDeviceName("Pixel_3a_API_34_extension_level_7_x86_64")
//                .setPlatformVersion("14.0")
                .setApp(getAppPath())
                .setAppPackage(mobileConfig.getAppPackage())
                .setAppActivity(mobileConfig.getAppActivity());


        return new AndroidDriver(getAppiumServer(), caps);
    }

    private String getAppPath() {
        String appUrl = "https://github.com/wikimedia/apps-android-wikipedia/releases/download/latest/app-alpha-universal-release.apk";
        String path = mobileConfig.getAppPath();

        File app = new File(path);
        if (!app.exists()) {
            try (InputStream in = new URL(appUrl).openStream()) {
                copyInputStreamToFile(in, app);
            } catch (IOException e) {
                throw new AssertionError("Failed to download application", e);
            }
        }
        return app.getAbsolutePath();
    }
}
