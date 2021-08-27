import org.json.simple.JSONObject;
import org.junit.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class AnotherPost_Request {
	
	
	
	@Test
	public void tryPost() {
		RequestSpecification request=RestAssured.given();
		request.header("Content-Type", "application/json");
		JSONObject json = new JSONObject();
		
		json.put("Job Id", "3004");
		json.put("Job Title", "API Testing");
		json.put("Job Location", "WestTexas");
		json.put("Job Company Name", "FSD");
		json.put("Job Type", "Permanent");
		json.put("Job Posted time", "Yesterday");
	json.put("Job Description", "CuCumber Behave");
		request.body(json.toJSONString());
		Response response = request.post("https://numpyninja-joblistapi.herokuapp.com/Jobs");
		
		System.out.println("Response Body is:" +json);
		
		int code = response.getStatusCode();
		System.out.println(code);
		Assert.assertEquals(code, 201);
		
		
	}

}
