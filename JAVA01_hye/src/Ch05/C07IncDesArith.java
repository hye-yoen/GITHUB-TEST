package Ch05;

public class C07IncDesArith {
	public static void main(String[] args) {
		int a=5, b=6, c=10, d;
		boolean e;
		d=++a*b--; //a = 6 b= 5 d = 6*6 =36
		 System.out.printf("a = %d, b = %d, d = %d\n", a, b, d);
		d=a++ + ++c - b--; // a = 7 c = 11 b = 4 d= 6 + 11  - 5 =12
		System.out.printf("a = %d, b = %d, c = %d, d = %d\n", a, b, c, d);
		a=1;
		b=0;
		e=(a++>0)||((b*d/c)>0);// a=2 b=0 c=11 d= 12 e =t 
		System.out.printf("a = %d, b = %d, c = %d, d = %d ,e = %b\n", a, b, c, d , e);
	}

}
