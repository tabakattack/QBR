package passRatingAppView;

import javax.swing.JFrame;
import javax.swing.JPanel;

import passRatingAppController.PRAppController;

public class PRAppFrame extends JFrame {
	
	private PRAppPanel basePanel;
	
	public PRAppFrame(PRAppController baseController) {
		basePanel = new PRAppPanel(baseController);
		setupFrame();
	}

	
	public void setupFrame() {
		this.setSize(600, 400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.add(basePanel);
		this.pack();
		this.setVisible(true);
		

	}
}
