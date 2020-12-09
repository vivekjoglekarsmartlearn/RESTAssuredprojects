package testcase;
import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;
public class SendGETRequestuseingRestAssured {

	
	@Test
	public void listofAllUserGettest() {
	//  set authentication -  basic auth/ bearer token using Headers
//  Request -->  set  specification
		//Repose--> 
		//do validations
		//  content type ---  1.  using ContentType()
		//  2. adding content type in the headers
//Response  reposne=		given().
//	auth().
//	basic("sk_test_51HC46AK6I1joyeRbYbP6FWcL13m446KAfaSSE1QRawq7b1Pc173PbAyxVVJs3hCKfOnVvT0H8EUDdLuVfemJN6Eg00LojOcG1o", "")
//	.get("https://api.stripe.com/v1/customers");
//		
Response  reposne=		given().param("limit", 3).
auth().
basic("sk_test_51HC46AK6I1joyeRbYbP6FWcL13m446KAfaSSE1QRawq7b1Pc173PbAyxVVJs3hCKfOnVvT0H8EUDdLuVfemJN6Eg00LojOcG1o", "")
.get("https://api.stripe.com/v1/customers");

//System.out.println(reposne);
//reposne.prettyPrint();
String  jsonReponse=reposne.asString();
System.out.println(jsonReponse);
System.out.println("Request code is --->"+reposne.statusCode()); 

Assert.assertEquals(201, reposne.statusCode());

	//given().contentType(ContentType.JSON);	
	//	given().contentType("application/json");
	//	given().header("content-type","application/json");
		
	}
	
	
}
