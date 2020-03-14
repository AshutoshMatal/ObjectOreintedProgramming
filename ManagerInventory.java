import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
class Inventory{
	public void display() throws IOException, ParseException
	{
	//FILE PATH FROM WHERE WE HAVE CREATE A JSON FILE
			String filepath="/home/bridz/Desktop/SteadyJava/ObjectOrientedProgramming/src/manager.json";
			
			//GET THE FILE PATH 
			FileReader reader=new FileReader(filepath);
			//BUFFERED READER IS USE TO READ THE SPACE
			  BufferedReader br = new BufferedReader(reader);
				JSONParser jsonparser = new JSONParser();
				JSONObject jsonObject=(JSONObject)jsonparser.parse(reader);
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the choice:");
				String choice=sc.next();
				//USING SWITCHCASE MANAGER WILL CHOICE THE ELEMENT
				switch(choice)
				{
				case "rice":
						JSONArray rice=(JSONArray)jsonObject.get("rice");
						for(int i=0;i < rice.size();i++)		
						{
							JSONObject arrayValue=(JSONObject)rice.get(i);	
							System.out.println(rice.get(i));
							System.out.println();
							System.out.println("NAME :"+arrayValue.get("name"));
							System.out.println("Weight :"+arrayValue.get("weight"));
							System.out.println("pricePerkg :"+arrayValue.get("pricePerkg"));
							long weightresult=(long) arrayValue.get("weight");
							long pricePerkg= (long)arrayValue.get("pricePerkg");
							long totalPriceOfWeight=(weightresult*pricePerkg);
							System.out.println("Total Price of Weight :"+totalPriceOfWeight);	
						}
						break;
			case "wheats":
					JSONArray wheats=(JSONArray)jsonObject.get("wheats");
						for(int i=0;i < wheats.size();i++)		
						{
							JSONObject arrayValue=(JSONObject)wheats.get(i);
							System.out.println(wheats.get(i));
							System.out.println();
							System.out.println("NAME :"+arrayValue.get("name"));
							System.out.println("Weight :"+arrayValue.get("weight"));
							long weightresult=(long) arrayValue.get("weight");
							//System.out.println("pricePerkg :"+arrayValue.get("pricePerkg"));
							long pricePerkg= (long)arrayValue.get("pricePerkg");
							long totalPriceOfWeight=(weightresult*pricePerkg);
							System.out.println("Total Price of Weight :"+totalPriceOfWeight);		
						}
						break;
			case "pulses":	
						JSONArray pulses=(JSONArray)jsonObject.get("pulses");
						for(int i=0;i < pulses.size();i++)		
						{
							JSONObject arrayValue=(JSONObject)pulses.get(i);
							System.out.println(pulses.get(i));
							System.out.println();
							System.out.println("NAME :"+arrayValue.get("name"));
							System.out.println("Weight :"+arrayValue.get("weight"));
							System.out.println("pricePerkg :"+arrayValue.get("pricePerkg"));
							long weightresult=(long) arrayValue.get("weight");
							long pricePerkg= (long)arrayValue.get("pricePerkg");
							long totalPriceOfWeight=(weightresult*pricePerkg);
							System.out.println("Total Price of Weight :"+totalPriceOfWeight);	
						}
				}
		}
}
public class ManagerInventory  {

	public static void main(String[] args) throws  IOException, ParseException {
		Inventory inventory=new Inventory();
		inventory.display();
			
	}

}
