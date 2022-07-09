package View;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;


import View.ViewParent;

public class HomeView extends ViewParent  {
	public HomeView() throws IOException {
		super();
		mainFrame.setTitle("Home");
		JPanel imagePanel = new JPanel(new BorderLayout());
		JPanel userProfilePanel = new JPanel();
		JPanel fieldsPanel = new JPanel(new GridLayout());
		
		BufferedImage myPicture = ImageIO.read(new File("src/images/bank.jpg"));
		JLabel picLabel = new JLabel(new ImageIcon(myPicture));
		picLabel.setSize(350, 197);
		imagePanel.setSize(350, 197);
		imagePanel.add(picLabel);
		
		mainFrame.add(imagePanel);
		
		
	}
	 
	
}
