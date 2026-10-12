package com.romeryto.workshop_javafx_jdbc.model.services;

import com.romeryto.workshop_javafx_jdbc.model.dao.DaoFactory;
import com.romeryto.workshop_javafx_jdbc.model.dao.DepartmentDao;
import com.romeryto.workshop_javafx_jdbc.model.entities.Department;
import java.util.List;

public class DepartmentService {

    DepartmentDao dao = DaoFactory.createDepartmentDao();

    public List<Department> findAll() {
        return dao.findAll();
    }
}
