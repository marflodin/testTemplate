package com.marflo.testtemplate.entity;

import javax.persistence.*;

@Entity
@Table(name = "TEST")
@NamedQueries({

})
public class TestEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TestId", unique = true)
    private Long testId;
    @Column(name = "TestName")
    private String testName;

    public Long getTestId() {
        return testId;
    }

    public void setTestId(Long testId) {
        this.testId = testId;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }
}
