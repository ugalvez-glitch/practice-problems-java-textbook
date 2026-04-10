public class Lanterns {
	public static void main() {
		allLanterns();
	}
	
	public static void fiveStars() {
		IO.println("     *****	");
	}
	
	public static void nineStars() {
		IO.println("   *********  ");
		
	}
	public static void thirteenStars() {
		IO.println(" ************* "); 
	}
	
	public static void topLantern() {
		fiveStars();
		nineStars();
		thirteenStars();
	}
	public static void twoLines() {
		IO.println(" ");
		IO.println(" ");
	}
	public static void light() {
		IO.println(" * | | | | | * ");
	}
	
	public static void middleLantern() {
		topLantern();
		light();
		thirteenStars();
		topLantern();
	}
	
	public static void bottomLantern() {
		topLantern();
		fiveStars();
		light();
		light();
		fiveStars();
		fiveStars();
	}
	public static void allLanterns() {
		topLantern();
		twoLines();
		middleLantern();
		twoLines();
		bottomLantern();
	}
}

		
		
