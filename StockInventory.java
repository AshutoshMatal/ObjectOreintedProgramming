import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
class Stock 
{
void display() throws IOException, ParseException
{	long totalvalue1=0;
	long totalvalue2=0;
	long totalvalue3=0;
	
	//FILE PATH FROM WHERE WE HAVE CREATE A JSON FILE
	String filepath="/home/bridz/Desktop/SteadyJava/ObjectOrientedProgramming/stock.json";
//GET THE FILE PATH 
FileReader reader=new FileReader(filepath);
//BUFFERED READER IS USE TO READ THE SPACE
  BufferedReader br = new BufferedReader(reader);
	JSONParser jsonparser = new JSONParser();
	JSONObject jsonObject=(JSONObject)jsonparser.parse(reader);

	//PLACING THIS INTO A ARRAY
	JSONArray parle=(JSONArray)jsonObject.get("parle");
	JSONArray marie=(JSONArray)jsonObject.get("marie");
	JSONArray oreo=(JSONArray)jsonObject.get("oreo");
	 
		for(int i=0;i < parle.size();i++)		
		{
			JSONObject arrayValue=(JSONObject)parle.get(i);
			System.out.println(parle.get(i));
			System.out.println();
			System.out.println("stock_name :"+arrayValue.get("stock_name"));
			System.out.println("number_of_shares:"+arrayValue.get("number_of_shares"));
			System.out.println("shareprice :"+arrayValue.get("share_price"));
			long no_of_share_result=(long) arrayValue.get("number_of_shares");
			long share_price_result= (long)arrayValue.get("share_price");
			totalvalue1=(no_of_share_result*share_price_result);
			System.out.println("Total Price of parle :"+totalvalue1);	
		}
		for(int i=0;i < marie.size();i++)		
		{
			JSONObject arrayValue=(JSONObject)marie.get(i);
			System.out.println(parle.get(i));
			System.out.println();
			System.out.println("stock_name :"+arrayValue.get("stock_name"));
			System.out.println("number_of_shares:"+arrayValue.get("number_of_shares"));
			System.out.println("shareprice :"+arrayValue.get("share_price"));
			long no_of_share_result=(long) arrayValue.get("number_of_shares");
			long share_price_result= (long)arrayValue.get("share_price");
			totalvalue2=(no_of_share_result*share_price_result);
			System.out.println("Total Price of marie :"+totalvalue2);	
		}
		for(int i=0;i < oreo.size();i++)		
		{
			JSONObject arrayValue=(JSONObject)oreo.get(i);
			System.out.println(parle.get(i));
			System.out.println();
			System.out.println("stock_name :"+arrayValue.get("stock_name"));
			System.out.println("number_of_shares:"+arrayValue.get("number_of_shares"));
			System.out.println("shareprice :"+arrayValue.get("share_price"));
			long no_of_share_result=(long) arrayValue.get("number_of_shares");
			long share_price_result= (long)arrayValue.get("share_price");
			totalvalue3=(no_of_share_result*share_price_result);
			System.out.println("Total Price of oreo :"+totalvalue3);	
		}
	long TotalStock=totalvalue1+totalvalue2+totalvalue3;
	System.out.println("Total price of  all Stock:"+TotalStock);
	}
}
public class StockInventory {

	public static void main(String[] args) throws IOException, ParseException {
		Stock stock=new Stock();
		stock.display();
		
	}
}

