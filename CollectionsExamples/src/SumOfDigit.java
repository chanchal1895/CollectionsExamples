
public class SumOfDigit {
	public static void main(String[] args) {
		int i =81;
		int sum =0;
		while(i>0  ) {
			int rem = i%10;
			sum =sum+rem;
			i= i/10;
			if(i==0 && sum>=10) {
				i=sum;
				sum=0;
			}
			
		}
		
		System.out.println(sum);
	}

}
