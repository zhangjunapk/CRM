package org.zj.crm.dao;

import org.apache.ibatis.annotations.Select;
import org.zj.crm.bean.personnel.Department;
import org.zj.crm.bean.personnel.Employee;
import org.zj.crm.bean.personnel.JoinDepartmentHistory;
import org.zj.crm.bean.personnel.ManagerAccount;

import java.util.List;

public interface QueryDao {

    /**
     * 获得所有员工
     */
    @Select("select * from employee")
    List<Employee> selectAllEmployee();

    /**
     * 根据id来获得员工
     */
    @Select ("select * from employee where ID_card=#{ID_card}")
    Employee selectEmployeeByID(int ID_card);

    /**
     * 获得所有部门
     */
    @Select("select * from department")
    List<Department> selectAllDepartment();

    /**
     * 获得加入部门记录
     */
    @Select("select * from join_department_history")
    List<JoinDepartmentHistory> selectAllJoinDepartmentHistory();

    /**
     * 获得所有管理账号
     */
    @Select("selec * from manager_account")
    List<ManagerAccount> getAllManagerAccount();

    /**
     * 根据指定员工的id来获得加入部门的记录
     */
    @Select("select * from join_department_history where ID_card=#{ID_card}")
    JoinDepartmentHistory getJoinDepartmentHistoryByEmployeeID(int ID_card);

    /**
     * 根据部门ID来获得部门
     */
    @Select("select * from department where department_id=#{department_id}")
    Department selectDepartmentByID(int department_id);



}
