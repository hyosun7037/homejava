package swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

//�α��� â �����
public class LogIn extends JFrame{
	public LogIn() {
		JPanel panel = new JPanel();
		JLabel IdLabel = new JLabel("ID : ");
		JLabel psJLabel = new JLabel("password : ");
		JTextField txtID = new JTextField(10);
		JPasswordField txtPW = new JPasswordField(10); //��ȣȭ
		
		//��ư ����
		JButton longBtn = new JButton("Log In");
		
		//ID ����
		panel.add(IdLabel);
		panel.add(txtID);
		
		//PW ����
		panel.add(psJLabel);
		panel.add(txtPW);
		
		//��ư ����
		panel.add(longBtn);
		
		//�α��� ��ư�� ����߰�
		longBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String id = "sunny";
				String pw = "1234";
				
				if(id.equals(txtID.getText())&& pw.equals(txtPW.getText())){ //����� ��
					JOptionPane.showMessageDialog(null, "success");
				}else {
					JOptionPane.showMessageDialog(null, "fail");
				}
			}
		});
		
		//panel�߰�
		add(panel); //JFrame�� ��ӹ޾ұ� ������ super �����ϰ� �ٷ� add
		
		//�⺻����
		setVisible(true); //�ڵ� ������ ����
		setSize(600,400);
		setLocationRelativeTo(null); //��� ��ġ
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new LogIn();
	}
}

