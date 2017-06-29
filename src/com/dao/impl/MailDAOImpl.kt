package com.dao.impl

import com.dao.MailDAO
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

class MailDAOImpl :MailDAO, JdbcDaoSupport() {
	private val LOGGER = LogManager.getLogger(MailDAOImpl::class.java.getName());
	
	override fun getToList():List<String>{
		var mailList = ArrayList<String>()
		var sql = "select email from booking_mail where 1 = 1 and PROGRAM_NAME = 'DO_DAILY_SALES' order by display_seq";
		
		try {
			//LOGGER.info(sql);
			var result = getJdbcTemplate().queryForList(sql, String::class.java);
			if(result is ArrayList<String>){
				mailList = result
			}
			
		} catch (ex:Exception) { 
			ex.printStackTrace();
//			LOGGER.info(ex.getMessage());
			//mailList.add("woottiphat.t@honda.co.th");
		}
		return mailList
	}
}