import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonInventoryManagement {

		public static void main(String[] args) throws  IOException, ParseException {
//FILE PATH FROM WHERE WE HAVE CREATE A JSON FILE
			String filepath="/home/bridz/Desktop/SteadyJava/ObjectOrientedProgramming/myJSON.json";
			
			//GET THE FILE PATH 
			FileReader reader=new FileReader(filepath);
			//BUFFERED READER IS USE TO READ THE SPACE
			  BufferedReader br = new BufferedReader(reader);
				JSONParser jsonparser = new JSONParser();
				JSONObject jsonObject=(JSONObject)jsonparser.parse(reader);
			
				//PLACING THIS INTO A ARRAY
			JSONArray rice=(JSONArray)jsonObject.get("rice");
			JSONArray wheats=(JSONArray)jsonObject.get("wheats");
			JSONArray pulses=(JSONArray)jsonObject.get("pulses");
			//FOR LOOP FOR RICE DATA
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
			//FOR LOOP FOR WHEAT DATA
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
			//FOR LOOP FOR PULSES DATA
			for(int i=0;i < pulses.size();i++)		
			{
				JSONObject arrayValue=(JSONObject)pulses.get(i);
				System.out.println(pulses.get(i));
				System.out.println();
				System.out.println("NAME :"+arrayValue.get("name"));
				System.out.println("Weight :"+arrayValue.get("weight"));
				System.out.println("pricePerkg :"+arrayValue.get("pricePerkg"));
				long weightresult=(long) arrayValue.get("weight");
				//System.out.println("pricePerkg :"+arrayValue.get("pricePerkg"));
				long pricePerkg= (long)arrayValue.get("pricePerkg");
				long totalPriceOfWeight=(weightresult*pricePerkg);
				System.out.println("Total Price of Weight :"+totalPriceOfWeight);	
			}
		
			
		}

		}
