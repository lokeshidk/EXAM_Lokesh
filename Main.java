import Models.Order;
import Models.Tshirt;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);


        System.out.println("Welcome to Juju Tees");
        int[]sizeOne={45,57,65,56};
        int[]sizeTwo={55,66,77,45};

        Tshirt one=new Tshirt("Gorkhali Batman",4565,1234,"adidas","Graphic text: You either die a hero or live long enough to see yourself be a villain",sizeOne);
        Tshirt two=new Tshirt("HMm",4345,4670,"nike","Tshirst to keep you cool during the summer",sizeTwo);
        one.Itemdetail();//method to display item detail of tshirt 1
        two.Itemdetail();//methd to display item detail of tshirt 2

        System.out.println("To place order type Y");
        String order=input.nextLine();

        if (order.equals("Y")){
            System.out.println("Enter YOur name");
            String Full_name=input.nextLine();
            System.out.println("Enter phone number");
            int Phonenumber=input.nextInt();
            String[] items={"HMm","Gorkhali Batman"};
            int[] price={1234,4670};
            Order details=new Order(Full_name,Phonenumber,items,price);
            details.Bill();//method to display bill
        }


    }
}
