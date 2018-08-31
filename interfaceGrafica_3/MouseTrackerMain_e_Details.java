import javax.swing.JFrame;


public class MouseTrackerMain_e_Details {
public static void main(String[] args) {
	MouseTrackerFrame frame = new MouseTrackerFrame();
	MouseDetailsFrame frame2 = new MouseDetailsFrame();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(300,100);
	frame.setVisible(true);
	frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame2.setSize(500,100);
	frame2.setVisible(true);
}
}
