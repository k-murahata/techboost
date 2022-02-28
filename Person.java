package questionOne;

public class Person {
	String sex;
	
    public Person(String sex) {
    	this.sex = sex;
    }
    
	public void speak() {
		if (this.sex.equals("man")) {
			System.out.println("I'am a man");
		}
		if (this.sex.equals("woman")) {
			System.out.println("I'am a woman");
		}
	}
	
	public static void main(String[] args) {
		Person p1 = new Person("man");
		Person p2 = new Person("woman");
		p1.speak();
		p2.speak();
	}
}
