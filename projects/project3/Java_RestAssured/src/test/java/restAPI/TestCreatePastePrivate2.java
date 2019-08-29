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

public class TestCreatePastePrivate2 {
	
    @Test
	public void testCreatePastePrivate2() throws IOException
	{	
		//Step1: calling createNewPaste()	
		String randomSuffix = String.valueOf(TestHelp.getRandomNum());
		String content = "My content" + randomSuffix;
		String pasteKey = TestHelp.createPastePrivate2(content);

		//Step2: Fetching the created paste for validity		
		String url1 = "https://pastebin.com/" + pasteKey;
		HttpURLConnection huc =  TestHelp.getURL(url1);	 		
	    int urlStatus = huc.getResponseCode();
		Assert.assertEquals(urlStatus, 200);	
		System.out.println("url: " + url1);
		
		//Step3: verify created paste has the same content and is private
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
        System.out.println("Content1: " + content1);
        System.out.println("Content: " + content);  
        //assert the content is same as content1 above
        Assert.assertEquals(content1.toString(), content);
        
	    //Step4: verify created paste has the same title as in step1
	}	
}