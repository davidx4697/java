package boardclient;
import javax.swing.JFrame;
public class ClientWin {
	public static void main(String[]args) {
		Client local ;
		local=new Client ("127.0.0.1");
		local.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		local.startRunning();
	}
}
