package hackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Grid {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		
		//		list.add("vpvv");
//		list.add("pvvv");
//		list.add("vzzp");
//		list.add("zzyy");
		
		  list.add("abc"); 
		  list.add("hjk"); 
		  list.add("mpq");		  
		  list.add("rtv"); 
		
//		  list.add("eabcd"); 
//		  list.add("fghij"); 
//		  list.add("olkmn");		  
//		  list.add("trpqs"); 
//		  list.add("xywuv");
//		  list.add("shm");
//		  list.add("zzrzz");
//		  list.add("rzzzz");
		  
		  int count=0;
	        int count1=0;
	        String outcome = "";
	        for(String s1 : list){
	            char[] c=s1.toCharArray();            
	            Arrays.sort(c);
	            String s = new String(c);
	            System.out.println(s);
	            list.set(count, s);  
	            count++;                   
	        }
	        count=1;
	        for(String s:list){
	            int i=0;
	              if(count<list.size()){
	            	  System.out.println(count);
	              String s1= list.get(count);
	              if(s.equals(s1))
	                count1++;
	              else{	     
	            	  
	            	  while(i<s.length()) {
	                  if(s.charAt(i)<=s1.charAt(i)) {	
	            		            	 
	                    i++;  
	                   
	                  }
	                  else
	                    break;
	                  } System.out.println(i);
	            	  if(i==s.length()){
		                  count1++;

		              }
	              }
	             
	            }
          	 
	             
	              count++;
	        }
	        System.out.println(count1);
	  	        if(count1==list.size()-1)
	            outcome="YES";
	        else
	            outcome="NO";
	       

		    System.out.println(outcome);
	}
}
