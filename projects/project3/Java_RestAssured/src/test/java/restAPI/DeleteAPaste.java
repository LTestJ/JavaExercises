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

public class DeleteAPaste {
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
	//create a paste and delete it--
	//do deep test--verify it is deleted--
	//fetch and make sure paste is missing
	
	@Test
    public void newPaste1() throws IOException
	{	
		// Create a paste   
        String randomSuffix = String.valueOf(getRandomNum());
        String title = "MyTitle" + randomSuffix;                                                                                                        
        String content = "MyContent" + randomSuffix;                                                                                                    
        String pasteKey = createPaste(title, content); 
        String url1 = "https://pastebin.com/" + pasteKey;
                                                       
		//fetch and delete that paste	
		RequestSpecification request=RestAssured.given();
		request.header("Content-Type","application/x-www-form-urlencoded");	
		request.body("api_dev_key=6c2e400f5df158b657b692687c0dc347&"
				   + "api_user_key=8c87a30fd3d053bcbf2887fad3abcc85&"			   
				   + "api_option=delete&"
				   + "api_paste_key=" + pasteKey);
		
		Response response=request.post("https://pastebin.com/api/api_post.php");		
		int responseStatus=response.getStatusCode();	
		Assert.assertEquals(responseStatus, 200);			
		System.out.println("response: " + response.asString());	
		System.out.println("url1: " + url1);
		
		//verify obtained url is NOT a complete url
		//vefrify that url is missing
		final URL url = new URL(url1);
	    HttpURLConnection huc =  (HttpURLConnection)  url.openConnection(); 
	    huc.setRequestMethod("GET"); //OR  huc.setRequestMethod ("HEAD");
	    huc.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows; U; "
	    		+ "Windows NT 6.0; en-US; rv:1.9.1.2) Gecko/20090729 Firefox/3.5.2 (.NET CLR 3.5.30729)");//setting up input http  header
	    huc.connect(); 		
	    int urlStatus = huc.getResponseCode() ;
		Assert.assertEquals(urlStatus, 404);	
		System.out.println("url: " + url);

//		Paste Removed
//		url1: https://pastebin.com/Yiyn761s
//		url: https://pastebin.com/Yiyn761s
//		PASSED: newPaste1
	}		
}