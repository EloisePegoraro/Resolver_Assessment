# Resolver_Assessment
The purpose of this repository is to address the task assigned by Resolver. As part of the recruitment assessment, I received a web page along with instructions to test it.

# Automation Tools
Framework: Selenium/Cucumber/Junit
Programming Language: Java 
Build automation tool: Maven

# Notes
In Cucumber, there is a feature file where the scenarios and test steps are written in plain English (Gherkin language), making it easy for the non-technical audience to understand the tests. Please locate the HomePage.feature file in the resources folder: src/test/resources. 

Furthermore, in Cucumber, the keyword "Background" is utilized to prevent the repetition of identical steps. In this particular test, as "Navigate to the home page" serves as the initial step for all the tests, it is defined once under the Background keyword, ensuring it executes for all the tests within that Feature. 

During Test 2, while examining the third requirement, which states: "Assert that the second list item's value is set to 'List Item 2'," I came across a potential defect. The requirement specifies "List Item 2," but upon inspecting the HTML DOM, I noticed two additional spaces present (following the initial quotation mark and after the number 2). As a result, Test 2 is failing due to this reason. 

For the reports on the passed/failed tests, please refer to the file: Cucumber Reports.html

