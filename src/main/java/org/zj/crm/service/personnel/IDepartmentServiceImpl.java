package org.zj.crm.service.personnel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zj.crm.bean.personnel.Department;
import org.zj.crm.bean.personnel.JoinDepartmentHistory;
import org.zj.crm.dao.DeleteDao;
import org.zj.crm.dao.InsertDao;
import org.zj.crm.dao.QueryDao;
import org.zj.crm.dao.UpdateDao;

import java.util.Date;
import java.util.List;

@Service
public class IDepartmentServiceImpl implements IDepartmentService {

    @Autowired
    InsertDao insertDao;


    @Autowired
    DeleteDao deleteDao;

    @Autowired
    UpdateDao updateDao;

    @Autowired
    QueryDao queryDao;
    @Override
    public boolean createDeepartment(Department department) {
        return insertDao.insertDepartment(department);
    }

    @Override
    public boolean deleteDepartmentByID(int id) {
        return deleteDao.deleteDepartmentByID(id);
    }

    @Override
    public boolean modifyDepartment(Department department) {
        return updateDao.updateDepartment(department);
    }

    @Override
    public boolean joinDepartment(String ID_card, int departmentID) {
        return insertDao.insertJoinDepartmentHistory(new JoinDepartmentHistory(ID_card,departmentID,new Date()));
    }

    @Override
    public Department getDepartmentByID(int id) {
        return queryDao.selectDepartmentByID(id);
    }

    @Override
    public List<Department> getAllDepartment() {
        return null;
    }
}
