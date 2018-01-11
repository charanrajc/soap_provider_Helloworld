package com.app.provier;

import javax.xml.ws.Endpoint;

public class CalculationPublisher 
{
	public static void main(String[] args) 
	{
		String addr="http://localhost:8096/sample";
		Calculation calculation=new Calculation();
		Endpoint.publish(addr, calculation);
		System.out.println("Hello world");
	}
}
