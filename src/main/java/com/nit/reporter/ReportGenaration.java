package com.nit.reporter;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component("report")
public class ReportGenaration {

	/*
	  @Scheduled(initialDelay=2000,fixedDelay=3000)
	   public void reportGenerate() {
	  System.out.println("sales report of :"+new Date() ); }
	 */
	/*
	 @Scheduled(fixedDelayString="3000") public void reportGenerate() {
	 System.out.println("sales report of :"+new Date()); }
	 */
	@Scheduled(initialDelay=4000,fixedDelay=3000)
	public void reportGenerate() {
		System.out.println(" start Report sales1: "+new Date());
		try {
			Thread.sleep(4000);
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
		System.out.println("start Report sales1"+new  Date());
		System.out.println("****************************************");
	}
	@Scheduled(initialDelay=10000,fixedDelay=3000)
	public void reportGenerate2() {
		System.out.println(" start Report sales2: "+new Date());
		try {
			Thread.sleep(4000);
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
		System.out.println("start Report sales2"+new  Date());
	}
	
}
