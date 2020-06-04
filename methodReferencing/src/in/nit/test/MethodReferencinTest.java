package in.nit.test;

import java.util.List;

public class MethodReferencinTest {

	public static void main1(String[] args) {

		List<String> list = List.of(new String("AS"), new String("DS"));

		/*
		 * list.forEach((s)->{ System.out.println(s); });
		 */
		/*
		 * list.forEach((s)->MethodReferencinTest.print(s));
		 */

		list.forEach(MethodReferencinTest::print);

	}

	public static void print(String s) {
		System.out.println(s);
	}

	public void printInstance(String s) {
		System.out.println(s);
	}

	public static void main(String[] args) {

		List<String> list = List.of(new String("AS"), new String("DS"));
		MethodReferencinTest mt = new MethodReferencinTest();
		/* list.forEach((s)->mt.printInstance(s)); */

		list.forEach(mt::printInstance);

	}

}
