import java.util.HashMap;
import java.util.Scanner;

public class Hash02 {

	String solution(String s1, String s2) {
	
		String ans = "YES";
		
		
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(char c : s1.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		
		for(char c: s2.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) - 1);
			
			if(map.get(c) == 0) {
				map.remove(c);
			}
		}
		
		if(map.size() != 0) {
			return "NO";
		}
		
		return ans;
	}
	
	public static void main(String[] args) {
		
		Hash02 h02 = new Hash02();
		
		Scanner scanner = new Scanner(System.in);
		String s1 = scanner.next();
		String s2 = scanner.next();
		
		
		System.out.println(h02.solution(s1, s2));
	}
}
