# Entry 9 Final

### Moving on from the MVP
My mvp was nothing like I wanted it to be. My vision was to make a program that allowed users to communicate with eachother. My mvp only grabbed the user's input and returned it back to the gui. I decided to go back to the java reference and learned all about sockets, servers, and port connections. Learning servers and port connections was not as hard as I thought it would be. Since java is a object oriented language, I could make custom functions that made connections within a localhost and a port. 
    
##### An example of how a java application can connect to the local host using ports:
    
``` java
    private void connectToServer() throws IOException{
			showMessage("Attempting Connection..\n");
			connection = new Socket(InetAddress.getByName(serverIP),6789);
			
		}
```

The code snippet above lets me to connect to a computer using a port "6789".

``` java 
public static void main(String[]args) {
		Client local;
		local=new Client ("127.0.0.1");
		local.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		local.startRunning();
	} 
``` 