package com.training.inheritanceassignments;

import java.util.Date;

/**
 * @author pripawar
 *
 */
public class DateMain {
	
	private Date date;
	

	/**
	 * constructor with no argument
	 */
	public DateMain()
	{
		super();
	}
	/**
	 * constructor with parameter which initialize the date
	 * @param date
	 */
	
	public DateMain(Date date) {
		this.date=date;
		
	}
    /**
     * @return Date
     */
    //setters and getters
	public Date getDate() {
		return date;
	}

	/**
	 * @param date
	 */
	public void setDate(Date date) {
		this.date = date;
	}
	

}
