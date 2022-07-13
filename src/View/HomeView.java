package View;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class HomeView extends ViewParent  {
	public HomeView() throws IOException {
		super();
		mainFrame.setTitle("Home");
		JPanel homePanel = new JPanel();
		JPanel imagePanel = new JPanel();
		JPanel buttonPanel = new JPanel();
		mainFrame.getContentPane().setLayout(new BoxLayout(mainFrame.getContentPane(), BoxLayout.PAGE_AXIS));
		
		BufferedImage myPicture = ImageIO.read(new File("src/images/bank.jpg"));
		JLabel picLabel = new JLabel(new ImageIcon(myPicture));
		picLabel.setSize(350, 197);
		imagePanel.add(picLabel);
		//imagePanel.setLayout(new BoxLayout(imagePanel, BoxLayout.LINE_AXIS));
		
		
		JButton userProfileViewButton = new JButton("User Profile");
		JButton accountViewButton = new JButton("User Account");
		
		userProfileViewButton.setSize(20, 10);
		accountViewButton.setSize(20, 10);
		
		userProfileViewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new UserAuthentication();
			}
		});

		buttonPanel.add(userProfileViewButton);
		buttonPanel.add(accountViewButton);
		
		homePanel.add(imagePanel);
		homePanel.add(buttonPanel);
		
		homePanel.setAlignmentX(Component.CENTER_ALIGNMENT);
		homePanel.setAlignmentY(Component.CENTER_ALIGNMENT);
		homePanel.setPreferredSize(new Dimension(350, 300));
		homePanel.setMaximumSize(new Dimension(350, 300));
		
	
		mainFrame.getContentPane().add(homePanel);
		
		
	}
	 
	
}
