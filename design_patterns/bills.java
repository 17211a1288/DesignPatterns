package design_patterns;
//import java.util.logging.Logger;
import java.io.*;
public class bills {
	//private static  final Logger LOGGER=Logger.getLogger(bills.class.getName());
	public static void main(String args[]) throws IOException
	{
		getPlan g=new getPlan();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter plan type:");
		String plan_name=br.readLine();
		System.out.println("Enter the number of units:");
		int units=Integer.parseInt(br.readLine());
		plan p=g.get(plan_name);
		System.out.println("Amount for plan "+plan_name+" of "+units+" is:");
		p.getRate();
		p.cal_Bill(units);
	}
}
