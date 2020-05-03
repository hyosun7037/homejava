package maskClone;

import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import mask.JFXTest;

import javax.swing.JPanel;

public class maskBtn {

	// 검색 버튼을 누르면 JtextField의 내용을 가져와서, JtextArea에 넣어줘야 하기 때문에
	// 전역 공간에 위치해야한다.

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
					maskBtn window = new maskBtn();
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
	public maskBtn() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 743, 429);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("\uC704\uCE58");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(55, 42, 39, 30);
		frame.getContentPane().add(lblNewLabel);

		textField = new JTextField();
		textField.setBounds(114, 40, 134, 31);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		// ScrollPane아래에 textArea를 놔둬야 화면이 나타남 (순서중요)
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(55, 84, 268, 251);
		frame.getContentPane().add(scrollPane);

		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);

		///////////////////////////////////////////////////// 여기부터 수정

		JButton btnNewButton = new JButton("\uAC80\uC0C9");
		btnNewButton.addMouseListener(new MouseAdapter() { // 마우스 어댑터
			@Override
			public void mouseClicked(MouseEvent e) { // 마우스가 클릭되면 콜백
				DataClone d1 = new DataClone(); // 약국정보를 불러오는 모듈 객체 생성
				Module2 m2 = d1.getInfo(); // 약국 정보 가져오기
				StringBuilder sb = new StringBuilder(); // 약국 정보를 하나로 묶기 위한 스트링 빌더 생성

				int storeNum = m2.getStoreInfos().size(); // 불러온 약국의 수

				for (int i = 0; i < storeNum; i++) {
					if ((m2.getStoreInfos().get(i).getAddr().contains(textField.getText()))) {
						String name = m2.getStoreInfos().get(i).getName();
						String addr = m2.getStoreInfos().get(i).getName();
						sb.append(name + "의 위치는 " + addr + "\n");
					}

				}
				textArea.setText(sb.toString()); // 스트링 빌더에 담긴 내용을 textArea에 덮어씌우기
			}
		});

		btnNewButton.setBounds(265, 42, 61, 27);
		frame.getContentPane().add(btnNewButton);

		JFXPanel panel = new JFXPanel();
		panel.setBounds(376, 84, 291, 251);
		frame.getContentPane().add(panel);

		Platform.runLater(new Runnable() {
			public void run() {
				JFXTest.initAndLoadWebView(panel);
			}

		});

	}
}
