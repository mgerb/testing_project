/**
 * Created by Mitchell on 4/16/16.
 */
public class commission {

    public commission(){

    }

    public static String calculate(int locks, int stocks, int barrels){

        double lockPrice = 35, stockPrice =  25, barrelPrice = 20, lockSales = 0, stockSales = 0,
                barrelSales = 0, sales = 0, commission = 0;

        int totalLocks = 0, totalStocks = 0, totalBarrels = 0;

        totalLocks+= locks;
        totalStocks+= stocks;
        totalBarrels+= barrels;

        lockSales = lockPrice * totalLocks;
        stockSales = stockPrice * totalStocks;
        barrelSales = barrelPrice * totalBarrels;

        sales = lockSales + stockSales + barrelSales;

        if (sales > 1800){
            commission = 0.10 * 1000;
            commission += 0.15 * 800;
            commission += 0.20 * (sales-1800);
        }
        else if (sales > 1000){
            commission = 0.10 * 1000;
            commission += 0.15*(sales-1000);
        }
        else {
            commission = 0.10 * sales;
        }

        return "" + commission;
    }


}
