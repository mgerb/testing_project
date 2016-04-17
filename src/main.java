/**
 * Created by Mitchell on 4/15/16.
 */

import java.util.*;

public class main {


    public static void main(String[] args){

        ArrayList<triangle> triangleRBVACases = generateTriangleRBVACases();

        System.out.println("Robustness Boundary Value Analysis Tests:");
        
        for (triangle t : triangleRBVACases){
            t.run();
        }


    }

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

    public static ArrayList<triangle> generateTriangleWCCases(){

    }

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
