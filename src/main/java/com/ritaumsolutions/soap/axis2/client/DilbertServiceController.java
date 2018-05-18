package com.ritaumsolutions.soap.axis2.client;

import java.rmi.RemoteException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import net.gcomputer.webservices.DilbertStub;

@Controller
@EnableAutoConfiguration
public class DilbertServiceController {
	
	@RequestMapping("/todaysdilbert")
	@ResponseBody
	String todaysDilbert() throws RemoteException {
		DilbertStub stub = new DilbertStub();
		DilbertStub.TodaysDilbert request = new DilbertStub.TodaysDilbert();
		DilbertStub.TodaysDilbertResponse response = stub.todaysDilbert(request);
		return response.getTodaysDilbertResult();
	}
	
	@RequestMapping("/dailydilbert")
	@ResponseBody
	String dailyDilbert(@RequestParam(value="y") int year,@RequestParam(value="m") int month,@RequestParam(value="d") int day) throws RemoteException {
		DilbertStub stub = new DilbertStub();
		DilbertStub.DailyDilbert request = new DilbertStub.DailyDilbert();
		Calendar cal = GregorianCalendar.getInstance();
		cal.setTime(new Date(year, month, day));
		request.setADate(cal);
		DilbertStub.DailyDilbertResponse response = stub.dailyDilbert(request);
		return response.getDailyDilbertResult();
	}
	
}
