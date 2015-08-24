package com.marflo.testtemplate.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

public class EJBAbstractService<T, ID> implements GenericServiceDao<T, ID> {

    @PersistenceContext(unitName = "ApplicationDb")
    private EntityManager entityManager;
    private Class<T> persistentClass;

    public EJBAbstractService() {
    }

    public EJBAbstractService(Class<T> persistentClass) {
        this.persistentClass = persistentClass;
    }

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public T findById(ID id) {
        return entityManager.find(persistentClass, id);
    }

    public List<T> findAll() {
        Query query = createQuery("FROM " + persistentClass.getSimpleName());
        return query.getResultList();
    }

    public void remove(T entity) {
        entityManager.remove(entity);
    }

    public T persist(T entity) {
        entityManager.persist(entity);
        return entity;
    }

    public T saveOrUpdate(T entity) {
        return entityManager.merge(entity);
    }

    private Query createQuery(String theQuery) {
        return entityManager.createQuery(theQuery);
    }

    private Query createNamedQuery(String theNamedQuery) {
        return entityManager.createNamedQuery(theNamedQuery);
    }
}