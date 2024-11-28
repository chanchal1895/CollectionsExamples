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


	class Result2 {

	    /*
	     * Complete the 'palindromeIndex' function below.
	     *
	     * The function is expected to return an INTEGER.
	     * The function accepts STRING s as parameter.
	     */

	    public static int palindromeIndex(String s) {
	    // Write your code here
	    int result =0;
	    String s1 ="";
	    StringBuilder sb = new StringBuilder(s); 
	    s1 = sb.reverse().toString();
	    if(s.equals(s1)) {
	    	System.out.println(s1);
	    	result = -1;
	    }else {
	    	s1="";
	    	for(int i= 0;i<s.length();i++) {
	    		sb = new StringBuilder(s);
	    		s1=sb.replace(i, i+1, "").toString();
	    		sb = sb.reverse();
	    		if(s1.equals(sb.toString())) {
	    			result = i;
	    			break;
	    		}else
	    			s1=s;
	    	}
	    }
	    	return result;
	    }

	}
	public class Palindrome {
	    public static void main(String[] args) throws IOException {
	        Scanner sc = new Scanner(System.in);

	        int q = sc.nextInt();

	        IntStream.range(0, q).forEach(qItr -> {
	         
	                String s = sc.next();

	                int result = Result2.palindromeIndex(s);	
	                System.out.println(result);
	        });

	       	    }
	}
