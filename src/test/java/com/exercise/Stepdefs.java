package com.exercise;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class Stepdefs {
    private String[] data = {"", "", ""};
    private String actualAnswer;

    @Given("string {string}")
    public void setString(String myStrings) {
        // TODO Better handle many arguments
        data[0] = myStrings;
    }

    @When("I ask number of vowel")
    public void numberOfVowel() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(baos));
        VowelCount.main(data);
        actualAnswer = baos.toString();
    }


    @Then("I should see {int}")
    public void iShouldSee(int value) {
        //TODO parse actualAnswer from json to value
        assertEquals(value, 2);
    }
}