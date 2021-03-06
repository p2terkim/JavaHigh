package kr.or.ddit.basic;

import java.util.ArrayList;

public class ArrayListTest01 {

	public static void main(String[] args) {
		// ArrayList는 기본적인 사용법이 Vector와 같다.
		// Vector보다는 ArrayList를 더 많이 사용한다.
		// List가 더 가볍다.
		
		ArrayList list1 = new ArrayList();
		
		
		//add()메서드로 데이터를 추가한다.
		list1.add("aaa");
		list1.add(123);
		list1.add('k');
		list1.add(false);
		list1.add(123.45);
		list1.add("bbb");
		
		System.out.println("list1 => " + list1);
		System.out.println("size => " + list1.size());
		
		// get() 메서드로 데이터를 꺼내온다.
		System.out.println("1번째 자료 : " + list1.get(1));
		
		// 데이터를 끼워넣기도 같다.
		list1.add(3, "zzz");
		System.out.println("list1 => " + list1);
		
		// 데이터 변경하기
		String temp = (String) list1.set(3, "YYY");
		System.out.println("temp : " + temp);
		System.out.println("list1 => " + list1);
		
		// 삭제도 같다.
		list1.remove(3);
		System.out.println("list1 => " + list1);
		
		list1.remove("bbb");		
		System.out.println("list1 => " + list1);
		
		System.out.println("--------------------------------------------------------------------");
		
		
		
		// 제네릭을 사용할 수 있다.
		ArrayList<String> list2 = new ArrayList<>();
		list2.add("aaaa");
		list2.add("bbbb");
		list2.add("cccc");
		list2.add("dddd");
		list2.add("eeee");
		
		for(int i = 0; i < list2.size(); i++){
			System.out.println(i + " ==> " + list2.get(i));
		}
		System.out.println("--------------------------------------------------------------------");

		for(String str : list2){
			System.out.println(str);
		}
		
		
		//comtains(비교데이터) ==> List에 '비교데이터'가 있으면 true, 없으면 false를 변환한다.
		System.out.println("dddd값 : " + list2.contains("dddd"));
		System.out.println("ffff값 : " + list2.contains("ffff"));
		
		
		// indexOf(비교데이터)
		// ==> List에 '비교데이터'가 있으면 '비교데이터'가 있는 index값을 반환하고
		//		'비교데이터'가 없으면 -1을 반환한다.
		System.out.println("dddd값 : " + list2.indexOf("dddd"));
		System.out.println("ffff값 : " + list2.indexOf("ffff"));
		
		
		// toArray() ==> 리스트 안의 데이터를 배열로 변환하여 반환한다.
		//			 ==> 기본적으로 Object형 배열로 변환한다.
		
		// toArray(new 제네릭타입[0]) ==> 제네릭타입의 배열로 변환한다.
		
		Object[] strArr = list2.toArray();
		System.out.println("배열의 개수 : " + strArr.length );
		System.out.println("리스트의 개수 : " + list2.size() );
		
		for (int i = 0; i < strArr.length; i++){
			System.out.println(i + " ==> " + strArr[i] );
		}
		System.out.println("--------------------------------------------------------------------");

		
		String[] strArr2 = list2.toArray(new String[0]);
		for(String str : strArr2){
			System.out.println(str);
		}
		
		
		
		
		
	}

}
