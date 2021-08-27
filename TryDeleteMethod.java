import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class TryDeleteMethod {

	@Test
public void deletemethod() {
	
		given().
		baseUri("https://numpyninja-joblistapi.herokuapp.com/Jobs").
		header("Content-Type", "application/json").
		

        when()
               .delete("3049").
        then()
               .assertThat().statusCode(200).
		log().all();
           //    .body("message", equalTo("Successfully! Record has been deleted"));

//System.out.println("Response :" + validatableResponse.extract().asPrettyString());

}

}

		
