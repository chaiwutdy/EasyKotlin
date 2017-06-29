package com.dao.impl

import com.dao.DummyDAORpt
import org.springframework.jdbc.core.support.JdbcDaoSupport

class DummyRptDAOImpl : DummyDAORpt ,JdbcDaoSupport() {
	override fun getReportData():String{
		var result = "";
		try {
			var sql = StringBuffer();
			sql.append("SELECT 'HELLO WORLD' FROM DUAL ");
			result = getJdbcTemplate().queryForObject(sql.toString(), String::class.java)
		} catch (e:Exception) { 
			e.printStackTrace();
		}
		return result;
	}
	
}