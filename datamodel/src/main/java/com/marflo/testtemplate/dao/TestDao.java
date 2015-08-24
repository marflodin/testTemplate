package com.marflo.testtemplate.dao;

import com.marflo.testtemplate.entity.TestEntity;

import javax.ejb.Local;

@Local
public interface TestDao extends GenericServiceDao<TestEntity, Long> {
}
