import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.util.Iterator;

import org.bson.Document;
public class Main {
	public static void main(String [] args) {
//	    MongoClientOptions.Builder options = MongoClientOptions.builder().sslEnabled(true);
	    
	    // Creating Credentials 
//	    char[] password= {};
//	    MongoCredential credential = MongoCredential.createCredential("gDan","Test",password);
	    
	    //mongodb+srv://gDan:<PASSWORD>@cluster0-tgfhl.mongodb.net/test
	    MongoClientURI uri = new MongoClientURI("mongodb+srv://gDan:LT0NSa3V8PfkkYnp@cluster0-tgfhl.mongodb.net/Test");

	    MongoClient mongoClient = new MongoClient(uri);
//	    DB db = mongoClient.getDB( "Test" );
		
	    System.out.println("Connected to the database successfully");  
	    // Accessing the database 
	    MongoDatabase database = mongoClient.getDatabase("Test");  
	    // Retrieving a collection 
	    MongoCollection<Document> collection = database.getCollection("Test");
	    System.out.println("Collection sampleCollection selected successfully"); 
	    // Getting the iterable object 
	    FindIterable<Document> iterDoc = collection.find();
	    int i = 1; 
        // Getting the iterator 
        Iterator it = iterDoc.iterator();
        while(it.hasNext()) {
        	System.out.println(it.next());
        	i++;
        }
        mongoClient.close();
	}
}
