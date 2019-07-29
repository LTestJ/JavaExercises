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

public class TestCreateNewPastesMultiple {
	
	static int getRandomNum() {
		Random rand = new Random(); 
		return rand.nextInt(1000);		
	}

    public static String createNewPaste(String title, String content)                                                                  
    {                                                                                                                                                 
		RequestSpecification request=RestAssured.given();                                                                                               
		request.header("Content-Type","application/x-www-form-urlencoded");                                                                             
		request.body("api_dev_key=6c2e400f5df158b657b692687c0dc347&"                                                                                    
			+ "api_user_key=8c87a30fd3d053bcbf2887fad3abcc85&"                                                                   
			+ "api_option=paste&"                                                                                                
			+ "api_paste_code=" + content + "&"                                                                                  
			+ "api_paste_name=" + title + "&"
			);                                                                                   
			
		Response response=request.post("https://pastebin.com/api/api_post.php");                                                                      
		int responseStatus=response.getStatusCode();                                                                                                  
		Assert.assertEquals(responseStatus, 200); 
		String[] parts = response.asString().split("/");
		return parts[parts.length-1];
    }
	
	@Test
	public void createMultiplePastesTest() throws IOException
	{	
		// calling createNewPaste function	
		String[] pasteKey = new String[2];
		for (int i = 0; i < 2; i++) {	
			String randomSuffix = String.valueOf(getRandomNum());
			String title = "My Titile" + randomSuffix;
			String content = "My content" + randomSuffix;
			pasteKey[i] = createNewPaste(title, content);	
		}
	
		//Step 2: Fetch the created pastes
		for (int i = 0; i < 2; i++) {
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
		for (int i = 0; i < 2; i++) {
			String url1 = "https://pastebin.com/" + pasteKey[i];
			final URL url = new URL(url1);
		    HttpURLConnection huc =  (HttpURLConnection)  url.openConnection(); 
		    huc.setRequestMethod("GET"); //OR  huc.setRequestMethod ("HEAD");
		    huc.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows; U; "
		    		+ "Windows NT 6.0; en-US; rv:1.9.1.2) Gecko/20090729 Firefox/3.5.2 (.NET CLR 3.5.30729)");//setting up input http  header
		    huc.connect(); 		
		    int urlStatus = huc.getResponseCode();
			Assert.assertEquals(urlStatus, 200);	
			System.out.println("url: " + url);		
		}
	}	
}