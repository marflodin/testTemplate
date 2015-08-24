package com.marflo.testtemplate.dao;

import com.marflo.testtemplate.entity.TestEntity;

import javax.ejb.Stateless;

@Stateless
public class TestDaoImpl extends EJBAbstractService<TestEntity, Long> implements TestDao {
    public TestDaoImpl() {
        super(TestEntity.class);
    }
}
