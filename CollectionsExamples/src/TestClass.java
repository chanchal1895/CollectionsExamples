class A {
	
}

class B extends A{
	
	public int add(int x,int y) {
		return x+y;
	}
}

public class TestClass{
	
	public static void main(String[] ag) {
		 A a = new B();
		 //a.add();
		 Object obj = new Integer(100); 
		obj = ( (Integer)(obj)).intValue();
		System.out.println(obj);
		
	}
}