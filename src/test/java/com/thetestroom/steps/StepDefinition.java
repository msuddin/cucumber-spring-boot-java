package com.thetestroom.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class StepDefinition {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate testRestTemplate;

    private String response;

    @Given("^I call \"([^\"]*)\"$")
    public void iCall(String endpointWithPathVariable) throws Throwable {
        response = testRestTemplate.getForObject("http://localhost:" + port + endpointWithPathVariable, String.class);
    }

    @Then("^I should expect \"([^\"]*)\" to be returned$")
    public void expectedResponseShouldBe(String expectedResponse) throws Throwable {
        assertThat(response, is(expectedResponse));
    }
}
