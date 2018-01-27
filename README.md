# codejam
framework to hit the ground running with the google codejam


### To get started 


1. Create a class as --  
`public class <className> extends AbstractSolutionAdapter implements CodeJam<<Type you want to print as result of a test case>> {`

2. Specify CodeJame Configurations -  
    `@CodeJamArgs(Args)`  
    Valid arguments are the following -  
  - year - string
  - round - enum
  - problem - enum
  - problem size - enum
  - practice - boolean
  - filepresent - boolean

3. Write your solution in the method (this is what is required to be implemented for the CodeJam<> interface)
`public <Type you want to print as result of a test case> solve(){`

4. Default main method - doesn't require any change  
```java
public static void main(String[] args) throws Exception {	
		setIOConfig();
		createSolutionInstance();
}```


Example usage - https://github.com/aashwin-gaur/codejam/blob/master/src/solutions/y2016/round1a/A.java
