
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MaxOccurenceIBM {
	public static void main(String[] args) {
		HashMap<Character, Integer> m = new HashMap<Character, Integer>();
		String str = "web application";
		str=str.replaceAll("\\s","");
		char[] temp = str.toCharArray();
		for (char flag : temp) {
			if (m.containsKey(flag))
				m.put(flag, m.get(flag) + 1);
			else
				m.put(flag, 1);
}
		int[] count = new int[m.size()];
		int i = 0;
		for (int num : m.values()) {
			count[i] = num;
			i++;
		}
		Arrays.sort(count);
		int max = count[m.size() - 1];
		for (Map.Entry entry : m.entrySet()) {
			if (entry.getValue().equals(max)) {
				System.out.println(entry.getKey() + ":" + entry.getValue());
			}
		}
	}
}
