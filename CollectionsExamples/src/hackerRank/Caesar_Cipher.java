package hackerRank;


	import java.io.*;
	import java.math.*;
	import java.security.*;
	import java.text.*;
	import java.util.*;
	import java.util.concurrent.*;
	import java.util.function.*;
	import java.util.regex.*;
	import java.util.stream.*;
	import static java.util.stream.Collectors.joining;
	import static java.util.stream.Collectors.toList;

	class Result1 {

	    /*
	     * Complete the 'caesarCipher' function below.
	     *
	     * The function is expected to return a STRING.
	     * The function accepts following parameters:
	     *  1. STRING s
	     *  2. INTEGER k
	     */

	    public static String caesarCipher(String s, int k) {
	    // Write your code here
	    String s1="";
	    System.out.println(s.indexOf('C'));
	    for(int i=0;i<s.length();i++){
	        if(s.charAt(i)>=65 && s.charAt(i)<=90){
	            if((s.charAt(i)+k%26)<=90){
	            	System.out.println(s.charAt(i)+k%26);
	            	System.out.println("Capital");
	                 s1=(s1+ (char)(s.charAt(i)+k));
	                 
	            }else{
	            	System.out.println("else Capital");
	                s1=(s1+ (char)(65+(s.charAt(i)+k%26)-91));
	            }
	           
	        }else if(s.charAt(i)>=97 && s.charAt(i)<=122){
	            if((s.charAt(i)+k%26)<=122){
	            	System.out.println("small ");
	                 s1=(s1+ (char)(s.charAt(i)+k%26));
	            }else{
	            	System.out.println("small else");
	            	
	                s1=(s1+ (char)((97+s.charAt(i)+k%26)-123));
	            }
	           
	        }
	        else{
	        	System.out.println("else");
	            s1=s1+s.charAt(i);
	        }
	    }
	        return s1;
	    }

	}

	public class Caesar_Cipher {
	    public static void main(String[] args) throws IOException {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        String s = sc.next();

	        int k = sc.nextInt();

	        String result = Result1.caesarCipher(s, k);

	        System.out.println(result);
	    }
	}
