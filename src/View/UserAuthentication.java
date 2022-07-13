package View;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class UserAuthentication extends ViewParent {
	public UserAuthentication() {
		super();
		mainFrame.setTitle("Authentication");
		
		JPanel userAuthenticationPanel = new JPanel();
		
		JLabel userLabel = new JLabel("Username:");
		JTextField username = new JTextField();
		userLabel.setSize(20, 10);
		username.setSize(20, 10);
		
		JLabel passwordLabel = new JLabel("Password:");
		JPasswordField password = new JPasswordField();
		passwordLabel.setSize(20, 10);
		password.setSize(20, 10);
		
		userAuthenticationPanel.add(userLabel);
		userAuthenticationPanel.add(username);
		userAuthenticationPanel.add(passwordLabel);
		userAuthenticationPanel.add(password);
		
		mainFrame.add(userAuthenticationPanel);
		
		
		
	}
}
