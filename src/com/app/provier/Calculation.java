package com.app.provier;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class Calculation
{
	@WebMethod
	public int doSum(int x, int y)
	{
		return x+y;
	}
}
