package star_Pattern_Programs;

public class Star_Diagonal {
	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				if (i == j) {
					System.out.print(" * ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
