package com.visu.tutorial.employee;

import org.junit.Assert;
import org.junit.Test;

public class EmployeeImplTest {

    @Test
    public void testGetSalary() {
        EmployeeImpl worker = new EmployeeImpl(1000, "Ivan", "Ivanov");

        Assert.assertEquals(1000, worker.getSalary());
    }

    @Test
    public void testSetSalary() {
        EmployeeImpl worker = new EmployeeImpl(1000, "Ivan", "Ivanov");

        Assert.assertEquals(1000, worker.getSalary());
        worker.setSalary(1500);
        Assert.assertEquals(1500, worker.getSalary());
    }
}
