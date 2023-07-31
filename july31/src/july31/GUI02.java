package july31;

import javax.swing.JButton;
import javax.swing.JFrame;

//Swing 앞에 J가 붙어요


public class GUI02 {
	JFrame frame = new JFrame("프레임입니다");
	JButton btn = new JButton("Press the button");
	
	public GUI02() {
		frame.add(btn);
		frame.setSize(300,600);
		frame.setVisible(true);
		//x누르면 닫기
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new GUI02();
		
		
	}
}
