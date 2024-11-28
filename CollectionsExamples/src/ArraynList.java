import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraynList {
	 static int k =0;
	 static {
		 k=10/0;
	 }
	public static void main(String args[])
	{
		
		String[] arr = {"Chanchal","Ricky"};
		System.out.println(arr[0]+" "+arr[1]);
		List<String> list = new ArrayList<>(10);
		System.out.println(list.size());;
		list = Arrays.asList(arr);
		list.set(1, "test");
		System.out.println(list); 
		arr[0]= "new";
		System.out.println(arr[0]+" "+arr[1]);
		System.out.println(1+3+"v"+2+6);
		int three = 3;
		String four = "4";
		System.out.println(1 + 2 + three + four);
		String s1 = "1";
		String s2 = s1.concat("2");
		s1="3";
		System.out.println(s1+s2);
		String alpha = "";
		 for(char current = 'a'; current <= 'z'; current++) 
		 alpha += current;
		 System.out.println(alpha);
		 System.out.println(" Hello world ".trim());
		 
		 LocalDate date1 = LocalDate.of(2015, Month.JANUARY, 20);
		 LocalDate date2 = LocalDate.of(2015, 1, 20);
		int[] arr5 = new int[] {1,2,3};
		System.out.println(arr5[-1]);
		 int a= 5, b=7,k=0;
		 Integer m = null;
		 k=b+ new Integer(a);// new Integer(b);
		 m=new Integer(a)+new Integer(b);
		 String c = "";
		 c.trim();
		 c.length();
		 c.concat(c);
		// c.reverse
		 
		 
		 System.out.println("k="+k);
		 System.out.println(date2);
		 
		 System.out.println(LocalDate.now());
		 System.out.println(LocalTime.now());
		 System.out.println(LocalDateTime.now());
		
		
		//list.remove(1);
		//String[] array2 = (String[]) list.toArray();
		
	}

}
 abstract class CheckAbstract extends ArrayList{
	
	 static int k =0;
	 static {
		 k=10/0;
	 }
}