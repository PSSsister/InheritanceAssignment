package com.training.inheritanceassignments;

import java.util.Date;

public class DateMain {
	
	private Date date;
	
	//constructor with no argument
	public DateMain()
	{
		super();
	}
	//constructor with parameter
	public DateMain(Date date) {
		this.date=date;
		// TODO Auto-generated constructor stub
	}
    //setters and getters
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	

}
