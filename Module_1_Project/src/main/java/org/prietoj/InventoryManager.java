package org.prietoj;

import java.io.*;
import java.nio.file.*;
import java.util.List;
import java.util.ArrayList;

public class InventoryManager
{

    //create the list to hold product data
    public static List<Product> productList;

    //object creation of the InventoryManager class
    public InventoryManager()
    {
        this.productList = new ArrayList<>();
    }

    public void addProduct(Product product)
    {
        productList.add(product);
    }

    public List<Product> getProductList()
    {
        return productList;
    }

    //save to inventory.dat
    public void saveToFile(String fileName){
        try(ObjectOutputStream objectOStream = new ObjectOutputStream(new FileOutputStream(fileName))){
            objectOStream.writeObject(productList);
            System.out.println("Product List saved to " + fileName);
        }catch (IOException e) {
            System.err.println("Error Saving " + e.getMessage());
        }
    }


    //load the productList
    public void loadFromFile(String fileName){
        try (ObjectInputStream objectIStream = new ObjectInputStream(new FileInputStream(fileName))){
            productList = (List<Product>) objectIStream.readObject();
            System.out.println("Product list loaded from" + fileName);
        }catch(IOException | ClassNotFoundException e) {
            System.err.println("Error loading file");
        }
    }







    //checks for the "inventory.dat" file that will hold the product info
    public static boolean inventoryChecker(String fileName){
        //get the users home directory
        String userHome = System.getProperty("user.home");

        //creates the path to the users home directory
        Path filePath = Paths.get(userHome, fileName);

        //check if the file exists
        return Files.exists(filePath);
    }




    //creates the "inventory.dat" file if one does not exist in home directory
    public static void createFile(String fileName){
        //confirm users home directory
        String userHome = System.getProperty("user.home");

        //create the path to the file creation
        Path filePath = Paths.get(userHome, fileName);

        if(!Files.exists(filePath)){
            try{
                //create file
                Files.createFile(filePath);
                System.out.println("File created.");
            }catch (Exception e) {
                System.err.println("Error creating File: " + e.getMessage());
            }
        }else {
            System.out.println("File already exists.");

        }
    }


    //File name you want to look for
    String FileName = "inventory.dat";






}









