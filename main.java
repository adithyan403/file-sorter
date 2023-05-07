import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class main extends JFrame{
	public main(){
		setTitle("File Sorter");
		setSize(400,300);
		setLayout(new BorderLayout());
		JLabel label=new JLabel("            Welcome \n Enter the file location with complete path");

		add(label,BorderLayout.NORTH);
		JButton button=new JButton("Click TO Arr");
		add(button,BorderLayout.SOUTH);
        JTextField text=new JTextField(5);
		add(text);
		text.setPreferredSize(new Dimension(200, 30));
		text.setBackground(Color.blue);
		setVisible(true);
		button.addActionListener((e) -> {
			// Perform the action when the button is clicked
			
			System.out.println("Button clicked with input: ");
			String input=text.getText();
		});
		

	}
	public static void main(String[] args) {
		new main();
	}


}
