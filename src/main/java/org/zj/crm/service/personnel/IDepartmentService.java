package org.zj.crm.service.personnel;

import org.zj.crm.bean.personnel.Department;

import java.util.List;

public interface IDepartmentService {
    /**
     * 创建部门
     */
    boolean createDeepartment(Department department);

    /**
     * 根据id删除部门
     * @param id
     * @return
     */
    boolean deleteDepartmentByID(int id);

    /**
     * 修改部门
     * @param department
     * @return
     */
    boolean modifyDepartment(Department department);

    /**
     * 让一个人加入部门
     * @param ID_card
     * @param departmentID
     * @return
     */
    boolean joinDepartment(String ID_card,int departmentID);

    /**
     * 根据id来获得部门
     */
    Department getDepartmentByID(int id);

    List<Department> getAllDepartment();
}
