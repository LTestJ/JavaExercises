package restAPI;


import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class TestHelp {
	
	//Function to create random content
	public static int getRandomNum() {
		Random rand = new Random(); 
		return rand.nextInt(1000);		
	}
	public static String getDate() {
		Date today = new Date();
		return today.toString();
	}		
	
	public static String getRandomString(String prefix) {	
		int length=5;
		Boolean useLetters=true;
		Boolean useNumbers=true;			
		prefix = RandomStringUtils.random(length, useLetters, useNumbers);
		return prefix;
	}
    //Function to get a given URL
    public static HttpURLConnection getURL(String targetUrl) throws IOException {
        final URL url = new URL(targetUrl);
        HttpURLConnection huc =  (HttpURLConnection)  url.openConnection();
        huc.setRequestMethod("GET");
        huc.setRequestProperty("User-Agent", "Jose Test code");
        huc.connect();
        return huc;
    }
	//Function to create Paste with given content
    public static String createPaste(String content)                                                                  
    {                                                                                                                                                
		RequestSpecification request=RestAssured.given();                                                                                               
		request.header("Content-Type","application/x-www-form-urlencoded");                                                                             
		request.body("api_dev_key=6c2e400f5df158b657b692687c0dc347&"                                                                                    
			+ "api_user_key=8c87a30fd3d053bcbf2887fad3abcc85&"                                                                   
			+ "api_option=paste&"                                                                                                
			+ "api_paste_code=" + content 
			);                                                                                   
		//creating new paste and verifying its status	
		Response response=request.post("https://pastebin.com/api/api_post.php");                                                                      
		int responseStatus=response.getStatusCode();                                                                                                  
		Assert.assertEquals(responseStatus, 200); 
		String[] parts = response.asString().split("/");
		return parts[parts.length-1];		
    }
	
	//Function to delete Paste with given content
    public static void deletePaste(String pasteKey)                                                                  
    {                                                                                                                                                
		RequestSpecification request=RestAssured.given();                                                                                               
		request.header("Content-Type","application/x-www-form-urlencoded");                                                                             
		request.body("api_dev_key=6c2e400f5df158b657b692687c0dc347&"                                                                                    
			+ "api_user_key=8c87a30fd3d053bcbf2887fad3abcc85&"                                                                   
			+ "api_option=delete&"
			+ "api_paste_key=" + pasteKey
			);                                                                                   
		//verifying response status	
		Response response=request.post("https://pastebin.com/api/api_post.php");		
		int responseStatus=response.getStatusCode();	
		Assert.assertEquals(responseStatus, 200); 		
    }
    
  //Function to create paste with Json Format
    public static String createPasteFormatJson(String content)                                                                  
    {                                                                                                                                                
		RequestSpecification request=RestAssured.given();                                                                                               
		request.header("Content-Type","application/x-www-form-urlencoded");                                                                             
		request.body("api_dev_key=6c2e400f5df158b657b692687c0dc347&"                                                                                    
			+ "api_user_key=8c87a30fd3d053bcbf2887fad3abcc85&"                                                                   
			+ "api_option=paste&"                                                                                                
			+ "api_paste_code=" + content + "&"
			+ "api_paste_format=json"
			);                                                                                   
		//Verifying status creating new paste	
		Response response=request.post("https://pastebin.com/api/api_post.php");                                                                      
		int responseStatus=response.getStatusCode();                                                                                                  
		Assert.assertEquals(responseStatus, 200); 
		String[] parts = response.asString().split("/");
		return parts[parts.length-1];
    }
	
	//Function to create paste with expireDate=1 year
    public static String createPasteExpireDate1Y(String content)                                                                  
    {                                                                                                                                                
		RequestSpecification request=RestAssured.given();                                                                                               
		request.header("Content-Type","application/x-www-form-urlencoded");                                                                             
		request.body("api_dev_key=6c2e400f5df158b657b692687c0dc347&"                                                                                    
			+ "api_user_key=8c87a30fd3d053bcbf2887fad3abcc85&"                                                                   
			+ "api_option=paste&"                                                                                                
			+ "api_paste_code=" + content + "&"
			+ "api_paste_expire_date=1Y"
			);                                                                                   
		//Verifying status creating new paste	
		Response response=request.post("https://pastebin.com/api/api_post.php");                                                                      
		int responseStatus=response.getStatusCode();                                                                                                  
		Assert.assertEquals(responseStatus, 200); 
		String[] parts = response.asString().split("/");
		return parts[parts.length-1];
    }
    
	//Function to create paste with given content and Xml format 
    public static String createPasteFormatXml(String content)                                                                  
    {                                                                                                                                                
		RequestSpecification request=RestAssured.given();                                                                                               
		request.header("Content-Type","application/x-www-form-urlencoded");                                                                             
		request.body("api_dev_key=6c2e400f5df158b657b692687c0dc347&"                                                                                    
			+ "api_user_key=8c87a30fd3d053bcbf2887fad3abcc85&"                                                                   
			+ "api_option=paste&"                                                                                                
			+ "api_paste_code=" + content + "&"
			+ "api_paste_format=xml"
			);                                                                                   
		//Verifying status creating new paste with given content and format XML	
		Response response=request.post("https://pastebin.com/api/api_post.php");                                                                      
		int responseStatus=response.getStatusCode();                                                                                                  
		Assert.assertEquals(responseStatus, 200); 
		String[] parts = response.asString().split("/");
		return parts[parts.length-1];
    }
    
	//Function to create paste with given content and given title
    public static String createPasteWithTitle(String title, String content)                                                                  
    {                                                                                                                                                
		RequestSpecification request=RestAssured.given();                                                                                               
		request.header("Content-Type","application/x-www-form-urlencoded");                                                                             
		request.body("api_dev_key=6c2e400f5df158b657b692687c0dc347&"                                                                                    
			+ "api_user_key=8c87a30fd3d053bcbf2887fad3abcc85&"                                                                   
			+ "api_option=paste&"                                                                                                
			+ "api_paste_code=" + content + "&"
			+ "api_paste_name=" + title
			);                                                                                   
		//Verifying status creating new paste	
		Response response=request.post("https://pastebin.com/api/api_post.php");                                                                      
		int responseStatus=response.getStatusCode();                                                                                                  
		Assert.assertEquals(responseStatus, 200); 
		String[] parts = response.asString().split("/");
		return parts[parts.length-1];
    }
    
	//Function to create private paste with given content and private=2
    public static String createPastePrivate2(String content)                                                                  
    {                                                                                                                                                
		RequestSpecification request=RestAssured.given();                                                                                               
		request.header("Content-Type","application/x-www-form-urlencoded");                                                                             
		request.body("api_dev_key=6c2e400f5df158b657b692687c0dc347&"                                                                                    
			+ "api_user_key=8c87a30fd3d053bcbf2887fad3abcc85&"                                                                   
			+ "api_option=paste&"                                                                                                
			+ "api_paste_code=" + content + "&"
			+ "api_paste_private=2"
			);                                                                                   
		//sending request to create new paste	
		Response response=request.post("https://pastebin.com/api/api_post.php");                                                                      
		int responseStatus=response.getStatusCode();                                                                                                  
		Assert.assertEquals(responseStatus, 200); 
		String[] parts = response.asString().split("/");
		return parts[parts.length-1];
    }
    
}