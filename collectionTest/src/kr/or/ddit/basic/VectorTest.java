package kr.or.ddit.basic;

import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		
		// 객체 생성
		Vector v1 = new Vector();
		
		System.out.println("처음 크기 : " + v1.size() );
		
		
		// 데이터 추가 ==> add(추가할 데이터)
		// 반환값 : 성공(true), 실패(false)
		v1.add("aaaaa");
		v1.add(new Integer(111));
		v1.add(123); // 오토박싱 : 기본형 데이터를 객체형으로 자동으로 형변환해준다.
		v1.add('a');
		v1.add(true);
		boolean r = v1.add(3.14);
		
		
		
		System.out.println("현재 크기 : " + v1.size() );
		System.out.println("반환값 : " + r);
		
		
		// 데이터 추가 : addElement(추가할 데이터)
		// 이전 버전의 프로그램도 사용할 수 있도록 하기 위해서 남아있는 메서드
		v1.addElement("CCC");
		System.out.println("v1 : " + v1);
		
		// 데이터 추가 : add(index, 데이터)
		// ==> index 번 째에 '데이터'를 끼워 넣는다. (index는 0부터 시작)
		// ==> 반환값은 없다.
		v1.add(1, "kkk");
		System.out.println("v1 : " + v1);
		
		// 데이터 수정 : set(index, 새로운 데이터)
		// ==> index번 째의 데이터를 '새로운 데이터'로 덮어쓴다.
		// ==> 반환값 : 원래데이터
		String temp =  (String) v1.set(0, "zzz"); // 데이터를 꺼낼 때는 객체형 데이터가 기본형 데이터로 자동으로 변환되지 않는다. 형변환을 해줘야한다. 
		
		System.out.println("v1 : " + v1);
		System.out.println(temp);
		
		// 데이터 삭제 : remove(index)
		// ==> index번 째의 데이터를 삭제한다.
		// ==> 반환값 : 삭제된 데이터
		temp = (String) v1.remove(0);
		System.out.println("삭제 후 v1 = " + v1);
		System.out.println("삭제된 데이터 : "+ temp);
		
		// 데이터 삭제 : remove(삭제할 데이터)
		// ==> '삭제할 데이터'를 찾아서 삭제한다.
		// ==> '삭제할 데이터'가 여러 개이면 앞에서부터 삭제한다.
		// ==> 반환값 : 삭제성공(true), 삭제실패(false)
		// 삭제할 데이터가 '정수형(int형) 이거나 'char형' 일 경우에는 반드시 객체로 변환해서 사용해야한다.
		v1.remove("CCC");
		System.out.println("삭제 후 v1 = " + v1);
		
//		v1.remove((Integer) 123);
		v1.remove(new Integer(123));
		System.out.println("삭제 후 v1 = " + v1);
		
//		v1.remove('a');
//		v1.remove((Character)'a');
		v1.remove(new Character('a'));
		System.out.println("삭제 후 v1 = " + v1);
		
		v1.remove(true);
		System.out.println("삭제 후 v1 = " + v1);
		
		v1.remove(3.14);
		System.out.println("삭제 후 v1 = " + v1);
		
		// 데이터 꺼내오기 : get(index)
		// ==> index번 째의 데이터를 꺼내온다.
		int data = (int)v1.get(1);
		System.out.println("1번 째 데이터 : " + data);
		
		/*
		제네릭 타입(Generic Type) ==> 객체를 선언할 때 < > 안에 그 객체가 사용할 데이터의 타입을 정해주는 것을 말한다.
			이런 식으로 선언하게 되면 생성된 객체에는 제네릭 타입으로 지정한 데이터 이외의 데이터를 저장할 수 없다.
			이때, 제네릭으로 선언될 수 있는 데이터 타입은 클래스형이어야 한다.
			예) int는 Integer, boolean은 Boolean, char은 Character 등으로 대채해서 사용해야 한다.
			제네릭 타입으로 선언하게 되면 데이터를 꺼내올 때 별도의 형변환이 필요없다. 
		 */
		
		Vector<String> v2 = new Vector<>(); // String만 저장할 수 있는 Vector
		Vector<Integer> v3 = new Vector<>(); // int형만 저장할 수 있는 Vector
		
		//v2.add(123); // 오류 ==> 제네릭타입과 다른 종류의 데이터를 저장할 수 없다.
		v2.add("안녕하세요"); 
		System.out.println("v2 = " + v2);
		
		String temp2 = v2.get(0); // 제네릭을 설정했기때문에 데이터를 꺼내올 때 따로 형변환을 해 줄 필요가 없다.
		System.out.println(temp);
		
		//이렇게 사용하기도 한다.
		Vector<Vector> vv = new Vector<>();
		Vector<Vector<Vector>> vvv = new Vector<>();
		
		//전체 데이터 삭제 : clear()
		v2.clear();
		System.out.println("v2의 size : " + v2.size());
		
		v2.add("AAA");
		v2.add("BBB");
		v2.add("CCC");
		v2.add("DDD");
		v2.add("EEE");
		
		Vector<String> v4 = new Vector<>();
		v4.add("BBBB");
		v4.add("EEEE");
		
		System.out.println("v2 = " + v2);
		
		// 데이터 삭제 : removeAll(Collection 객체)
		// ==> 'Collection 객체'가 가지고 있는 데이터를 모두 삭제한다.
		// ==> 반환값 : 삭제성공(true), 삭제실패(false)
		v2.removeAll(v4);
		System.out.println("v2 = " + v2);
		System.out.println("------------------------------------------------------------------------------");
		
		
		v2.clear();
		v2.add("AAA");
		v2.add("BBB");
		v2.add("CCC");
		v2.add("DDD");
		v2.add("EEE");
		
		// Vector의 데이터를 순서대로 모두 가져와 사용하고 싶으면 반복문을 사용하면 된다.
		// (주로 for문을 사용한다.)
		for(int i = 0; i < v2.size(); i++){
			System.out.println(i +"번 째 자료 : " + v2.get(i));
		}
		System.out.println("------------------------------------------------------------------------------");

		// 향상된 for문
		for(String str : v2){
			System.out.println(str);
			
		}
		
	}
}






























