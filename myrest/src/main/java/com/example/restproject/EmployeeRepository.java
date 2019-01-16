
package com.example.restproject;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.restproject.model.Employee;

interface EmployeeRepository extends JpaRepository<Employee, Long> {

}	