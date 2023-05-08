import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
public class main extends JFrame{
	public main(){
		setTitle("File Sorter");
		setSize(400,300);
		setLayout(new BorderLayout());
		JLabel label=new JLabel("            Welcome \n Enter the file location with complete path");

		add(label,BorderLayout.NORTH);
		JButton button=new JButton("Click TO Arrange");
		add(button,BorderLayout.SOUTH);
        JTextField text=new JTextField(5);
		add(text);
		text.setPreferredSize(new Dimension(200, 30));
		text.setBackground(Color.blue);
		setVisible(true);
		Comparator<File> comparator = new Comparator<File>() {
            public int compare(File file1, File file2) {
                return Long.compare(file1.length(), file2.length());
            }
        };
		
		
        // Define a comparator to compare files based on their size
        
		button.addActionListener((e) -> {
			// Perform the action when the button is clicked
			
			System.out.println("Button clicked with input: ");
			File directory = new File(text.getText());
        
        // Use the File class to retrieve a list of all the files in the directory
        	File[] files = directory.listFiles();
        
        // Convert the array of files to a List
        	List<File> fileList = Arrays.asList(files);
			Collections.sort(fileList, comparator);
        
        // Iterate over the sorted list and perform the desired action
        	for (File file : fileList) {
            // Move the file to a new directory
            	file.renameTo(new File(text.getText() + file.getName()));
        }

        
    
            	
		});
		
		
	}
	public static void main(String[] args) {
		new main();
	}


}
