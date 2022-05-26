package Java;

import java.text.SimpleDateFormat;
import java.util.Date;

public class currentdateandtime {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d= new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("d/M/y E hh:mm:ss");
		//System.out.println(sdf.);
		System.out.println(sdf.format(d));
		System.out.println(d.toString());
		

	}

}
