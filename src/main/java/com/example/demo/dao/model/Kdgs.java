package com.example.demo.dao.model;

import java.util.Date;

public class Kdgs {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column kdgs.id
     *
     * @mbg.generated Sat Mar 06 13:35:50 CST 2021
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column kdgs.kdgs_no
     *
     * @mbg.generated Sat Mar 06 13:35:50 CST 2021
     */
    private String kdgsNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column kdgs.kdgs_cn
     *
     * @mbg.generated Sat Mar 06 13:35:50 CST 2021
     */
    private String kdgsCn;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column kdgs.status
     *
     * @mbg.generated Sat Mar 06 13:35:50 CST 2021
     */
    private Integer status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column kdgs.create_at
     *
     * @mbg.generated Sat Mar 06 13:35:50 CST 2021
     */
    private Date createAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column kdgs.update_at
     *
     * @mbg.generated Sat Mar 06 13:35:50 CST 2021
     */
    private Date updateAt;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column kdgs.id
     *
     * @return the value of kdgs.id
     *
     * @mbg.generated Sat Mar 06 13:35:50 CST 2021
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column kdgs.id
     *
     * @param id the value for kdgs.id
     *
     * @mbg.generated Sat Mar 06 13:35:50 CST 2021
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column kdgs.kdgs_no
     *
     * @return the value of kdgs.kdgs_no
     *
     * @mbg.generated Sat Mar 06 13:35:50 CST 2021
     */
    public String getKdgsNo() {
        return kdgsNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column kdgs.kdgs_no
     *
     * @param kdgsNo the value for kdgs.kdgs_no
     *
     * @mbg.generated Sat Mar 06 13:35:50 CST 2021
     */
    public void setKdgsNo(String kdgsNo) {
        this.kdgsNo = kdgsNo == null ? null : kdgsNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column kdgs.kdgs_cn
     *
     * @return the value of kdgs.kdgs_cn
     *
     * @mbg.generated Sat Mar 06 13:35:50 CST 2021
     */
    public String getKdgsCn() {
        return kdgsCn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column kdgs.kdgs_cn
     *
     * @param kdgsCn the value for kdgs.kdgs_cn
     *
     * @mbg.generated Sat Mar 06 13:35:50 CST 2021
     */
    public void setKdgsCn(String kdgsCn) {
        this.kdgsCn = kdgsCn == null ? null : kdgsCn.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column kdgs.status
     *
     * @return the value of kdgs.status
     *
     * @mbg.generated Sat Mar 06 13:35:50 CST 2021
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column kdgs.status
     *
     * @param status the value for kdgs.status
     *
     * @mbg.generated Sat Mar 06 13:35:50 CST 2021
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column kdgs.create_at
     *
     * @return the value of kdgs.create_at
     *
     * @mbg.generated Sat Mar 06 13:35:50 CST 2021
     */
    public Date getCreateAt() {
        return createAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column kdgs.create_at
     *
     * @param createAt the value for kdgs.create_at
     *
     * @mbg.generated Sat Mar 06 13:35:50 CST 2021
     */
    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column kdgs.update_at
     *
     * @return the value of kdgs.update_at
     *
     * @mbg.generated Sat Mar 06 13:35:50 CST 2021
     */
    public Date getUpdateAt() {
        return updateAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column kdgs.update_at
     *
     * @param updateAt the value for kdgs.update_at
     *
     * @mbg.generated Sat Mar 06 13:35:50 CST 2021
     */
    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }
}