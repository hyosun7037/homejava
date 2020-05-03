package ch13;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class RandomCircleFrame extends JFrame {
	public RandomCircleFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new Circle());
		setSize(500, 500);
		setVisible(true);
	}

	class Circle extends JPanel implements Runnable {

		private int x = 100;
		private int y = 100;

		public Circle() {
			this.addMouseListener(new MouseAdapter() {
				private Thread th = null;

				@Override
				public void mousePressed(MouseEvent arg0) {
					if (th == null) {
						th = new Thread(Circle.this);
						th.start();
					}
				}
			});
		}

		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.magenta);
			g.drawOval(x, y, 10, 10);
		}

		@Override
		public void run() {
			while (true) {
				try {
					Thread.sleep(400);
				} catch (InterruptedException e) {
					e.printStackTrace();
					return;
				}

				x = (int) (Math.random() * this.getWidth());
				y = (int) (Math.random() * this.getHeight());
				repaint();
			}
		}
	}

	public static void main(String[] args) {
		new RandomCircleFrame();
	}
}
