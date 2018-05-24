/**
 * 
 */
package CreditSuisse.RiskAnalysis;

import java.time.LocalDate;

/**
 * @author Yussef Guerrab
 *
 */
public class RowInfo {

	private LocalDate date;
	
	private double price;
	
	/**
	 * @return the date
	 */
	public LocalDate getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(LocalDate date) {
		this.date = date;
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	
}
