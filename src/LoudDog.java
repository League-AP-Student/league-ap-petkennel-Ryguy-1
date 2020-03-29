
public class LoudDog extends Dog{

	public LoudDog(String petName) {
		super(petName);
	}

	public String speak() {
		String temp = dog_sound;
		temp+= " " + dog_sound;
		return temp;
	}
	
}
