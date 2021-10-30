package passRatingAppView;

import javax.swing.JPanel;

import passRatingAppController.PRAppController;

public class InfoPanel extends JPanel {

	private PRAppController baseController;
	
	  private javax.swing.JButton okButton;
	  private javax.swing.JLabel resultsLabel;
	
	
	public InfoPanel(PRAppController baseController) {
		this.baseController = baseController;
        initComponents();
    }

    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        okButton = new javax.swing.JButton();
        resultsLabel = new javax.swing.JLabel(baseController.getMessage());

        setLayout(new java.awt.GridBagLayout());

        okButton.setText("OK");
        okButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        okButton.setLocation(new java.awt.Point(0, 1));
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        add(okButton, gridBagConstraints);

        resultsLabel.setFont(new java.awt.Font("Lucida Grande", 0, 18));
        add(resultsLabel);

    }                      

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
    	System.exit(0);
    }                                        


                
  
        
}


