package Models;
public class Tshirt {
    String name;
    int product_code;
    int price;
    String brand;
    String description;
    int [] sizes;

    // Constructor
    public Tshirt(String name, int product_code, int price, String brand, String description, int[] sizes) {
        this.name = name;
        this.product_code = product_code;
        this.price = price;
        this.brand = brand;
        this.description = description;
        this.sizes = sizes;
    }

    public void Itemdetail(){
        System.out.println("Item Name: "+this.name+"\n\n"); //Prints item name
        System.out.println("Description: "+this.description); //PrintsDescription
        System.out.println("Product code: "+this.product_code+"\n\n");//prints product codes
        System.out.println("Price: "+this.price);
        System.out.println("Sizes: ");
        for (int i = 0; i < this.sizes.length; i++) {
            System.out.print(this.sizes[i] + " ");
        }
        System.out.println();
    }

    //Getter and Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int[] getSizes() {
        return sizes;
    }

    public void setSizes(int[] sizes) {
        this.sizes = sizes;
    }
}
