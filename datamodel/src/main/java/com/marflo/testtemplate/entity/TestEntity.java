package com.marflo.testtemplate.entity;

import javax.persistence.*;

@Entity
@Table(name = "test")
@NamedQueries({

})
public class TestEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TestId", unique = true)
    private Long testId;

    public Long getTestId() {
        return testId;
    }

    public void setTestId(Long testId) {
        this.testId = testId;
    }
}
