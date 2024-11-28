import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StringMan {
	public static void main(String[] args) {

		String c = "My name is chanchal and I am a football fan";
		String[] banned = {"football"};
		//String[] strArr = c.split(" ");
		for(String str: banned) {
			if(c.contains(str)) {
				c=c.replace(str, "");
			}
		}
		
		System.out.println(c);
//		List<String> l = Arrays.asList(strArr);
//		l.stream().filter();
//		List<Integer> l = Arrays.asList(2, 4, 87, 76, 65, 74);
//		// System.out.println(l.stream().max((i1,i2)->i1-i2).get());
//
//		List<Double> list = new ArrayList<>();
//		Map<Integer, String> map = new HashMap<Integer, String>();
//		map.put(32, "chanchal");
//		map.put(54, "Ravi");
//		map.put(87, "Abhinav");
//		map.put(90, "Abhinav");
//		map.put(67, "chanchal");
//		map.put(78, "chanchal");
//
////		Set<String> set = new HashSet(map.values());
////		int sum = 0;
////		int count = 0;
////		System.out.println(map);
////		for (String str:set) {
////			for (Map.Entry<Integer, String> entry2 : map.entrySet()) {
////				if (entry2.getValue().equals(str)) {
////					sum = sum + entry2.getKey();
////					count++;
////				}
////			}
////			list.add((double) (sum / count));
////			sum = 0;
////			count = 0;			
////		}
////		System.out.println(list.stream().max((i1,i2)->(int)(i1-i2)).get());
//
		

	}
	

}
