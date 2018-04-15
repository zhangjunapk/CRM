package org.zj.crm.dao;

import org.apache.ibatis.annotations.Insert;
import org.zj.crm.bean.personnel.Department;
import org.zj.crm.bean.personnel.Employee;
import org.zj.crm.bean.personnel.JoinDepartmentHistory;
import org.zj.crm.bean.personnel.ManagerAccount;

public interface InsertDao {
    /**
     * 插入员工
     */
    @Insert("insert into employee(")
    boolean insertEmployee(Employee employee);
    /**
     * 插入员工加入部门的记录
     */
    @Insert("inset into join_department_history(ID_card,department_id,date) values(ID_card,department_id,date")
    boolean insertJoinDepartmentHistory(JoinDepartmentHistory joinDepartmentHistory);

    /**
     * 创建部门
     */
    @Insert("insert into department(id,name,info) values(id,name,info)")
    boolean insertDepartment(Department department);

    /**
     * 常见管理账号
     */
    @Insert("insert into manager_account(ID_card,username,password,date) values(#{ID_card},#{username},#{password},#{date})")
    boolean insertManagerAccount(ManagerAccount managerAccount);


}
