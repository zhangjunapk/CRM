package org.zj.crm.service.personnel;


import org.zj.crm.bean.personnel.Employee;

import java.util.List;

public interface IPersonService {

    /**
     *删除一个员工
     */
    boolean deelteEmployee(int id);

    /**
     * 修改员工
     */

    boolean modifyEmployee(Employee employee );

    /**
     * 查找所有员工
     */
    List<Employee> getAllEmployee();


    /**
     *  根据id来查找员工
     */
    Employee getEmployeeByID(int ID);

    boolean insertEmployee(Employee employee);
}
