import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;

public class scoutingApp extends JFrame {
	public static void main(String[] args) {
		new scoutingApp();
	}
	public scoutingApp() {
		initUI();
	}
	JButton submit;
	public void initUI() {
		this.setSize(600, 200);
		this.setTitle("FUSION 6763 Scouting");
		this.setResizable(false);
		
		JPanel panel = new JPanel();
		this.add(panel);
		
		JLabel title = new JLabel("Submit a robot to the database");
		//Font titleFont = title.getFont();
		title.setFont(new Font("Raleway Light", Font.PLAIN, 40));
		panel.add(title);
		
		panel.add(new JLabel("Team number"));
		
		JTextField number = new JTextField(20);
		number.setToolTipText("The number is used for database organization.");
		number.setVisible(true);
		panel.add(number);
		
		panel.add(new JLabel("How did they do?"));
		
		String[] scoreList = {"Well", "OK", "Bad"};
		JComboBox score = new JComboBox(scoreList);
		panel.add(score);
				
		submit = new JButton("Submit");
		submit.addActionListener(new ClickListener());
		submit.setFont(new Font("Raleway", Font.PLAIN, 20));
		panel.add(submit);
		submit.setVisible(true);
		
		this.setVisible(true);
	}
	public class ClickListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == submit) {
				//Put button actions here.
			}
		}
	}
}
