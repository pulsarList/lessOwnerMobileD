package _lesson.helpers;

import static _lesson.helpers.CustomAllureListener.withCustomTemplates;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.proxy;


public class Browserstack {

    public static String videoUrl(String sessionId) {
        String url = String.format("https://api.browserstack.com/app-automate/sessions/%s.json", sessionId);

        return given()
                .filter(withCustomTemplates())
                .auth().basic(proxy.getUsername(), proxy.getPassword())
                .get(url)
                .then()
                .log().status()
                .log().body()
                .statusCode(200)
                .extract().path("automation_session.video_url");//JSON
    }
}
