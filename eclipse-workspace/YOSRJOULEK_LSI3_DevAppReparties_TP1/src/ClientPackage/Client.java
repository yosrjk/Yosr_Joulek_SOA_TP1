package ClientPackage;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.InetAddress;
import java.net.*;
public class Client {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		System.out.println("je suis  un client pas encore connecte");
		InetAddress host =InetAddress.getByName("localhost");
		try {
			Socket socket = new Socket(host,1234);
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("je suis  un client connecte");
	
	
        
	}
	}


