package apitests;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class ApiCrud {
    String baseUrl = "https://gorest.co.in/public/v2";

    @Test(description = "create resource via get request")
    public void test01_createResource() {
        Response response = given()
                .log()
                .all()
                .contentType(ContentType.JSON)
                .param("gender")
                .when()
                .get(baseUrl + "/users")
                .then()
                .extract()
                .response();

        int male = response("gender.male");
        int female = response.path("gender.female");
        System.out.println(male);
        System.out.println(female);
        Assert.assertEquals(male, female);



    }
}
