## This is a sample Camel Standalone Project

### To Execute in the console

mvn compile
mvn camel:run 

### Build an executable jar and run

mvn camel:prepare-fatjar package
java -jar target/camel-standalone-1.0.0-SNAPSHOT-executable-jar.jar 
