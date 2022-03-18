package QuestionThree;

import java.util.HashMap;
import java.util.Map;

public class Recorder {
	public Map<String, String> record = new HashMap<String, String>();

	public void rec(String key, String value) {

		if (key.equals("") && value.equals("")) {
			for (int i = 0; i <= record.size(); i++) {
				record.remove(i);
			}
			System.out.println("Empty");
		} else if (value.equals("")) {
			System.out.println(record.get(key));
		} else if (record.containsKey(key) && value.equals("Delete")) {
			System.out.println(key + " deleted");
		} else if (value.equals("Delete")) {
			throw new IllegalArgumentException();
		} else {
			record.put(key, value);
			System.out.println(key + "=" + value);

		}
	}
}
