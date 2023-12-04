package owner.config;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Objects;

public class WebDriverConfigOld {

    public String getBaseUrl() {
        String baseURL = System.getProperty("baseUrl");
        if (Objects.isNull(baseURL)) {
            baseURL = "https://github.com";
        }
        return baseURL;
    }

    public Browser getBrowser() {

        String browser = System.getProperty("browser");

        if (Objects.isNull(browser)) {
            browser = "CHROME";
        }
        return Browser.valueOf(browser);
    }

    public URL getRemoteUrl() {
        String remoteURL = System.getProperty("remoteUrl");
        if (Objects.isNull(remoteURL)) {
            remoteURL = "https://localchost:4444";
        }
        try {
            return new URL(remoteURL);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}
