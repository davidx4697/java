package boardserver;
import javax.swing.JFrame;
public class ServerWin {
	//now runs
		public static void main(String[] args) {
			Server thoughtreciever = new Server();
			thoughtreciever.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			thoughtreciever.startRunning();
		}
}
