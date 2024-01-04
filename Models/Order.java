package Models;


public class Order {
    String name;
    int phone_number;
    String []items;
    int []prices;

    //Constructor
    public Order(String name, int phone_number, String []items, int []prices) {
        this.name = name;
        this.phone_number = phone_number;
        this.items = items;
        this.prices = prices;
    }
    //
    public void Bill(){
        int total=0;
        for (int i = 0;i<this.items.length;i++){
            System.out.println(this.items[i]+" \t \t \t "+this.prices[i]);
            total += this.prices[i];
        }
        double vat = total * 0.13;
        System.out.println("Order details:");
        System.out.println("Name: " + name);
        System.out.println("Phone number: " + phone_number);
        System.out.println("Items: "  );
        for (int i=0;i<this.items.length;i++){//prints all the sizes
            System.out.println(this.items[i]+" ");
        }
        System.out.println();
        System.out.println("Prices: "  );
        for (int i=0;i<this.prices.length;i++){//prints all the sizes
            System.out.println(this.prices[i]+" ");
        }
        System.out.println();
        System.out.println("Total price: " + total);
        System.out.println("VAT (13%): " + vat);
        System.out.println("Total price with VAT: " + (total + vat));
    }

    //Getter Setter


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(int phone_number) {
        this.phone_number = phone_number;
    }


    public int[] getPrices() {
        return prices;
    }

    public void setPrices(int[] prices) {
        this.prices = prices;
    }
}
