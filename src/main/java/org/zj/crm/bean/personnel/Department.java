package org.zj.crm.bean.personnel;

public class Department {


    /**
     * | id    | int(10)  | YES  |     | NULL    |       |
     * | name  | tinytext | YES  |     | NULL    |       |
     * | info  | text     | YES  |     | NULL    |       |
     * +-------+----------+------+-----+---------+-------+
     */

    private int id;
    private String name;
    private String info;

    public Department() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Department(int id, String name, String info) {
        this.id = id;
        this.name = name;
        this.info = info;
    }
}
