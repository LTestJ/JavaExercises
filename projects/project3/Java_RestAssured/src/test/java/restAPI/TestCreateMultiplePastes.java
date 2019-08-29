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

public class TestCreateMultiplePastes {
	
	@Test
	public void createMultiplePastesTest() throws IOException
	{	
		// calling createNewPaste function	
		String[] pasteKey = new String[3];
		for (int i = 0; i < 3; i++) {	
			String randomSuffix = String.valueOf(TestHelp.getRandomNum());
			String title = "My Titile" + randomSuffix;
			String content = "My content" + randomSuffix;
			pasteKey[i] = TestHelp.createPasteWithTitle(title, content);	
		}
	
		//Step 2: Fetch the created pastes
		for (int i = 0; i < 3; i++) {
			RequestSpecification request=RestAssured.given();
			request.header("Content-Type","application/x-www-form-urlencoded");	
			request.body("api_dev_key=6c2e400f5df158b657b692687c0dc347&"
					   + "api_user_key=8c87a30fd3d053bcbf2887fad3abcc85&" 
					   + "api_option=paste&"
					   + "api_paste_key=" + pasteKey[i]);
			
			//verify response status
			Response response=request.post("https://pastebin.com/api/api_post.php");		
			int responseStatus=response.getStatusCode();	
			Assert.assertEquals(responseStatus, 200);
		}
		
		//step 3: verify each obtained paste is complete
		for (int i = 0; i < 3; i++) {				
			String rawPasteURL = "https://pastebin.com/" + pasteKey[i];	
			System.out.println(rawPasteURL);
		    HttpURLConnection rawPasteConn = TestHelp.getURL(rawPasteURL); 
		    int urlStatus = rawPasteConn.getResponseCode();
			Assert.assertEquals(urlStatus, 200);		
		}
	}	
}