package com.dragon.project.employee.service.impl;


import com.dragon.common.web.mapper.BaseEntityMapper;
import com.dragon.common.web.service.impl.BaseServiceImpl;
import com.dragon.project.employee.entity.Employee;
import com.dragon.project.employee.service.IEmployeeService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author dragon
 * @since 2022-06-02
 */
@Service
public class EmployeeServiceImpl extends BaseServiceImpl<Employee> implements IEmployeeService {

    @Override
    protected BaseEntityMapper getMapper() {
        return null;
    }
}
