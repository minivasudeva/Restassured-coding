import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class TryGetMethod {
	@Test
	public void testGet() {
		given().
		get("https://numpyninja-joblistapi.herokuapp.com/Jobs").
		then().
		statusCode(200).
		log().all();
		
		
	}

}
