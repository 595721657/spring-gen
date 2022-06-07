package com.dragon.common.web.service;

import java.util.List;

/**
 * @author dragon
 * @date 2022/5/31 15:11
 */
public interface IBaseService<T> {
    /**
     * 查询列表数据
     *
     * @param obj
     * @return
     */
    List<T> selectList(T obj);

    /**
     * 根据id查询数据
     *
     * @param id
     * @return
     */
    T selectById(Long id);

    /**
     * 根据id删除数据
     *
     * @param id
     * @return
     */
    int deleteById(Long id);

    /**
     * 新增数据
     *
     * @param obj
     * @return
     */
    int insert(T obj);

    /**
     * 修改数据
     *
     * @param obj
     * @return
     */
    int update(T obj);

    /**
     * 根据ids查询数据
     *
     * @param ids
     * @return
     */
    List<T> selectByIds(List<Long> ids);
}
