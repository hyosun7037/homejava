package javaGame;

////// ũ�� ���缭 �ѰŶ� ���߿� �̹����� �����ϸ� ��!
import java.awt.AlphaComposite;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

import ex.RunnableTest;
import test.Jelly;

//���� �ܰ�
//1. ���� �ڷ� �̵� ��ų �� �ִ�. O
//
//1-1. ���� ���� ���ѹݺ� �� �� �ִ�. O
//
//2. �ʰ� �Բ� ������ �ڷ� �̵� ��ų �� �ִ�. O
//
//3. ĳ���Ͱ� �����ϰų� ���� �� �ִ�. O
//
//4. ĳ���Ϳ� ������ ������ ������ ������� �� �� �ִ�. O
//
//5. ü�°������� �����, �������� 0�� �Ǹ� ���� ������ �ǰ� �� �� �ִ�. 
//
//6. ���� ������, �������� ���� ������, ����������� ���� �� �ִ�.
//
//7. �Ŵ�ȭ�� �� �� �ִ�.
//
//8. ����ȭ�� �� �� �ִ�.
//
//â ������ 800 *480 / ���ǻ����� 80 / ��ĭ¥�� ��ֹ� 80*80 / �ε����� ���� 120*80 / ���� 20*20 ~ 30*30 / ���� �Ʒ� ���� / ĳ���ʹ� ����° ���ǿ� ��ġ

// firstMap ���� 1200���� �ø��� / �� �����ϰ� ��������

//������, �г�, ���� �� ����

//�� ��ü�� ����
//
//�⺻���� 255, 255, 0  //  16776960
//������� 200, 200, 0  //  13158400
//��ȫ���� 150, 150, 0  //  9868800
//
//�ǹ���  255, 100, 0  //  16737280
//
//1����ֹ� 255, 0, 0   //  16711680
//2����ֹ� 255, 0, 150  //  16711830
//3����ֹ� 255, 0, 255  //  16711935 

public class CookieRunTest extends JFrame {

	MyPanel panel;

	private int runPage = 0; // �� ȭ�� �̵��� ü�� ��� ���� ����
	
	private int runStage = 1; // �������� Ȯ�� ����
	
	int nowField = 2000; // ĳ���� ���̿� ���� ���� ��ġ ���� ����

	private boolean fall = false; // ���� ���������� Ȯ��
	
	private boolean jump = false; // ���� ���������� Ȯ��
 
	private int resultScore = 0; // ���� ���ھ�

	private int gameSpeed = 3; // ���� �ӵ�

	private boolean escKeyOn = false; // �Ͻ����� Ȯ��
	
	private boolean downKeyOn = false; // �ٿ�Ű �⺻ ����
	
	private boolean invincible = false; // �������� ����

	int doubleJump = 0; // ���� ī��Ʈ (2�� �Ǹ� �������� ����)

	int cookieAlpha = 255; // ����
	
	int face; // ��Ű ����
	
	int foot; // ��Ű ��
	

	
	/* ���ӿ� ������ �̹������� �׷��ش�. */
	
	// ���� �̹���
	private ImageIcon fieldIc1 = new ImageIcon("img/footTest.png"); // 1�ܹ���
	private ImageIcon fieldIc2 = new ImageIcon("img/footTest2.png"); // 2�ܹ���

	// ��� �̹���
	private ImageIcon bg1 = new ImageIcon("img/bg1.png");
	private ImageIcon bg2 = new ImageIcon("img/bg2.png");

	// ��Ű ĳ���� �̹���
	private ImageIcon cookie = new ImageIcon("img/cookieTest.png"); // �⺻
	private ImageIcon cookieDown = new ImageIcon("img/slideTest.png"); // �����̵�
	private ImageIcon cookieJump = new ImageIcon("img/jumpTest.png"); // ����
	private ImageIcon cookieDJump = new ImageIcon("img/doubleJumpTest.png"); // ��������
	private ImageIcon cookieFall = new ImageIcon("img/fallTest.png"); // ����
	private ImageIcon cookieHit = new ImageIcon("img/hitTest.png"); // ���ݹ޾��� ��

