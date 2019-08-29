package restAPI;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Random;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DisplayUserDetails {
    // How to do Deep verification--display user details
    // In order to list pastes, should we create a paste or user 
   static int getRandomNum() {                                                                                                                         
        Random rand = new Random(); 
        return rand.nextInt(1000);                                                                                                                      
    } 

    public static String createPaste(String title, String content) throws IOException                                                                  
    {                                                                                                                                                   
		RequestSpecification request=RestAssured.given();                                                                                               
		request.header("Content-Type","application/x-www-form-urlencoded");                                                                             
		request.body("api_dev_key=6c2e400f5df158b657b692687c0dc347&"                                                                                    
			+ "api_user_key=8c87a30fd3d053bcbf2887fad3abcc85&"                                                                   
			+ "api_option=paste&"                                                                                                
			+ "api_paste_code=" + content + "&"                                                                                  
			+ "api_paste_name=" + title + "&");                                                                                   
			
		Response response=request.post("https://pastebin.com/api/api_post.php");                                                                      
		int responseStatus=response.getStatusCode();                                                                                                  
		Assert.assertEquals(responseStatus, 200);                                                                                                     
		String[] parts = response.asString().split("/");
		return parts[parts.length-1];  			
    }                                     	
	@Test
	public void displyUserDetails() throws IOException
	{	
		// Create a paste                         
        String randomSuffix = String.valueOf(getRandomNum());
        String title = "MyTitle" + randomSuffix;                                                                                                        
        String content = "MyContent" + randomSuffix;                                                                                                    
        String pasteKey = createPaste(title, content); 
        
		RequestSpecification request=RestAssured.given();
		request.header("Content-Type","application/x-www-form-urlencoded");	
		request.body("api_dev_key=6c2e400f5df158b657b692687c0dc347&"
				   + "api_user_key=8c87a30fd3d053bcbf2887fad3abcc85&"			   
				   + "api_option=userdetails");	
		
		Response response=request.post("https://pastebin.com/api/api_post.php");		
		int responseStatus=response.getStatusCode();	
		Assert.assertEquals(responseStatus, 200);			
		System.out.println(response.asString());								
	}		
}