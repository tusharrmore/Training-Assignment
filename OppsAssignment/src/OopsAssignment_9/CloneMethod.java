package OopsAssignment_9;

public class CloneMethod {
	
	   public static void main(String[] args) throws CloneNotSupportedException {
	        
	        Product p1=new Product(501, "Sugar", 500, "Killo Gram");
	        
	        Product p2=(Product) p1.clone();
	        p2.setPname("Samsung");
	        p2.setPrice(50000);
	        
	        System.out.println(p2);
	        if(p2 instanceof Product) {
	            
	            System.out.println("Both Object are same");
	        }
	        
	    }

}
