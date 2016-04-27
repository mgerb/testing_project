/**
 * Created by Mitchell on 4/15/16.
 */
public class triangle {

    public int a, b, c;

    public triangle(int a, int b, int c){

        this.a = a;
        this.b = b;
        this.c = c;

    }

    //function to run the test case for this object
    public void run(){

        //System.out.print("Testing: " + a + " " + b + " " + c + " - ");
        System.out.printf("%s %3d %5d %5d %10s", "Testing: ", a, b, c, "Output: ");

        boolean c1 = (a >= 5) && (a <= 205);
        boolean c2 = (b >= 5) && (b <= 205);
        boolean c3 = (c >= 5) && (c <= 205);

        if (!c1 || !c2 || !c3){
            System.out.printf("%20s %20s %20s", "Invalid Length", "_______________", "_______________");
        }
        else if (a < (b + c) && b < (a + c) && c < (a + b)){
            if(a == b && b == c){
                System.out.printf("%20s %20s %20s", "Equilateral", "_______________", "_______________");
            }
            else if (a != b && a != c && b != c){
                System.out.printf("%20s %20s %20s", "Scalene", "_______________", "_______________");
            }
            else {
                System.out.printf("%20s %20s %20s", "Isosceles", "_______________", "_______________");
            }
        }
        else {
            System.out.printf("%20s %20s %20s", "NotATriangle", "_______________", "_______________");
        }

        System.out.println();
    }

}
