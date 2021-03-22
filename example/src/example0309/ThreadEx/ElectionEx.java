package example0309.ThreadEx;

class Election extends Thread{
	
	public Election(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		
		int limit = 0;//100%를 초과하지 못하도록 하는 제한 변수
		String stars = "";//별모양 저장변수
		
		while(limit < 100) {
			int ranNum=(int)(Math.random()*5+1);
			//1~5까지 랜덤 수 
			//while문 안에다 둔 이유는 루프를 돌 때마다
			//다시 랜덤으로 수를 생성해야 하기 때문
			//while문 밖에다가 두면 숫자가 하나로 고정됨
			
			String stars100 = "";
			for(int i=0; i<100; i++) {
				stars100 = stars100+"*";
			}//100을 초과할 때 쓸 별모양
			
			for(int i=0; i<ranNum; i++) {
				stars = stars+"*";
			}//100 이하 상황에서 더해줄 별 모양 만들기
			
			limit = limit+ranNum; //0에 계속 ranNum을 더해줌
			
			if(limit>100) {//만약 limit이 100을 초과하면 수행
				System.out.printf("%s : %d%%(%d) %s \n", getName(), 100,ranNum,stars100);
			}else { //limit이 100 이하일 경우 수행
				System.out.printf("%s : %d%%(%d) %s \n",getName(),limit,ranNum,stars);
			}
			
			try {
				Thread.sleep((long)(Math.random()*500));
			}catch(InterruptedException e) {
				return;
			}
			
		}
	}
}

public class ElectionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Election e1 = new Election("제1지역구");
		Election e2 = new Election("제2지역구");
		Election e3 = new Election("제3지역구");

		e1.start();
		e2.start();
		e3.start();
		
	}

}