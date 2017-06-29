package com.run

import com.dao.DummyDAORpt
import com.dao.impl.DummyRptDAOImpl
import com.dao.impl.MailDAOImpl
import com.utils.Utils

class RunTest {
	
}
fun main(args: Array<String>) {
	var dummyRptDAO = Utils.APP_CONTEXT.getBean("dummyRptDAO");
	var dummyRptDAO2 = Utils().APP_CONTEXT2.getBean("dummyRptDAO");
	
	//	dummyRptDAO.get
	if(dummyRptDAO is DummyRptDAOImpl){
		println(dummyRptDAO.getReportData())
	}
	
	if(dummyRptDAO2 is DummyRptDAOImpl){
		println("test: ${dummyRptDAO2.getReportData()}")
	}
	
	var mailDAO = Utils.APP_CONTEXT.getBean("mailDAO") as MailDAOImpl;
	var toList = mailDAO.getToList()
		for(to in toList){
			println("to: ${to}")
		}
	/*if(mailDAO is MailDAOImpl){
			var toList = mailDAO.getToList()
			for(to in toList){
				println("to: ${to}")
			}
	}*/
	
	var d : DummyDAORpt
	d = dummyRptDAO as DummyRptDAOImpl

	println("test is ${d.getReportData()}")
//	MailDAOImpl as
	
}