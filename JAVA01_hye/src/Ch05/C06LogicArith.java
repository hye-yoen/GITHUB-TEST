package Ch05;

public class C06LogicArith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=0;
		boolean c;
		
		a = 1;
		b = 1;
		c =(++a>0)||(++b>0) ; //2 |  => t //a==2 a가 참이여서 b작동 x
		System.out.printf("a = %d , b = %d c = %s\n", a, b, c);

		a = 1;
		b = 1;
		c = (++a>0)||(--b>0) ; //2 | 0 = >t  //위의 것거ㅣ 마찬가지로 a가 참이므로 b 작동 x
		System.out.printf("a = %d , b = %d c = %s\n", a, b, c);

		a = 1;
		b = 1;
		c = (--a>0)||(++b>0) ; //0 |2 => t 
		System.out.printf("a = %d , b = %d c = %s\n", a, b, c);

		a = 1;
		b = 1;
		c = (--a>0)||(b-->0) ; // 0 | 1 =>t1 이후 b는 -1 됨 
		System.out.printf("a = %d , b = %d c = %s\n", a, b, c);
		
		//=============
//		a = 2 , b = 1 c = true
//		a = 2 , b = 1 c = true
//		a = 0 , b = 2 c = true
//		a = 0 , b = 0 c = true
		//=============
	}

}
