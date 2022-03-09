package QuestionTwo;

public abstract class AbstractPerson {
	String gender;

	public void speak() {
		if (this.gender.equals("man")) {
			System.out.println("I'am a man");
		}
		if (this.gender.equals("woman")) {
			System.out.println("I'am a woman");
		}
	}

	public static void main(String[] args) {
		Man man = new Man();
		Woman woman = new Woman();
		man.speak();
		woman.speak();

	}
}
