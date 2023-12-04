package owner.config;

import org.aeonbits.owner.Config;


@Config.Sources({
        "file:/Users/admin/Desktop/tmp/secret.properties",
        "classpath:auth.properties"
})
public interface SecretAuthConfig extends Config {

    @Key("username")
    String username();

    @Key("password")
    String password();
}
