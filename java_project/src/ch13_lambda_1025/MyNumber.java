package ch13_lambda_1025;

// 컴파일러에 알려줌. 함수형 인터페이스라
// 메서드 하나야

// 에너테이션을 사용하게 되며느 마치 유효성을 체크하는 것처럼
// 미리 1차 검사
// 메서드를 만약 모르고 2개 만들 경우 문법 체크해서 오류 발생
@FunctionalInterface
public interface MyNumber {
	
	int getMax(int num1, int num2);
//	int getMax2(int num1, int num2);
}
