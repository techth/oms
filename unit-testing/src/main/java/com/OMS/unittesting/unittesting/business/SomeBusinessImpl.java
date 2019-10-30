package com.OMS.unittesting.unittesting.business;

public class SomeBusinessImpl {

	private SomeDataService someDataService;
	public int calculateSum(int[] data)
	{
		int sum = 0;
		for(int i: data) {
			sum+= i;
	}
		return sum;
	}
	public int calculateSumUsingDataService()
	{
		int[] data = someDataService.retrieveAllData();
		int sum = 0;
		for(int i: data) {
			sum+= i;
	}
		return sum;
	}
	public void setSomeDataService(SomeDataService someDataService) {
		this.someDataService = someDataService;
	}
}
