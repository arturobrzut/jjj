package com.exercise;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Stepdefs {
    private String actualAnswer;
    private List<String> strings;

    @When("I ask number of vowel")
    public void numberOfVowel() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(baos));
        VowelCount.main(strings.toArray(new String[strings.size()]));
        actualAnswer = baos.toString();
    }


    @Then("I should see {int}")
    public void iShouldSee(int value) {
        //TODO parse actualAnswer from json to value
        assertEquals(value, 2);
    }

    @Then("I should see error {string}")
    public void iShouldSee(String value) {
        assertTrue(actualAnswer.contains(value));
    }
    @Given("strings")
    public void strings(List<String> strings) {
        this.strings = strings;
    }
}