package ch09_gamelevel_1021;

public class UltraLevel extends PlayerLevel {
	
	@Override
	public void run() {
		System.out.println("2X엄청 빨리 달립니다.");
		
	}

	@Override
	public void jump() {
		System.out.println("2X아주 높이 jump 합니다.");
	}

	@Override
	public void turn() {
		System.out.println("2X한 바퀴 돕니다.");		
	}

	@Override
	public void showLevelMessage() {
		System.out.println("***** 초고급자 레벨 입니다. *****");
	}
	

}
