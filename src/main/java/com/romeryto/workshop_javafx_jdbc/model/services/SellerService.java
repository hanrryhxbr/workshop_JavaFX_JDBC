package com.romeryto.workshop_javafx_jdbc.model.services;

import com.romeryto.workshop_javafx_jdbc.model.dao.DaoFactory;
import com.romeryto.workshop_javafx_jdbc.model.dao.SellerDao;
import com.romeryto.workshop_javafx_jdbc.model.entities.Seller;

import java.util.List;

public class SellerService {

    SellerDao dao = DaoFactory.createSellerDao();

    public List<Seller> findAll() {
        return dao.findAll();
    }

    public void saveOrUpdate(Seller obj) {
        if (obj.getId() == null) {
            dao.insert(obj);
        }
        else {
            dao.update(obj);
        }
    }

    public void remove(Seller obj) {
        dao.deleteById(obj.getId());
    }
}
