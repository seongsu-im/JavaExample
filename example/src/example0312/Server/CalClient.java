package example0312.Server;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class CalClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub


		//로컬 컴퓨터 Socket 통신을 위해 9800 서버로 접속한 객체 생성 
		Socket socketOfClient = new Socket("127.0.0.1", 9800);
		BufferedReader keyboard =
				new BufferedReader(new InputStreamReader(System.in));
		OutputStream out = socketOfClient.getOutputStream();
		InputStream in = socketOfClient.getInputStream();
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(out));
		BufferedReader br = new BufferedReader(new InputStreamReader(in));
		String line = null;
				
		while((line=keyboard.readLine())!=null) {
			if(line.equals("quit")) {
				break;
			}
			pw.println(line); 
			pw.flush();
			String echo = br.readLine();
			
			System.out.println("서버로부터 받은 문자열 : "+echo);				
		}
		pw.close();
		br.close();
		socketOfClient.close();
	
	}

}