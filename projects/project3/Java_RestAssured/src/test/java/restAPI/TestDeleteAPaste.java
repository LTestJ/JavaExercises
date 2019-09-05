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

public class TestDeleteAPaste {
	
	@Test
	public void deleteAPaste() throws IOException
	{	
		//Step1: calling function to create new paste	
		String randomSuffix = String.valueOf(TestHelp.getRandomNum());
		String content = "My content" + randomSuffix;
		String pasteKey = TestHelp.createPaste(content);

		//Step2: Fetching and deleting the paste
		TestHelp.deletePaste(pasteKey);
		
		//Step3: verify obtained paste is completely deleted 
		String rawPasteURL = "https://pastebin.com/" + pasteKey;	
	    HttpURLConnection rawPasteConn = TestHelp.getURL(rawPasteURL);   		
	    int urlStatus = rawPasteConn.getResponseCode();
		Assert.assertEquals(urlStatus, 404);	
	}	
}