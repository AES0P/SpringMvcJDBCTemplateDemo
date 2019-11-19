package com.hzero.demo.springmvc.service;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public interface JdbcBaseService<T> {

    void save(T entity);

    void update(T entity);

    void delete(T entity);

    void delete(Serializable id);

    void deleteAll();

    T findById(Serializable id);

    List<T> findAll();

    void batchDelete(Serializable[] ids);

    void batchUpdate(List<T> list);

    void batchSave(List<T> list);

    Map<String, Object> findOne(Object... args);

    List<Map<String, Object>> findListMap(Object... args);
}