	int cookieHeight = cookie.getImage().getHeight(null); // ĳ���� ����

	// ���� �̹���, ����Ʈ �̹���
	private ImageIcon jelly = new ImageIcon("img/jellyTest.png"); // ����
	private ImageIcon effect = new ImageIcon("img/tw2.png");

	// ��ֹ� �̹���
	private ImageIcon tacle = new ImageIcon("img/tacleTest1.png"); // ��ֹ� (���� �߰�����)

	
	
	/* ����, ����, ��ֹ� ����Ʈ ��ġ  */

	// ���� ���� ����Ʈ
	private List<Jelly> jellyList = new ArrayList<>();

	// ���� ��ü�� ���� ����Ʈ
	private List<Field> fieldList = new ArrayList<>();

	// ��ֹ� ����Ʈ
	private List<Tacle> tacleList = new ArrayList<>();

	
	
	/* ������, �г�, ��ư ���� ���������� ��ġ : Ŭ���� �� �ٸ� ��ü �� �޼������ �̿��ϱ� ���� */

	int[][] colorArr; // �̹����� x,y��ǥ�� ������ �����ϴ� 2�����迭 colorArr[0][0]�� ȣ���ϸ� 16777215
	int[] sizeArr; // �̹����� ���̿� ���̸� �������� 1���� �迭

	
	
	/*PaintComponent ���� */
	// ���� ���� ���� (������ �߰�)
	Image buffImage;
	Graphics buffg;
	
	private AlphaComposite alphaComposite; // ���� ������ ���� ����
	
