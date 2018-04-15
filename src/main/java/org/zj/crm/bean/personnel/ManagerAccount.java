package org.zj.crm.bean.personnel;

import java.util.Date;

public class ManagerAccount {

    /**
     * +----------+-------------+------+-----+---------+-------+
     * | Field    | Type        | Null | Key | Default | Extra |
     * +----------+-------------+------+-----+---------+-------+
     * | ID_card  | varchar(20) | YES  |     | NULL    |       |
     * | username | varchar(20) | YES  |     | NULL    |       |
     * | password | varchar(20) | YES  |     | NULL    |       |
     * | date     | date        | YES  |     | NULL    |       |
     * +----------+-------------+------+-----+---------+-------+
     */

    private String ID_card;
    private String username;
    private String password;
    private Date date;

    public ManagerAccount() {
    }

    public String getID_card() {
        return ID_card;
    }

    public void setID_card(String ID_card) {
        this.ID_card = ID_card;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public ManagerAccount(String ID_card, String username, String password, Date date) {
        this.ID_card = ID_card;
        this.username = username;
        this.password = password;
        this.date = date;
    }
}
