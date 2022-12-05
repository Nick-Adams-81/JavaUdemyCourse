package Module1;

public class Casting {



    public static void main(String[] args) {
        double sales = 24309.65;
        double profit = 18562.18;
        double refunds = 688.78;
        double shipping = 1233.57;

        int newSales = (int)sales;
        int newProfit = (int)profit;
        int newRefunds = (int)refunds;
        int newShipping = (int)shipping;
        System.out.println("Sales: " + newSales);
        System.out.println("Profit: " + newProfit);
        System.out.println("Refunds: " + newRefunds);
        System.out.println("Shipping: " + newShipping);
    }
}
