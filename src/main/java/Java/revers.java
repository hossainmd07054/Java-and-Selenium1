package Java;

public class revers {

	public static void main(String[] args) {
//		int i = 10;
//		int j = 20;
//		j = i+j;//30
//		i = j-i;//20
//		j = j-i;//10
//		
//		System.out.println(i);
//		System.out.println(j);
		
		String name = "Mohammad";
		for (int i = name.length() - 1; i >= 0; i--) {
			System.out.println(name.charAt(i));
		}
		for (int i = name.length() - 1; i >= 0; i--) {
			System.out.print(name.charAt(i));
		}
		System.out.println(" ");

		String t ="";
		for (int i = name.length() - 1; i >= 0; i--) {
			t = t + name.charAt(i);
		}
		System.out.println(t);

		StringBuffer input = new StringBuffer(name);
		StringBuffer output = input.reverse();
		System.out.println(output);
	}
}
