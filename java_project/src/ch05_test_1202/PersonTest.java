package ch05_test_1202;

public class PersonTest {
   
	 public static void main(String[] args) {
		 // 기본 생성자를 호출
		  Person Kkh = new Person();
		  // 데이터에 직접 접근 하는 경우?
		 // Kkh.name = "김관후";
		  Kkh.height = 180F;
		  Kkh.weight = 85F;
		  
		  // set(메서드) 를 이용해서 name 값 설정하기
		  Kkh.setName("김관후 세터로 추가함");
		  Kkh.showInfo();
		  // get(메서드) 이용하는 경우
		  System.out.println("get 메서드로 이름 호출"
		  + Kkh.getName());
		  
		// 매개변수가 1개인 생성자를 호출
		  Person Kkh2 = new Person("김관후");
		  Kkh2.height = 180F;
		  Kkh2.weight = 85F;
		  Kkh2.showInfo();
		  
		// 매개변수가 3개인 생성자를 호출
		  Person Kkh3 = new Person("김관후",180F,85F );
		  Kkh3.showInfo();
//		  personKim.name = "김유신";;
//		  personKim.weight = 85.5F;
//		  personKim.height = 180.0F;
//		
//		  Person personLee = new Person("이순신", 175, 75);
	 }
}
