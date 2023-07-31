package july31;

import java.awt.event.InputEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;

public class Menu {
	JFrame jf = new JFrame("메뉴만들기");
	JTextArea textArea = new JTextArea("입력하세요",5,10);
	
	JScrollPane jScrollPane = new JScrollPane(textArea); // 스크롤바 만들기
	//메뉴바
	JMenuBar menuBar = new JMenuBar();
	JMenu fileMenu = new JMenu("파일");
	JMenu helpMenu = new JMenu("도움말");
	
	
	public Menu() {
		//메뉴설정 
		fileMenu.add(new JMenuItem("새파일열기"));
		fileMenu.add( new JMenuItem("저장하기"));
		fileMenu.add( new JMenuItem("기존파일에 추가"));
		fileMenu.add( new JMenuItem("종료"));
		
		//단축키
		fileMenu.getItem(0).setAccelerator(KeyStroke.getKeyStroke('N', InputEvent.CTRL_MASK ^ InputEvent.ALT_MASK));
	
		
		helpMenu.add(new JMenuItem("이 프로그램은"));
		helpMenu.add(new JMenuItem("만든사람"));
		
		//조립과정
		menuBar.add(fileMenu);
		menuBar.add(helpMenu); // 메뉴바에 붙임
		jf.setJMenuBar(menuBar); //메뉴바를 프레임에 붙였어요
		jf.add(jScrollPane, "Center"); //중앙에 붙임
		jf.setSize(300,600); // 가로세로 크기
		jf.setVisible(true); // 보여주기
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
	}
	
	public static void main(String[] args) {
		new Menu();
		
	}
}
