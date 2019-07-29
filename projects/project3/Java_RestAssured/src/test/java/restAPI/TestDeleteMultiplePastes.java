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
	//Function to create random content
	static int getRandomNum() {
		Random rand = new Random(); 
		return rand.nextInt(1000);		
	}
	//Function to create a new paste
    public static String createNewPaste(String content,String title)                                                                  
    {                                                                                                                                                
		RequestSpecification request=RestAssured.given();                                                                                               
		request.header("Content-Type","application/x-www-form-urlencoded");                                                                             
		request.body("api_dev_key=6c2e400f5df158b657b692687c0dc347&"                                                                                    
			+ "api_user_key=8c87a30fd3d053bcbf2887fad3abcc85&"                                                                   
			+ "api_option=paste&"                                                                                                
			+ "api_paste_code=" + content + "&"
			+ "api_paste_name=" + title
			);                                                                                   
		//creating new paste	
		Response response=request.post("https://pastebin.com/api/api_post.php");                                                                      
		int responseStatus=response.getStatusCode();                                                                                                  
		Assert.assertEquals(responseStatus, 200); 
		String[] parts = response.asString().split("/");
		return parts[parts.length-1];
    }
	
	@Test
	public void deleteMultiplePastes() throws IOException
	{	
		//Step1: calling function to create multiple new paste
		String[] pasteKey = new String[3];
		for (int i = 0; i < 3; i++) {
			String randomSuffix = String.valueOf(getRandomNum());
			String content = "My content" + randomSuffix;
			String title = "My Title" + randomSuffix;
			pasteKey[i] = createNewPaste(content, title);
		}
		
		//Step2: deleting the pastes
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
			String url1 = "https://pastebin.com/" + pasteKey[i];
			System.out.println(url1);
			final URL url = new URL(url1);
		    HttpURLConnection huc =  (HttpURLConnection)  url.openConnection(); 
		    huc.setRequestMethod("GET");
		    huc.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows; U; "
		    		+ "Windows NT 6.0; en-US; rv:1.9.1.2) Gecko/20090729 Firefox/3.5.2 (.NET CLR 3.5.30729)");//setting up input http  header
		    huc.connect(); 		
		    int urlStatus = huc.getResponseCode();
			Assert.assertEquals(urlStatus, 404);	
		}		
	}	
}