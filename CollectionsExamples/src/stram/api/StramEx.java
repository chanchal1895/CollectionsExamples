package stram.api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StramEx {
	
	public static void main(String[] args)
	{
				
		
		ArrayList<Integer> al = new ArrayList<>();
		al.add(5);
		al.add(6);
		al.add(7);
		al.add(8);
		al.add(9);
		al.add(3);
		
		List<Integer> l = al.stream().filter(i->i%2==0).collect(Collectors.toList());
		List<Integer> l1 = al.stream().map(i-> i+5).collect(Collectors.toList());
		List<Integer> l2 = al.stream().sorted().collect(Collectors.toList());
		System.out.println(l);
		System.out.print(l2);
	}

}
