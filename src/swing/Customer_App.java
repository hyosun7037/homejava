//package swing;
//
////로그인 패널
//import java.awt.Dimension;
//import java.awt.EventQueue;
//import java.awt.Graphics;
//import java.awt.Image;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.util.Arrays;
//
//import javax.swing.ImageIcon;
//import javax.swing.JFrame;
//import javax.swing.JPanel;
//import javax.swing.JLabel;
//import javax.swing.JMenu;
//import javax.swing.JMenuBar;
//import javax.swing.JMenuItem;
//import javax.swing.JOptionPane;
//
//import java.awt.Font;
//import java.awt.Color;
//import javax.swing.JTextField;
//import javax.swing.JPasswordField;
//import javax.swing.JButton;
//import java.awt.BorderLayout;
//import javax.swing.SwingConstants;
//import javax.swing.JComboBox;
//
//public class Customer_App {
//
//	private JFrame frame;
//	private JTextField id;
//	private JPasswordField password;
//
//	/**
//	 * Launch the application.
//	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Customer_App window = new Customer_App();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}
//
//	/**
//	 * Create the application.
//	 */
//	public Customer_App() {
//		initialize();
//	}
//
//	/**
//	 * Initialize the contents of the frame.
//	 */
//	private void initialize() {
//		frame = new JFrame();
//		//이미지 패널에 넣기
//		ImagePanel welcomePanel = new ImagePanel(new ImageIcon("C:/src/javawork/javastudy/src/javaproject/image/bg.jpg").getImage());
//		welcomePanel.setBackground(new Color(0, 0, 128));
//		
//		//welcomePanel가로 세로 사이즈 불러오기
//		frame.setSize(welcomePanel.getWidth(), welcomePanel.getHeight());
//		frame.getContentPane().add(welcomePanel);
//		
//		JLabel lblNewLabel = new JLabel("Login");
//		lblNewLabel.setForeground(Color.WHITE);
//		lblNewLabel.setFont(new Font("나눔고딕", Font.PLAIN, 25));
//		lblNewLabel.setBounds(396, 181, 70, 39);
//		welcomePanel.add(lblNewLabel);
//		
//		id = new JTextField();
//		id.setFont(new Font("나눔고딕", Font.PLAIN, 25));
//		id.setToolTipText("id");
//		id.setBounds(316, 236, 247, 39);
//		welcomePanel.add(id);
//		id.setColumns(10);
//		
//		password = new JPasswordField();
//		password.setToolTipText("password");
//		password.setBounds(316, 287, 247, 39);
//		welcomePanel.add(password);
//		
//		JLabel lblNewLabel_1 = new JLabel("ID");
//		lblNewLabel_1.setFont(new Font("나눔고딕", Font.PLAIN, 20));
//		lblNewLabel_1.setForeground(Color.WHITE);
//		lblNewLabel_1.setBounds(269, 250, 62, 18);
//		welcomePanel.add(lblNewLabel_1);
//		
//		JLabel lblNewLabel_1_1 = new JLabel("PASSWORD");
//		lblNewLabel_1_1.setForeground(Color.WHITE);
//		lblNewLabel_1_1.setFont(new Font("나눔고딕", Font.PLAIN, 20));
//		lblNewLabel_1_1.setBounds(179, 296, 121, 18);
//		
//		//추가했던 패널은 로그인 후 사라지게 함
//		welcomePanel.add(lblNewLabel_1_1);
//		
//		JButton btnLogin = new JButton("");
//		btnLogin.setIcon(new ImageIcon("C:\\Users\\\uAE40\uD6A8\uC120\\Desktop\\login.jpg"));
//		btnLogin.setBackground(Color.WHITE);
//		btnLogin.setBounds(382, 465, 113, 39);
//		
//		JPanel mainPanel = new JPanel();
//		mainPanel.setBackground(Color.WHITE);
//		frame.getContentPane().add(mainPanel, BorderLayout.NORTH);
//		mainPanel.setLayout(null);
//		
//		//버튼에 기능넣기 : 버튼 누르면 아이디, 패스워드 값 추출
//		btnLogin.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				
//				if(id.getText().equals("sunny") && Arrays.equals(password.getPassword(),"1234".toCharArray())) {
//					System.out.println("Hello,sunny"); //로그인이 되면 값 출력
//					welcomePanel.setVisible(false);
//					mainPanel.setVisible(true);
//				}else {
//					JOptionPane.showMessageDialog(null, "try again");
//				}
//				//비밀번호는 charArray로 저장
//		
//				//System.out.println(id.getText()); //String
//				//System.out.println(password.getPassword()); //characterArray
//			}
//		});
//		
//		welcomePanel.add(btnLogin);
//		
//		JLabel lblNewLabel_3 = new JLabel("Name");
//		lblNewLabel_3.setBounds(191, 208, 109, 67);
//		welcomePanel.add(lblNewLabel_3);
//		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
//		
//		//선택박스
//		JComboBox gender = new JComboBox(new String[]{"Male","Female"});
//		gender.setBounds(316, 339, 248, 40);
//		welcomePanel.add(gender);
//		
//		JButton btnNewButton1 = new JButton("submit");
//		btnNewButton1.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
////				String nameTxt = name.getText() // 이름값 저장
////				String ageTxt = age.getText() // 나이 저장
////				String phoneTxt = phone.getText(); // 폰 저장
//				String genderTxt = gender.getSelectedItem().toString(); // 셀렉트박스저장
//				
//			}
//		});
//		
//		JLabel lblNewLabel_1_1_1 = new JLabel("GENDER");
//		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
//		lblNewLabel_1_1_1.setForeground(Color.WHITE);
//		lblNewLabel_1_1_1.setFont(new Font("나눔고딕", Font.PLAIN, 20));
//		lblNewLabel_1_1_1.setBounds(201, 348, 99, 18);
//		welcomePanel.add(lblNewLabel_1_1_1);
//		
//		JButton btnNewButton_1 = new JButton("submit");
//		btnNewButton_1.setBounds(578, 346, 105, 27);
//		welcomePanel.add(btnNewButton_1);
//
//		
//		JPanel panel = new JPanel();
//		panel.setBounds(0, 0, 794, 569);
//		mainPanel.add(panel);
//		
//		JLabel lblNewLabel_2 = new JLabel("Welcome to page");
//		lblNewLabel_2.setToolTipText("Welcome to page");
//		lblNewLabel_2.setBackground(Color.WHITE);
//		lblNewLabel_2.setFont(new Font("나눔고딕", Font.PLAIN, 20));
//		lblNewLabel_2.setBounds(320, 40, 229, 96);
//		mainPanel.add(lblNewLabel_2);
//		
//	
//		frame.setJMenuBar(menubar()); //메뉴추가 //안에 아무것도 없으면 에러가 뜬다.
//		frame.setResizable(false); //임의로 사이즈 조정 X
//		frame.setBounds(100, 100, 800, 600);
//		frame.setLocationRelativeTo(null);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//	}
//	
//	public JMenuBar menubar() {
//		JMenuBar bar = new JMenuBar();
//		JMenu fileMenu = new JMenu("File");
//		JMenu aboutMenu = new JMenu("About");
//		
//		bar.add(fileMenu);
//		bar.add(aboutMenu);
//		
//		//메뉴아이템이 없기 떄문에 추가해준다
//		JMenuItem openFile = new JMenuItem("Open");
//		JMenuItem exit = new JMenuItem("Exit");
//		
//		fileMenu.add(openFile);
//		fileMenu.addSeparator(); //메뉴 사이 선 만들기
//		fileMenu.add(exit);
//		
//		exit.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent arg0) {
//				System.exit(0); //시스템 종료
//			}
//		});
//		
//		return bar;
//	}
//}
//
////이미지 넣기
//class ImagePanel extends JPanel{
//	private Image img;
//	
//	public ImagePanel(Image img) {
//		this.img = img;
//		setSize(new Dimension(img.getWidth(null),img.getHeight(null)));//이미지 최대값
//		setLayout(null); //원하는 곳에 위치시킬 수 있음
//		setPreferredSize(new Dimension(img.getWidth(null),img.getHeight(null)));
//		
//	}
//	//이미지 가로
//	public int getWidth() {
//		return img.getWidth(null); 
//	}
//	
//	//이미지 세로
//	public int getHeight() {
//		return img.getHeight(null);
//	}
//	
//	//이미지를 보여주는 기능
//	public void paintComponent(Graphics g) {
//		g.drawImage(img, 0, 0, null);
//	}
//}
