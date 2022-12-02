package ch05_test_1202;

public class Man {
	String name;
	int age;
	boolean isMarried;
	int child;
	
	public void showInfo() {
		System.out.println("남자이름 : " + name + " 나이 : "+age);
	}
	
	public static void main(String[] args) {
		
		Man hang = new Man();
		
		hang.name= "돼지";
		hang.age = 60;
		hang.isMarried = true;
		hang.child = 0;
		
		hang.showInfo();
		
		System.out.println(hang);
		System.out.println(hang.name);
		System.out.println(hang.age);
		System.out.println(hang.isMarried);
		System.out.println(hang.child);
	}

}
