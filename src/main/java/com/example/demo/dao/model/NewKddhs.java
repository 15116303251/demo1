package com.example.demo.dao.model;

import java.util.Date;

public class NewKddhs {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column new_kddhs.id
     *
     * @mbg.generated Sat Mar 06 14:19:42 CST 2021
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column new_kddhs.kdgs
     *
     * @mbg.generated Sat Mar 06 14:19:42 CST 2021
     */
    private String kdgs;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column new_kddhs.kddhs
     *
     * @mbg.generated Sat Mar 06 14:19:42 CST 2021
     */
    private String kddhs;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column new_kddhs.isBackTaskName
     *
     * @mbg.generated Sat Mar 06 14:19:42 CST 2021
     */
    private String isbacktaskname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column new_kddhs.count
     *
     * @mbg.generated Sat Mar 06 14:19:42 CST 2021
     */
    private Integer count;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column new_kddhs.status
     *
     * @mbg.generated Sat Mar 06 14:19:42 CST 2021
     */
    private Integer status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column new_kddhs.phone
     *
     * @mbg.generated Sat Mar 06 14:19:42 CST 2021
     */
    private String phone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column new_kddhs.create_at
     *
     * @mbg.generated Sat Mar 06 14:19:42 CST 2021
     */
    private Date createAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column new_kddhs.update_at
     *
     * @mbg.generated Sat Mar 06 14:19:42 CST 2021
     */
    private Date updateAt;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column new_kddhs.id
     *
     * @return the value of new_kddhs.id
     *
     * @mbg.generated Sat Mar 06 14:19:42 CST 2021
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column new_kddhs.id
     *
     * @param id the value for new_kddhs.id
     *
     * @mbg.generated Sat Mar 06 14:19:42 CST 2021
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column new_kddhs.kdgs
     *
     * @return the value of new_kddhs.kdgs
     *
     * @mbg.generated Sat Mar 06 14:19:42 CST 2021
     */
    public String getKdgs() {
        return kdgs;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column new_kddhs.kdgs
     *
     * @param kdgs the value for new_kddhs.kdgs
     *
     * @mbg.generated Sat Mar 06 14:19:42 CST 2021
     */
    public void setKdgs(String kdgs) {
        this.kdgs = kdgs == null ? null : kdgs.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column new_kddhs.kddhs
     *
     * @return the value of new_kddhs.kddhs
     *
     * @mbg.generated Sat Mar 06 14:19:42 CST 2021
     */
    public String getKddhs() {
        return kddhs;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column new_kddhs.kddhs
     *
     * @param kddhs the value for new_kddhs.kddhs
     *
     * @mbg.generated Sat Mar 06 14:19:42 CST 2021
     */
    public void setKddhs(String kddhs) {
        this.kddhs = kddhs == null ? null : kddhs.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column new_kddhs.isBackTaskName
     *
     * @return the value of new_kddhs.isBackTaskName
     *
     * @mbg.generated Sat Mar 06 14:19:42 CST 2021
     */
    public String getIsbacktaskname() {
        return isbacktaskname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column new_kddhs.isBackTaskName
     *
     * @param isbacktaskname the value for new_kddhs.isBackTaskName
     *
     * @mbg.generated Sat Mar 06 14:19:42 CST 2021
     */
    public void setIsbacktaskname(String isbacktaskname) {
        this.isbacktaskname = isbacktaskname == null ? null : isbacktaskname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column new_kddhs.count
     *
     * @return the value of new_kddhs.count
     *
     * @mbg.generated Sat Mar 06 14:19:42 CST 2021
     */
    public Integer getCount() {
        return count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column new_kddhs.count
     *
     * @param count the value for new_kddhs.count
     *
     * @mbg.generated Sat Mar 06 14:19:42 CST 2021
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column new_kddhs.status
     *
     * @return the value of new_kddhs.status
     *
     * @mbg.generated Sat Mar 06 14:19:42 CST 2021
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column new_kddhs.status
     *
     * @param status the value for new_kddhs.status
     *
     * @mbg.generated Sat Mar 06 14:19:42 CST 2021
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column new_kddhs.phone
     *
     * @return the value of new_kddhs.phone
     *
     * @mbg.generated Sat Mar 06 14:19:42 CST 2021
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column new_kddhs.phone
     *
     * @param phone the value for new_kddhs.phone
     *
     * @mbg.generated Sat Mar 06 14:19:42 CST 2021
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column new_kddhs.create_at
     *
     * @return the value of new_kddhs.create_at
     *
     * @mbg.generated Sat Mar 06 14:19:42 CST 2021
     */
    public Date getCreateAt() {
        return createAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column new_kddhs.create_at
     *
     * @param createAt the value for new_kddhs.create_at
     *
     * @mbg.generated Sat Mar 06 14:19:42 CST 2021
     */
    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column new_kddhs.update_at
     *
     * @return the value of new_kddhs.update_at
     *
     * @mbg.generated Sat Mar 06 14:19:42 CST 2021
     */
    public Date getUpdateAt() {
        return updateAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column new_kddhs.update_at
     *
     * @param updateAt the value for new_kddhs.update_at
     *
     * @mbg.generated Sat Mar 06 14:19:42 CST 2021
     */
    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }
}