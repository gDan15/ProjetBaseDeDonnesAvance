public class Main {
	public static void main(String [] args) {
////	    MongoClientOptions.Builder options = MongoClientOptions.builder().sslEnabled(true);
//	    
//	    // Creating Credentials 
////	    char[] password= {};
////	    MongoCredential credential = MongoCredential.createCredential("gDan","Test",password);
//	    
//	    //mongodb+srv://gDan:<PASSWORD>@cluster0-tgfhl.mongodb.net/test
//	    MongoClientURI uri = new MongoClientURI("mongodb+srv://gDan:LT0NSa3V8PfkkYnp@cluster0-tgfhl.mongodb.net/Test");
//
//	    MongoClient mongoClient = new MongoClient(uri);
////	    DB db = mongoClient.getDB( "Test" );
//		
//	    System.out.println("Connected to the database successfully");  
//	    // Accessing the database 
//	    MongoDatabase database = mongoClient.getDatabase("Test");  
//	    // Retrieving a collection 
//	    MongoCollection<Document> collection = database.getCollection("Test");
//	    System.out.println("Collection sampleCollection selected successfully"); 
////	    Getting the iterable object 
//	    FindIterable<Document> iterDoc = collection.find();
////	    DBCursor cursor = collection.find();
//	    int i = 1; 
//        // Getting the iterator 
//        Iterator it = iterDoc.iterator();
//        while(it.hasNext()) {
//        	System.out.println(it.next());
//        	i++;
//        }
//		DBCursor curs;
//		MongoClientURI uri = new MongoClientURI("mongodb+srv://gDan:LT0NSa3V8PfkkYnp@cluster0-tgfhl.mongodb.net/Test");
//		MongoClient mongoClient = new MongoClient(uri);
//		DB db = mongoClient.getDB("Test");
//		DBCollection coll = db.getCollection("Test");
//		curs= coll.find();
//		int i = 1; 
//		while(i<4) {
//			BasicDBObject p = (BasicDBObject) curs.next();
//			BasicDBObject q = p;
//			BasicDBObject sold = new BasicDBObject("sold", false);
//
////			o.put("sold", false);
////			coll.update(p.append("sold",false),q);
////			System.out.println(p);
////			System.out.println(q);
//			BasicDBObject newDocument =
//					new BasicDBObject().append("$set",
//					new BasicDBObject().append("total clients", 99));
//			System.out.println(newDocument);
//			coll.update(p, newDocument);
//			i++;
//		}
//		curs= coll.find();
//		while(i<7) {
//			BasicDBObject o = (BasicDBObject) curs.next();
////			o.append("sold",false);
//			System.out.println(o);
//			i++;
//		}
//		mongoClient.close();
		MongoDb mongoDb = new MongoDb("mongodb+srv://gDan:LT0NSa3V8PfkkYnp@cluster0-tgfhl.mongodb.net/Test","Test","Test");
		mongoDb.addColumnRandomValue("area", 160.0f);
		mongoDb.stopConnection();
	}
}
