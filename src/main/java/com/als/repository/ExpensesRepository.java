package com.als.repository;

import com.als.entity.EmployeeExpenses;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpensesRepository extends JpaRepository<EmployeeExpenses, Long> {
}
