package com.homeparactice;

public class Amstrong {

	public static void main(String[] args) {

		int a = 153;
		int t=a;
		int t1=a;
		int count = 0;
		int sum = 0;
		
		while (t != 0) {
			
			count++;
			t=t/10;
		}
		System.out.println(count);
		
		while (t1 != 0) {
			
			int l = t1 %10;
			int p = 1;
			for (int i = 0; i < count; i++) {
				p=p*l;
				System.out.println(" "+p);
			}
			
			sum +=p;
			System.out.println(sum);
			t1 = t1/10;
		}
		String res = sum==a?"Amstrong number":"Not a Amstrong number";
		System.out.println(res);

	}

}
