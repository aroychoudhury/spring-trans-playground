package org.abhishek.tutorials.spring.transactions.model;

import java.util.Date;

public class User extends BaseObject {
    private static final long serialVersionUID = 4255157410505462958L;

    private Integer id;
    private String firstName;
    private String lastName;
    private Date birthday;

    /**
     * @return Returns the id.
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id The id to set.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return Returns the firstName.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName The firstName to set.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return Returns the lastName.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName The lastName to set.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return Returns this user's birthday
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * @param birthday The birthday to set.
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * @return Returns firstName and lastName
     */
    public String getFullName() {
        return firstName + ' ' + lastName;
    }
}