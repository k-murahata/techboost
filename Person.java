package questionOne;

public class Person {
	String sex;
    Person(String sex){
    	this.sex = sex;
    }
	public void speak() {
		if (this.sex == "man") {
			System.out.println("I'am a man");
		}
		if (this.sex == "woman") {
			System.out.println("I'am a woman");
		}
	}
}
