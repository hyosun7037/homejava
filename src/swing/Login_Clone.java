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

public class Login_Clone extends JFrame{
	public Login_Clone() {
		JPanel panel = new JPanel();
		JLabel IdLabel = new JLabel("ID : ");
		JLabel PsLabel = new JLabel("PW : ");
		JTextField txtID = new JTextField(10);
		JPasswordField txtPW = new JPasswordField(10);
		
		JButton longBtn = new JButton("Log In");
		
		panel.add(IdLabel);
		panel.add(PsLabel);
		panel.add(txtID);
		panel.add(txtPW);
		panel.add(longBtn);
		
		longBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String id = "sunny";
				String pw = "1234";
				
				if(id.equals(txtID.getText()) && pw.equals(txtPW.getText())) {
					JOptionPane.showMessageDialog(null, "success");
				}else {
					JOptionPane.showMessageDialog(null, "fail");
				}
				
			}
		});
		
		add(panel);
		
		setVisible(true);
		setSize(600,400);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Login_Clone();
	}

}
