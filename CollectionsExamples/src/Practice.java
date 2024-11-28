import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Practice 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		
//		Map<Integer, String> map = new HashMap<Integer, String>();
//		
//		map.put(80,"Ashi");
//		map.put(67,"Mehek");
//		map.put(87,"Chanchal");
//		map.put(78,"Mehek");
//		map.put(56,"Chanchal");
//		map.put(34,"Chanchal");
//		map.put(34,"Chanchal");
//		map.put(45,"Ashi");
//				
//		Set<String> set = new HashSet<>(map.values());
//		Set<Double> setInt = new HashSet<>();
//		
//		for(String str: set) {
//			int sum =0;
//			int count=0;
//			for(Entry<Integer, String> entry:map.entrySet()) {
//				if(entry.getValue().equalsIgnoreCase(str)) {
//					count++;
//					sum += entry.getKey();
//				}				
//			}
//			setInt.add( ((double)sum/count));		
//		}		
//		System.out.println(setInt.stream().max(Comparator.comparing(i->i)).get());
//	}
	
	//	Prime Factorization
	
		
//		int i = sc.nextInt();
//		List<Integer> list = new ArrayList<>();
//		for(int j=2;j<i;j++) {
//			if(i%j==0) {
//			list.add(j);
//			}
//		}
//	System.out.println(list);
	//	2.First Reapeated character in string
//		String str = sc.next();
//		Set<Character> set = new HashSet<>();
//		for(int i = 0;i<str.length();i++){
//			if(set.contains(str.charAt(i))) {
//				System.out.println(str.charAt(i));
//				break;
//			}else {
//				set.add(str.charAt(i));
//			}
//		}
		
		int i = sc.nextInt();
		int count = 0;
		while(i!=0 ) {
			int rem = i%10;
			count+=rem;
			i=i/10;
			if(count>9) {
				i=count;
				count=0;
			}
		}
		
		
		System.out.println(count);
}
}
