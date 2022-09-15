package OopsAssignment_10;

import java.util.Date;

public class Test {

	public static void main(String[] args) {
		
		Employee emp=new Employee();
		emp.setEmpid(501);
		emp.setEmpname("tushar");
		emp.setEmpsalary(10000);
		emp.setEmpaddress("pune");
		emp.setEmp_dob(new Date(06-12-1995));
		emp.setEmp_doj(new Date(23-06-2022));
		System.out.println(emp);
	
	}
	
}
