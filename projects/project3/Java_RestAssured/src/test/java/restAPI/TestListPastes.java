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

public class TestListPastes {
	
	@Test
	public void listPastes() throws IOException
	{	
		//Step1: Create paste	
		String randomSuffix = String.valueOf(TestHelp.getRandomNum());
		String content = "My content" + randomSuffix;
		String title = "MyTitle" + randomSuffix; 
		String pasteKey = TestHelp.createPasteWithTitle(content, title);
		
        //Step 2 : Verify validity of the created paste
        String pasteURL = "https://pastebin.com/" + pasteKey;
        HttpURLConnection pasteConn = TestHelp.getURL(pasteURL);
        int urlStatus = pasteConn.getResponseCode();
        Assert.assertEquals(urlStatus, 200);
		
		//Step3: Listing all pastes of the user		
		RequestSpecification request=RestAssured.given();
		request.header("Content-Type","application/x-www-form-urlencoded");	
		request.body("api_dev_key=6c2e400f5df158b657b692687c0dc347&"
				   + "api_user_key=8c87a30fd3d053bcbf2887fad3abcc85&" 					  
				   + "api_result_limit=10&"
				   + "api_option=list"
				   );	
	
		Response response=request.post("https://pastebin.com/api/api_post.php");		
		int responseStatus=response.getStatusCode();	
		Assert.assertEquals(responseStatus, 200);
		System.out.println(response.asString());
	}	
}