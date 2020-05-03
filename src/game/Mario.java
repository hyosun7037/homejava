package game;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

//���۸�����
//�����ؾ��� ��� : ������ ����, ���� �Ծ��� �� ��ȭ�� �ֱ�
public class Mario extends JFrame {

	MousePanel panel; // ���پ��Ŵ� �� �������� ������!
	int imgX = 50;
	int imgY = 800;

	ImageIcon mario = new ImageIcon("image/ch1.png");
	Image ma = mario.getImage(); // �̹��� ��������

	ImageIcon bg = new ImageIcon("image/game_bg.jpg");
	Image b = bg.getImage();

	//// ������////
	public Mario() {
		panel = new MousePanel();
		setContentPane(panel); // MousePanel ���̱�
		setSize(1673, 1046); // ũ�� ����
		setVisible(true); // ���̰� �ϱ�
	}

	//// �׸��׸���////
	class MousePanel extends JPanel {

		public MousePanel() { // ������
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
							}).start();// ������ ��
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
