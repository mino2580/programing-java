package prednasky;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.UnknownHostException;
import java.net.*;
class Vlakno extends Thread {
	
	Socket s;
	
	public Vlakno(Socket s) {
		this.s=s;
	}
	
	public void run() {
		int znak;
		InputStream is;
		try {
			is = s.getInputStream();
			while((znak=is.read())!=-1) {
				System.out.print((char)znak);
			}
			s.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
}

public class Telnet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Socket s=new Socket("old.unart.cz",80);
			
			Vlakno v1=new Vlakno(s);
			v1.start();
			
			InputStream is=s.getInputStream();
			OutputStream os=s.getOutputStream();
			
			
			int znak;
			while((znak=System.in.read())!=-1) {
				if(s.isClosed()) break;
				os.write(znak);
				os.flush();
			}
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		

		

	}
}

