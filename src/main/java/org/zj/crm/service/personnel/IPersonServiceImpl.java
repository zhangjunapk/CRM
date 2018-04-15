package org.zj.crm.service.personnel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zj.crm.bean.personnel.Employee;
import org.zj.crm.dao.DeleteDao;
import org.zj.crm.dao.InsertDao;
import org.zj.crm.dao.QueryDao;
import org.zj.crm.dao.UpdateDao;

import java.util.List;

@Service
public class IPersonServiceImpl implements IPersonService{

    @Autowired
    InsertDao insertDao;


    @Autowired
    DeleteDao deleteDao;

    @Autowired
    UpdateDao updateDao;

    @Autowired
    QueryDao queryDao;

    @Override
    public boolean deelteEmployee(int id) {
        return deleteDao.deleteEmployee(id);
    }

    @Override
    public boolean modifyEmployee(Employee employee) {
        return updateDao.updateEmployee(employee);
    }

    @Override
    public List<Employee> getAllEmployee() {
        return queryDao.selectAllEmployee();
    }

    @Override
    public Employee getEmployeeByID(int ID) {
        return queryDao.selectEmployeeByID(ID);
    }

    @Override
    public boolean insertEmployee(Employee employee) {
        return insertDao.insertEmployee(employee);
    }
}
