package level_1;

public class TheNumberOfPAndYInTheString {
	public static void main(String[] args) {
		TheNumberOfPAndYInTheString andYInTheString = new TheNumberOfPAndYInTheString();
		String s = "Pyy";
		System.out.println(andYInTheString.solution(s));
	}
	
	public boolean solution(String s) {
		boolean answer = true;
		int p = 0;
		int y = 0;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == 'p' || s.charAt(i) == 'P') {
				p++;
			}
			if(s.charAt(i) == 'y' || s.charAt(i) == 'Y') {
				y++;
			}
		}
		answer = (p != y) ? false : true;
		return answer;
	}
}