	/*��Ÿ ���۷���*/
	Cookie c1; // ��Ű (������ �������� ����)
	Back b11; // ��� 1-1
	Back b12; // ��� 1-2
	Button escBtn; //esc ��ư
	
	
	//// ������ ////
	public CookieRunTest() {
		panel = new MyPanel();
		setTitle("Cookie Run : Stage1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel); // MyPanel ���̱�
		setSize(800, 480); // â ũ��
		setVisible(true); // ���̰� �ϱ�
		
		
		
		/*esc ��ư ����*/
		
		escBtn = new Button("�����");
		escBtn.setBounds(350, 240, 50, 30);
		escBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel.remove(escBtn);
				escKeyOn = false;
			}
		});
	}

	class MyPanel extends JPanel {
		public MyPanel() {
			
			setFocusable(true); // Ű �Է� �켱��

			// ��Ű �ν��Ͻ� ���� / �⺻�ڷ�� Ŭ���� �ȿ� ����, �̹��� �߰�
			c1 = new Cookie(cookie.getImage());

			// ��Ű ���� = ��Ű X�� + ����
			face = c1.getX() + c1.getWidth();

			// ��Ű �� �� ��ġ = ��Ű Y�� + ����
			foot = c1.getY() + c1.getHealth();

			// ��Ű ü�� ȸ��
			
			// ��� 1-1
			b11 = new Back(
					bg1.getImage(), 
					0, 
					0, // y�� �����ʿ�
					bg1.getImage().getWidth(null),
					bg1.getImage().getHeight(null));

			// ��� 1-2
			b12 = new Back(
					bg1.getImage(), 
					bg1.getImage().getWidth(null), 
					0, // y�� �����ʿ�
					bg1.getImage().getWidth(null), 
					bg1.getImage().getHeight(null));

			
			/* Util Class ���� getSize�� getPic�޼��� �̿�, ������� �÷��� ������� */

			try {
				sizeArr = Util.getSize("img/firstMap.png"); // �� ������
				colorArr = Util.getPic("img/firstMap.png"); // �� ����
			} catch (Exception e1) {
				e1.printStackTrace();
			}

			int maxX = sizeArr[0]; // ���� ����
			int maxY = sizeArr[1]; // ���� ����

			

			/* ���� ��ü ����Ʈ ���� */
			
			// 1�� ���� ������ : 0
			for (int i = 0; i < maxX; i += 2) { // ������ 4ĭ�� �����ϴ� ����, 2,2������� �ݺ���
				for (int j = 0; j < maxY; j += 2) { // �� ���� 0�� ��� (������)
					if (colorArr[i][j] == 0) {
						fieldList.add(new Field(fieldIc1.getImage(), i * 40, j * 40, 80, 80)); // ��ǥ�� 40�� ���ϰ�, ���̿� ���̴� 80
																								
					}
				}
			}
			
			// 2�� ���� ȸ�� : 6579300 (���Ŀ� �߰��ϱ�)
			for (int i = 0; i < maxX; i += 2) { // ������ 4ĭ�� �����ϴ� ����, 2,2������� �ݺ���
				for (int j = 0; j < maxY; j += 2) { // �� ���� 0�� ��� (������)
					if (colorArr[i][j] == 6579300) {
						fieldList.add(new Field(fieldIc1.getImage(), i * 40, j * 40, 80, 80)); // ��ǥ�� 40�� ���ϰ�, ���̿� ���̴� 80
																								
					}
				}
			}

			
			
			/* ���� ��ü ����Ʈ ���� */
			
			// �⺻���� 255, 255, 0 : 16776960
			for (int i = 0; i < maxX; i += 1) { // ������ 1ĭ�� ����, 1,1������� �ݺ���
				for (int j = 0; j < maxY; j += 1) {
					if (colorArr[i][j] == 16776960) { 
						jellyList.add(new Jelly(jelly.getImage(), i * 40, j*40, 30, 30, 1000, 1000)); // ��ǥ�� 40���ϰ�, ���̿� ���̴� 30
					}
				}
			}
			
			// ������� 200, 200, 0 : 13158400
			for (int i = 0; i < maxX; i += 1) { // ������ 1ĭ�� ����, 1,1������� �ݺ���
				for (int j = 0; j < maxY; j += 1) {
					if (colorArr[i][j] == 13158400) { 
						jellyList.add(new Jelly(jelly.getImage(), i * 40, j*40, 30, 30, 2000, 1500)); // ��ǥ�� 40���ϰ�, ���̿� ���̴� 30
					}
				}
			}

			// ��ȫ���� 150, 150, 0 : 9868800
			for (int i = 0; i < maxX; i += 1) { // ������ 1ĭ�� ����, 1,1������� �ݺ���
				for (int j = 0; j < maxY; j += 1) {
					if (colorArr[i][j] == 9868800) { 
						jellyList.add(new Jelly(jelly.getImage(), i * 40, j*40, 30, 30, 3000, 2000)); // ��ǥ�� 40���ϰ�, ���̿� ���̴� 30
					}
				}
			}
			
			
			
			/* ���� ��ü ����Ʈ ���� */
			
			//�ǹ���  255, 100, 0  //  16737280
			for (int i = 0; i < maxX; i += 1) { // ������ 1ĭ�� ����, 1,1������� �ݺ���
				for (int j = 0; j < maxY; j += 1) {
					if (colorArr[i][j] == 16737280) { 
						jellyList.add(new Jelly(jelly.getImage(), i * 40, j*40, 30, 30, 10000, 10000)); // ��ǥ�� 40���ϰ�, ���̿� ���̴� 30
					}
				}
			}
			
			
			
			/* ��ֹ� ��ü ����Ʈ ����  */
			
			//1����ֹ� 255, 0, 0   //  16711680
			for (int i = 0; i < maxX; i += 2) {
				for (int j = 0; j < maxY; j += 2) {
					if (colorArr[i][j] == 16711680) { // �� ���� 16711680�� ��� (������)
						tacleList.add(new Tacle(tacle.getImage(), i * 40, j * 40, 80, 80, 0));  // ��ǥ�� 40�� ���ϰ�, ���̿� ���̴� 80
					}
				}
			}
			
			//2����ֹ� 255, 0, 150  //  16711830
			for (int i = 0; i < maxX; i += 2) {
				for (int j = 0; j < maxY; j += 2) {
					if (colorArr[i][j] == 16711830) { // �� ���� 16711680�� ��� (������)
						tacleList.add(new Tacle(tacle.getImage(), i * 40, j * 40, 80, 80, 0));  // ��ǥ�� 40�� ���ϰ�, ���̿� ���̴� 80
					}
				}
			}
			
			//3����ֹ� 255, 0, 255  //  16711935
			for (int i = 0; i < maxX; i += 2) {
				for (int j = 0; j < maxY; j += 2) {
					if (colorArr[i][j] == 16711935) { // �� ���� 16711680�� ��� (������)
						tacleList.add(new Tacle(tacle.getImage(), i * 40, j * 40, 80, 80, 0));  // ��ǥ�� 40�� ���ϰ�, ���̿� ���̴� 80
					}
				}
			}
			

			
			///////////////// ���� ��ǥ �̵� ������ ////////////////////
			new Thread(new Runnable() {

				@Override
				public void run() {
					while (true) {
						for (int i = 0; i < fieldList.size(); i++) {
							fieldList.get(i).setX(fieldList.get(i).getX() - 4);
						} // ����

						for (int i = 0; i < jellyList.size(); i++) {
							jellyList.get(i).setX(jellyList.get(i).getX() - 4);
						} // ����

						for (int i = 0; i < tacleList.size(); i++) {
							tacleList.get(i).setX(tacleList.get(i).getX() - 4);
						} // ��ֹ�

						////////////////// �����Ǹ� ������ �ȶ������� //////////////////
						List<Integer> countList = new ArrayList<>(); // ������ �ȿ� �ӽ������� ����

						int tempField; // ���� ��ġ�� ��� ��ĵ�ϴ� ����
						int tempNowField;// snowField�� ����

						//// ����ȭ ���ǹ�
						if (c1.isInvincible()) {
							tempNowField = 400;
						} else {
							tempNowField = 2000;
						}

						for (int i = 0; i < fieldList.size(); i++) {
							int tempX = fieldList.get(i).getX(); // ������ X��

							if (tempX > c1.getX()-60 && tempX <= face) { // ������ ĳ��������

								tempField = fieldList.get(i).getY(); // ������ y��

								foot = c1.getY() + c1.getHeight(); // ĳ���� �� ��ġ ��ĵ

								// ������ġ�� tempNowField���� �۰�, �߹ٴ��� ��ġ�� tempField���� ���� �ִٸ�
								if (tempField < tempNowField && tempField >= foot) {

									tempNowField = tempField;
								}
							}
						}
						nowField = tempNowField; // ����� nowField�� ������Ʈ

						try {
							Thread.sleep(10);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			}).start();

			////////////////// ���� ������ /////////////////////////
			new Thread(new Runnable() {

				public void run() {
					while (true) {
						// �߹ٴ� ��ġ�� �̹����� Y��ġ + �̹����� ����
						foot = c1.getY() + c1.getHeight(); // ĳ���� �� ��ġ �罺ĵ

						// �߹ٴ��� ������ ���� ������ �۵�
						if (
							foot < nowField 
							&& !c1.isJump() 
							&& !c1.isFall()) { // ������ X, ���߿� �ְ�, �������� ���� �ƴ� �� �۵�

							c1.setFall(true);// �������� ������ ��ȯ
							System.out.println("����");

							if (c1.getCountJump() == 2) { // �������� X, ���� �̹����� ����
								c1.setImage(cookieFall.getImage());
							}

							long t1 = Util.getTime(); // ����ð��� �����´�
							long t2;
							int set = 2; // ó�� ���϶� (0~10)���� �׽�Ʈ

							while (foot < nowField) { // ���� ���� ��� ������ �ݺ�
								t2 = Util.getTime() - t1; // ���� �ð����� t1�� ����
								int fallY = set + (int) ((t2) / 40); // ���Ϸ��� �ø���.

								foot = c1.getY() + c1.getHeight(); // ĳ���� �� ��ġ �� ��ĵ

								if (foot + fallY > nowField) {
									fallY = nowField - foot;
								}

								c1.setY(c1.getY() + fallY); // Y��ǥ�� ���Ϸ� ���ϱ�

								if (c1.isJump()) { // �������ٰ� ���� ������ �ϸ� ��������
									break;
								}

								try {
									Thread.sleep(10);
								} catch (InterruptedException e) {
									e.printStackTrace();
								}
							}
							c1.setFall(false); // while���� ������ �ٽ� false
							
							
							if (
									downKeyOn // �ٿ�Ű ������
									&& !c1.isJump() // �������� X
									&& !c1.isFall() // ���ϻ��� X
									&& c1.getImage() != cookieDown.getImage()) { // ��Ű�̹����� �����̵� �̹����� X

								c1.setImage(cookieDown.getImage());
								; // ���� �̹����� ����

							} else if (
									!downKeyOn // �ٿ�Ű �������� X
									&& !c1.isJump() // �������� X
									&& !c1.isFall() // ���ϻ��� X
									&& c1.getImage() != cookie.getImage()) { // ��Ű�̹����� �⺻ �̹����� X

								c1.setImage(cookie.getImage());
							}

							if (!c1.isJump()) { // ���� ���� ���, �������� X, �������� ī��Ʈ 0
								c1.setCountJump(0);
							}

						}
						
						try {
							Thread.sleep(10);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			}).start();

			
			
			/*repaint ���� ������*/
			
			new Thread(new Runnable() {

				@Override
				public void run() {
					while (true) {
						repaint();
						
						if(escKeyOn) {
							while(escKeyOn) { //escŰ ������ repaint ����
								try {
									Thread.sleep(10);
								} catch (InterruptedException e) {
									e.printStackTrace();
								}
							}
						}
						
						try {
							Thread.sleep(10);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			}).start();


			//////////////////// Ű�̺�Ʈ(��, �ٿ�) ///////////////////////
			this.addKeyListener(new KeyAdapter() {

				@Override
				public void keyPressed(KeyEvent e) {
					
					
					if(e.getKeyCode() == KeyEvent.VK_ESCAPE) { // ESC Ű�� ������ �Ͻ������ϱ�
						if(!escKeyOn) {
							escKeyOn = true;
							add(escBtn); // esc�� ������ escKeyOn������ true�� �ǰ� ��ư�� ȭ�鿡 ���̰���
							repaint(); // ȭ�� ��Ӱ� �ϱ� ���� repaint
						}else {
							remove(escBtn);
							escKeyOn = false;
						}
					}
					
					if(!escKeyOn) { // esc�� ���� ������ �۵�
						if (e.getKeyCode() == KeyEvent.VK_SPACE && c1.getCountJump() < 2) { // jump == false
							new Up();

						}
						if (e.getKeyCode() == KeyEvent.VK_DOWN) {

							downKeyOn = true;

							if (
								c1.getImage() != cookieDown.getImage()
								&& !c1.isJump() 
								&& !c1.isFall()) {

								c1.setImage(cookieDown.getImage());// ������ �� �̹��� ����
							}
						}
					}
					
				}

				@Override
				public void keyReleased(KeyEvent e) {
					if (e.getKeyCode() == KeyEvent.VK_DOWN) {

						downKeyOn = false; // downKeyOn ������ false��

						if (
							c1.getImage() != cookie.getImage() // ��Ű�̹����� �⺻�̹��� X
							&& !c1.isJump()  // ������ X
							&& !c1.isFall()) { // ������ X

							c1.setImage(cookie.getImage()); // �̹����� �⺻�̹����� ����
						}
					}
					
				}
			});
		}

		@Override
		protected void paintComponent(Graphics g) {

			
			
			
			// �������
			if (buffg == null) {
				buffImage = createImage(this.getWidth(), this.getHeight());
				if (buffImage == null) {
					System.out.println("���� ���۸��� ���� ��ũ�� ���� ����");
				} else {
					buffg = buffImage.getGraphics();
				}
			}

			// ����
			Graphics2D g2 = (Graphics2D) buffg;

			super.paintComponent(buffg); // ���� �̹����� �����.

			
						
			// ���
			buffg.drawImage(b11.getImage(), b11.getX(), 0, null);
			buffg.drawImage(b12.getImage(), b12.getX(), 0, null);

			// ���� ���
			buffg.drawImage(bg2.getImage(), 0, 0, null);
						
			// ����
			for (int i = 0; i < fieldList.size(); i++) {

				Field tempFoot = fieldList.get(i);

				if (tempFoot.getX() > -90) {
					
					buffg.drawImage(

							tempFoot.getImage(), 
							tempFoot.getX(), 
							tempFoot.getY(), 
							tempFoot.getWidth(),
							tempFoot.getHeight(), 
							null);
				}
			}

			// ����
			for (int i = 0; i < jellyList.size(); i++) {

				Jelly tempJelly = jellyList.get(i);

				if (tempJelly.getX() > -90) {

					buffg.drawImage(

							tempJelly.getImage(), 
							tempJelly.getX(), 
							tempJelly.getY(), 
							tempJelly.getWidth(),
							tempJelly.getHeight(), 
							null);
				}
			}

			// ��ֹ�
			for (int i = 0; i < tacleList.size(); i++) {

				Tacle tempTacle = tacleList.get(i);

				if (tempTacle.getX() > -90 && tempTacle.getX() < 810) {

					buffg.drawImage(

							tempTacle.getImage(), 
							tempTacle.getX(), 
							tempTacle.getY(), 
							tempTacle.getWidth(),
							tempTacle.getHeight(), 
							null);
				}
			}

			////////////////// ĳ���Ͱ� �������� ������ �ٲ�� �ϱ� //////////////////
			for (int i = 0; i < jellyList.size(); i++) {
				Jelly tempJelly = jellyList.get(i);

				if (tempJelly.getX() < -90) {
					fieldList.remove(tempJelly);

				} else {
					tempJelly.setX(tempJelly.getX() - gameSpeed);
					
					foot = c1.getY() + c1.getHeight(); // ĳ���� �� ��ġ �� ��ĵ

					if (
							tempJelly.getX() >= c1.getX()
							&& tempJelly.getX() <= face
							&& tempJelly.getY() >= c1.getY()
							&& tempJelly.getY() <= foot
							&& tempJelly.getImage() != effect.getImage()){
							
						tempJelly.setImage(effect.getImage()); // ���� �̹��� ����Ʈ�� �ٲٱ�
						resultScore = resultScore + tempJelly.getScore();
						
					}
				}

				buffg.drawImage(tempJelly.getImage(), tempJelly.getX(), tempJelly.getY(), tempJelly.getWidth(),
						tempJelly.getHeight(), null);
			}

			/////////////////// ĳ���Ͱ� ��ֹ��� �ε����� ĳ���� ���°� �������� ���� /////////////////////////
			for (int i = 0; i < tacleList.size(); i++) {
				Tacle tempTacle = tacleList.get(i);

				
				////////////////// ���� /////////////////////
				if (tempTacle.getX() < -90) {
					fieldList.remove(tempTacle);
				} else {
					tempTacle.setX(tempTacle.getX() - gameSpeed);
					
					foot = c1.getY() + c1.getHeight(); // ĳ���� �� ��ġ �罺ĵ
					
					if ( // �������� X, ĳ������ ���� �ȿ� ��ֹ��� ������
							!c1.isInvincible()
							&& tempTacle.getX() >= c1.getX()
							&& tempTacle.getX() <= face
							&& tempTacle.getY() >= c1.getY()
							&& tempTacle.getY() <= foot) {
						

						new Thread(new Runnable() {

							@Override
							public void run() {

								// ��������
								c1.setInvincible(true);

								System.out.println("��������");

								// ��Ű ü��
								c1.setHealth(c1.getHealth() - 100);
								System.out.println(c1.getHealth()); // ������ Ȯ��
								
								// ��Ű ����
								c1.setAlpha(80);

								// ��Ű ��� ����
								c1.setImage(cookieHit.getImage());

								// 0.5�� ���
								try {
									Thread.sleep(500);
								} catch (InterruptedException e) {
									e.printStackTrace();
								}

								// �ٽ� �⺻ �̹����� ����
								if (c1.getImage() == cookieHit.getImage()) {
									c1.setImage(cookie.getImage());
								}

								// 2.5�ʵ��� �����̱�
								for (int j = 0; j < 11; j++) {
									if (c1.getAlpha() == 80) {
										c1.setAlpha(160);
									} else {
										c1.setAlpha(80);
									}
									try {
										Thread.sleep(250);
									} catch (InterruptedException e) {
										e.printStackTrace();
									}
								}
								c1.setAlpha(255);

								c1.setInvincible(false);
								System.out.println("��������");
							}
						}).start();
					}
				}

				
				
				buffg.drawImage(tempTacle.getImage(), tempTacle.getX(), tempTacle.getY(), tempTacle.getWidth(),
						tempTacle.getHeight(), null);
			}

			
						
			// ��Ű ���İ�
			alphaComposite = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, (float) c1.getAlpha() / 255);
			g2.setComposite(alphaComposite);

			// ��Ű �׸���
			buffg.drawImage(c1.getImage(), c1.getX(), c1.getY(), c1.getWidth(), c1.getHeight(), null);

			// ���İ� �ǵ�����
			alphaComposite = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, (float) 255 / 255);
			g2.setComposite(alphaComposite);

			// ����
			buffg.drawString("Score : " +Integer.toString(resultScore), 700, 30);

			// ü�°�����
			buffg.fillRect(50, 40, c1.getHealth() /2, 30);

			
			// ȭ�鿡 ���
			g.drawImage(buffImage, 0, 0, null);

//			buffg.drawLine(0, 0, 0, 500); // ���� ����
//			buffg.drawLine(80, 0, 80, 500); // ���� ����
		}

	}

	class Up {

		public Up() {
			///////////////////////////////// ���� ���� ���� ///////////////////////////
			new Thread(new Runnable() {

				@Override
				public void run() {

					c1.setCountJump(c1.getCountJump() + 1); // ����Ƚ�� ����

					int nowJump = c1.getCountJump();
					int nowY = c1.getY();

					c1.setJump(true);

					if (c1.getCountJump() == 1) {
						
						System.out.println("����");
						c1.setImage(cookieJump.getImage());

					} else if (c1.getCountJump() == 2) {
						
						System.out.println("��������");
						c1.setImage(cookieDJump.getImage());
					}

					long t1 = Util.getTime(); // ����ð� ��������
					long t2;
					int set = 8; // ���� ��� ����(0~20)���� �ٲ㺸��
					int jumpY = 1; // 1�̻����θ� �����ϸ� �ȴ�. (while�� ���� ������)

					while (jumpY >= 0) { // ���̰� 0�� �� ���� �ݺ�

						t2 = Util.getTime() - t1; // ���� �ð����� t1 ����
						jumpY = set - (int) ((t2) / 40); // jump ����

						c1.setY(c1.getY() - jumpY); // Y�� ����

						/// �������� �߰��Ѻκ� ����
						if (nowJump != c1.getCountJump()) { // ������ �ѹ� �� �Ǹ� ù��° ������ ����
							break;
						}

						try {
							Thread.sleep(10);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}

					if (nowJump == c1.getCountJump()) { // ������ ��¥ ������ ���� Ȯ��
						c1.setJump(false);
					}
				}
			}).start();
		}
	}
	
	/* ĳ���� ü�� �ڿ� ����, ����̵� �޼��� */
	void mapMove() {
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				while(true) {
					if(runPage > 800) { //�� �������� �̵��ϸ� ü���� 10�� ���� (���� ����)
						c1.setHealth(c1.getHealth() - 10);
						runPage = 0;
					}
					runPage += gameSpeed; // ȭ���� �̵��ϸ� reunPage�� �̵��� ��ŭ ����
					
					// ��� �̵�
					if (b11.getX() < -(b11.getWidth() - 1)) {
						b11.setX(b11.getWidth());
					}
					
					if (b12.getX() < -(b12.getWidth() - 1)) {
						b12.setX(b12.getWidth());
					}
					
					// ����� X��ǥ�� -1 ���ش� (�������� �帧)
					b11.setX(b11.getX() - gameSpeed / 3);
					b12.setX(b12.getX() - gameSpeed / 3);
				}
			}
		}).start();
	}

	public static void main(String[] args) {
		new CookieRunTest();
	}

}