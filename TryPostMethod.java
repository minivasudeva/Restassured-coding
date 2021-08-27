import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class TryPostMethod {
	@Test
	public void testPost() {

JSONObject json = new JSONObject();
json.put("Job Id", "3049");
json.put("Job Title", "API Testing");
json.put("Job Location", "WestTexas11");
json.put("Job Company Name", "FSDd");
json.put("Job Type", "Permanent");
json.put("Job Posted time", "Yesterday");
json.put("Job Description", "CuCumber Behave1");
	given().
	header("Content-Type", "application/json").
	body(json.toJSONString()).
	when().
	post("https://numpyninja-joblistapi.herokuapp.com/Jobs").
then().
log().all().
	statusCode(201);
	
	
	}}
