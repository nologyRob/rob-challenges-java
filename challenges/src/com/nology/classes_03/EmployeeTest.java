package com.nology.classes_03;



import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    public Employee employee;

    @BeforeEach
    void setUp() {
        int[] deals = {22000, 13000, 21000, 7500, 9000, 17000, 18000};
        this.employee = new Employee("Adam", "Manager", 9, deals);
    }

    @Test
    void isPromotable_ValidPromotion_ReturnsTrue() {
        boolean result = this.employee.isPromotable();
        assertTrue(result);

        int[] deals = {1500, 2000};
        Employee employee2 = new Employee("John", "Doe", 5, deals);
        assertFalse(employee2.isPromotable());
    }

    @Test
    void calculateCompletedDealsSum_ValidDeals_ReturnsSumOfDeals() {
        int result = this.employee.calculateCompletedDealsSum();
        assertEquals(107500, result);
    }

    @Test
    void hasBonusQualification_ValidBonus_ReturnsCorrectMessage() {
        Boolean result = this.employee.hasBonusQualification();
        assertTrue(result);

        int[] deals = {1500, 2000};
        Employee employee2 = new Employee("John", "Doe", 9, deals);
        assertFalse(employee2.hasBonusQualification());
    }
}