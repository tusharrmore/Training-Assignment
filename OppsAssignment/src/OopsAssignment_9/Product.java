package OopsAssignment_9;

public class Product implements Cloneable{

	private int pid;
	
	private String pname;
	
	private double price;
	
	private String unitofMeasurement;
	
	
	public Object clone()throws CloneNotSupportedException{  
	    return super.clone();  
	}

	public Product() {
		super();
		
	}

	

	public int getPid() {
		return pid;
	}



	public void setPid(int pid) {
		this.pid = pid;
	}



	public String getPname() {
		return pname;
	}



	public void setPname(String pname) {
		this.pname = pname;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	public String getUnitofMeasurement() {
		return unitofMeasurement;
	}



	public void setUnitofMeasurement(String unitofMeasurement) {
		this.unitofMeasurement = unitofMeasurement;
	}



	public Product(int pid, String pname, double price, String unitofMeasurement) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
		this.unitofMeasurement = unitofMeasurement;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + ", unitofMeasurement="
				+ unitofMeasurement + "]";
	}
	
}
