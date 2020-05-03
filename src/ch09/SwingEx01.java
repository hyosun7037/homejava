package ch09;

import javax.swing.JButton;
import javax.swing.JFrame;

class Mybutton extends JButton{
	
}

public class SwingEx01 extends JFrame{

	public SwingEx01() {
		setTitle("첫번째 프레임");
		setSize(500,300);
		add(new JButton("클릭"));
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new SwingEx01();
	}

}
