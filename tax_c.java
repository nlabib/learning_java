import java.util.Scanner;

public class tax_c {
    public static void main(String[] args) {


       // input
        double total_meal_price; // Total Meal price
        System.out.println("What is the total meal price? ");
        Scanner tmp = new Scanner(System.in);
        total_meal_price = tmp.nextDouble();

        double tax_rate; //Tax Rate
        System.out.println("What is the tax rate in decimals ");
        Scanner tp = new Scanner(System.in);
        tax_rate = tp.nextDouble();

        double delivery_fee;  //Delivery fee
        System.out.println("What is the Delivery Fee? ");
        Scanner df = new Scanner(System.in);
        delivery_fee = df.nextDouble();


        // Solve
        // tax
        double tax = (total_meal_price * tax_rate);// Total Meal Price * Tax Rate


        // Subtotal
        double subtotal = (total_meal_price + delivery_fee);  // total price + delivery fee

        // Output
        System.out.println("Tip Calculator");
        // tip
        float tenp = (float) (subtotal * .10);
        System.out.println("A 10% tip would be: " + tenp);
        //10% Tip (Subtotal * .10%)
        float twentyp = (float) (subtotal * .20);
        System.out.println("A 10% tip would be: " + twentyp);
        // 20% Tip (Subtotal * .20%)

        // Total with 10%
        float tentotal = (float) (tenp + subtotal + tax);
        //Total with 20%
        float twentlytotal = (float) (twentyp + subtotal + tax);


        System.out.println("The total would be: " + tentotal);
        System.out.println("The total would be: " + twentlytotal);




    }
}
