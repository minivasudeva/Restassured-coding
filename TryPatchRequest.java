import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class TryPatchRequest {
	@Test
	public void testPatch() {

		JSONObject json = new JSONObject();
		json.put("Job Id", "3044");
		json.put("Job Title", "API Testing/webservice");
		json.put("Job Location", "WestTexas11");
		json.put("Job Company Name", "FSDd");
		json.put("Job Type", "Permanent/Contract");
		json.put("Job Posted time", "Today");
		json.put("Job Description", "CuCumber Behave1");
			given().
			header("Content-Type", "application/json").
			body(json.toJSONString()).
			when().
			put("https://numpyninja-joblistapi.herokuapp.com/Jobs").
		then().
		log().all();
		//statusCode(200);
			
			
			}}

	
	
	


