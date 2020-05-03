package swing;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Table extends JFrame{
	public static void main(String[] args) {
		JFrame frame = new JFrame("Table");
		JPanel panel = new JPanel();
		String[] headings = new String[] {"ID", "NAME", "Country"};
		Object[][] data = new Object[][] {
			{"1","Sunny","Korea"},
			{"2","Daniel","korea"},
			{"3","jenny", "NZ"}
		}; //2차원 배열
		
		JTable table = new JTable(data,headings);
		
		//Dimension안에 넣어줘야 오류가 X
		table.setPreferredScrollableViewportSize(new Dimension(700,600));
		table.setFillsViewportHeight(true);

		
		panel.add(new JScrollPane(table));		
		frame.add(panel);
		
		frame.setVisible(true);
		frame.setSize(800,640);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
