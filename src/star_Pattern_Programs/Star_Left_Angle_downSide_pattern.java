package star_Pattern_Programs;

public class Star_Left_Angle_downSide_pattern {
//pattern always print left to right side
	public static void main(String[] args) {
		int space = 4;
		int star = 1;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= space; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= star; j++) {
				System.out.print("*");
			}
			System.out.println();
			star++;
			space--;
		}
	}

}
//    *
//   **
//  ***
// ****
//*****
