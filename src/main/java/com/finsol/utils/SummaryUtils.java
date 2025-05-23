package com.finsol.utils;

import com.finsol.bean.SummaryModel;

public class SummaryUtils {
	private SummaryUtils()
	{
		
	}

	public static SummaryModel createSummary(String status, String msgCode) {
		return new SummaryModel(status, msgCode);
	}
	

}






