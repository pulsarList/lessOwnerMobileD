package helpers;

import static io.restassured.RestAssured.given;


public class Browserstack {

    // curl -u "bsuser_QuzLj5:UTxffAFqcq4BNQLc7Ssw" -X GET "https://api.browserstack.com/app-automate/sessions/0359d759d2aaa4f46401dac46bd281b6d9b24943.json"
    // automation_session.video_url

    public static String videoUrl(String sessionId) {
        String url = String.format("https://api.browserstack.com/app-automate/sessions/%s.json", sessionId);

        return given()
                .auth().basic("bsuser_QuzLj5", "UTxffAFqcq4BNQLc7Ssw")
                .get(url)
                .then()
                .log().status()
                .log().body()
                .statusCode(200)
                .extract().path("automation_session.video_url");//JSON
    }
}
