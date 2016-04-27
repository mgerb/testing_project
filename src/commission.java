/**
 * Created by Mitchell on 4/16/16.
 */
public class commission {

    public int locks, stocks, barrels;

    public commission(int locks, int stocks, int barrels){

        this.locks = locks;
        this.stocks = stocks;
        this.barrels = barrels;

    }

    //function to run this test case for this object
    public void run(){

        double lockPrice = 35, stockPrice =  25, barrelPrice = 20, lockSales = 0, stockSales = 0,
                barrelSales = 0, sales = 0, commission = 0;

        lockSales = lockPrice * locks;
        stockSales = stockPrice * stocks;
        barrelSales = barrelPrice * barrels;

        sales = lockSales + stockSales + barrelSales;

        if (locks < 0 || locks > 77){
            System.out.printf("%s %5d %10d %10d %10s %10s %25s %20s %20s", "Testing: ", locks, stocks, barrels, "nil", "nil", "Invalid Locks Sales", "_______________", "_______________");
        }
        else if(stocks < 0 || stocks > 88){
            System.out.printf("%s %5d %10d %10d %10s %10s %25s %20s %20s", "Testing: ", locks, stocks, barrels, "nil", "nil", "Invalid Stocks Sales", "_______________", "_______________");
        }
        else if(barrels < 0 || barrels > 99){
            System.out.printf("%s %5d %10d %10d %10s %10s %25s %20s %20s", "Testing: ", locks, stocks, barrels, "nil", "nil", "Invalid Barrel Sales", "_______________", "_______________");
        }
        else{
            if (sales > 1800) {
                commission = 0.10 * 1000;
                commission += 0.15 * 800;
                commission += 0.20 * (sales - 1800);
            } else if (sales > 1000) {
                commission = 0.10 * 1000;
                commission += 0.15 * (sales - 1000);
            } else {
                commission = 0.10 * sales;
            }

            System.out.printf("%s %5d %10d %10d %10.0f %10.2f %25s %20s %20s", "Testing: ", locks, stocks, barrels, sales, commission, "Valid", "_______________", "_______________");
        }

        System.out.println();
    }


}
