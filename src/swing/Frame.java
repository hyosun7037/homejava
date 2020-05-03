package swing;

//이전버튼 다음버튼 실행 

//Absolute 레이아웃으로 제작해야 유동적으로 이동이나, 크기조절 가능
//JPanel 2개 만들고 각각 JButton 추가,Absolute 레이아웃 추가
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

public class Frame {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame window = new Frame();
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
	public Frame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("프레임");
		frame.setBounds(100, 100, 800, 600);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel end = new JPanel();
		end.setBounds(0, 0, 794, 565);
		frame.getContentPane().add(end);
		end.setLayout(null);
		
		JButton btnBefore = new JButton("pre page");
		btnBefore.setBounds(468, 128, 256, 280);
		end.add(btnBefore);
		
		JPanel start = new JPanel();
		start.setBounds(0, 0, 794, 565);
		frame.getContentPane().add(start);
		start.setLayout(null);
		
		JButton btnNext = new JButton("new page");
		btnNext.setBounds(25, 99, 173, 245);
		start.add(btnNext);
		
		end.setVisible(false);
		btnNext.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				end.setVisible(true);
				start.setVisible(false);
				
			}
		});
		btnBefore.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				start.setVisible(true);
				end.setVisible(false);
				
			}
		});
	}
}
