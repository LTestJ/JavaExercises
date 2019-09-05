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

public class TestDeleteMultiplePastes {

	@Test
	public void deleteMultiplePastes() throws IOException, InterruptedException
	{	
		//Step1: create multiple pastes
		String[] pasteKey = new String[3];
		for (int i = 0; i < 3; i++) {
			String randomSuffix = String.valueOf(TestHelp.getRandomNum());
			String content = "My content" + randomSuffix;
			String title = "My Title" + randomSuffix;
			pasteKey[i] = TestHelp.createPasteWithTitle(title, content);
			String rawPasteURL = "https://pastebin.com/" + pasteKey[i];	
			System.out.println(rawPasteURL);
		}
		
		//Step2: deleting pastes
		for (int i = 0; i < 3; i++) {	
			TestHelp.deletePaste(pasteKey[i]);
//			try { Thread.sleep(5000); } catch (Exception e) {}
			Thread.sleep(5000);
		}
		
		//Step3: verify deletion of pastes
		//showing captcha error
		for (int i = 0; i < 3; i++) {			
			String rawPasteURL = "https://pastebin.com/" + pasteKey[i];	
			System.out.println(rawPasteURL);
		    HttpURLConnection rawPasteConn = TestHelp.getURL(rawPasteURL); 
		    int urlStatus = rawPasteConn.getResponseCode();
			Assert.assertEquals(urlStatus, 404);	
			Thread.sleep(5000);

		}		
	}	
}