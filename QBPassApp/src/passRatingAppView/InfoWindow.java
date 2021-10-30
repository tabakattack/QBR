package passRatingAppView;

import javax.swing.JFrame;

import passRatingAppController.PRAppController;

public class InfoWindow extends JFrame {

private InfoPanel infoPanel;
	
	public InfoWindow(PRAppController baseController) {
		infoPanel = new InfoPanel(baseController);
		setupFrame();
	}

	
	public void setupFrame() {
		this.setSize(600, 400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.add(infoPanel);
		//this.pack();
		this.setVisible(true);
		

	}
}
