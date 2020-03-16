package level_1;

import java.util.ArrayList;

public class MockExam {
	public static void main(String[] args) {
		MockExam exam = new MockExam();
		int[] answers1 = {1, 2, 3, 4, 5};
		int[] answers2 = {1, 3, 2, 4, 2};
		int[] answer = exam.solution(answers2);
		for(int i = 0; i < answer.length; i++) {
			System.out.print(answer[i] + " ");
		}
	}
	
	public int[] solution(int[] answers) {
		int[] stu1 = {1, 2, 3, 4, 5};
		int[] stu2 = {2, 1, 2, 3, 2, 4, 2, 5};
		int[] stu3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
		int[] result = new int[3];
		int a = 0;
		int b = 0;
		int c = 0;
		ArrayList<Integer> temp = new ArrayList<Integer>();
		
		for(int i = 0; i < answers.length; i++) {
			if(a > stu1.length) {
				a = 0;
			}
			if(b > stu2.length) {
				b = 0;
			}
			if(c > stu3.length) {
				c = 0;
			}
			if(answers[i] == stu1[a]) {
				result[0]++;
			}
			if(answers[i] == stu2[b]) {
				result[1]++;
			}
			if(answers[i] == stu3[c]) {
				result[2]++;
			}
			a++;
			b++;
			c++;
		}
		
		temp.add(1);
		if(result[1] == result[2]) {
			if(result[0] == result[1]) {
				temp.add(2);
				temp.add(3);
			}
			else if(result[0] < result[1]) {
				temp.clear();
				temp.add(2);
				temp.add(3);
			}
		}
		else if(result[1] < result[2]) {
			if(result[0] == result[2]) {
				temp.add(3);
			}
			else if(result[0] < result[2]) {
				temp.clear();
				temp.add(3);
			}
		}
		else {
			if(result[0] == result[1]) {
				temp.add(2);
			}
			else if(result[0] < result[1]) {
				temp.clear();
				temp.add(2);
			}
		}
		
		int[] answer = new int[temp.size()];
		for(int i = 0; i < temp.size(); i++) {
			answer[i] = temp.get(i);
		}
		
		return answer;
	}
}