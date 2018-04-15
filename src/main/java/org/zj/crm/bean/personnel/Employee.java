package org.zj.crm.bean.personnel;

import java.util.Date;

public class Employee {

    /**
     * +----------------+--------------+------+-----+---------+-------+
     * | ID_card        | varchar(20)  | YES  |     | NULL    |       |
     * | name           | varchar(20)  | YES  |     | NULL    |       |
     * | salary         | int(10)      | YES  |     | NULL    |       |
     * | telephone      | varchar(20)  | YES  |     | NULL    |       |
     * | location       | varchar(100) | YES  |     | NULL    |       |
     * | work_time_year | int(2)       | YES  |     | NULL    |       |
     * | join_date      | date         | YES  |     | NULL    |       |
     * | status         | varchar(10)  | YES  |     | NULL    |       |
     * | info           | text         | YES  |     | NULL    |       |
     * +------
     */

    private String ID_card;
    private String name;
    private int salary;
    private String telephone;
    private String location;
    private int work_time_year;
    private Date join_date;
    private String status;
    private String info;

    public Employee() {
    }

    public String getID_card() {
        return ID_card;
    }

    public void setID_card(String ID_card) {
        this.ID_card = ID_card;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getWork_time_year() {
        return work_time_year;
    }

    public void setWork_time_year(int work_time_year) {
        this.work_time_year = work_time_year;
    }

    public Date getJoin_date() {
        return join_date;
    }

    public void setJoin_date(Date join_date) {
        this.join_date = join_date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Employee(String ID_card, String name, int salary, String telephone, String location, int work_time_year, Date join_date, String status, String info) {
        this.ID_card = ID_card;
        this.name = name;
        this.salary = salary;
        this.telephone = telephone;
        this.location = location;
        this.work_time_year = work_time_year;
        this.join_date = join_date;
        this.status = status;
        this.info = info;
    }
}
