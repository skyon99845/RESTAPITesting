import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;


public class RESTAPII {
    //"https://restapi.demoqa.com/utilities/weather/city"
    @Test
    public void GetWeatherDetails()
    {
        RestAssured.baseURI="https://www.tutorialspoint.com";
        RequestSpecification httpRequest=RestAssured.given();
        Response response = httpRequest.get("/http/http_status_codes.htm");

        int statusCode = response.getStatusCode();

        assertEquals(statusCode, response.getStatusCode());
        assertEquals(statusCode ,200);
    }

    @Test
    public void NegativeGetWeatherDetails()
    {
        RestAssured.baseURI="https://www.tutorialspoint.com";
        RequestSpecification httpRequest=RestAssured.given();
        Response response = httpRequest.get("/http/http_status");

        int statusCode = response.getStatusCode();

        assertEquals(statusCode, response.getStatusCode());
        assertEquals(statusCode ,200);
    }
}
