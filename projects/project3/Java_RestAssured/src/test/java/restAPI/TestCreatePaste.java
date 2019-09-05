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

public class TestCreatePaste {
	

	@Test
	public void testCreatePasteRandomContent() throws IOException
	{	
		//Step1: Create paste	
		String randomSuffix = String.valueOf(TestHelp.getRandomNum());
		String content = "My contentt" + randomSuffix;
		String pasteKey = TestHelp.createPaste(content);
		
        //Step 2 : Verify validity of the created paste
        String pasteURL = "https://pastebin.com/" + pasteKey;
        HttpURLConnection pasteConn = TestHelp.getURL(pasteURL);
        int urlStatus = pasteConn.getResponseCode();
        Assert.assertEquals(urlStatus, 200);

        //Step 3: Verify fetched paste has the same content as created in Step 1.
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
        
        //assert the content is same as content1 above
        Assert.assertEquals(content1.toString(), content);
	}	
}