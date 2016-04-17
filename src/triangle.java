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

    public void run(){

        //System.out.print("Testing: " + a + " " + b + " " + c + " - ");
        System.out.printf("\n %s %5d %5d %5d %5s", "Testing: ", a, b, c, "");

        boolean c1 = (a >= 5) && (a <= 205);
        boolean c2 = (b >= 5) && (b <= 205);
        boolean c3 = (c >= 5) && (c <= 205);

        if (!c1 || !c2 || !c3){
            System.out.println("Invalid Length");
        }
        else if (a < (b + c) && b < (a + c) && c < (a + b)){
            if(a == b && b == c){
                System.out.println("Equilateral");
            }
            else if (a != b && a != c && b != c){
                System.out.println("Scalene");
            }
            else {
                System.out.println("Isosceles");
            }
        }
        else {
            System.out.println("NotATriangle");
        }


    }

}
