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

public class TestCreateMultiplePasteAndList { 
                                                   
	@Test
	public void createMultiplePasteAndList() throws IOException, InterruptedException
	{	
		// create multiple new pastes   
		String[] pasteKey = new String[3];
		for (int i = 0; i < 3; i++) {
	        String randomSuffix = String.valueOf(TestHelp.getRandomNum());
	        String title = "MyTitle" + randomSuffix;                                                                                                        
	        String content = "My Content" + randomSuffix;                                                                                                    
	        pasteKey[i] = TestHelp.createPasteWithTitle(title, content); 
		}
        //listing private pastes
		RequestSpecification request=RestAssured.given();
		request.header("Content-Type","application/x-www-form-urlencoded");	
		request.body("api_dev_key=6c2e400f5df158b657b692687c0dc347&"
						   + "api_user_key=8c87a30fd3d053bcbf2887fad3abcc85&"
						   + "api_result_limit=10&"				   
						   + "api_option=list");	
		
		Response response=request.post("https://pastebin.com/api/api_post.php");		
		int responseStatus=response.getStatusCode();
		Assert.assertEquals(responseStatus, 200);			
		System.out.println(response.asString());	
		
		//Step4: delete all the newly created pastes
		for (int i = 0; i < 3; i++) {
			deletePaste(pasteKey[i]);	
			Thread.sleep(10000);
		}
	}	
	
	public void deletePaste(String pasteKey) throws IOException 
	{	
		//Function to delete the created paste		
		TestHelp.deletePaste(pasteKey);
		
		//Verify deleted paste does not exist		
		String url1 = "https://pastebin.com/" + pasteKey;	
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