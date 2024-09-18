import java.net.UnknownHostException;

import javax.swing.text.Document;

import org.bson.conversions.Bson;
import com.mongodb.client.model.Filters;
import com.mongodb.BulkWriteOperation;
import com.mongodb.BulkWriteResult;
import com.mongodb.Cursor;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;


public class primaria{

	public static void main(String[] args){
		
        // Conexión a MongoDB
        MongoClient mongoClient = new MongoClient("localhost", 27017);
        DB db = (DB) mongoClient.getDatabase("alumns_records_with_MGDB");
        DBCollection coll = db.getCollection("collection1"); 
        DBObject query = (DBObject) Filters.eq("id", 1);
        System.out.println(coll.find(query));
        // Crear la consulta para encontrar el documento con id 1
		
		new myframe();
	
	}
}