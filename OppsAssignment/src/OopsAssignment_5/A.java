package OopsAssignment_5;

public abstract class A extends CalcAbs {
	
	@Override
	void sum(int a, int b) {
		int c=a+b;
		System.out.println("Sum Of 2 digit : "+c);
	}
	
	abstract void sub(int a, int b);
	abstract void mul(int a, int b);
	abstract void div(int a,int b);

}
