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

public class CreateNewPaste {
	
	static int getRandomNum() {
		Random rand = new Random(); 
		return rand.nextInt(1000);		
	}
	   
	static String getDate() {
		Date today = new Date();
		return today.toString();
	}		
	
	static String getRandomString(String prefix) {	
		int length=5;
		Boolean useLetters=true;
		Boolean useNumbers=true;			
		prefix = RandomStringUtils.random(length, useLetters, useNumbers);
		return prefix;
	}
    public static String createPaste(String title, String content)                                                                  
    {   // --with json format output
		// --with an expire date                                                                                                                                               
		RequestSpecification request=RestAssured.given();                                                                                               
		request.header("Content-Type","application/x-www-form-urlencoded");                                                                             
		request.body("api_dev_key=6c2e400f5df158b657b692687c0dc347&"                                                                                    
			+ "api_user_key=8c87a30fd3d053bcbf2887fad3abcc85&"                                                                   
			+ "api_option=paste&"                                                                                                
			+ "api_paste_code=" + content + "&"                                                                                  
			+ "api_paste_name=" + title + "&"
			+ "api_paste_format=json&"
			+ "api_paste_private=2&"
			+ "api_paste_expire_date=1Y"
			);                                                                                   
			
		Response response=request.post("https://pastebin.com/api/api_post.php");                                                                      
		int responseStatus=response.getStatusCode();                                                                                                  
		Assert.assertEquals(responseStatus, 200); 
		String[] parts = response.asString().split("/");
		return parts[parts.length-1];
    }
	
	@Test
	public void newPasteRandomTitleWithDate() throws IOException
	{	
		// creating a new paste		
		String randomSuffix = String.valueOf(getRandomNum());
		String date = String.valueOf(getDate());
//		String text = getRandomString(String prefix);
		String text = getRandomString(RandomStringUtils.random(5, true, true));
		String title = "My Titile" + randomSuffix + date;
		String content = "My content" + randomSuffix;
		String pasteKey = createPaste(title, content);
		String url1 = "https://pastebin.com/" + pasteKey;
		
		RequestSpecification request=RestAssured.given();
		request.header("Content-Type","application/x-www-form-urlencoded");	
		request.body("api_dev_key=6c2e400f5df158b657b692687c0dc347&"
				   + "api_user_key=8c87a30fd3d053bcbf2887fad3abcc85&" 
				   + "api_option=paste&"
				   + "api_paste_key=" + pasteKey);	
		
		//verify response status
		Response response=request.post("https://pastebin.com/api/api_post.php");		
		int responseStatus=response.getStatusCode();	
		Assert.assertEquals(responseStatus, 200);
		
		//deep test -- verify obtained url is a complete url
		final URL url = new URL(url1);
	    HttpURLConnection huc =  (HttpURLConnection)  url.openConnection(); 
	    huc.setRequestMethod("GET"); //OR  huc.setRequestMethod ("HEAD");
	    huc.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows; U; "
	    		+ "Windows NT 6.0; en-US; rv:1.9.1.2) Gecko/20090729 Firefox/3.5.2 (.NET CLR 3.5.30729)");//setting up input http  header
	    huc.connect(); 		
	    int urlStatus = huc.getResponseCode() ;
		Assert.assertEquals(urlStatus, 200);	
		System.out.println("url: " + url);
	}	
}