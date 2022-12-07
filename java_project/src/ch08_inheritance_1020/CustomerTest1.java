package ch08_inheritance_1020;

public class CustomerTest1 {
	// 모든 클래스는 부모 클래스가 : Object 최고 상위 클래스가 암묵적으로
	// 생성자 호출하는 부분이 생략

	// 상속을 배워서 자식 클래스라고 말하는 것은 여기에 부모 클래스가 있다는 것
	// VIPCutomer, extends Customer
	// 자식클래스가 자기 멤버를 초기화 하기 전에, 
	public static void main(String[] args) {
		Customer customerLee = new Customer(10010, "이순신");
//		Customer customerLee = new Customer();
//		customerLee.setCustomerID(10010);
//		customerLee.setCustomerName("이순신");
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
		System.out.println("===============================");
		
		//VIPCustomer customerKim = new VIPCustomer(10020, "김유신", 12345);
		VIPCustomer customerKim = new VIPCustomer();
		customerKim.setCustomerID(10020);
		customerKim.setCustomerName("김유신");
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
		
		// 다형성에서 부모 클래스 형으로 받으면
		// 바라 보는 관점은 부모 클래스 형으로 보임
		// 확인 lsy. 찍어보면 부모 클래스만 보인다.
		Customer lsy = new VIPCustomer();
		// 원래의 자식 클래스 형으로 변환 다운캐스팅
		// 명시적 형변환을 했을 때, 이거슬 받을 형은 원래 자식 클래스 형입니다
		// lsy7 찍어보면, 자식 클래스와 부모 클래스가 전부 다 보입니다.
		// 상속은 그래서, 자식보다는 부모가 먼저 초기화가 반드시 되므로
		// 1타2피로 사용 가능                                                 
		VIPCustomer lsy7 =(VIPCustomer)lsy;
		
		VIPCustomer lsy2 = new VIPCustomer();
		Object lsy3 = new VIPCustomer();
		
		
	}
}
