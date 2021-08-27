
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSenderOptions;
import io.restassured.specification.RequestSpecification;

public class Delete_Request {
	
	@SuppressWarnings("unchecked")
	@Test
	
	public void deleteRequest() {
		
	
RestAssured.baseURI="https://numpyninja-joblistapi.herokuapp.com";
RestAssured.basePath= "/Jobs";

RequestSpecification deleteRequest=RestAssured.given();
//JSONObject requestParam = new JSONObject();

//deleteRequest.header("Content-Type", "application/json");
//deleteRequest.body(requestParam.toJSONString());
Response response=deleteRequest.delete("3049");
System.out.println(response);


//String responseBody =response.getBody().asString();

//System.out.println("Response Body is:" +responseBody);


}
}