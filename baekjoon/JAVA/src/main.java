import java.util.HashMap;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] part = {"leo", "kiki", "eden"};
		String[] comp = {"eden", "kiki"};
		main sol = new main();
//		System.out.println(sol.solution(part, comp));
		
		HashMap<String, Integer> test = new HashMap();
//		test.put("a",100);
//		test.put("b",200);
//		test.put("c",300);
		System.out.println(test);
		System.out.println(test.getOrDefault("d", 0)+1);
		test.put("a", test.getOrDefault("a",0)+1);
		test.put("b", test.getOrDefault("b",0)+1);
		System.out.println(test);
		
	}
	
	public String solution(String[] participant, String[] completion) {
		String answer = "";
		
		HashMap<String, Integer> map = new HashMap<>();
		for(String player : participant) {
			map.put(player, map.getOrDefault(player, 0)+1);
		}
		for(String player : completion) map.put(player, map.get(player)-1);
		
		for(String key : map.keySet()) {
			if (map.get(key) != 0) {
				answer = key;
			}
		}
		
		return answer;
	}
}
