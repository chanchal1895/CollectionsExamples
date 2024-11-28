import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InterQuestion
{
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		int cout = 0;
		list.add(5);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(7);
		Map<Integer, Integer> hmap = new HashMap<>();
		
		
		
		for(int i: list) {
			//hmap.put(null, null)
			
			if(i<list.get(cout))
				cout++;
			if(i>list.get(cout)) {
				System.out.println(i+""+list.get(cout));
				cout=0;
			}
		}
		
	}
	

}
