package myfirstpackage;

public class MySecondClass {
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