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


public class FlipMatrix {
    public static void main(String[] args) throws IOException {
    	List<Integer> l = new ArrayList<>();
    	List<Integer> l1 = new ArrayList<>();
    	List<Integer> l2 = new ArrayList<>();
    	List<Integer> l3 = new ArrayList<>();
    	List<List<Integer>> matrix=new ArrayList<>();
    	
    	
		/*
		 * 112 42 83 119 56 125 56 49 15 78 101 43 62 98 114 108
		 */
    		l.add(112);
    		l.add(42);
    		l.add(83);
    		l.add(119);
    		
    		l1.add(56);
    		l1.add(125);
    		l1.add(56);
    		l1.add(49);
    		
    		l2.add(15);
    		l2.add(78);
    		l2.add(101);
    		l2.add(43);
    		
    		l3.add(62);
    		l3.add(98);
    		l3.add(114);
    		l3.add(108);
    		
    		matrix.add(l);
    		matrix.add(l1);
    		matrix.add(l2);
    		matrix.add(l3);
    		
    		//l.removeAll(l);
    		
    		int sum1 =0;
    	    int sum2 = 0;
    	    int sum =0;
    	    int count = 0;
    	    List <Integer> arrf = new ArrayList<>();
    	    List<Integer> arrl = new ArrayList<>();;
    	    int size =matrix.size();
    	    for(List<Integer> list:matrix) {
    	        count++;
    	        
    	        if(count==1) {
    	             arrf = list;
    	        }
    	        if(count==size ){
    	             arrl =list;
    	        }
    	    }count=0;
    	        for(int i=1;i<=size/2;i++) {
    	            sum1=sum1+arrf.get(i);
    	            if(arrf.get(size-i)> arrl.get(size-i)) {
    	                sum = sum+arrf.get(size-i);
    	                
    	            }else {
    	                sum = sum+arrl.get(size-i);
    	                System.out.println(sum);
    	                
    	            }
    	            
    	        }
    	       for(List<Integer> list:matrix) {
    	        	count++;
    	        if(count>1 && count<=size/2){
    	            for(int i=1;i<size/2;i++) {
    	                sum2 = sum2+list.get(size-i);
    	                sum1=sum1+list.get(i-1);
    	                
    	            }
    	                       
    	            if(sum1>sum2)
    	                sum=sum+sum1;
    	            else
    	                sum = sum+sum2;
    	            sum1=0;
    	            sum2=0;
    	        }
    	        }  	       
    	        System.out.println(sum);
    	        System.out.println(matrix);
    }
    

    
}
