//package owner.config;
//
//import org.aeonbits.owner.ConfigFactory;
//import org.junit.jupiter.api.Test;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//public class MobileTest {
//
//    @Test
//    public void TetsMobile() {
//
//        MobileConfig config = ConfigFactory.create(MobileConfig.class, System.getProperties());
//
//        assertThat(config.getDevice()).isEqualTo("iPhone 13 Pro Max");
//
//        assertThat(config.getPlatformName()).isEqualTo("IOS");
//
//        assertThat(config.getPlatformVersion()).isEqualTo("13");
//
//
//    }
//
//    @Test
//    public void TetsMobileOverride() {
//
//        System.setProperty("platform.version", "9.0");
//        System.setProperty("platform.name", "android");
//        System.setProperty("device.name", "Samsung S22");
//
//        MobileConfig config = ConfigFactory.create(MobileConfig.class, System.getProperties());
//
//        assertThat(config.getDevice()).isEqualTo("Samsung S22");
//
//        assertThat(config.getPlatformName()).isEqualTo("android");
//
//        assertThat(config.getPlatformVersion()).isEqualTo("9.0");
//
//
//    }
//
//
//    @Test
//    public void TetsMobileWithAndroid() {
//
////        System.setProperty("platform.version", "9.0");
////        System.setProperty("platform.name", "android");
//        System.setProperty("device", "google-pixel");
//
//        MobileConfig config = ConfigFactory.create(MobileConfig.class, System.getProperties());
//
//        assertThat(config.getDevice()).isEqualTo("Google Pixel");
//
//        assertThat(config.getPlatformName()).isEqualTo("android");
//
//        assertThat(config.getPlatformVersion()).isEqualTo("22");
//
//
//    }
//
//    @Test
//    public void TetsMobileWithIphone() {
//
////        System.setProperty("platform.version", "9.0");
////        System.setProperty("platform.name", "android");
//        System.setProperty("device", "iPhone");
//
//        MobileConfig config = ConfigFactory.create(MobileConfig.class, System.getProperties());
//
//        assertThat(config.getDevice()).isEqualTo("iPhone 13 Pro Max");
//
//        assertThat(config.getPlatformName()).isEqualTo("IOS");
//
//        assertThat(config.getPlatformVersion()).isEqualTo("13");
//
//
//    }
//}
