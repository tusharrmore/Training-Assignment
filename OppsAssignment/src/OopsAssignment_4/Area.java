package OopsAssignment_4;

public class Area {
	
		double Length;
	    double Weidth;
	    double Height;
	    
	   public Area(double Length, double Weidth, double Height) {
	        super();

	   }

	   public Area() {
	        super();
	        // TODO Auto-generated constructor stub
	    }

	   void areaOfTraingle(double Length, double Weidth, double Height) {
	        double Traingle = Length * Weidth * Height;

	       System.out.println("print area of tringle-" + Traingle);
	    }

	   void areaOfRectangle(double Length, double Height, double Weidth) {

	       double Rectangle = Length * Weidth;
	       System.out.println("print area of Rectangle-" + Rectangle);
	    }

	   void areaOfSquare(double Length, double Height, double Weidth) {
		   
	       double Square = Length * Length;
	        System.out.println("print area of Square-" + Square);    
	   }
	   
}
