package com.training.rakuten;

import java.util.Calendar;
/*
 * We have been asked to create Helpdesk to assist employees
 * But this should be operational only FROM Monday to Friday ( 9-5)
 * Write test case to check this
 */
public class HelpDesk {

	public final static int EOB_HOUR = 17;
	public final static int SOB_HOUR = 9;
	public boolean willHandleIssue(int dayOfTheWeek, int time) {
		Calendar cal = Calendar.getInstance();
		
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		if (Calendar.SUNDAY == dayOfTheWeek || Calendar.SATURDAY == dayOfTheWeek) {
			return false;
		}
		if (time<SOB_HOUR || time > EOB_HOUR) {
			return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		HelpDesk d = new HelpDesk();
		System.out.println(d.willHandleIssue(2,10));	 // will return true. 
	}
}