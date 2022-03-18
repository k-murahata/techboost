package QuestionThree;

public class RecorderRunner {
	public static void main(String[] args) {
		Recorder r = new Recorder();
		try {
			r.rec("key1", "value1");
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			r.rec("key1", "Delete");
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			r.rec("key2", "Delete");
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			r.rec("key2", "value2");
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			r.rec("", "");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
