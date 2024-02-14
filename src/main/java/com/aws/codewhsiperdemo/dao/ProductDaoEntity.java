package com.aws.codewhsiperdemo.dao;

//create a dynamo db ProductDaoEntity class with partition Key as id, name, price, description, rating attributes using dynamo db enhanced mapper annotationss

// import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
// import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
// import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

// @DynamoDBTable(tableName = "Product")
// public class ProductDaoEntity {

//     @DynamoDBHashKey(attributeName = "id")
//     private String id;

//     @DynamoDBAttribute(attributeName = "name")
//     private String name;

//     @DynamoDBAttribute(attributeName = "price")
//     private String price;

//     @DynamoDBAttribute(attributeName = "description")
//     private String description;

//     @DynamoDBAttribute(attributeName = "rating")
//     private String rating;

//     public String getId() {
//         return id;
//     }

//     public void setId(String id) {
//         this.id = id;
//     }

//     public String getName() {
//         return name;
//     }

//     public void setName(String name) {
//         this.name = name;
//     }

//     public String getPrice() {
//         return price;
//     }
//     public void setPrice(String price) {
//         this.price = price;
//     }
// }    

