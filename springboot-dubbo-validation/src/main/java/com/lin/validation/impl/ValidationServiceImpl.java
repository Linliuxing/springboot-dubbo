package com.lin.validation.impl;

import com.lin.validation.api.ValidationParameter;
import com.lin.validation.api.ValidationService;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * @Title: ValidationServiceImpl
 * @Description:
 * @author: youqing
 * @version: 1.0
 * @date: 2018/6/22 17:22
 */
public class ValidationServiceImpl implements ValidationService {
    @Override
    public void save(ValidationParameter parameter) {

    }

    @Override
    public void update(ValidationParameter parameter) {

    }

    @Override
    public void delete(@Min(1) long id, @NotNull @Size(min = 2, max = 16) @Pattern(regexp = "^[a-zA-Z]+$") String operator) {

    }
}
