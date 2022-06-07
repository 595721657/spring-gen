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
@ApiModel(value="Comminfo对象", description="")
public class Comminfo extends BaseEntity {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "商品编号")
    @TableField("itemNo")
    private String itemNo;

    @ApiModelProperty(value = "商品名称")
    @TableField("itemName")
    private String itemName;

    @ApiModelProperty(value = "品牌")
    private String brand;

    @ApiModelProperty(value = "型号")
    private String model;

    @ApiModelProperty(value = "售价")
    @TableField("salePrice")
    private Integer salePrice;


}
