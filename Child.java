

public class Run {
	public static void main(String[] args) throws Except {
		Child children = new Child(
				new String[] {"programmer", "prof", "programmer", "prof1"},
				new String[] {"Taron", "Hasmik", "Shushan", "Gohar"},
				new int[]{25, 26, 12, 12});
		Person people = new Child(
				new String[] {"programmer", "prof", "programmer", "prof1"},
				new String[] {"Taron", "Hasmik", "Shushan", "Gohar"},
				new int[]{25, 26, 6, 12});
		children.printMoreThan25();
		people.printMoreThan25();
		Oceanographer o = new Oceanographer();
		o.checkSound(new Dolphin());
		o.checkSound(new Whale());
	}
}


public class Person {
	protected int[] age;
	protected String[] name;
	Person(int[] age, String[] name) throws Except {
		if(age.length != name.length) {
			throw new Except("Name and age should have the same size.");
		}
		this.age = new int[age.length];
		this.name = new String[name.length];
		for(int i = 0; i < age.length; i++) {
			this.age[i] = age[i];
			this.name[i] = name[i];
		}
	}
	
	public void printMoreThan25() {
		for(int i = 0; i < this.age.length; i++) {
			if(this.age[i] < 25) {
				System.out.println("name is: " + this.name[i]);
				System.out.println("age is: " + this.age[i]);
			}
		}
	}
}




public class Child extends Person {
	private String[] profession;
	Child(String[] profession, String[] name, int[] age) throws Except {
		super(age, name);
		if(profession.length != name.length) {
			throw new Except("Profession and name should have the same size");
		}
		this.profession = new String[profession.length];
		for(int i = 0; i < profession.length; i++) {
			this.profession[i] = profession[i];
		}
	}
	public void printMoreThan25() {
		for(int i = 0; i < this.profession.length; i++) {
			if(this.age[i] < 25 && this.profession[i].equals("programmer")) {
				System.out.println("profession is: " + this.profession[i]);
				System.out.println("name is: " + this.name[i]);
				System.out.println("age is: " + this.age[i]);
			}
		}
	}
}











interface LivesInOcean {
	String makeSound();
}
public class Oceanographer {

	public void checkSound(LivesInOcean obj) {
		System.out.println(obj.makeSound());
	}
}

class Whale implements LivesInOcean {
	@Override
	public String makeSound() {
		return "Whale";
	}
}
class Dolphin implements LivesInOcean {
	@Override
	public String makeSound() {
		return "Dolphin";
	}
}