package myfirstpackage;

public class MySecondClass {
	private int arg1;
	private int arg2;
	public void SetArg1(int n) {
		arg1 = n;
	}
	public void SetArg2(int n) {
		arg2 = n;
	}
	public int GetArg1() {
		return arg1;
	}
	public int GetArg2() {
		return arg2;
	}
	public MySecondClass(int n1, int n2) {
		arg1 = n1;
		arg2 = n2;
	}
	public int bitand() {
		return (arg1 & arg2);
	}
}