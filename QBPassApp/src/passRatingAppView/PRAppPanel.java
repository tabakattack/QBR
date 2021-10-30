package passRatingAppView;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import passRatingAppController.PRAppController;
import passRatingAppModel.PRAppModel;



public class PRAppPanel extends JPanel implements ActionListener{
	
	private PRAppController baseController;
	
	private javax.swing.JLabel attemptsLabel;
	private javax.swing.JButton continueButton;
	private javax.swing.JLabel completionsLabel;
	private javax.swing.JLabel interceptionsLabel;
	private javax.swing.JLabel touchdownsLabel;
	private javax.swing.JLabel yearLabel;
	private javax.swing.JLabel yardsThrownLabel;
	private javax.swing.JLabel nameLabel;
	private javax.swing.JTextField yearTextField;
	private javax.swing.JTextField attemptsTextField;
	private javax.swing.JTextField completionsTextField;
	private javax.swing.JTextField yardsThrownTextField;
	private javax.swing.JTextField touchdownsTextField;
	private javax.swing.JTextField interceptionsTextField;
	private javax.swing.JTextField nameTextField;	


	public PRAppPanel(PRAppController baseController) {
		this.baseController = baseController;
		initComponents();
	}
	
	private void initComponents() {

        attemptsLabel = new javax.swing.JLabel();
        completionsLabel = new javax.swing.JLabel();
        interceptionsLabel = new javax.swing.JLabel();
        touchdownsLabel = new javax.swing.JLabel();
        yearLabel = new javax.swing.JLabel();
        yardsThrownLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        
        yearTextField = new javax.swing.JTextField();
        attemptsTextField = new javax.swing.JTextField();
        completionsTextField = new javax.swing.JTextField();
        yardsThrownTextField = new javax.swing.JTextField();
        touchdownsTextField = new javax.swing.JTextField();
        interceptionsTextField = new javax.swing.JTextField();
        nameTextField = new javax.swing.JTextField();
        continueButton = new javax.swing.JButton();

        
        attemptsLabel.setText("Attempts");
        completionsLabel.setText("Completions");
        interceptionsLabel.setText("Interceptions");
        touchdownsLabel.setText("Touchdowns");
        yearLabel.setText("Year");
        yardsThrownLabel.setText("Yards Thrown");
        nameLabel.setText("Quarterback Name");

        nameTextField.setPreferredSize(new Dimension(200, 25));
        yearTextField.setPreferredSize(new Dimension(100, 25));
        attemptsTextField.setPreferredSize(new Dimension(100, 25));
        completionsTextField.setPreferredSize(new Dimension(100, 25));
        yardsThrownTextField.setPreferredSize(new Dimension(100, 25));
        touchdownsTextField.setPreferredSize(new Dimension(100, 25));
        interceptionsTextField.setPreferredSize(new Dimension(100, 25));

        continueButton.setText("Calculate");
        continueButton.addActionListener(this);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(completionsLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(completionsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(attemptsLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(attemptsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(yearLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(yearTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(nameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(interceptionsLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(interceptionsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(touchdownsLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(touchdownsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(yardsThrownLabel)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(yardsThrownTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(nameTextField))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(145, Short.MAX_VALUE)
                .addComponent(continueButton)
                .addContainerGap(145, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yearLabel)
                    .addComponent(yardsThrownLabel)
                    .addComponent(yearTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yardsThrownTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(attemptsLabel)
                    .addComponent(touchdownsLabel)
                    .addComponent(attemptsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(touchdownsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(completionsLabel)
                    .addComponent(interceptionsLabel)
                    .addComponent(completionsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(interceptionsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(continueButton)
                .addContainerGap(12, Short.MAX_VALUE))
        );
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		
		baseController.updateData(this.nameTextField.getText(), this.yearTextField.getText(), 
				this.attemptsTextField.getText(), this.completionsTextField.getText(),
				this.yardsThrownTextField.getText(), this.touchdownsTextField.getText(), 
				this.interceptionsTextField.getText());
		
		System.out.println("button pressed");
		baseController.initQBCalc();
		System.out.println(baseController.QBRatingNum());
		InfoWindow infoWindow = new InfoWindow(baseController);
		
	} 
}
