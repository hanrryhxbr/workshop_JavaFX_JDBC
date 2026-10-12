package com.romeryto.workshop_javafx_jdbc.model.services;

import com.romeryto.workshop_javafx_jdbc.model.entities.Department;

import java.util.ArrayList;
import java.util.List;

public class DepartmentService {

    public List<Department> findAll() {
        List<Department> list = new ArrayList<>();
        list.add(new Department(1, "Books"));
        list.add(new Department(2, "Computers"));
        list.add(new Department(3, "Eletronics"));

        return list;
    }
}
