package java_20200528;

import java.io.IOException;
import java.net.ServerSocket;

public class ServerSocketDemo {

	public ServerSocketDemo() {
		// TODO Auto-generated constructor stub
		ServerSocket serverSocket = null;
		for(int i=1;i<6500;i++) {
			try {
				serverSocket = new ServerSocket(1);
				//System.out.println(1+"포트를 사용할 수 있습니다.");
			} catch (IOException e) {
				System.err.println(1+"포트를 사용할 수 없습니다.");
			}
	
		}
	}

}
