package Java;

public class Max_eliments_array { 
	public static void main(String[] args) {
		
		int a[]= {160,50,60,10,30,180,65};
		int max=a[0];
		for(int i=1;i<a.length;i++) 
		{
			if(a[i]>max) {
				max=a[i];
			}
		
		}
		System.out.println(max);
	}

}
 