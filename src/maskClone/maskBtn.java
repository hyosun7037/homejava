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

	// �˻� ��ư�� ������ JtextField�� ������ �����ͼ�, JtextArea�� �־���� �ϱ� ������
	// ���� ������ ��ġ�ؾ��Ѵ�.

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

		// ScrollPane�Ʒ��� textArea�� ���־� ȭ���� ��Ÿ�� (�����߿�)
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(55, 84, 268, 251);
		frame.getContentPane().add(scrollPane);

		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);

		///////////////////////////////////////////////////// ������� ����

		JButton btnNewButton = new JButton("\uAC80\uC0C9");
		btnNewButton.addMouseListener(new MouseAdapter() { // ���콺 �����
			@Override
			public void mouseClicked(MouseEvent e) { // ���콺�� Ŭ���Ǹ� �ݹ�
				DataClone d1 = new DataClone(); // �౹������ �ҷ����� ��� ��ü ����
				Module2 m2 = d1.getInfo(); // �౹ ���� ��������
				StringBuilder sb = new StringBuilder(); // �౹ ������ �ϳ��� ���� ���� ��Ʈ�� ���� ����

				int storeNum = m2.getStoreInfos().size(); // �ҷ��� �౹�� ��

				for (int i = 0; i < storeNum; i++) {
					if ((m2.getStoreInfos().get(i).getAddr().contains(textField.getText()))) {
						String name = m2.getStoreInfos().get(i).getName();
						String addr = m2.getStoreInfos().get(i).getName();
						sb.append(name + "�� ��ġ�� " + addr + "\n");
					}

				}
				textArea.setText(sb.toString()); // ��Ʈ�� ������ ��� ������ textArea�� ������
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
