public class ThreeFlags {
	public static void main(String[] args) {
	firstFlag();
	threeLineSpace();
	secondFlag();
	threeLineSpace();
	thirdFlag();
}
	public static void lineStar() {
		System.out.println("*****");
	}
	
	public static void twoPointStar() {
		System.out.println(" * * ");
	}
	
	public static void middleStar() {
		System.out.println("  *   ");
	}
	
	public static void threeLineSpace() {
		System.out.println("     ");
		System.out.println("     ");
		System.out.println("     ");
	}
	public static void firstFlag() {
		lineStar();
		lineStar();
		twoPointStar();
		middleStar();
		twoPointStar();
	}
	
	public static void secondFlag() {
		firstFlag();
		lineStar();
		lineStar();
	}
	
	public static void thirdFlag() {
		middleStar();
		middleStar();
		middleStar();
		firstFlag();
	}
}
