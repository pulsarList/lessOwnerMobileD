//package owner.config;
//
//import org.aeonbits.owner.ConfigFactory;
//import org.junit.jupiter.api.Test;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//public class FruitsTest {
//
//    @Test
//    public void test1() {
//        System.setProperty("array", "banana, apple");
//
//        FruitsConfig config = ConfigFactory.create(FruitsConfig.class, System.getProperties());
//
//        assertThat(config.getFruitsArray()).containsExactly("banana", "apple");
//    }
//
//    @Test
//    public void test2() {
//        System.setProperty("list", "banana1, orange1");
//
//        FruitsConfig config = ConfigFactory.create(FruitsConfig.class, System.getProperties());
//
//        assertThat(config.getFruitsArrayList()).containsExactly("banana1", "orange1");
//
//    }
//
//    @Test
//    public void test3() {
//        //System.setProperty("array", "banana, orange");
//
//        FruitsConfig config = ConfigFactory.create(FruitsConfig.class, System.getProperties());
//
//        assertThat(config.getFruitsArrayDefault()).containsExactly("orange", "apple");
//
//    }
//
//    @Test
//    public void test4() {
//       // System.setProperty("list-separator", "banana, orange");
//
//        FruitsConfig config = ConfigFactory.create(FruitsConfig.class, System.getProperties());
//
//        assertThat(config.getFruitsArrayListSeparator()).containsExactly("orange", "banana");
//
//    }
//}
