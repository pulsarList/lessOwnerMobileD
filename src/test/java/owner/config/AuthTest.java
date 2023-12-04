//package owner.config;
//
//import org.aeonbits.owner.ConfigFactory;
//import org.junit.jupiter.api.Test;
//
//import java.io.IOException;
//import java.nio.charset.StandardCharsets;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//public class AuthTest {
//
//    @Test
//    public void testAuth() {
//        SecretAuthConfig config = ConfigFactory.create(SecretAuthConfig.class, System.getProperties());
//
//        assertThat(config.username()).isEqualTo("Leo");
//        assertThat(config.password()).isEqualTo("123");
//    }
//
//    @Test
//    public void testAuthSecretFile() throws IOException {
//
////        String content = "username=secret-user\npassword=secret-pass";
////        Path secret = Paths.get("C:/Users/admin/Desktop/tmp/secret.properties");
////
////        Files.write(secret, content.getBytes(StandardCharsets.UTF_8));
//
//        SecretAuthConfig config = ConfigFactory.create(SecretAuthConfig.class, System.getProperties());
//
//
//        assertThat(config.username()).isEqualTo("secret-user");
//        assertThat(config.password()).isEqualTo("secret-pass");
//
//        //Files.delete(secret);
//
//    }
//
//}
