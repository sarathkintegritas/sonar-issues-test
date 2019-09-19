package com.integrtias.threadfix;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        App app = new App();
        Integer result = app.convertToInteger("1");
        System.out.println("Result: " + result);
    }
    
    public Integer convertToInteger(String text) {
    	Integer value = Integer.parseInt(text);
    	
    	return value;
    }
}
