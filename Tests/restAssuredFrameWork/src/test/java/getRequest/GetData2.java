package getRequest;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;



public class GetData2 
{
	@Test
	public void testResponsecode()
	{
		
		int code=get("http://restcountries.eu/rest/v1/name/france").getStatusCode();
		
		System.out.println("Status code is " + code);
		
		Assert.assertEquals(code, 200);
	}
	
	
	@Test
	public void testbody()
	{	
		String data=get("http://restcountries.eu/rest/v1/name/france").asString();
		
		long time=get("http://restcountries.eu/rest/v1/name/france").getTime();
		
		System.out.println("Response time is " + time);
		
	}

}
