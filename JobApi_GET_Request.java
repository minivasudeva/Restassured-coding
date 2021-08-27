
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class JobApi_GET_Request {
	
	@Test
	void JobDetails()
	{
		
		// Specify Base URL
		RestAssured.baseURI="https://numpyninja-joblistapi.herokuapp.com";
		
		
		//Request Object
		RequestSpecification getRequest=RestAssured.given();
		//Response Object
		Response response=getRequest.request(Method.GET,"/Jobs");
		
		//Print response in console window
		String responseBody =response.getBody().asString();
		
		System.out.println("Response Body is:" +responseBody);
		
		//status code validation
		int statusCode=response.getStatusCode();
		System.out.println("status code is:" +statusCode);
		Assert.assertEquals(statusCode, 200);
				
	}

}
