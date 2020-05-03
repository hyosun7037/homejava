package swing;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Swing_Ex01 {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel(); //�����Ӿȿ� �߰����
		JLabel label = new JLabel("Context"); //�������� ǥ���ϴ� ���, �� �� ����� X
		JButton btn1 = new JButton("Click");
		JButton btn2 = new JButton("Exit");
		//JTextField txtField = new JTextField(200); //����
		JTextArea txtArea = new JTextArea();//������
		
		//��ư�� �ʹ� ũ�ϱ� ���ο� panel�ȿ� ��ư�� ����־��
		JPanel btnPanel = new JPanel();
		
		//���� �ߴٰ� �ؼ� �ڵ����� �����Ӿ����� ���� X, ������ �ȿ� �־������
		frame.add(panel);
		
				
		btnPanel.add(btn1);
		btnPanel.add(btn2);
		
		panel.setLayout(new BorderLayout()); //���ϴ� ��ġ�� ���� �� �ִ�.
		panel.add(label, BorderLayout.NORTH); //���ʿ� ��ġ
		//panel.add(btn1, BorderLayout.WEST); //���ʿ� ��ġ
		panel.add(btnPanel, BorderLayout.WEST); //btnPanel�� ����ֱ�
		panel.add(txtArea, BorderLayout.CENTER);
		
		//��ư�� ����߰��ϱ�
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
//				txtArea.append("�ؽ�Ʈ �߰� \n");
				label.setText(txtArea.getText()); 
				//�Է��� ���ڷ� �ٲ�� ����
			}
		});
		
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		
		//panel.add(new JLabel("Hello World"));
		
		
		frame.setResizable(false); //������ ũ�� ���� X --> false
		frame.setVisible(true);
		frame.setPreferredSize(new Dimension(840,840/12*9));
		frame.setSize(840,840/12*9);
		frame.setLocationRelativeTo(null); //null�ϸ� �ڵ����� ��� ��ġ
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //������ ���� ����
	}

}
