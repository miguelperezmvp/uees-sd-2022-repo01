import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Random;


public class Cliente {

	  public static final void main(final String[] args) {
		  
	    Socket        client;
	    OutputStream  os;
	    InetAddress   ia;

	    
	    try {
	    	
	      int r1 = (int)(Math.random()*10);
 
	      System.out.println("Este es el numero random" + r1);	    	

	      
		  
		  
	      ia = InetAddress.getByName("192.168.100.191");//get local host address
	      
	      client = new Socket(ia, 9999); //create socket (*@\clientBox{1+2)}@*)
	      
	      os = client.getOutputStream(); //get stream to write to
	      
	      os.write(r1);  //write one byte of value 1 (*@\clientBox{3)}@*)

	      client.close(); //close (*@\clientBox{4)}@*)
	    } catch (Throwable t) {
	      t.printStackTrace();
	    }
	  }
	}
