package Java;

public class swaping {

	public static void main(String[] args) {
		int a=10;
		int b=5;
		
		
		//with extra variable
		/*int temp;
		temp =a;//10
		a =b;   //5
		b=temp; //10
		System.out.println(a);
		System.out.println(b);*/
		
		//without extra variable
		a=a+b;//a=15
		b=a-b;//b=10
		a=a-b;//a=5
		System.out.println(a);
		System.out.println(b);
		

	}

}
