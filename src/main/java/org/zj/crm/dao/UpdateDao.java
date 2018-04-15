package org.zj.crm.dao;

import org.apache.ibatis.annotations.Update;
import org.zj.crm.bean.personnel.Department;
import org.zj.crm.bean.personnel.Employee;
import org.zj.crm.bean.personnel.ManagerAccount;

public interface UpdateDao {

    /**
     * 更新员工信息
     */
    boolean updateEmployee(Employee employee);

    /**
     * 更新部门信息
     * @param department
     * @return
     */
    @Update("update department set name=#{name},info=#{info}")
    boolean updateDepartment(Department department);

    /**
     * 更新管理账号
     * @param managerAccount
     * @return
     */
    @Update("update manager_account set username=#{username},password=#{password}")
    boolean updateManagerAccount(ManagerAccount managerAccount);

}
