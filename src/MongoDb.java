import java.util.ArrayList;
import java.util.List;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.util.JSON;

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
		Object valueUser =value;
//		int i = 0;
		while(curs.hasNext()) {
//		while(i < 10) {
			if(value instanceof Float) 
			{
				value = valueUser;
				value = (float) value + (float)(Math.random()*200000);
			}else if(value instanceof Boolean){
				float number=3;
				number = number + (float)Math.random() * 5;
				if(number < 5) {value=!(Boolean)value;}
			}
			BasicDBObject p = (BasicDBObject) curs.next();
			BasicDBObject newDocument =
					new BasicDBObject().append("$set",
					new BasicDBObject().append(column, value));
			coll.update(p, newDocument);	
//			i++;
		}
	}
	public List<DBObject> query(String queryString) {
		DBCursor cursor;
		List <DBObject> listDocument = new ArrayList<DBObject>();
		DB db = this.mongoClient.getDB(this.database);	
		DBCollection coll = db.getCollection(this.table);
		cursor= coll.find(transformStringInDBObject(queryString));
		while(cursor.hasNext()) {
			listDocument.add(cursor.next());
		}
		return listDocument;	
	}
	public DBObject transformStringInDBObject(String queryString) {
		DBObject dbObject = (DBObject) JSON.parse(queryString);
		return dbObject;
	}
	public List<DBObject> sortList(List<DBObject> listDBObject) {
		List<DBObject> listToReturn = new ArrayList<DBObject>();
		for(DBObject document : listDBObject) {
			
		}
		return null;
	}
	public void stopConnection() {
		this.mongoClient.close();
	}
}
