package ExceptionAssignment_10;

public class Parent {
	
	void maximum(int a[]) throws NullPointerException,ArrayIndexOutOfBoundsException {
        int temp=0,i;
        for(i=0;i<a.length-1;i++) {
            if(a[i]>a[i+1]) {
                temp=a[i];
                a[i]=a[i+1];
                a[i+1]=temp;
            }
    }
        System.out.println("max value "+a[i]);
    }

}
