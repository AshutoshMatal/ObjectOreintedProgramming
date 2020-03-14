import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

	public static void main(String[] args) {
		 int count=0;
		 //MESSEGE
		 String name=" Hello Ashutosh we have your fullname as Ashutosh Matal in our system"
		 		+ " your contact number is 917208239130 plz let us know with the clarification "
		 		+ ".thank you bridgelabz 01/01/2020";
		 //USING REGEX FINDING NAME AND CONTACT NO
		Pattern p=Pattern.compile("(0/91)?[7-9][0-9]{9}");
		Pattern p1=Pattern.compile("[a-zA-Z0-9]");
		Matcher m=p.matcher(name);
		Matcher m1=p.matcher(name);
		System.out.println(name);
		//USING REGEX FINDING THE DATE 
		StringTokenizer st=new StringTokenizer("01/01/2020","/");
		{
			while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
		}
		while(m.find())
		{	count++;
			System.out.println(m.group());
		}
		System.out.println("number of occurences :"+count);
		System.out.println("After replacing :");
		System.out.println("****************************************************************(");
		name= name.replace("Ashutosh","Steady");
		name=name.replace("917208239130", "918928088212");
		name=name.replace("01/01/2020", "14/03/2020");
		System.out.println(name);
	}
}
