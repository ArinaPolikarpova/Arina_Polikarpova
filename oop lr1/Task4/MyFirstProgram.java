import myfirstpackage.*;

class MyFirstClass {
	public static void main(String[] s) {
		MySecondClass o = new MySecondClass(1, 2);
        	System.out.println(o.surplus());
        	for (int i = 1; i <= 8; i++) {
            		for (int j = 1; j <= 8; j++) {
               		o.SetFNum(i);
                	o.SetSNum(j);
               		System.out.print(o.surplus());
               		System.out.print(" ");
            		}
            	System.out.println();
        	}

	}

}

