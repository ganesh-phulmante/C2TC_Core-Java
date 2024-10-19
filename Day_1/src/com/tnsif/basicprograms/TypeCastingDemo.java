package com.tnsif.basicprograms;

public class TypeCastingDemo {

	public static void main(String[] args) {
		
		// Widening Type Casting, Implicit, No memory loss
		
		int a = 15;
		System.out.println(a);
		long l = a;
		System.out.println(l);
		
		float f = 45.67789f;
		System.out.println(f);
		double d = f;
		System.out.println(d);
		
		// Shortening Type Casting, Explicit, Memory loss in this
		
				int b = 35;
				System.out.println(a);
				short s = (short)b;
				System.out.println(l);
				
				double  dub= 45.6778978887766668898f;
				System.out.println(dub);
				float fl = (float)dub;
				System.out.println(fl);
		

	}

}
