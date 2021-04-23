package coding;

interface calculable{
	double PI = 3.14;
int sum(int v1, int v2);
}

interface Printable{
	
	void print();
}

class Realcal implements calculable,Printable{


	public int sum(int v1, int v2) {
		return v1+v2;
	}

	public void print() {
		System.out.println("This is RealCal!!");
	}
	
}

class Dummycal implements calculable{
	
	public int sum(int v1, int v2) {
	return 3;
	
	}
}


public class InterfaceApp {

	public static void main(String[] args) {

		//더하기 기능이 있는 클래스를 만들어주세요.
		Realcal c = new Realcal();
		System.out.println(c.sum(2, 1));
		c.print();
		System.out.println(c.PI);
	}

}
