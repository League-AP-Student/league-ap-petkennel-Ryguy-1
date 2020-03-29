import java.util.ArrayList;
import java.util.List;

public class Kennel {
	private List<Pet> petList = new ArrayList<Pet>(3);
	
	/** For every Pet in the kennel, print the name followed by
	 * the result of a call to its speak method, one line per Pet
	 */
	public void allSpeak(){
		for (Pet p: petList) {
			System.out.println(p.getName() + " says " + p.speak());
		}
	}
	
	
	public static void main(String[] args) {
		Kennel k = new Kennel();
		Dog d = new Dog("dog");
		Cat c = new Cat("cat");
		LoudDog ld = new LoudDog("louddog");
		k.petList.add(d);
		k.petList.add(c);
		k.petList.add(ld);
		k.allSpeak();
	}
	
	
}
