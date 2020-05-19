package com.example.as.Collection.Map;

import java.util.HashMap;
import java.util.Map;

public class CRUD {

    /*
    Use a map to simulate database table, key should be the primary key (assume only one column), value is the record,
    your simulation should include CRUD operation methods
     */

    Map<Integer,String> employees = new HashMap<>();

    public void addEmployee(Employee employee){
        employees.put(employee.getId(),employee.getName());
    }
    public void deleteEmployee(Employee employee){
        for (Integer id: employees.keySet()){
            if (id == employee.getId()){
                employees.remove(id);
            }
        }
    }
    public void changeEmployee(Employee employee){
        if (employees.containsKey(employee.getId())){
            employees.put(employee.getId(),employee.getName());
        }
    }
    public Employee findEmployee(int employeeID){
        if(employees.containsKey(employeeID)){
            Employee e = new Employee();
            e.setId(employeeID);
            e.setName(employees.get(employeeID));
            return e;
        }
        return null;
    }
}
