import com.mongodb.DBObject;

public class Design {
	static void printResult(MongoDb mongoClient, String queryString) {
		for(DBObject s : mongoClient.query(queryString)) {
			if((boolean) s.get("sold")!= true) {
				System.out.println("===========================================================");
				System.out.println(s.get("address"));
				System.out.print(s.get("zip"));
				System.out.print(" ");
				System.out.println(s.get("county"));
				System.out.println(s.get("state"));
				System.out.println("Sold by : "+s.get("company_name"));
			}
		}
		System.out.println("===========================================================");
	}
}
