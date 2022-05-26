package Java;
public class string {
	public static void main(String[] args) {
		String a = "Mohammad Hossain ";
		
	System.out.println("1- "+a.charAt(5));				//print m
	System.out.println("2- "+a.indexOf("m"));			//print m index number- 4
	System.out.println("3- "+a.substring(4));			//print index 4 to end - mmad Hossain
	System.out.println("4- "+a.substring(5));			//print index 5 to end - mad Hossain
	System.out.println("5- "+a.substring(2,10));		//print index 2 to 10 - hammad H
	System.out.println("6- "+a.substring(3, 11));		//print index 3 to 11 - ammad Ho
	System.out.println("7- "+a.concat("Mithu"));		//add something with value - Mohammad Hossain Mithu
	System.out.println("8- "+a.toLowerCase());			//print all LowerCase - mohammad hossain
	System.out.println("9- "+a.toUpperCase());			//print all UpperCase - MOHAMMAD HOSSAIN
	System.out.println("10- "+a.length());				//print how many character-16
	
		String b = "Mohammad Hossain";
	System.out.println("11- "+b.repeat(3));				//Mohammad Hossain Mohammad Hossain Mohammad Hossain 
	System.out.println("12- "+b.replace("m","H"));		//replace all (m) to (H) - MohaHHad Hossain 
	
		String c = "      Mohammad Hossain    ";
	System.out.println("13- "+c.trim());				//Delete all spaces from front - Mohammad Hossain
	
		String d = "Mohammad Hossain";
	System.out.println("14- "+d.startsWith("Mo"));		//true
	System.out.println("15- "+d.startsWith("M"));		//true
	System.out.println("16- "+d.startsWith("m"));		//false
	
	System.out.println("17- "+d.endsWith("in"));		//true
	System.out.println("18- "+d.endsWith("n"));			//true
	System.out.println("19- "+d.endsWith("N"));			//false
	
		String e = "Mohammad";
	System.out.println("20- "+e.equals("Mohammad"));	//true
	System.out.println("21- "+e.equals("Mohammad "));	//false
	System.out.println("22- "+e.equals(" Mohammad"));	//false
	System.out.println("23- "+e.equals("mohammad"));	//false
	
	System.out.println("24- "+e.equalsIgnoreCase("Mohammad"));	//true
	System.out.println("25- "+e.equalsIgnoreCase("Mohammad "));	//false
	System.out.println("26- "+e.equalsIgnoreCase("Mohamma" ));	//false
	System.out.println("27- "+e.equalsIgnoreCase("mohaMMad"));	//true
	System.out.println("28- "+e.equalsIgnoreCase(" mohaMMad"));	//false
	
		String f = "Mohammad Hossain";
	    String arr[] = f.split(" ");
	    for(int i= 0;i<arr.length;i++) {
	    	System.out.println(arr[i]);
	   }	
}

}
