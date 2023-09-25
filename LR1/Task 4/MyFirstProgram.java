import myfirstpackage.*;

class MyFirstClass {
	public static void main(String[] s) {
		MySecondClass o = new MySecondClass(1, 2);
		System.out.println(o.bitand());
		for (int i = 1; i <= 8; i++) {
			for (int j = 1; j <= 8; j++) {
			o.SetArg1(i);
			o.SetArg2(j);
			System.out.print(o.bitand());
			System.out.print(" ");
			}
		System.out.println();
		}
	}
}