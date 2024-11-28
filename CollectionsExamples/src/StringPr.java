
public class StringPr {
	
	public static void main(String[]args) {
		
		String input = "India Is my country";
		 
		
		String s = input;
		s=s.replace(" ", "");
		
		StringBuilder sb = new StringBuilder(s);
		System.out.println(sb.reverse());
		
		
		
	    int length = s.indexOf(" ");
	    for(int i=0;i<input.length();i++) {
	    	if(input.charAt(i)==32) {
	    		 sb.insert(i, " ");
	    	}
	    }
	   
		  System.out.println(sb);
		  
	   
			
		System.out.println(sb);
		
		
		
	}

}
