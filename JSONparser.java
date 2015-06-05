import java.io.IOException;
import org.apache.http.client.fluent.Request;
import org.json.*;

public class Clever {
	
	static int stu_count=0;

	public static void main(String[] args) throws JSONException {
		
		String body;
		int i,j,sec_count=0;
		JSONObject jObject;
		JSONArray jArray;
		JSONArray jArr;
		
		try {
			body = Request.Get("https://api.clever.com/v1.1/sections")
			                     .addHeader("Authorization", "Bearer DEMO_TOKEN")
			                     .execute().returnContent().asString();
			
			jObject = new JSONObject(body);
			jArray =  new JSONArray(jObject.get("data").toString());	
						
			for (i=0;i<jArray.length();i++) {
				++sec_count;
				jArr= jArray.getJSONObject(i).getJSONObject("data").getJSONArray("students");
				for (j=0; j<jArr.length();j++)
				++stu_count;
			}
			//(float)
			System.out.println("The average number of students per section = "+(Math.round((float)stu_count/sec_count)));
			
		} catch (IOException e) {		
			e.printStackTrace();
		}		
	}
}