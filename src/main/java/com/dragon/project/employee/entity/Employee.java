package com.dragon.project.employee.entity;

import com.dragon.common.web.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.Version;
import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author dragon
 * @since 2022-06-02
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(value="Employee对象", description="")
public class Employee extends BaseEntity {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "员工号")
    @TableField("employeeNo")
    private String employeeNo;

    @ApiModelProperty(value = "员工姓名")
    @TableField("employeeName")
    private String employeeName;

    @ApiModelProperty(value = "性别")
    private String sex;

    @ApiModelProperty(value = "基本工资")
    @TableField("basePay")
    private Integer basePay;

    @ApiModelProperty(value = "职务")
    private String post;

    @ApiModelProperty(value = "密码")
    private String password;


}
