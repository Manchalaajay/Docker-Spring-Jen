package com.finsol.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.finsol.bean.EmployeeSalaryDetailsBean;
import com.finsol.service.EmployeeSalaryService;
import com.finsol.utils.ResponseEntityUtils;

import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
@Slf4j
@RestController
@RequestMapping("/api/employees")
public class EmployeeSalaryController {
@Autowired
    private  EmployeeSalaryService employeeSalaryService;

 


@PostMapping("/sample")
public String getStatus()
{
	return "welocme to our project";
}
  
    @PostMapping("/saveemployeesalary")
    public ResponseEntity<Object> saveEmployeeSalaryDetails(
            @RequestBody  @Valid EmployeeSalaryDetailsBean employeeSalaryDetailsBean,
            BindingResult bindingResult) {

        String statusCode;
        String messageCode;
        HttpStatus httpStatus;

        try {
            log.debug("Starting to save employee salary details.");

            if (bindingResult.hasErrors()) {
                log.debug("Validation failed for employee salary details.");
                statusCode = "08";
                messageCode ="FAILURE_EMPLOYEE_SAVE";
                httpStatus = HttpStatus.FORBIDDEN;
                return ResponseEntityUtils.createResponse(httpStatus, statusCode, messageCode, "Employee record valadation failed");
            }

            employeeSalaryService.save(employeeSalaryDetailsBean);

            log.debug("Employee salary details saved successfully.");
            statusCode = "00";
            messageCode = "SUCCESS_EMPLOYEE_SAVE";
            httpStatus = HttpStatus.OK;

            return ResponseEntityUtils.createResponse(httpStatus, statusCode, messageCode, "Employee record saved successfully.");

        } catch (Exception e) {
            log.error("Error saving employee salary details: {}", e.getMessage());
            httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
            statusCode ="08";
            messageCode ="FAILURE_EMPLOYEE_SAVE";
            return ResponseEntityUtils.createResponse(httpStatus, statusCode, messageCode, null);
        }
    }


   
    // Get by eCode
    @PostMapping("/getemployeesalary")
    public ResponseEntity<Object> getEmployeeById(@RequestBody EmployeeSalaryDetailsBean employeeSalaryDetailsBean) {
        String statusCode;
        String messageCode;
        HttpStatus httpStatus;
        EmployeeSalaryDetailsBean resultBean = null;

        try {
            log.debug("Fetching salary details for employee code: {}", employeeSalaryDetailsBean.getId());

            resultBean = employeeSalaryService.getById(employeeSalaryDetailsBean.getId());

            if (resultBean == null) {
                messageCode = "EMPLOYEE_NOT_FOUND";
                httpStatus = HttpStatus.OK; // Or HttpStatus.NOT_FOUND depending on business need
                statusCode = "00";
                log.info("No employee salary details found for code: {}", employeeSalaryDetailsBean.getId());
            } else {
                messageCode = "EMPLOYEE_FOUND_SUCCESSFULLY";
                httpStatus = HttpStatus.OK;
                statusCode = "00";
                log.info("Employee salary details found for code {}: {}", employeeSalaryDetailsBean.getId(), resultBean);
            }

            return ResponseEntityUtils.createResponse(httpStatus, statusCode, messageCode, resultBean);

        } catch (Exception e) {
            log.error("Error fetching employee salary details for code {}: {}", 
                      employeeSalaryDetailsBean.getId(), e.getMessage());

            httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
            statusCode = "08";
            messageCode = "EMPLOYEE_FETCH_ERROR";

            return ResponseEntityUtils.createResponse(httpStatus, statusCode, messageCode, "");
        }
    }

}
