import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.mongodb.BasicDBObject;
import com.mongodb.Cursor;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

public class Main {
	public static void main(String [] args) {
		
//		MongoClientURI uri = new MongoClientURI("mongodb+srv://gDan:LT0NSa3V8PfkkYnp@cluster0-tgfhl.mongodb.net/Test");
//		MongoClient mongoClient = new MongoClient(uri);
//		DB db = mongoClient.getDB("Test");	
//		DBCollection coll = db.getCollection("Test");
//		BasicDBObject query = new BasicDBObject("sold",false);
//		Cursor cursor;
//		cursor = coll.find(query);
//		DBObject s;
//		System.out.println("Query in progress");
//		while(cursor.hasNext()) {
//			s =  cursor.next();
//			System.out.println(s.get("first_name"));
//		}
		MongoDb mongoClient = new MongoDb("mongodb+srv://gDan:LT0NSa3V8PfkkYnp@cluster0-tgfhl.mongodb.net/Test","Database","RealEstate1");
//		Design.printResult(mongoClient, "{state : 'LA'}");
//		mongoClient.addColumnRandomValue("price", 170000f);
		mongoClient.addColumnRandomValue("sold", false);
//		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//		try {
//			String line = reader.readLine();
//			if(line.equals("s")) {System.out.println("nothing");}
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		mongoClient.stopConnection();
	}
		
}
