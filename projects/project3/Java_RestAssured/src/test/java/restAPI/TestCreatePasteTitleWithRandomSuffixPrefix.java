package restAPI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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

public class TestCreatePasteTitleWithRandomSuffixPrefix {
	

	
	@Test
	public void newPasteWithRandomSuffixPrefix() throws IOException
	{	
		// creating a new paste		
		String randomSuffix = String.valueOf(TestHelp.getRandomNum());
		String date = String.valueOf(TestHelp.getDate());
		String text = TestHelp.getRandomString(RandomStringUtils.random(5, true, true));
		String title = text + "My Titile" + randomSuffix + date;
		String content = text + "My content" + randomSuffix;
		String pasteKey = TestHelp.createPasteWithTitle(title, content);
		
		//Step 2 : Verify validity of the created paste
		String url1 = "https://pastebin.com/" + pasteKey;
	    HttpURLConnection huc =  TestHelp.getURL(url1);	    	
	    int urlStatus = huc.getResponseCode();
		Assert.assertEquals(urlStatus, 200);	
		System.out.println("url: " + url1);
		
		//Step3: verify that created paste has the same content as created in step1
        String rawPasteURL = "https://pastebin.com/raw/" + pasteKey;
        HttpURLConnection rawPasteConn = TestHelp.getURL(rawPasteURL);        
        //Get content here
        BufferedReader in = new BufferedReader(
        		 new InputStreamReader(rawPasteConn.getInputStream()));
        String rawContent;
        StringBuffer content1 = new StringBuffer();
        while ((rawContent = in.readLine()) != null) {
        	content1.append(rawContent);
        }
	}	
}