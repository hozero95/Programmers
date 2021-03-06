package level_1;

public class SumBetweenTwoIntegers {
	public static void main(String[] args) {
		SumBetweenTwoIntegers betweenTwoIntegers = new SumBetweenTwoIntegers();
		int a = 3;
		int b = 5;
		System.out.println(betweenTwoIntegers.solution(a, b));
	}
	
	public long solution(int a, int b) {
		long answer = 0;
		if(a > b) {
			int temp = a;
			a = b;
			b = temp;
		}
		for(int i = a; i <= b; i ++) {
			answer += (long)i;
		}
		return answer;
	}
}
