package com.lin.validation.api;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * @Title: ValidationService
 * @Description:
 * @author: youqing
 * @version: 1.0
 * @date: 2018/6/22 17:17
 */
public interface ValidationService {
    void save(ValidationParameter parameter);

    void update(ValidationParameter parameter);

    void delete(@Min(1) long id, @NotNull @Size(min = 2, max = 16) @Pattern(regexp = "^[a-zA-Z]+$") String operator);

    @interface Save{

    }
    @interface Update {

    }
}
