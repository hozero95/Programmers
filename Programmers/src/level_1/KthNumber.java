package level_1;

import java.util.Arrays;

public class KthNumber {
	public static void main(String[] args) {
		KthNumber kthNumber = new KthNumber();
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		int[] result = kthNumber.solution(array, commands);
		for(int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
	
	public int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];
		for(int i = 0; i < commands.length; i++) {
			int[] temp = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
			Arrays.sort(temp);
			answer[i] = temp[commands[i][2] - 1];
		}
		return answer;
	}
}