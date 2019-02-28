package test.day06;

public class test {

	public static void main(String[] args) {
		String[] participant = { "mislav", "stanko", "mislav", "ana" };
		String[] completion = { "stanko", "ana", "mislav" };
		// String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
		// String[] completion = {"josipa", "filipa", "marina", "nikola"};
		// String[] participant = {"leo", "kiki", "eden"};j
		// String[] completion = {"eden", "kiki"};

		Solution t1 = new Solution();
		String temp = t1.solution(participant, completion);
		System.out.println(temp);
	}

}

class Solution {
	public String solution(String[] participant, String[] completion) {
		String answer = "";
		boolean bool;

		for (int i = 0; i < participant.length; i++) {
			bool = false;

			for (int j = 0; j < completion.length; j++) {
				if (participant[i].equals(completion[j])) {
					bool = true;
					break;
				}else {
					 
				}
			}

			if (bool == false) {
				answer = participant[i];
			}
		}

		return answer;
	}
}