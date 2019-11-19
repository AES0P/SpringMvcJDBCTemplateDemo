package com.hzero.demo.springmvc.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public interface JdbcBaseDao<T> {

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

    Map<String, Object> findOne(String sql, Object... args);

    List<Map<String, Object>> findListMap(String sql, Object... args);

    void execSQL(String sql);

    SqlRowSet rowSet(String sql, Object... args);

    JdbcTemplate getJdbcTemplate();

}
