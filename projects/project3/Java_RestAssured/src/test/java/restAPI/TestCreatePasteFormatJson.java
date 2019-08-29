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
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class TestCreatePasteFormatJson  {
	
	
	@Test
	public void testCreatePasteFormatJson() throws IOException
	{	
		//Step1: calling function to create paste 	
		String randomSuffix = String.valueOf(TestHelp.getRandomNum());
		String content = "My content" + randomSuffix;
		String pasteKey = TestHelp.createPasteFormatJson(content);

		//Step2: Fetch the created paste to check for validity
		String url1 = "https://pastebin.com/" + pasteKey;
	    HttpURLConnection huc =  TestHelp.getURL(url1);	     		
	    int urlStatus = huc.getResponseCode();
		Assert.assertEquals(urlStatus, 200);	
		
		//Step3: verify created paste has the same content as in Step 1		
        String rawPasteURL = "https://pastebin.com/raw/" + pasteKey;
        HttpURLConnection rawPasteConn = TestHelp.getURL(rawPasteURL);        
        //Get content here
        BufferedReader in = new BufferedReader(
        		 new InputStreamReader(rawPasteConn.getInputStream()));
        String rawContent;
        StringBuffer content1 = new StringBuffer();
        while ((rawContent = in.readLine()) != null) {
        	content1.append(rawContent);
        	
        System.out.println("Content1: " + content1);
        System.out.println("Content: " + content);       
        }
        
        //assert the content is same as content above
        Assert.assertEquals(content1.toString(), content);
        
        //Step4: verify created paste has content in Json format
        
	}	
}