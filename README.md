# Interview Exercise for Agile QA role

Please note while taking this test, do not mention 90 Percent of Everything or 90poe anywhere on the code or repository name.

Clone this repo in your private git space. Once done, please add github username: shilpa-sethi as a collaborator/ reviewer.
While submitting please ensure to add a README explaining how to run the test and all related info.

## Testing Task
Product Owner wants a feature as described below. The developer has added the code and share with you as a QA for review/ testing.

### Feature

As a user I want to be able to add a list of strings. 
I want to see the number of vowels in each of the strings that I have entered.

### Acceptance Criteria

1. I should see the number of vowels and consonant for each string in the order they are keyed in.
2. I should be able to add up to 4 strings at once.

### QA Task

1. Review the user story and prepare a list of questions/ assumptions.
   1. How output format should look like
      1. JSON format should be good
      2. Proposal output format { "string with escaping chars" : value, "another string" : value }
      3. What should we do if there will be more then 4 string at once
         1. should we do not process anything -> current assumption
         2. or should we process first 4 strings
   2. The String separation is space/tab or string can contain space inside
2. Review the code and provide feedback/ improvements.
   1. Separate Main functions and business logic (getVowelCount method)
      1. After that change private attribute in getVowelCount to public
      2. add unittest for getVowelCount
   2. Why we create argumentList and iterate over it, maybe we should iereate over args
      ```
      for (String argument: args) {
          vowelCount.put(argument, getVowelCount(argument));
      }
      ```
   3. Why we use ```input.split("");``` which splt string insted of ```input.chars().``` 
   4. Add support for case-sensitive 
   5. output format should prepare proper output
      1. currently format can create problem during reading it we add input string as ```"abc=3, cde=33, c"``` output will be ```{abc=3, cde=33, c=2}```
3. Extend the program to return the number of consonants for each string array passed.
4. Use BDD/ Cucumber to add test cases to test the program for both vowels and consonants.
5. Report any bugs you find. Include as much information as necessary and add the feedback as a file to the repo along with the Cucumber Test Report.
   1. Add support for case-sensitive , now our service can search only lower case strings 
   2. Output format should be in format which prepare proper output
       1. currently format can create problem during reading it we add input string as "abc=3, cde=33, c" output will be {abc=3, cde=33, c=2}

Bonus points if you can add failing test cases for the bugs you find. 

## Evaluation Points

1. Use of Git.
2. Use of BDD/TDD/Cucumber.
3. Code Review skills.
4. Coding skills.
5. Test Case Coverage.

## Time limits

There are no hard time limits. We suggest not to spend more than ~2 hours.
