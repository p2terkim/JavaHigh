package kr.or.ddit.basic;

import java.util.ArrayList;
import java.util.Scanner;

/*
 	문제) 5명의 사람 이름을 입력받아 ArrayList에 저장한 후에
 		이들 중 '김'씨 성의 이름을 모두 출력하시오.
 		(단, 입력은 Scanner 객체를 이용한다.)
 */
public class ArrayListTest02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<String> names = new ArrayList<>();
		
		//이름 입력받기
		for (int i = 0; i < 5; i++) {
			System.out.println("이름을 입력하시오>");
			String a = sc.nextLine();
			names.add(a);
			System.out.println(names.get(i).charAt(0));
		}
		//입력받은 이름 출력
		System.out.println("입력받은 이름 : " + names);
		
		//김씨성 출력
		System.out.print("김씨 성을 가진 사람들 : ");
		
		
		//방법1
		//이름이 '김'으로 시작하면 출력
		for (int i = 0; i < names.size(); i++) {
			
			//방법1 - startsWith
//			String x = names.get(i);
//			String N = "김"; 
//			if (x.startsWith(N)){
//				System.out.print("\t" + x );
//							}
			
			//방법2 - charAt
//			String x = names.get(i);
//			char N = '김'; 
//			if (x.charAt(0) == N){
//				System.out.print("\t" + x );
//			}
			
			//방법3 - substring
//			String x = names.get(i);
//			
//			if (x.substring(0, 1).equals("김")){
//				System.out.print("\t" + x );
//			}
			
			
			
			//방법4 - indexOf
			String x = names.get(i);
			if(x.indexOf("김") == 0){
				System.out.println(x);
			}
			
			//기타 이름에 '김' 포함되면 출력된다.
//			String x = names.get(i);
//			String N = "김";
//			if (x.contains(N)){
//				System.out.print("\t" + x );
//							}
			
			
		}
		

				
		
	}

}
