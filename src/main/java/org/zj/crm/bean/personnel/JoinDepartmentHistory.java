package org.zj.crm.bean.personnel;

import java.util.Date;

public class JoinDepartmentHistory {

    /**
     * +---------------+-------------+------+-----+---------+-------+
     * | ID_card       | varchar(20) | YES  |     | NULL    |       |
     * | department_id | int(10)     | YES  |     | NULL    |       |
     * | date          | date        | YES  |     | NULL    |       |
     * +---------------+-------------+------+-----+---------+-------+
     */

    private String ID_card;
    private int department_id;
    private Date date;

    public JoinDepartmentHistory() {
    }

    public String getID_card() {
        return ID_card;
    }

    public void setID_card(String ID_card) {
        this.ID_card = ID_card;
    }

    public int getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(int department_id) {
        this.department_id = department_id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public JoinDepartmentHistory(String ID_card, int department_id, Date date) {
        this.ID_card = ID_card;
        this.department_id = department_id;
        this.date = date;
    }
}
