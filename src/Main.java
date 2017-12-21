public class Main {
	public static void main(String [] args) {
		
		MongoDb mongoDb = new MongoDb("mongodb+srv://gDan:LT0NSa3V8PfkkYnp@cluster0-tgfhl.mongodb.net/Test","Test","Test");
		mongoDb.addColumnRandomValue("area", 160.0f);
		mongoDb.stopConnection();
		
	}
}
