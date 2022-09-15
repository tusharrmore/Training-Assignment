package OopsAssignment_5;

public abstract class B extends A {
	
	@Override
	void sub(int a,int b) {
		int c=a-b;
		System.out.println("Substraction Of 2 digit :"+c);
	}
	
	abstract void mul(int a, int b);
	abstract void div(int a,int b);

}
