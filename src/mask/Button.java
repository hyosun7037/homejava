package mask;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JPanel;

public class Button {

	private JFrame frame;
	private JTextField textField;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Button window = new Button();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Button() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 795, 555);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Mask Location");
		lblNewLabel.setBounds(345, 31, 133, 24);
		lblNewLabel.setForeground(new Color(0, 0, 153));
		lblNewLabel.setFont(new Font("나눔고딕", Font.BOLD, 20));
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(101, 67, 520, 24);
		frame.getContentPane().add(textField);
		textField.setColumns(20);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setOpaque(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\\uAE40\uD6A8\uC120\\Desktop\\\uBC84\uD2BC.png"));
		btnNewButton.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {
			Data d1 = new Data(); // 약국정보를 불러오는 모듈 객체 생성
			Module1 d2 = d1.getInfo(); // 약국 정보를 가져오기
			StringBuilder sb = new StringBuilder(); // 약국 정보를 하나로 묵기
			int storeNum = d2.getStoreInfos().size(); // 불러온 약국의 수
			for (int i = 0; i < storeNum; i++) {
				if((d2.getStoreInfos().get(i).getAddr()).contains(textField.getText())) {
					String name = d2.getStoreInfos().get(i).getName();
					String addr = d2.getStoreInfos().get(i).getAddr();
					sb.append(name + "의 위치는 " + addr + "\n");
				}
			}
			textArea.setText(sb.toString());
		}
		
		});
		
		btnNewButton.setBounds(635,63,70,28);
		frame.getContentPane().add(btnNewButton);
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(101,103,604,337);
		frame.getContentPane().add(scrollPane);

		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
//		textArea = new JTextArea();
//		frame.getContentPane().add(textArea);
		textArea.setColumns(40);
		textArea.setRows(14);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(462, 187, 2, 2);
		frame.getContentPane().add(scrollPane_1);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);

	}

}
