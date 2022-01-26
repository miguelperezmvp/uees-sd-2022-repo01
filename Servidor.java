import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Servidor {
	
	  public static final void main(final String[] args) {
		    ServerSocket server;           
		    InputStream  is;
		    Socket       client;          
		    ArrayList<String> list = new ArrayList<String>();
		    try {
		      server = new ServerSocket(9999);//(*@\serverBox{1 + 2)}@*)
		      System.out.println("SERVIDOR INICIADO");
		      
		      
		      
		     for (int j = 5; (--j) >= 0;) {  //process only 5 clients, so I can show (*@\serverBox{5)}@*) below
		    	 
				 client = server.accept(); //wait for incoming connection (*@\serverBox{3)}@*)
				 System.out.println("Nueva CONEXION DE IP ---> " + client.getRemoteSocketAddress());
				        
				 is  = client.getInputStream(); //get stream to read from
				 
				 
				 int clientnumber = is.read();
				 
				 System.out.println(clientnumber);//(*@\serverBox{4} + \clientBox{3})@*)
				 
				 
				 
				 for(int i = 0  ; i < clientnumber ; i++) {
			        	list.add("X");
			        }
				 
				 System.out.println(list);
				 
				 
				 client.close(); //close connection to client
		      }
		      server.close();   //(*@\serverBox{5)}@*)
		    } catch (Throwable t) {
		      t.printStackTrace();
		    }
		  }
		}
