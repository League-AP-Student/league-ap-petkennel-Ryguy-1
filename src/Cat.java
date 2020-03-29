
public class Cat extends Pet{
	String cat_Sound = "meow";
	Cat (String PetName){
		super(PetName);
	}
	
	public String speak() {
		return cat_Sound;
	}
}
