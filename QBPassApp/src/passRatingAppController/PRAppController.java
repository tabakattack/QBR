package passRatingAppController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

import passRatingAppModel.PRAppModel;
import passRatingAppView.PRAppFrame;
import passRatingAppView.PRAppPanel;

public class PRAppController {

	private PRAppFrame appFrame;
	private PRAppPanel appPanel;
	private PRAppModel appModel;
	
	public void start() {
		appFrame = new PRAppFrame(this);
		appModel = new PRAppModel();
		
	}
	
	public boolean updateData(String name,String year,String attempts,
			String comps,String yrds,String tds, String interc) {
		boolean updatePerformed = false;
		if (checkYear(year)&&
			(checkData(attempts))&&
			(checkData(comps))&&
			(checkData(yrds))&&
			(checkData(tds))&&
			(checkData(interc)))
		{
			appModel.setqBName(name);
			appModel.setYear(Integer.parseInt(year));
			appModel.setAttempts(Double.parseDouble(attempts));
			appModel.setComps(Double.parseDouble(comps));
			appModel.setYrds(Double.parseDouble(yrds));
			appModel.setTds(Double.parseDouble(tds));
			appModel.setInterceptions(Double.parseDouble(interc));
			
			System.out.println(appModel.getAttempts());
			System.out.println(appModel.getComps());
			System.out.println(appModel.getYrds());
			System.out.println(appModel.getTds());
			System.out.println(appModel.getInterceptions());

			
			calculateComp();
			System.out.println(appModel.getCompCalc());
			initYrdsCalc();
			System.out.println(appModel.getYardsCalc());
			initTDsCalc();
			System.out.println(appModel.getTDCalc());
			initIntcCalc();
			System.out.println(appModel.getINtcClac());
			
			updatePerformed = true;
		}
		else{JOptionPane.showMessageDialog(null, appModel.getWarning(), "Problem!", JOptionPane.ERROR_MESSAGE);}
		return updatePerformed;	
	}
	public boolean checkYear(String input) {
		boolean isYear = false;
		int num;
		try {
			num = Integer.parseInt(input);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error with numbers");
			isYear = false;
			return isYear;
		}
		if (num > 1 && num < 2025) {
			isYear = true;
			appModel.setYear(num);
		}
		return isYear;
	}
	
	
	public boolean checkData(String input) {
		boolean checkPassed = false;
		if ((input == "")||(input == null)) {
			checkPassed = false;
			return checkPassed;
		}	
		try {
			double dub = Double.parseDouble(input);
			checkPassed = true;
		} catch(NumberFormatException nfe) {
			checkPassed = false;
			return checkPassed;
		}
		
		System.out.println(input);
		return checkPassed;
	}
	
	public boolean calculateComp() {
		boolean didCalc = false;
		double num;
		double test;
	
		test = appModel.getComps();
		try {
			num = ((appModel.getComps() / appModel.getAttempts())- 0.3) * 5;
			if (num > 2.375) {
				num = 2.375;
			}
			else if (num < 0) {
				num = 0;
			}
			appModel.setCompCalc(num);
			didCalc = true;
		} catch (Exception e) {
			System.out.println(e);
			didCalc = false;
			return didCalc;
			// TODO: handle exception
		}
		return didCalc;
	}
	
	public boolean initYrdsCalc() {
		boolean didCalc = false;
		double num;
		try {
			num = ((appModel.getYrds() / appModel.getAttempts()) - 3) * 0.25;
			if (num > 2.375) {
				num = 2.375;
			}
			else if (num < 0) {
				num = 0;
			}
			appModel.setYardsCalc(num);
			didCalc = true;
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			didCalc = false;
			return didCalc;
		}
		return didCalc;
	}
	
	public boolean initTDsCalc() {
		boolean didCalc = false;
		double num;
		try {
			num = ((appModel.getTds() / appModel.getAttempts())*20);
			if (num > 2.375) {
				num = 2.375;
			}
			else if (num < 0) {
				num = 0;
			}
			appModel.setTDCalc(num);
			didCalc = true;
		} catch (Exception e) {
			System.out.println(e);
			didCalc = false;
			return didCalc;
			// TODO: handle exception
		}
		
		return didCalc;
	}
	
	public boolean initIntcCalc() {
		boolean didCalc = false;
		double num;
		try {
			num = (2.375 - ((appModel.getInterceptions() / appModel.getAttempts())*25));
			if (num > 2.375) {
				num = 2.375;
			}
			else if (num < 0) {
				num = 0;
			}
			appModel.setIntcCalc(num);
			didCalc = true;
		} catch (Exception e) {
			System.out.println(e);
			didCalc = false;
			return didCalc;
			// TODO: handle exception
		}
		
		return didCalc;
	}
	
	public boolean initQBCalc() {
		boolean didCalc = false;
		double num = 0;
		try {
			num = (((appModel.getCompCalc() + appModel.getYardsCalc() + 
					appModel.getTDCalc() + appModel.getINtcClac()) / 6) * 100);
			
		} catch (Exception e) {
			System.out.println(e);
			didCalc = false;
			return didCalc;
			// TODO: handle exception
		}
		appModel.setQBRating(num);
		didCalc = true;
		
		return didCalc;
	}
	
	public double QBRatingNum() {
		return appModel.getQBRating();
	}
	
	public String getMessage() {
		return appModel.toString();
	}
}
