package com.training.inheritanceassignments.tests;

import static org.junit.Assert.*;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


import org.junit.Test;

import com.training.inheritanceassignments.DateMain;

/**
 * @author 
 *
 */
public class DateMainTest {

	/**
	 * @throws ParseException
	 */
	@Test
	public void testToPrintDateWithNoArgumentConstructor() throws ParseException {
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        Date date = formatter.parse("22-09-2018");
		DateMain dateMain = new DateMain();
		dateMain.setDate(date);
        Date actual=dateMain.getDate();
        assertEquals(date,actual);
		
		
	}
   /**
 * @throws ParseException
 */
@Test
   public void testToPrintDateUsingParameterizedArgumentConstructor() throws ParseException {
	        
	        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
	        Date date = formatter.parse("12-09-2019");
	        DateMain dateMain = new DateMain(date);
	        Date result = dateMain.getDate();
	        System.out.println(result);
	        assertEquals(date,result);
	        
	    }


	}
	 













