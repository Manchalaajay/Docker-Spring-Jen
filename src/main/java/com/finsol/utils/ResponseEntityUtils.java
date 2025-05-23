package com.finsol.utils;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.finsol.bean.ApiResponseModel;
import com.finsol.bean.SummaryModel;

public class ResponseEntityUtils {

	public static <T> ResponseEntity<Object> createResponse(HttpStatus httpstatus,String msgstatus,String msgcode, T data) {
		SummaryModel summary = SummaryUtils.createSummary(msgstatus, msgcode);
		if (httpstatus == HttpStatus.OK) {

			ApiResponseModel<T>	 responseModel = new ApiResponseModel<>(summary, data);
			return ResponseEntity.status(httpstatus).body(responseModel);
		} else {
			ApiResponseModel<T> errorResponse = new ApiResponseModel<>(summary, null);
			return ResponseEntity.status(httpstatus).body(errorResponse);
		}
	}
	private ResponseEntityUtils()
	{
	
	}

}
