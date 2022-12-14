package ch14_exception_1025;

public class IDFormatException extends Exception{
	// 사용자가 만든 임의의 클래스 상속 받음
	// 기존 메서드를 재사용하기 위해서
	
	public IDFormatException(String message){
		// Super 키워드를 보면 부모 클래스 메서드 사용
		super(message);
	}
}
