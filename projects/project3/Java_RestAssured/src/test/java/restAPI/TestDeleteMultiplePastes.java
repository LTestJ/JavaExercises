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

public class TestDeleteMultiplePastes {

	@Test
	public void deleteMultiplePastes() throws IOException, InterruptedException
	{	
		//Step1: create multiple pastes
		String[] pasteKey = new String[3];
		for (int i = 0; i < 3; i++) {
			String randomSuffix = String.valueOf(TestHelp.getRandomNum());
			String content = "My content" + randomSuffix;
			String title = "My Title" + randomSuffix;
			pasteKey[i] = TestHelp.createPasteWithTitle(content, title);
		}
		
		//Step2: deleting pastes
		for (int i = 0; i < 3; i++) {		
			RequestSpecification request=RestAssured.given();
			request.header("Content-Type","application/x-www-form-urlencoded");	
			request.body("api_dev_key=6c2e400f5df158b657b692687c0dc347&"
					   + "api_user_key=8c87a30fd3d053bcbf2887fad3abcc85&" 
					   + "api_option=delete&"
					   + "api_paste_key=" + pasteKey[i]);	
		
			//Sending request to Delete pastes
			Response response=request.post("https://pastebin.com/api/api_post.php");		
			int responseStatus=response.getStatusCode();	
			Assert.assertEquals(responseStatus, 200);
		}
		
		//Step3: verify deletion of pastes -- verify pastes do not exist
		for (int i = 0; i < 3; i++) {			
			//showing captcha error??
			String rawPasteURL = "https://pastebin.com/" + pasteKey[i];	
			System.out.println(rawPasteURL);
		    HttpURLConnection rawPasteConn = TestHelp.getURL(rawPasteURL); 
		    int urlStatus = rawPasteConn.getResponseCode();
			Assert.assertEquals(urlStatus, 404);	
			Thread.sleep(10000);
		}		
	}	
}