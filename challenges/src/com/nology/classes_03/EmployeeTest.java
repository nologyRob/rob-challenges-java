package com.nology.classes_03;



import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    public Employee employee;

    @BeforeEach
    void setUp() {
        int[] deals = {22000, 13000, 21000, 7500, 9000, 17000, 18000};
        Employee employee = new Employee("Adam", "Manager", 9, deals);
    }

    @Test
    void readyForPromotion() {
        boolean result = employee.readyForPromotion();
        assertTrue(result);
    }

    @Test
    void sumDeals() {
        int result = employee.sumDeals();
        assertEquals(107500, result);
    }

    @Test
    void qualifiesForBonus() {
        String result = employee.qualifiesForBonus();
        assertEquals("Well done, bonus awarded: 10750", result);
    }
}