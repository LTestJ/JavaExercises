package restAPI;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

import org.apache.commons.lang3.RandomStringUtils;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TestDisplyUserDetails {          
	
	@Test
	public void displyUserDetails() throws IOException 
	{	        
		RequestSpecification request=RestAssured.given(); 
		request.header("Content-Type","application/x-www-form-urlencoded");	
		request.body("api_dev_key=6c2e400f5df158b657b692687c0dc347&"
				   + "api_user_key=8c87a30fd3d053bcbf2887fad3abcc85&"			   
				   + "api_option=userdetails");	
		
		Response response=request.post("https://pastebin.com/api/api_post.php");		
		int responseStatus=response.getStatusCode(); 	
		Assert.assertEquals(responseStatus, 200); 		
		
		String expected = "<user>\r\n" + 
				"<user_name>Jose_Devassy</user_name>\r\n" + 
				"<user_format_short>text</user_format_short>\r\n" + 
				"<user_expiration>N</user_expiration>\r\n" + 
				"<user_avatar_url>https://pastebin.com/i/guest.png</user_avatar_url>\r\n" + 
				"<user_private>0</user_private>\r\n" + 
				"<user_website></user_website>\r\n" + 
				"<user_email>jose123go@gmail.com</user_email>\r\n" + 
				"<user_location></user_location>\r\n" + 
				"<user_account_type>0</user_account_type>\r\n" + 
				"</user>";
		Assert.assertEquals(response.asString(), expected);
	}		
}