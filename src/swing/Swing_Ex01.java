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
		JPanel panel = new JPanel(); //프레임안에 추가기능
		JLabel label = new JLabel("Context"); //컨텐츠를 표시하는 기능, 그 외 기능은 X
		JButton btn1 = new JButton("Click");
		JButton btn2 = new JButton("Exit");
		//JTextField txtField = new JTextField(200); //한줄
		JTextArea txtArea = new JTextArea();//여러줄
		
		//버튼이 너무 크니까 새로운 panel안에 버튼을 집어넣어보자
		JPanel btnPanel = new JPanel();
		
		//생성 했다고 해서 자동으로 프레임안으로 들어가지 X, 프레임 안에 넣어줘야함
		frame.add(panel);
		
				
		btnPanel.add(btn1);
		btnPanel.add(btn2);
		
		panel.setLayout(new BorderLayout()); //원하는 위치에 놔둘 수 있다.
		panel.add(label, BorderLayout.NORTH); //위쪽에 위치
		//panel.add(btn1, BorderLayout.WEST); //왼쪽에 위치
		panel.add(btnPanel, BorderLayout.WEST); //btnPanel을 집어넣기
		panel.add(txtArea, BorderLayout.CENTER);
		
		//버튼에 기능추가하기
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
//				txtArea.append("텍스트 추가 \n");
				label.setText(txtArea.getText()); 
				//입력한 글자로 바뀌게 설정
			}
		});
		
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		
		//panel.add(new JLabel("Hello World"));
		
		
		frame.setResizable(false); //프레임 크기 조절 X --> false
		frame.setVisible(true);
		frame.setPreferredSize(new Dimension(840,840/12*9));
		frame.setSize(840,840/12*9);
		frame.setLocationRelativeTo(null); //null하면 자동으로 가운데 위치
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //껏을때 모든게 종료
	}

}
