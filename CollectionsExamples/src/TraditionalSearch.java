import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class TraditionalSearch {
	public static void main(String[] args) {
		List<Animal> animals = new ArrayList<Animal>(); // list of animals
		animals.add(new Animal("fish", false, true));
		animals.add(new Animal("kangaroo", true, false));
		animals.add(new Animal("rabbit", true, false));
		animals.add(new Animal("turtle", false, true));
		System.out.println(Boolean.TRUE + " "+ Boolean.FALSE);
		
		Boolean b =new Boolean(true);
		//System.out.println(b);
		b=Boolean.parseBoolean("Yes");
		System.out.println("parseBoolean = " +b );
		boolean c=b.booleanValue();
		System.out.println("booleanValue = " +b );
		
		System.out.println("valueOf = " +Boolean.valueOf("true") );

		
		

		print(animals, (Animal a)-> {return a.canHop();}); // pass class that does check
	}

	private static void print(List<Animal> animals, Predicate<Animal> checker) {
		for (Animal animal : animals) {
			if (animal.canHop()) // the general check
				System.out.print(animal + " ");
		}
		System.out.println();		
	}
}