package cucumber.api;

import io.restassured.RestAssured;

public class getUserById {
    public int id;
    public String url;
    public String apiLinkURL;
    public String apiKeyword;

    public void setURL(String urlLink){
        url = urlLink;
        System.out.println("url: "+url);
        System.out.println("urlLink: " + urlLink);
    }

    public void setApiLink(String apiLink){
        apiLinkURL = apiLink;
        System.out.println("apiLink: "+apiLink);
        System.out.println("apiLinkURL: " + apiLinkURL);
    }

    public void setUserId(int userId){
        id = userId;
        System.out.println("userId: "+userId);
        System.out.println("id: " + id);
    }

    public void setAPIKey(String apiKey){
        apiKeyword = apiKey;
    }

    public void responseCheck(int response){
        RestAssured
                .given()
                .header("x-api-key", apiKeyword)
                .when()
                .get(url+apiLinkURL+id)
                .then()
                .log().all()
                .assertThat().statusCode(response);
    }
}

