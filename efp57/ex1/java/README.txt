this simple program is intended to show a basic competency with several
programming languages. 

overview:

ask user to input name, repeat name back in a polite greeting.

v1 - keep input, string concatenation and output separate 
v2 - no variables
v3 - different greetings for different people

breakdown:

Java

v1

System.out to ask for input, create an inputstream reader for user input,
store result in a string, create function for greeting with name.

v2

Ask the user for input, directly use this answer in output:

read text using bufferedreader (in separate function with string return),
concatenate the return of this method in the greeting.
