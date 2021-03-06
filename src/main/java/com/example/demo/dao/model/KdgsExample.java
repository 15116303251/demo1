package com.example.demo.dao.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class KdgsExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table kdgs
     *
     * @mbg.generated Sat Mar 06 13:35:50 CST 2021
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table kdgs
     *
     * @mbg.generated Sat Mar 06 13:35:50 CST 2021
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table kdgs
     *
     * @mbg.generated Sat Mar 06 13:35:50 CST 2021
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kdgs
     *
     * @mbg.generated Sat Mar 06 13:35:50 CST 2021
     */
    public KdgsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kdgs
     *
     * @mbg.generated Sat Mar 06 13:35:50 CST 2021
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kdgs
     *
     * @mbg.generated Sat Mar 06 13:35:50 CST 2021
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kdgs
     *
     * @mbg.generated Sat Mar 06 13:35:50 CST 2021
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kdgs
     *
     * @mbg.generated Sat Mar 06 13:35:50 CST 2021
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kdgs
     *
     * @mbg.generated Sat Mar 06 13:35:50 CST 2021
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kdgs
     *
     * @mbg.generated Sat Mar 06 13:35:50 CST 2021
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kdgs
     *
     * @mbg.generated Sat Mar 06 13:35:50 CST 2021
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kdgs
     *
     * @mbg.generated Sat Mar 06 13:35:50 CST 2021
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kdgs
     *
     * @mbg.generated Sat Mar 06 13:35:50 CST 2021
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kdgs
     *
     * @mbg.generated Sat Mar 06 13:35:50 CST 2021
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table kdgs
     *
     * @mbg.generated Sat Mar 06 13:35:50 CST 2021
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andKdgsNoIsNull() {
            addCriterion("kdgs_no is null");
            return (Criteria) this;
        }

        public Criteria andKdgsNoIsNotNull() {
            addCriterion("kdgs_no is not null");
            return (Criteria) this;
        }

        public Criteria andKdgsNoEqualTo(String value) {
            addCriterion("kdgs_no =", value, "kdgsNo");
            return (Criteria) this;
        }

        public Criteria andKdgsNoNotEqualTo(String value) {
            addCriterion("kdgs_no <>", value, "kdgsNo");
            return (Criteria) this;
        }

        public Criteria andKdgsNoGreaterThan(String value) {
            addCriterion("kdgs_no >", value, "kdgsNo");
            return (Criteria) this;
        }

        public Criteria andKdgsNoGreaterThanOrEqualTo(String value) {
            addCriterion("kdgs_no >=", value, "kdgsNo");
            return (Criteria) this;
        }

        public Criteria andKdgsNoLessThan(String value) {
            addCriterion("kdgs_no <", value, "kdgsNo");
            return (Criteria) this;
        }

        public Criteria andKdgsNoLessThanOrEqualTo(String value) {
            addCriterion("kdgs_no <=", value, "kdgsNo");
            return (Criteria) this;
        }

        public Criteria andKdgsNoLike(String value) {
            addCriterion("kdgs_no like", value, "kdgsNo");
            return (Criteria) this;
        }

        public Criteria andKdgsNoNotLike(String value) {
            addCriterion("kdgs_no not like", value, "kdgsNo");
            return (Criteria) this;
        }

        public Criteria andKdgsNoIn(List<String> values) {
            addCriterion("kdgs_no in", values, "kdgsNo");
            return (Criteria) this;
        }

        public Criteria andKdgsNoNotIn(List<String> values) {
            addCriterion("kdgs_no not in", values, "kdgsNo");
            return (Criteria) this;
        }

        public Criteria andKdgsNoBetween(String value1, String value2) {
            addCriterion("kdgs_no between", value1, value2, "kdgsNo");
            return (Criteria) this;
        }

        public Criteria andKdgsNoNotBetween(String value1, String value2) {
            addCriterion("kdgs_no not between", value1, value2, "kdgsNo");
            return (Criteria) this;
        }

        public Criteria andKdgsCnIsNull() {
            addCriterion("kdgs_cn is null");
            return (Criteria) this;
        }

        public Criteria andKdgsCnIsNotNull() {
            addCriterion("kdgs_cn is not null");
            return (Criteria) this;
        }

        public Criteria andKdgsCnEqualTo(String value) {
            addCriterion("kdgs_cn =", value, "kdgsCn");
            return (Criteria) this;
        }

        public Criteria andKdgsCnNotEqualTo(String value) {
            addCriterion("kdgs_cn <>", value, "kdgsCn");
            return (Criteria) this;
        }

        public Criteria andKdgsCnGreaterThan(String value) {
            addCriterion("kdgs_cn >", value, "kdgsCn");
            return (Criteria) this;
        }

        public Criteria andKdgsCnGreaterThanOrEqualTo(String value) {
            addCriterion("kdgs_cn >=", value, "kdgsCn");
            return (Criteria) this;
        }

        public Criteria andKdgsCnLessThan(String value) {
            addCriterion("kdgs_cn <", value, "kdgsCn");
            return (Criteria) this;
        }

        public Criteria andKdgsCnLessThanOrEqualTo(String value) {
            addCriterion("kdgs_cn <=", value, "kdgsCn");
            return (Criteria) this;
        }

        public Criteria andKdgsCnLike(String value) {
            addCriterion("kdgs_cn like", value, "kdgsCn");
            return (Criteria) this;
        }

        public Criteria andKdgsCnNotLike(String value) {
            addCriterion("kdgs_cn not like", value, "kdgsCn");
            return (Criteria) this;
        }

        public Criteria andKdgsCnIn(List<String> values) {
            addCriterion("kdgs_cn in", values, "kdgsCn");
            return (Criteria) this;
        }

        public Criteria andKdgsCnNotIn(List<String> values) {
            addCriterion("kdgs_cn not in", values, "kdgsCn");
            return (Criteria) this;
        }

        public Criteria andKdgsCnBetween(String value1, String value2) {
            addCriterion("kdgs_cn between", value1, value2, "kdgsCn");
            return (Criteria) this;
        }

        public Criteria andKdgsCnNotBetween(String value1, String value2) {
            addCriterion("kdgs_cn not between", value1, value2, "kdgsCn");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCreateAtIsNull() {
            addCriterion("create_at is null");
            return (Criteria) this;
        }

        public Criteria andCreateAtIsNotNull() {
            addCriterion("create_at is not null");
            return (Criteria) this;
        }

        public Criteria andCreateAtEqualTo(Date value) {
            addCriterion("create_at =", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtNotEqualTo(Date value) {
            addCriterion("create_at <>", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtGreaterThan(Date value) {
            addCriterion("create_at >", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtGreaterThanOrEqualTo(Date value) {
            addCriterion("create_at >=", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtLessThan(Date value) {
            addCriterion("create_at <", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtLessThanOrEqualTo(Date value) {
            addCriterion("create_at <=", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtIn(List<Date> values) {
            addCriterion("create_at in", values, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtNotIn(List<Date> values) {
            addCriterion("create_at not in", values, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtBetween(Date value1, Date value2) {
            addCriterion("create_at between", value1, value2, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtNotBetween(Date value1, Date value2) {
            addCriterion("create_at not between", value1, value2, "createAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtIsNull() {
            addCriterion("update_at is null");
            return (Criteria) this;
        }

        public Criteria andUpdateAtIsNotNull() {
            addCriterion("update_at is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateAtEqualTo(Date value) {
            addCriterion("update_at =", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtNotEqualTo(Date value) {
            addCriterion("update_at <>", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtGreaterThan(Date value) {
            addCriterion("update_at >", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtGreaterThanOrEqualTo(Date value) {
            addCriterion("update_at >=", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtLessThan(Date value) {
            addCriterion("update_at <", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtLessThanOrEqualTo(Date value) {
            addCriterion("update_at <=", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtIn(List<Date> values) {
            addCriterion("update_at in", values, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtNotIn(List<Date> values) {
            addCriterion("update_at not in", values, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtBetween(Date value1, Date value2) {
            addCriterion("update_at between", value1, value2, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtNotBetween(Date value1, Date value2) {
            addCriterion("update_at not between", value1, value2, "updateAt");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table kdgs
     *
     * @mbg.generated do_not_delete_during_merge Sat Mar 06 13:35:50 CST 2021
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table kdgs
     *
     * @mbg.generated Sat Mar 06 13:35:50 CST 2021
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}