package JavaCourse;

import java.util.Objects;

 class EqualMethodEx {
	
	private int value;

	public EqualMethodEx(int value) {
		super();
		this.value = value;
	}

	@Override
	public int hashCode() {
		return Objects.hash(value);
	}

	@Override
	/*public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EqualMethodEx other = (EqualMethodEx) obj;
		return value == other.value;
	}*/
	//overrinding equals method of Object class as per our need.EqualMethodEx other = (EqualMethodEx) obj;
	public boolean equals(Object obj) {
		EqualMethodEx other = (EqualMethodEx) obj;
		
		if(value==other.value) {
			return true;
		}
		return false;
	}
}
 
 
 public class ClassEqualMethodEX{
	 
	 public static void main(String args[]) {
		 
		 EqualMethodEx e1 = new EqualMethodEx(25);
		 EqualMethodEx e2 = new EqualMethodEx(25);
		 EqualMethodEx e3 = e1;
		 System.out.println(e1==e2);
		 System.out.println(e3 == e1);
		 System.out.println(e1.equals(e2));
	 }
	

		
	
 }
 
