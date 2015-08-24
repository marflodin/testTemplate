package com.marflo.testtemplate.dao;

import com.marflo.testtemplate.entity.TestEntity;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class TestDaoTest extends DaoTestUtil {

    List<TestEntity> testEntities;

    @Before
    public void setup() {
        setupEntityManagerAndTransaction();
        getTransaction().begin();
        testEntities = setupTestEntities(1);
    }

    @After
    public void tearDown() {
        getTransaction().rollback();
    }

    @Test
    public void basicFindByIdTest() {
        TestEntity searchedTestEntity = givenExistingTestEntity();
        TestEntity returnedTestEntity = whenSearchingForTestEntityById(searchedTestEntity.getTestId());
        thenExpectedTestEntitygIsReturned(searchedTestEntity, returnedTestEntity);
    }

    private TestEntity givenExistingTestEntity() {
        return testEntities.get(0);
    }

    private TestEntity whenSearchingForTestEntityById(Long testId) {
        return getTestDao().findById(testId);
    }

    private void thenExpectedTestEntitygIsReturned(TestEntity searchedTestEntity, TestEntity returnedTestEntity) {
        assertTrue(searchedTestEntity.equals(returnedTestEntity));
    }
}
