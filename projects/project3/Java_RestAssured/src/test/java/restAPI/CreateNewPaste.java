package restAPI;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateNewPaste {
	   
	static String getDate() {
		Date today = new Date();
		return today.toString();
	}		
	
	static int getRandomNum(int rand_int) {
		Random rand = new Random(); 
		rand_int = rand.nextInt(1000);
		return rand_int;
	}
	
	static String getRandomString(String prefix) {	
		int length=5;
		Boolean useLetters=true;
		Boolean useNumbers=true;			
		prefix = RandomStringUtils.random(length, useLetters, useNumbers);
		return prefix;
	}
	
	@Test
	public void newPaste1() throws IOException
	{	
		// creating a new paste, 
		// creating a new paste with random titles with current date
		// creating a new private paste
		// creating a new paste with json format output
		// creating a new paste with an expire date
		RequestSpecification request=RestAssured.given();
		request.header("Content-Type","application/x-www-form-urlencoded");	
		request.body("api_dev_key=6c2e400f5df158b657b692687c0dc347&"
				   + "api_option=paste&"
				   + "api_paste_code=hello 612_1x15&"
				   + "api_paste_name=MyTitle" 
				   + getRandomNum(1000)
				   + getRandomString(RandomStringUtils.random(5, true, true)) 
				   + getDate() + "&"
				   + "api_user_key=b07ba99ab58cf19e26ae0fbb31974108&"
				   + "api_paste_format=json&"
				   + "api_paste_private=2&"
				   + "api_paste_expire_date=1M");	
		
		Response response=request.post("https://pastebin.com/api/api_post.php");		
		int responseStatus=response.getStatusCode();	
		Assert.assertEquals(responseStatus, 200);					

		final URL url = new URL(response.asString());
	    HttpURLConnection huc =  (HttpURLConnection)  url.openConnection(); 
	    huc.setRequestMethod("GET"); //OR  huc.setRequestMethod ("HEAD");
	    huc.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows; U; "
	    		+ "Windows NT 6.0; en-US; rv:1.9.1.2) Gecko/20090729 Firefox/3.5.2 (.NET CLR 3.5.30729)");//setting up input http  header
	    huc.connect(); 		
	    int urlStatus = huc.getResponseCode() ;
		Assert.assertEquals(urlStatus, 200);						
	}		
}