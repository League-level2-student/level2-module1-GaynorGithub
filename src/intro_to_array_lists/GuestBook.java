package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	JFrame frame = new JFrame();
	JButton add = new JButton("Add Name");
	JButton view = new JButton("View Names");
	JPanel panel = new JPanel();
	ArrayList<String> names = new ArrayList<String>();
	
	public static void main(String[] args) {
		GuestBook guest = new GuestBook();
		guest.startGui();
	}
	
	void startGui() {
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		panel.add(add);
		panel.add(view);
		add.addActionListener(this);
		view.addActionListener(this);
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(add)) {
			String answer = JOptionPane.showInputDialog("Enter a Name:");
			names.add(answer);
		}
		else if(e.getSource().equals(view)) {
			String message = "";
			for (int j = 0; j < names.size(); j++) {
				message += ("Guest #" + (j + 1) + ": " + names.get(j) + "\n");
			}
				
			
			JOptionPane.showMessageDialog(null, message);
			
			
		}
		
	}
	
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
}
