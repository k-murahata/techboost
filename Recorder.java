package QuestionThree;

import java.util.HashMap;
import java.util.Map;

public class Recorder {
	public Map<String, String> record = new HashMap<String, String>();

	public void rec(String key, String value) {
		record.put(key, value);
		System.out.println(key + "=" + value);

		if (value.equals("Delete")) {

		} else if (record.containsKey(key)) {
			System.out.println(key + " deleted");
		} else {
			throw new IllegalArgumentException();
		}
	}

	public void rec(String key) {
		System.out.println(record.get(key));
	}

	public void rec() {
		for (int i = 0; i < record.size(); i++) {
			record.remove(i);
		}
		System.out.println("Empty");

	}
}
