package com.finsol.service;

import java.lang.reflect.InvocationTargetException;
import java.util.Optional;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finsol.bean.EmployeeSalaryDetailsBean;
import com.finsol.entity.EmployeeSalaryDetailsEntity;
import com.finsol.repository.EmployeeSalaryDetailsRepository;

@Service
public class EmployeeSalaryService {
@Autowired
    private  EmployeeSalaryDetailsRepository employeeSalaryDetailsRepository;

  
    public EmployeeSalaryDetailsEntity save(EmployeeSalaryDetailsBean employeeSalaryDetailsBean)  {
    	EmployeeSalaryDetailsEntity employeeSalaryDetailsEntity=new EmployeeSalaryDetailsEntity();
    	try {
			BeanUtils.copyProperties(employeeSalaryDetailsEntity, employeeSalaryDetailsBean);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return employeeSalaryDetailsRepository.save(employeeSalaryDetailsEntity);
    }

    

    public EmployeeSalaryDetailsBean getById(Integer eCode) {
        Optional<EmployeeSalaryDetailsEntity> entityOptional = employeeSalaryDetailsRepository.findById(eCode);

        if (entityOptional.isEmpty()) {
            return null; // or throw custom exception, or Optional.empty()
        }

        EmployeeSalaryDetailsBean employeeSalaryDetailsBean = new EmployeeSalaryDetailsBean();
        try {
            BeanUtils.copyProperties(employeeSalaryDetailsBean, entityOptional.get());
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException("Failed to copy properties from entity to bean", e);
        }

        return employeeSalaryDetailsBean;
    }

}
