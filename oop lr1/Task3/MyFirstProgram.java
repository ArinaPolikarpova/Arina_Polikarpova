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

class MySecondClass {
	private int fNum;
	private int sNum;
	
	public void SetFNum(int num){
		fNum=num;
	}

	public void SetSNum(int num){
		sNum=num;
	}

	public int GetFNum(){
		return fNum;
	}

	public int GetSNum(){
		return sNum;
	}

	
	public MySecondClass(int num1, int num2){
		 fNum=num1;
		 sNum=num2;
	}
	
	public int surplus() {
		return (fNum % sNum);
	}
}