package autos.rennen;

import autos.*;

public class SichtbarkeitenTest {

	public static void main(String[] args) {

		Auto a1 = new Auto();
		
		System.out.println(a1.a);	// public
//		System.out.println(a1.b);	// cf : protected
//		System.out.println(a1.c);	// cf :'pakage private' oder 'default'
//		System.out.println(a1.d);	// cf : private

	}

}