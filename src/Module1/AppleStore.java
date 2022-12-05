package Module1;

public class AppleStore {

    public static void main(String[] args) {
        double profit = 0;
        int customers = 0;
        int numberOfApples = 500;
        double applePrice = 0.4;

        customers += 1;
        numberOfApples -= 4;
        profit = applePrice * 4;

        System.out.println("You have " + numberOfApples + " left and made " + profit + " " + customers);

        customers += 1;
        numberOfApples -= 20;
        profit += applePrice * 20;
        System.out.println("You have " + numberOfApples + " left and made " + profit + " " + customers);

        customers += 1;
        numberOfApples -= 200;
        profit += applePrice * 200;
        System.out.println("You have " + numberOfApples + " left and made " + profit + " " + customers);

    }
}
