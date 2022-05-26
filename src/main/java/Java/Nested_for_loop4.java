package Java;

public class Nested_for_loop4 {
	public static void main(String[] args) {

		// print 3
		// 6 9
		// 12 15 18
		// 21 24 27 30

		int k = 3;
		for (int i=1; i<=5;i++) {
			for (int j=1; j <=i; j++) {
				System.out.print(k);
				System.out.print("  ");
				k=k+3;
			}
			System.out.println("");
		}

	}
}
