import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class JobApi_POST_Request {

	@Test
	void AddJobDetails()
	{
		
		// Specify Base URL
		RestAssured.baseURI="https://numpyninja-joblistapi.herokuapp.com";
		
		
		//Request Object
		RequestSpecification getRequest=RestAssured.given();
		
		
		
		//Request Parameters sending along with post request
	JSONObject requestParams = new JSONObject();
	requestParams.put("Job Id", "3000");
	requestParams.put("Job Title", "Sdet");
	requestParams.put("Job Location", "Texas");
	requestParams.put("Job Company Name", "FSD");
	requestParams.put("Job Type", "Permanent");
	requestParams.put("Job Posted time", "Yesterday");
	requestParams.put("Job Description", "CuCumber");
	
	getRequest.header("Content-Type", "application/json");
	getRequest.body(requestParams.toJSONString());
	
	//Response Object
	Response response=getRequest.request(Method.POST,"/Jobs");
			
	
	
	String responseBody =response.getBody().asString();
	
	System.out.println("Response Body is:" +responseBody);
	
	//status code validation
	
		int statusCode=response.getStatusCode();
	System.out.println("status code is:" +statusCode);
	Assert.assertEquals(statusCode, "201");
	
}
}
