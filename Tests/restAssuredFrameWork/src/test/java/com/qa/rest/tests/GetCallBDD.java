package com.qa.rest.tests;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class GetCallBDD {
	
	@Test
	public void test_numOfCircuitsFor2019_season(){		
		given().
		when().
			get("http://ergast.com/api/f1/2019/circuits.json").
		then().
			assertThat().			
			statusCode(200).			
			and().			
			body("MRData.CircuitTable.Circuits.circuitId", hasSize(21)).			
			and().			
			header("Content-Length", equalTo("4739"));	
	}
}