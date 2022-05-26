package Java;

public class sortarraydemo {

	public static void main(String[] args) {
		int a[] = {2,6,8,9,35,5,1,3,16,25};
		// print 1 2 3 5 6 8 9
		int temp;
		for (int i=0; i<a.length; i++) {

			for (int j=i+1; j<a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}
			}
		}
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
	}
}
