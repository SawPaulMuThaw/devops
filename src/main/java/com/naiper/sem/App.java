package com.naiper.sem;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;
import org.bson.Document;

public class App
{
    public static void main(String[] args)
    {
        // Connect using MongoClients factory method with a valid connection URI
        try (MongoClient mongoClient = MongoClients.create("mongo-dbserver")) {

            // Get database
            MongoDatabase database = mongoClient.getDatabase("mydb");

            // Get collection
            MongoCollection<Document> collection = database.getCollection("test");

            // Create document
            Document doc = new Document("name", "Saw Paul Mu Thaw")
                    .append("class", "DevOps")
                    .append("year", "2024")
                    .append("result", new Document("CW", 95).append("EX", 85));

            // Add document
            collection.insertOne(doc);

            // Check document
            Document myDoc = collection.find().first();
            if (myDoc != null) {
                System.out.println(myDoc.toJson());
            }
        }
    }
}