package kr.or.ddit.basic;

import java.util.ArrayList;
import java.util.Scanner;

/*
 	문제1) 5명의 별명을 입력받아 ArrayList에 저장하고 이들 중
 		별명의 길이가 제일 긴 별명을 출력하시오.
 		(단, 각 별명의 길이는 모두 다르게 입력한다.)
 		
 	문제2) 문제1에서 별명의 길이가 같은 것이 있을 경우를 처리하시오
 */


public class ArrayListTest03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<String> nickNameList = new ArrayList<>();
		
		//별명 입력받기
		for (int i = 0; i < 5; i++) {
			System.out.println("별명을 입력하시오>");
			String a = sc.nextLine();
			nickNameList.add(a);
		}
		
		System.out.println("입력받은 별명 : " + nickNameList);

//		int x = 0;
//		String str;
//		for (int i = 0; i < nickNameList.size() ; i++) {
//			for (int j = 0; j < nickNameList.get(i).length(); j++) {
//				if(x < nickNameList.get(i).length()) {
//					x = nickNameList.get(i).length();
//					str = 
//				}
//			}
//			
//		}
		

		
		int x = 0;
		String str = null;
		for (int i = 0; i < nickNameList.size() ; i++) {
			
			if(x < nickNameList.get(i).length()) {
				x = nickNameList.get(i).length();
				str = nickNameList.get(i);
			}
		}
		
		System.out.println("가장 긴 별명 : " + str);
				
	}

}
















































