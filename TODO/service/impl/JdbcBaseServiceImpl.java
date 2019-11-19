package com.hzero.demo.springmvc.service.impl;

import com.hzero.demo.springmvc.dao1.JdbcBaseDao;
import com.hzero.demo.springmvc.service1.JdbcBaseService;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public abstract class JdbcBaseServiceImpl<T> implements JdbcBaseService<T> {

    protected abstract JdbcBaseDao<T> jdbcDao();

    @Override
    public void save(T entity) {
        jdbcDao().save(entity);
    }

    @Override
    public void update(T entity) {
        jdbcDao().update(entity);
    }

    @Override
    public void delete(T entity) {
        jdbcDao().delete(entity);
    }

    @Override
    public void delete(Serializable id) {
        jdbcDao().delete(id);
    }

    @Override
    public void deleteAll() {
        jdbcDao().deleteAll();
    }

    @Override
    public T findById(Serializable id) {
        return jdbcDao().findById(id);
    }

    @Override
    public List<T> findAll() {
        return jdbcDao().findAll();
    }

    @Override
    public void batchDelete(Serializable[] ids) {
        jdbcDao().batchDelete(ids);
    }

    @Override
    public void batchUpdate(List<T> list) {
        jdbcDao().batchUpdate(list);
    }

    @Override
    public void batchSave(List<T> list) {
        jdbcDao().batchSave(list);
    }

    @Override
    public abstract Map<String, Object> findOne(Object... args);

    @Override
    public abstract List<Map<String, Object>> findListMap(Object... args);

}
