import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

public class MongoDb {
	private String database;
	private String table;
	private MongoClient mongoClient;
	
	public MongoDb(String uriString, String database, String table) {
		MongoClientURI uri = new MongoClientURI(uriString);
		this.mongoClient = new MongoClient(uri);
		this.database = database;
		this.table=table;
	}
	
	public void addColumnRandomValue(String column, Object value) {
		DBCursor curs;
		DB db = this.mongoClient.getDB(this.database);	
		DBCollection coll = db.getCollection(this.table);
		curs= coll.find();
		int i = 0; 
		while(i<4) {
			System.out.println(value instanceof Float);
			if(value instanceof Float) {
				value = (float) value + (float)(Math.random() * 50);
				System.out.println((float)(Math.random() * 60));
			}else if(value instanceof Boolean){
				float number=3;
				number = number + (float)Math.random() * 5;
				if(number < 5) {
					value=!(Boolean)value;
				}
			}
			BasicDBObject p = (BasicDBObject) curs.next();
			BasicDBObject newDocument =
					new BasicDBObject().append("$set",
					new BasicDBObject().append(column, value));
			coll.update(p, newDocument);
			i++;
		}
	}	
	public void stopConnection() {
		this.mongoClient.close();
	}
}
