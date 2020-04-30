This project was implemented using the following technologies:
- Java 8
- Maven

I used Intellij Community Edition to build, test and run the project.

To build the project, simply run mvn clean install from your IDE or the command line 
and it will output a jar file.

The project has unit tests for the service. You can run them either from the IDE or from Maven by using mvn clean test or mvn clean verify.

Assumptions:
- the sentence is assumed to be short enough to be modelled with a Java String
- the sentence is assumed to use Latin letters or digits
- the words are assumed to be separated by one or more spaces in the sentence
- if there are multiple words with the same min or max length in the sentence, the first such word will be chosen and returned
