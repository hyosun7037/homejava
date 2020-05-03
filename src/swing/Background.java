package swing;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

//배경 넣기
import javax.swing.JPanel;

class ImagePanel extends JPanel{
	private Image img;
	
	public ImagePanel(Image img) {
		this.img = img;
		setSize(new Dimension(img.getWidth(null),img.getHeight(null)));//이미지 최대값
		setLayout(null); //원하는 곳에 위치시킬 수 있음
		setPreferredSize(new Dimension(img.getWidth(null),img.getHeight(null)));
		
	}
	
	//이미지를 보여주는 기능
	public void paintComponent(Graphics g) {
		g.drawImage(img, 0, 0, null);
	}
}

public class Background {
	public static void main(String[] args) {
		JFrame frame = new JFrame("이미지");
		
		//프레임 사이즈
		frame.setSize(640,480);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		//이미지 삽입
		ImagePanel panel = new ImagePanel(new ImageIcon("./image/3.jpg").getImage());
		frame.add(panel);
		frame.pack();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
