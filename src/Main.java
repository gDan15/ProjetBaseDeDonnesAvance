import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

import com.mongodb.BasicDBObject;
import com.mongodb.Cursor;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

public class Main {
	public static void main(String [] args) {
		
		System.out.println("###################################################################################################");
		System.out.println("Bonjour, bienvenue sur l'application Real Estate Finder !");
		System.out.println("###################################################################################################");
//		List<Object> listCaracteristic = new ArrayList<Object>();
//		try {
//			
//			String city="";
//			System.out.println("Dans quelle ville voulez vous acheter ?");
//			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//			if(reader.readLine().trim().equals("")) 
//			{
//				city=null;
//			}
//			else 
//			{
//				city = reader.readLine();
//			}
//			listCaracteristic.add(city);
//			
//			String county="";
//			System.out.println("Dans quelle comté voulez vous acheter ?");
//			BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
//			if(reader1.readLine().trim().equals("")) 
//			{
//				county=null;
//			}
//			else 
//			{
//				county = reader.readLine();
//			}
//			listCaracteristic.add(county);
//			
//			String zip="";
//			System.out.println("Quelle est le code postal ?");
//			BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
//			if(reader2.readLine().trim().equals("")) 
//			{
//				System.out.println("blank");
//				zip=null;
//			}
//			else 
//			{
//				zip = reader2.readLine();
//			}
//			listCaracteristic.add(zip);
//			
//			String price ="";
//			System.out.println("Quel est le prix maximum que vous pouvez mettre ?");
//			BufferedReader reader3 = new BufferedReader(new InputStreamReader(System.in));
//			if(reader3.readLine().equals("")) 
//			{
//				System.out.println("blank");
//				price=null;
//			}
//			else 
//			{
//				zip = reader3.readLine();
//			}
//			listCaracteristic.add(price);
//			
//			String area ="";
//			System.out.println("Quel la surface que vous désirez ?");
//			BufferedReader reader4 = new BufferedReader(new InputStreamReader(System.in));
//			if(reader3.readLine().equals("")) 
//			{
//				System.out.println("blank");
//				area=null;
//			}
//			else 
//			{
//				area = reader3.readLine();
//			}
//			listCaracteristic.add(area);
//			
//		} catch (IOException e) {
//			e.printStackTrace();
//			System.out.println("Veuillez taper quelque chose d'adéquat");
//		}
//		String query="{";
//		for(int i=0;i<listCaracteristic.size();i++) {
//			
//			if(listCaracteristic.get(i) != null) {
//				if(i==0) {
//					query = query + "'city': " + listCaracteristic.get(0); 
//				}else if(i==1) {
//					if(!query.equals("{")) { query=query+" , ";}
//					query = query + "'county' : " + listCaracteristic.get(1);
//				}else if(i==2) {
//					if(!query.equals("{")) { query=query+" , ";}
//					query = query + "'zip' : " + Integer.parseInt(((String) listCaracteristic.get(2)).trim());
//				}else if(i==3) {
//					if(!query.equals("{")) { query=query+" , ";}
//					System.out.print(query);
//					query = query + "'price' : " + Integer.parseInt(((String)listCaracteristic.get(3)).trim());
//				}else if(i==4) {
//					if(!query.equals("{")) { query=query+" , ";}
//					query = query + "'area' : " + Integer.parseInt(((String) listCaracteristic.get(4)).trim());
//				}
//			}
//		}
//		query=query+"}";
//		System.out.print(query);
//		if(query.equals("{}")) {
//			System.out.println("Vous n'avez tapé aucun critère !!");
//		}
//		
		MongoDb mongoClient = new MongoDb("mongodb+srv://gDan:LT0NSa3V8PfkkYnp@cluster0-tgfhl.mongodb.net/Test","Database","RealEstate1");
		Design.printResult(mongoClient, "{state : 'LA'}","price");
		mongoClient.stopConnection();
	}
		
}
