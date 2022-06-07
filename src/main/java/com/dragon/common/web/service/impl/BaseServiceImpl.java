package com.dragon.common.web.service.impl;


import com.dragon.common.web.mapper.BaseEntityMapper;

import java.util.List;

/**
 * @author dragon
 * @date 2022/5/31 15:12
 */
public abstract class BaseServiceImpl<T> {

    /**
     *
     * @return
     */
    protected abstract BaseEntityMapper getMapper();

    /**
     * 查询列表数据
     *
     * @param obj
     * @return
     */
    public List<T> selectList(T obj) {
        return getMapper().selectList(obj);
    }

    /**
     * 根据id查询数据
     *
     * @param id
     * @return
     */
    public T selectById(Long id) {
        return (T) getMapper().selectById(id);
    }

    /**
     * 根据id删除数据
     *
     * @param id
     * @return
     */
    public int deleteById(Long id) {
        return getMapper().deleteById(id);
    }

    /**
     * 新增数据
     *
     * @param obj
     * @return
     */
    public int insert(T obj) {
        return getMapper().insert(obj);
    }

    /**
     * 修改数据
     *
     * @param obj
     * @return
     */
    public int update(T obj) {
        return getMapper().update(obj);
    }

    /**
     * 根据ids查询数据
     *
     * @param ids
     * @return
     */
    public List<T> selectByIds(List<Long> ids) {
        return getMapper().selectByIds(ids);
    }
}
