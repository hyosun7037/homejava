package game;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

//슈퍼마리오
//구현해야할 기능 : 포물선 점프, 버섯 먹었을 때 변화값 주기
public class Mario extends JFrame {

	MousePanel panel; // 갖다쓸거는 다 전역으로 빼놓기!
	int imgX = 50;
	int imgY = 800;

	ImageIcon mario = new ImageIcon("image/ch1.png");
	Image ma = mario.getImage(); // 이미지 가져오기

	ImageIcon bg = new ImageIcon("image/game_bg.jpg");
	Image b = bg.getImage();

	//// 생성자////
	public Mario() {
		panel = new MousePanel();
		setContentPane(panel); // MousePanel 붙이기
		setSize(1673, 1046); // 크기 조정
		setVisible(true); // 보이게 하기
	}

	//// 그림그리기////
	class MousePanel extends JPanel {

		public MousePanel() { // 옆으로
			setFocusable(true);
			this.addKeyListener(new KeyAdapter() {

				@Override
				public void keyPressed(KeyEvent e) {
					if (imgX != 0) {
						switch (e.getKeyCode()) {
						case KeyEvent.VK_LEFT:
							imgX = imgX - 10;
							break;
						case KeyEvent.VK_RIGHT:
							imgX = imgX + 10;
							break;
						case KeyEvent.VK_UP:
							imgY = imgY - 10;
							break;
						case KeyEvent.VK_DOWN:
							imgY = imgY + 10;
							break;
						case KeyEvent.VK_SPACE:

							new Thread(new Runnable() {

								@Override
								public void run() {
									int time = 10;
									while (time > 0) {
										imgY = imgY - 20;
										time--;

										if (time < 0) {
											imgY = imgY + 20;
											time++;
										}
										try {
											Thread.sleep(100);
										} catch (Exception e) {
											e.printStackTrace();
										}
										repaint();
									}
								}
							}).start();// 스레드 끝
							break;
						}
					}

					repaint();
				}

				@Override
				public void keyReleased(KeyEvent e) {
					if (e.getKeyCode() == KeyEvent.VK_SPACE) {
						imgY = imgY + 20;
					}
					super.keyReleased(e);
					repaint();
				}
			});
		}

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);

			g.drawImage(b, 0, 0, null);
			g.drawImage(ma, imgX, imgY, this);

		}

	}

	public static void main(String[] args) {
		new Mario();
	}

}
