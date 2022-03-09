package QuestionTwo;

public abstract class AbstractPerson {
	String gender;

	public void speak() {
		if (this.gender.equals("man")) {
			System.out.println("I'm a man");
		}
		if (this.gender.equals("woman")) {
			System.out.println("I'm a woman");
		}
	}
}
