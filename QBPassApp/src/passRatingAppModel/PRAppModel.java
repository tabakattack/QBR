package passRatingAppModel;

public class PRAppModel {

	String qBName;
	Integer year;
	Double attempts, comps, yrds, tds, interceptions, compCalc, yrdsClac, tDPerc, intcCalc, qbRating;
	
	
	public String getqBName() {
		return qBName;
	}
	public void setqBName(String qBName) {
		this.qBName = qBName;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getAttempts() {
		return attempts;
	}
	public void setAttempts(double attempts) {
		this.attempts = attempts;
	}
	public double getComps() {
		return comps;
	}
	public void setComps(double comps) {
		this.comps = comps;
	}
	public double getYrds() {
		return yrds;
	}
	public void setYrds(double yrds) {
		this.yrds = yrds;
	}
	public double getTds() {
		return tds;
	}
	public void setTds(double tds) {
		this.tds = tds;
	}
	public double getInterceptions() {
		return interceptions;
	}
	public void setInterceptions(double interceptions) {
		this.interceptions = interceptions;
	}
	public void setCompCalc(double num) {
		compCalc = num;
	}
	public double getCompCalc() {
		return compCalc;
	}
	public void setYardsCalc(double num) {
		yrdsClac = num;
	}
	public double getYardsCalc() {
		return yrdsClac;
	}
	public void setTDCalc(double num) {
		tDPerc = num;
	}
	public double getTDCalc() {
		return tDPerc;
	}
	public void setIntcCalc(double num) {
		intcCalc = num;
	}
	public double getINtcClac() {
		return intcCalc;
	}
	public void setQBRating(double num) {
		qbRating = num;
	}
	public double getQBRating() {
		return qbRating;
	}
	
	public String getWarning() {
		return "You have not filled out \nthe information properly";
	}
	
	@Override
	public String toString() {
		return (getqBName()+" has a QB Passer Rating of " + 
	(Math.round(getQBRating() * 100.0)/100.0));
	}
	
	
}
