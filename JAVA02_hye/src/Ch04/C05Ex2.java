package Ch04;

//다음 2개의 static 가진 ArrayUtils 클래스를 만들어보자. 다음 코드의 실행 결과를 참고하여 concat()와 print()를 작성하여 ArrayUtil 클래스를 완성하라.
class ArraySample{
	public static int[] concat(int a[],int b[]) {
		int len = a.length + b.length;
		int [] newarr = new int[len];
//		for(int i =0 ;i<a.length ;i++) {
//			//if 말고 다른 방식은 없을 려냐ㅏ?
//			newarr[i] = a[i];
//		}
//		for(int i = a.length ; i< len ; i++) {
//			newarr[i] = b[i];
//		}
		for(int i =0 ; i< newarr.length ; i++) {
			  if(i < a.length) {
				  newarr[i] =a[i];
			  }
			  else {
				  newarr[i] = b[i-a.length];
			  	}
			  }
		return newarr;
	}
	
	public static void printreverse(int a []) {
		int [] save = new int[a.length];
		for(int i =0 ; i< a.length ;i++) {
			save[i] = a[i];
		}
		for(int i =0 ; i<a.length ; i++) {
						
			if ( i <= (a.length/2)) {
				a[i] = save[a.length -  i];
				System.out.println(a[i]);
			}
			else {
				a[i] = save[a.length/2 + i];
				System.out.println(a[i]);
			}
		}
	}
}
public class C05Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr1 = {2, 4, 6};
        int[] arr2 = {1, 3, 5};
		int[] arr3 = ArraySample.concat(arr1, arr2);
		ArraySample.printreverse(arr3);
	}
}
