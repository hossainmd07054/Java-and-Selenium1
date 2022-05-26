package Java;
public class Nested_for_loop {
public static void main(String[] args) {
		
		// print 1
		// 		 1 2
		//  	 1 2 3
		// 		 1 2 3 4
	
		for (int i=1; i<=4;i++) {
		for (int j=1;j<=i;j++) {
		System.out.print(j);
		System.out.print("  ");}//Space
		//System.out.print("\t");//Space
		System.out.println("");}//Next line
	}
	}
