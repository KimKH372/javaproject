package ch11_object_1021;

class Book{ // 암묵적으로 무엇을 상속 받는가? -> Object
	// Object toString 메서드가 존재
	// 이 메서드는 의미가 없는 해당 메모리 주소값을 출력함
	// 실제 작업은 데이터를
	
	int bookNumber;
	String bookTitle;

	Book(int bookNumber, String bookTitle){
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}

	@Override
	public String toString() {
		
		return "책 제목 : " + bookTitle + ", 책 번호 : " + bookNumber;
	}
	
}

public class ToStringEx {

	public static void main(String[] args) {

	Book book1 = new Book(200, "개미");
	
	System.out.println(book1);
	System.out.println(book1.toString());
	}
}

