/**
 * Created by Mitchell on 4/15/16.
 */

import java.util.*;

public class main {


    public static void main(String[] args){

        //generate cases for triangle problem - robust boundary value analysis and robust worst case
        runTriangleTest("Robust Boundary Value Analysis for Triangle Function", generateTriangleRBVACases());
        System.out.println();
        runTriangleTest("Robust Worst Case for Triangle Function", generateTriangleRWCCases());
        System.out.println();

        //generate and run cases for nextDate problem - boundary value analysis and robust boundary value analysis
        runNextDateTest("Boundary Value Analysis for NextDate Function", generateNextDateBVACases());
        System.out.println();
        runNextDateTest("Robust Boundary Value Analysis for NextDate Function", generateNextDateRBVACases());
        System.out.println();

        runCommissionTest("Boundary Value Analysis for Commission Function", generateCommissionBVACases());
        System.out.println();
        runCommissionTest("Robust Boundary Value Analysis for Commission Function", generateCommissionRBVACases());
        System.out.println();
        runCommissionTest("Worst Case for Commission Function", generateCommissionWCCases());

    }


    //function to run triangle test
    //takes in test name along with the arraylist of test case objects
    public static void runTriangleTest(String testName, ArrayList<triangle> testList){
        System.out.println("Running Test: " + testName);
        System.out.printf("%s %3s %5s %5s %10s %20s %20s %20s", "         ", "A", "B", "C", "       ",
                "Output", "Expected Output", "Pass/Fail\n");
        for (triangle t : testList){
            t.run();
        }
    }

    //function to run nextDate tests
    //takes in string as test name and arraylist of nextDate objects
    public static void runNextDateTest(String testName, ArrayList<nextDate> testList){
        System.out.println("Running Test: " + testName);
        System.out.printf("%s %10s %10s %10s %10s", "         ", "Month", "Day", "Year", "");
        System.out.printf("%s %10s %10s %10s %20s %20s", "        ", "Month", "Day", "Year", "Expected Output", "Pass/Fail\n");

        for (nextDate d : testList){
            d.run();
        }
    }

    //function to run commission test cases
    //tests in string for test name along with arraylist of commission objects
    public static void runCommissionTest(String testName, ArrayList<commission> testList){
        System.out.println("Running Test: " + testName);
        System.out.printf("%s %5s %10s %10s %10s %10s %25s %20s %20s", "         ",
                "Locks", "Stocks", "Barrels", "Sales", "Commission", "Comment", "Expected Output", "Pass/Fail\n");

        for (commission c : testList){
            c.run();
        }
    }

    //generates arraylist of commission objects - one for each test case
    public static ArrayList<commission> generateCommissionBVACases(){

        int[] locksCases = getBVACases(0, 77);
        int[] stocksCases = getBVACases(0, 88);
        int[] barrelsCases = getBVACases(0, 99);

        ArrayList<commission> list = new ArrayList<>();

        for (int i = 0; i < locksCases.length; i++){
            commission c = new commission(locksCases[i], locksCases[2], locksCases[2]);
            list.add(c);
        }
        for (int i = 0; i < locksCases.length; i++){
            commission c = new commission(locksCases[2], locksCases[i], locksCases[2]);
            list.add(c);
        }
        for (int i = 0; i < locksCases.length; i++){
            commission c = new commission(locksCases[2], locksCases[2], locksCases[i]);
            list.add(c);
        }

        return list;
    }

    //generates test cases for commission robust boundary value analysis cases
    public static ArrayList<commission> generateCommissionRBVACases(){

        int[] locksCases = getRBVACases(0, 77);
        int[] stocksCases = getRBVACases(0, 88);
        int[] barrelsCases = getRBVACases(0, 99);

        ArrayList<commission> list = new ArrayList<>();

        for (int i = 0; i < locksCases.length; i++){
            commission c = new commission(locksCases[i], locksCases[2], locksCases[2]);
            list.add(c);
        }
        for (int i = 0; i < locksCases.length; i++){
            commission c = new commission(locksCases[2], locksCases[i], locksCases[2]);
            list.add(c);
        }
        for (int i = 0; i < locksCases.length; i++){
            commission c = new commission(locksCases[2], locksCases[2], locksCases[i]);
            list.add(c);
        }

        return list;
    }

    //generates worst case test case objects for commission problem
    public static ArrayList<commission> generateCommissionWCCases(){

        int[] locksCases = getBVACases(0, 77);
        int[] stocksCases = getBVACases(0, 88);
        int[] barrelsCases = getBVACases(0, 99);

        ArrayList<commission> list = new ArrayList<>();

        for (int i = 0; i < locksCases.length; i++){
            for (int j = 0; j < stocksCases.length; j++){
                for (int k =0; k < barrelsCases.length; k++){
                    commission c = new commission(locksCases[i], stocksCases[j], barrelsCases[k]);
                    list.add(c);
                }
            }
        }

        return list;
    }

