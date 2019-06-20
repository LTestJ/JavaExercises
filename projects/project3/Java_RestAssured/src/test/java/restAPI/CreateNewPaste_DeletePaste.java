package restAPI;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateNewPaste_DeletePaste {
	
	@Test
	public void newPaste1() throws IOException
	{	//delete paste	
		RequestSpecification request=RestAssured.given();
		request.header("Content-Type","application/x-www-form-urlencoded");	
		request.body("api_dev_key=6c2e400f5df158b657b692687c0dc347&"
				   + "api_user_key=b07ba99ab58cf19e26ae0fbb31974108&"			   
				   + "api_option=delete&"
				   + "api_paste_key=kExkMzFp");
		
		Response response=request.post("https://pastebin.com/api/api_post.php");		
		int responseStatus=response.getStatusCode();	
		Assert.assertEquals(responseStatus, 200);			
		System.out.println(response.asString());								
	}		
}