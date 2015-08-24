package com.marflo.testtemplate.dao;

import com.marflo.testtemplate.entity.TestEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public abstract class DaoTestUtil {

    private EntityTransaction transaction;
    private EntityManager entityManager;
    private TestDao testDao;

    public void setupEntityManagerAndTransaction() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("TestDb");
        entityManager = factory.createEntityManager();
        transaction = entityManager.getTransaction();
    }

    public EntityTransaction getTransaction() {
        return transaction;
    }

    private void initializeTestDao() {
        testDao = new TestDaoImpl();
        testDao.setEntityManager(entityManager);
    }

    public TestDao getTestDao() {
        if (testDao == null)
            initializeTestDao();
        return testDao;
    }

    public List<TestEntity> setupTestEntities(Integer numberOfEntities) {
        List<TestEntity> testEntities = new ArrayList<TestEntity>();
        for (Integer counter = 0; counter < numberOfEntities; counter++)
            testEntities.add(setupTestEntity());
        return testEntities;
    }

    private TestEntity setupTestEntity() {
        TestEntity testEntity = new TestEntity();
        return  getTestDao().persist(testEntity);
    }

}