    //generates next date boundary value analysis objects
    public static ArrayList<nextDate> generateNextDateBVACases(){

        int[] dayTestCases = getBVACases(1, 31);
        int[] monthTestCases = getBVACases(1, 12);
        int[] yearTestCases = getBVACases(1801, 2021);

        ArrayList<nextDate> list = new ArrayList<>();

        for (int i = 0; i < dayTestCases.length; i++){
            nextDate n = new nextDate(dayTestCases[i], monthTestCases[2], yearTestCases[2]);
            list.add(n);
        }

        for (int i = 0; i < dayTestCases.length; i++){
            nextDate n = new nextDate(dayTestCases[2], monthTestCases[i], yearTestCases[2]);
            list.add(n);
        }

        for (int i = 0; i < dayTestCases.length; i++){
            nextDate n = new nextDate(dayTestCases[2], monthTestCases[2], yearTestCases[i]);
            list.add(n);
        }

        return list;
    }

    //generates next date robust boundary value analysis test case objects
    public static ArrayList<nextDate> generateNextDateRBVACases(){

        int[] dayTestCases = getRBVACases(1, 31);
        int[] monthTestCases = getRBVACases(1, 12);
        int[] yearTestCases = getRBVACases(1801, 2021);

        ArrayList<nextDate> list = new ArrayList<>();

        for (int i = 0; i < dayTestCases.length; i++){
            nextDate n = new nextDate(dayTestCases[i], monthTestCases[3], yearTestCases[3]);
            list.add(n);
        }

        for (int i = 0; i < dayTestCases.length; i++){
            nextDate n = new nextDate(dayTestCases[3], monthTestCases[i], yearTestCases[3]);
            list.add(n);
        }

        for (int i = 0; i < dayTestCases.length; i++){
            nextDate n = new nextDate(dayTestCases[3], monthTestCases[3], yearTestCases[i]);
            list.add(n);
        }

        return list;
    }

    //generates tirangle problem robust boundary value analysis test case objects
    public static ArrayList<triangle> generateTriangleRBVACases(){

        int nominalValue = (5 + 205) / 2;

        int[] testCases = getRBVACases(5, 205);

        ArrayList<triangle> list = new ArrayList<>();

        for (int i = 0; i < testCases.length; i++){
            triangle t = new triangle(testCases[i], nominalValue, nominalValue);
            list.add(t);
        }

        for (int i = 0; i < testCases.length; i++){
            triangle t = new triangle(nominalValue, testCases[i], nominalValue);
            list.add(t);
        }

        for (int i = 0; i < testCases.length; i++){
            triangle t = new triangle(nominalValue, nominalValue, testCases[i]);
            list.add(t);
        }

        return list;
    }

    //generates worst case test cases for triangle problem
    public static ArrayList<triangle> generateTriangleRWCCases(){

        int nominalValue = (5 + 205) / 2;

        int[] testCases = getRBVACases(5, 205);

        ArrayList<triangle> list = new ArrayList<>();

        //nests for loops to get the cartesian product of the test cases
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                for (int k = 0; k < 5; k++){
                    triangle t = new triangle(testCases[i], testCases[j], testCases[k]);
                    list.add(t);
                }
            }
        }

        return list;
    }

    //function to generate boundary value analysis cases based on a min and max value
    //returns an array of each boundary value: min, minPlus, nom, maxMinus, max
    public static int[] getBVACases(int min, int max){

        int[] cases = new int[5];

        //min value
        cases[0] = min;

        //min plus
        cases[1] = min + 1;

        //nominal value
        cases[2] = (min + max)/2;

        //max minus
        cases[3] = max - 1;

        //max value
        cases[4] = max;

        return cases;

    }

    //function to generate robust boundary value analysis cases based on a min and max value
    //returns an array of each boundary value: minMinus, min, minPlus, nom, maxMinus, max, maxPlus
    public static int[] getRBVACases(int min, int max){

        int[] cases = new int[7];

        //min minus
        cases[0] = min - 1;

        //min value
        cases[1] = min;

        //min plus
        cases[2] = min + 1;

        //nominal value
        cases[3] = (min + max)/2;

        //max minus
        cases[4] = max - 1;

        //max value
        cases[5] = max;

        //max plus
        cases[6] = max + 1;

        return cases;

    }

}
