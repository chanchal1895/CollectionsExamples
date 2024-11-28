package hackerRank;

import java.util.ArrayList;
import java.util.List;

public class MinMaxSum {
	
	public static void main(String args[]) {
		List<Integer> list =new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
	    int count = 0;
	    int s = list.stream().min((i1,i2)->i1.compareTo(i2)).get();
	    int l = list.stream().max((i1,i2)->i1.compareTo(i2)).get();
	    
	    for(int i:list){
	        
	        count = count+i;
//	        if(s==0){
//	            s=i;
//	        }
//	       else if(s<i){
//	            s=i;
//	        }
//	        if(l==0){
//	            l=i;
//	        }
//	        else if(l>i){
//	            l=i;
//	        }
	    }
	    System.out.println(s+" "+l);
	    System.out.println((count-s)+" "+(count-l));
		
	}

}
