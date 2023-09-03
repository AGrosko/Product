public class Product {

    String ID;
    String Name;
    String Description;
    double Price;

    public Product (String ID, String Name, String Description, double Price){
     this.ID = ID;
     this.Name = Name;
     this.Description = Description;
     this.Price = Price;

    }

    public String toCSVDataRecord(){
        return ID+","+Name+","+Description+","+Price;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        this.Price = price;
    }







}
