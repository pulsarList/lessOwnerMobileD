//package tests.local;
//
//import org.junit.jupiter.api.Test;
//
//import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
//import static com.codeborne.selenide.Condition.visible;
//import static com.codeborne.selenide.Selenide.*;
//import static io.appium.java_client.AppiumBy.*;
//import static io.qameta.allure.Allure.step;
//
//public class SearchTests extends TestBase {
//
//    @Test
//    void successfulSearchTestWikipedia() {
//
//        step("Skip onboarding screen", () -> {
//            //back();
//            $(id("org.wikipedia.alpha:id/fragment_onboarding_skip_button")).click();
//        });
//        step("Type search", () -> {
//            //back();
//            $(accessibilityId("Search Wikipedia")).click();
//            $(id("org.wikipedia.alpha:id/search_src_text")).sendKeys("Appium");
//        });
//        step("Verify content found", () ->
//                $$(id("org.wikipedia.alpha:id/page_list_item_title"))
//                        .shouldHave(sizeGreaterThan(0)));
//    }
//
//
//    @Test
//    void successfulSearchTestWikipedia1() {
//        step("Type search", () -> {
//            back();
//            $(accessibilityId("Search Wikipedia")).click();
//            $(id("org.wikipedia.alpha:id/search_src_text")).sendKeys("Appium");
//        });
//        step("Verify content found", () ->
//                $$(id("org.wikipedia.alpha:id/page_list_item_title"))
//                        .shouldHave(sizeGreaterThan(0)));
//
//        step("click on", () ->
//                $(id("org.wikipedia.alpha:id/page_list_item_image")).click());
//
//        step("text visible", () ->
//                $(id("org.wikipedia.alpha:id/page_web_view")).shouldHave(visible));
//
//
//    }
//
//    @Test
//    void successfulSearchTestWindows() {
//        step("Type search", () -> {
//            $(accessibilityId("Search Wikipedia")).click();
//            $(id("org.wikipedia.alpha:id/search_src_text")).sendKeys("Windows");
//        });
//        step("Verify content found", () ->
//                $$(id("org.wikipedia.alpha:id/page_list_item_title"))
//                        .shouldHave(sizeGreaterThan(0)));
//    }
//}
