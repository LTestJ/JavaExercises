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
		//Step1: create private Paste
		String randomSuffix = String.valueOf(TestHelp.getRandomNum());
		String content = "My content" + randomSuffix;
		String pasteKey = TestHelp.createPastePrivate2(content);

		//Step2: Checking the created paste for validity		
		String url1 = "https://pastebin.com/" + pasteKey;
		HttpURLConnection huc =  TestHelp.getURL(url1);	 		
	    int urlStatus = huc.getResponseCode();
		Assert.assertEquals(urlStatus, 200);	
		
		//Step3: verify created paste has the same content is same as in step1
		//Step3 Cannot be verified because paste is private
	}	
}