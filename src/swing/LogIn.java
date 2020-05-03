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

//로그인 창 만들기
public class LogIn extends JFrame{
	public LogIn() {
		JPanel panel = new JPanel();
		JLabel IdLabel = new JLabel("ID : ");
		JLabel psJLabel = new JLabel("password : ");
		JTextField txtID = new JTextField(10);
		JPasswordField txtPW = new JPasswordField(10); //암호화
		
		//버튼 영역
		JButton longBtn = new JButton("Log In");
		
		//ID 영역
		panel.add(IdLabel);
		panel.add(txtID);
		
		//PW 영역
		panel.add(psJLabel);
		panel.add(txtPW);
		
		//버튼 영역
		panel.add(longBtn);
		
		//로그인 버튼에 기능추가
		longBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String id = "sunny";
				String pw = "1234";
				
				if(id.equals(txtID.getText())&& pw.equals(txtPW.getText())){ //사용은 됨
					JOptionPane.showMessageDialog(null, "success");
				}else {
					JOptionPane.showMessageDialog(null, "fail");
				}
			}
		});
		
		//panel추가
		add(panel); //JFrame을 상속받았기 떄문에 super 생략하고 바로 add
		
		//기본설정
		setVisible(true); //자동 프레임 생성
		setSize(600,400);
		setLocationRelativeTo(null); //가운데 위치
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new LogIn();
	}
}

