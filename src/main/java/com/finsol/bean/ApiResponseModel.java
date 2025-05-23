package com.finsol.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ApiResponseModel<T> {
    private SummaryModel summary;
    private T responseData;

}



  