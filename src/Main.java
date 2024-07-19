import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;
import org.bson.Document;
import com.mongodb.client.FindIterable;
import com.mongodb.client.result.UpdateResult;
import com.mongodb.client.result.DeleteResult;


public class Main {
    public static void main(String[] args) {

        // Insertar

        try (MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017/miBaseDeDatos)")) {
            MongoDatabase database = mongoClient.getDatabase("miBaseDeDatos");
            MongoCollection<Document> collection = database.getCollection("miColeccion");
            Document documents = new Document("nombre", "Carlos")
                    .append("apellido", "Perez")
                    .append("edad", "19");
            collection.insertOne(documents);
            System.out.println("Documento insertado con éxito");

        }

        // Leer

        try (MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017/miBaseDeDatos)")) {
            MongoDatabase database = mongoClient.getDatabase("miBaseDeDatos");
            MongoCollection<Document> collection = database.getCollection("miColeccion");
        }
    }
}