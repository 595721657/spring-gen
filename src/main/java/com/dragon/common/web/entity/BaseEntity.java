package com.dragon.common.web.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author dragon
 * @date 2022/5/31 15:22
 */
@Data
public class BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private String createBy;
    private Data createByTime;
    private String updateBy;
    private Data updateByTime;
    private Boolean deleted;
}
