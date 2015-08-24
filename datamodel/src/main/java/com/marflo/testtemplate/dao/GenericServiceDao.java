package com.marflo.testtemplate.dao;

import javax.persistence.EntityManager;
import java.util.List;

public interface GenericServiceDao<T, ID> {
    void setEntityManager(EntityManager entityManager);
    T findById(ID id);
    List<T> findAll();
    void remove(T entity);
    T persist(T entity);
    T saveOrUpdate(T entity);
}
