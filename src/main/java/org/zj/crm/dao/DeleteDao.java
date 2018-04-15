package org.zj.crm.dao;

import org.apache.ibatis.annotations.Delete;

public interface DeleteDao {
    /**
     * 删除部门
     */
    @Delete("delete from department where id=#{id}")
    boolean deleteDepartmentByID(int id);

    /**
     * 删除员工根据身份证号
     */
    @Delete("delete from employee where ID_card=#{ID_card")
    boolean deleteEmployee(int ID_card);

    /**
     * 删除员工根据姓名
     */
    @Delete("delete from employee where name=#{name}")
    boolean deleteEmployeeByName(String name);

    /**
     * 删除管理账号根据身份证号
     */
    @Delete("delete from manager_account where ID_card=#{ID_card}")
    boolean deleteManagerAccountByID(String ID_card);


}
