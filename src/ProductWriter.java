import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.ArrayList;

public class ProductWriter {


    public static void main(String[] args) {

        String FileName;
        File outFile;
        PrintWriter productPrinter;
        ArrayList<Product> ProductData = new ArrayList<Product>();
        Scanner in = new Scanner(System.in);
        String id;
        String Name;
        String Description;
        double price;
        Product toAdd;

        int productCounter = 1;
        int index = 0;

        id = SafeInput.getNonZeroLenString(in,"Enter an id for the product");
        Name = SafeInput.getNonZeroLenString(in,"Enter a name for the product");
        Description = SafeInput.getNonZeroLenString(in,"Enter a description for the product");
        price = SafeInput.getDouble(in,"Enter a price for the product");

        System.out.printf("The product you created is: %n" +
                        "id: %s%n" +
                        "name: %s%n" +
                        "description: %s%n"+
                        "price %2f",


                id, Name, Description, price);

        toAdd = new Product(id,Name,Description,price);


        ProductData.add(toAdd);


        while(SafeInput.getYNConfirm(in,"Do you want to create another product?")){

            productCounter++;

            id = SafeInput.getNonZeroLenString(in,"Enter an id for the product");
            Name = SafeInput.getNonZeroLenString(in,"Enter a name for the product");
            Description = SafeInput.getNonZeroLenString(in,"Enter a description for the product");
            price = SafeInput.getDouble(in,"Enter a price for the product");

            System.out.printf("The product you created is: %n" +
                            "id: %s%n" +
                            "name: %s%n" +
                            "description: %s%n"+
                            "price %2f",


                    id, Name, Description, price);


            toAdd = new Product(id,Name,Description,price);

            ProductData.add(toAdd);


        }

        try {

            FileName = SafeInput.getNonZeroLenString(in, "Enter a name for the file");
            outFile = new File(FileName + ".txt");
            System.out.println("File created: " + outFile.getName());

            FileWriter productsWriter = new FileWriter(outFile.getName());
            productPrinter = new PrintWriter(productsWriter);



            while (index <= productCounter){

                productPrinter.println(ProductData.get(index).toCSVDataRecord());

                index++;
                productCounter--;
            }

            productsWriter.close();

        }

        catch (IOException e){

            System.out.println("An error occurred.");
            e.printStackTrace();

        }

    }

}