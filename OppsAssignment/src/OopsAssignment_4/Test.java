package OopsAssignment_4;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
        Area area = new Area();

       Scanner s = new Scanner(System.in);
        System.out.println("enter the three side");

       double Length = s.nextDouble();
        double Weidth = s.nextDouble();
        double Height = s.nextDouble();

       if (Length == Weidth || Length == Height || Weidth == Height) {

           area.areaOfSquare(Length, Weidth, Height);

       } else {

           area.areaOfRectangle(Length, Weidth, Height);

           area.areaOfTraingle(Length, Weidth, Height);

           if (Height == Length + Weidth || Length == Height + Weidth || Weidth == Length + Height) {
                System.out.println("Right-Angle Triangle");
            } else {
                System.out.println("NotRight-Angle Triangle");
            }

       }
    }
	
}
