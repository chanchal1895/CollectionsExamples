package hackerRank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Median {
	
	public static void main(String args[]) {
		List<Integer> list = new ArrayList<>();	
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		for(int i =0;i<size;i++) {
			int j = sc.nextInt();
			list.add(j);
		}
		Collections.sort(list);
		for (int k : list) {
			System.out.println(k);
		}
		int m =0;
		if(size%2==0) {
			System.out.println("Median = "+(float)(list.get(size/2)+list.get((size/2)-1))/2);
		}
		else {
			System.out.println("Median = "+list.get(size/2));
		}
	}

}
