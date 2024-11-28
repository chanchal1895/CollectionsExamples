
public class DynamicArray {
	
	private int[] array;
	int count;

	public DynamicArray() {
		count = 0;
		
		array = new int[1];
	}

	public static void main(String args[]) {
		DynamicArray da = new DynamicArray();
		da.addElement(10);
		da.addElement(20);
		da.addElement(30);
		da.addElement(40,3);
		for(int i =0;i<da.array.length;i++) {
		System.out.println(da.array[i]+" ");
		}
	}

	public void addElement(int a) {
		if (count == array.length) {
			growSize();
		}

		array[count] = a;
		count++;
	}
	public void addElement(int a, int index) {
		if(count==array.length)
		{
			growSize();
		}
		for(int i=count-1;i>=index;i--)
		{
			array[i+1]=array[i];
		}
		array[index] = a;
		count++;
	}
	public void growSize() {
		int[] temp = null;
					temp = new int[array.length*2];

			for (int i = 0; i < array.length; i++) {
				temp[i] = array[i];
			}
		//System.out.println(array.length);
		//System.out.println(array.length);
		array = temp;
		//System.out.println(array.length);
		

	}
}
