package com.qianfeng.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CustomerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomerExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andCusIdIsNull() {
            addCriterion("cus_id is null");
            return (Criteria) this;
        }

        public Criteria andCusIdIsNotNull() {
            addCriterion("cus_id is not null");
            return (Criteria) this;
        }

        public Criteria andCusIdEqualTo(Integer value) {
            addCriterion("cus_id =", value, "cusId");
            return (Criteria) this;
        }

        public Criteria andCusIdNotEqualTo(Integer value) {
            addCriterion("cus_id <>", value, "cusId");
            return (Criteria) this;
        }

        public Criteria andCusIdGreaterThan(Integer value) {
            addCriterion("cus_id >", value, "cusId");
            return (Criteria) this;
        }

        public Criteria andCusIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cus_id >=", value, "cusId");
            return (Criteria) this;
        }

        public Criteria andCusIdLessThan(Integer value) {
            addCriterion("cus_id <", value, "cusId");
            return (Criteria) this;
        }

        public Criteria andCusIdLessThanOrEqualTo(Integer value) {
            addCriterion("cus_id <=", value, "cusId");
            return (Criteria) this;
        }

        public Criteria andCusIdIn(List<Integer> values) {
            addCriterion("cus_id in", values, "cusId");
            return (Criteria) this;
        }

        public Criteria andCusIdNotIn(List<Integer> values) {
            addCriterion("cus_id not in", values, "cusId");
            return (Criteria) this;
        }

        public Criteria andCusIdBetween(Integer value1, Integer value2) {
            addCriterion("cus_id between", value1, value2, "cusId");
            return (Criteria) this;
        }

        public Criteria andCusIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cus_id not between", value1, value2, "cusId");
            return (Criteria) this;
        }

        public Criteria andCusNameIsNull() {
            addCriterion("cus_name is null");
            return (Criteria) this;
        }

        public Criteria andCusNameIsNotNull() {
            addCriterion("cus_name is not null");
            return (Criteria) this;
        }

        public Criteria andCusNameEqualTo(String value) {
            addCriterion("cus_name =", value, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameNotEqualTo(String value) {
            addCriterion("cus_name <>", value, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameGreaterThan(String value) {
            addCriterion("cus_name >", value, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameGreaterThanOrEqualTo(String value) {
            addCriterion("cus_name >=", value, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameLessThan(String value) {
            addCriterion("cus_name <", value, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameLessThanOrEqualTo(String value) {
            addCriterion("cus_name <=", value, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameLike(String value) {
            addCriterion("cus_name like", value, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameNotLike(String value) {
            addCriterion("cus_name not like", value, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameIn(List<String> values) {
            addCriterion("cus_name in", values, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameNotIn(List<String> values) {
            addCriterion("cus_name not in", values, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameBetween(String value1, String value2) {
            addCriterion("cus_name between", value1, value2, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameNotBetween(String value1, String value2) {
            addCriterion("cus_name not between", value1, value2, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusPasswordIsNull() {
            addCriterion("cus_password is null");
            return (Criteria) this;
        }

        public Criteria andCusPasswordIsNotNull() {
            addCriterion("cus_password is not null");
            return (Criteria) this;
        }

        public Criteria andCusPasswordEqualTo(String value) {
            addCriterion("cus_password =", value, "cusPassword");
            return (Criteria) this;
        }

        public Criteria andCusPasswordNotEqualTo(String value) {
            addCriterion("cus_password <>", value, "cusPassword");
            return (Criteria) this;
        }

        public Criteria andCusPasswordGreaterThan(String value) {
            addCriterion("cus_password >", value, "cusPassword");
            return (Criteria) this;
        }

        public Criteria andCusPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("cus_password >=", value, "cusPassword");
            return (Criteria) this;
        }

        public Criteria andCusPasswordLessThan(String value) {
            addCriterion("cus_password <", value, "cusPassword");
            return (Criteria) this;
        }

        public Criteria andCusPasswordLessThanOrEqualTo(String value) {
            addCriterion("cus_password <=", value, "cusPassword");
            return (Criteria) this;
        }

        public Criteria andCusPasswordLike(String value) {
            addCriterion("cus_password like", value, "cusPassword");
            return (Criteria) this;
        }

        public Criteria andCusPasswordNotLike(String value) {
            addCriterion("cus_password not like", value, "cusPassword");
            return (Criteria) this;
        }

        public Criteria andCusPasswordIn(List<String> values) {
            addCriterion("cus_password in", values, "cusPassword");
            return (Criteria) this;
        }

        public Criteria andCusPasswordNotIn(List<String> values) {
            addCriterion("cus_password not in", values, "cusPassword");
            return (Criteria) this;
        }

        public Criteria andCusPasswordBetween(String value1, String value2) {
            addCriterion("cus_password between", value1, value2, "cusPassword");
            return (Criteria) this;
        }

        public Criteria andCusPasswordNotBetween(String value1, String value2) {
            addCriterion("cus_password not between", value1, value2, "cusPassword");
            return (Criteria) this;
        }

        public Criteria andCusBirthdayIsNull() {
            addCriterion("cus_birthday is null");
            return (Criteria) this;
        }

        public Criteria andCusBirthdayIsNotNull() {
            addCriterion("cus_birthday is not null");
            return (Criteria) this;
        }

        public Criteria andCusBirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("cus_birthday =", value, "cusBirthday");
            return (Criteria) this;
        }

        public Criteria andCusBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("cus_birthday <>", value, "cusBirthday");
            return (Criteria) this;
        }

        public Criteria andCusBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("cus_birthday >", value, "cusBirthday");
            return (Criteria) this;
        }

        public Criteria andCusBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("cus_birthday >=", value, "cusBirthday");
            return (Criteria) this;
        }

        public Criteria andCusBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("cus_birthday <", value, "cusBirthday");
            return (Criteria) this;
        }

        public Criteria andCusBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("cus_birthday <=", value, "cusBirthday");
            return (Criteria) this;
        }

        public Criteria andCusBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("cus_birthday in", values, "cusBirthday");
            return (Criteria) this;
        }

        public Criteria andCusBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("cus_birthday not in", values, "cusBirthday");
            return (Criteria) this;
        }

        public Criteria andCusBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("cus_birthday between", value1, value2, "cusBirthday");
            return (Criteria) this;
        }

        public Criteria andCusBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("cus_birthday not between", value1, value2, "cusBirthday");
            return (Criteria) this;
        }

        public Criteria andCusAgeIsNull() {
            addCriterion("cus_age is null");
            return (Criteria) this;
        }

        public Criteria andCusAgeIsNotNull() {
            addCriterion("cus_age is not null");
            return (Criteria) this;
        }

        public Criteria andCusAgeEqualTo(Integer value) {
            addCriterion("cus_age =", value, "cusAge");
            return (Criteria) this;
        }

        public Criteria andCusAgeNotEqualTo(Integer value) {
            addCriterion("cus_age <>", value, "cusAge");
            return (Criteria) this;
        }

        public Criteria andCusAgeGreaterThan(Integer value) {
            addCriterion("cus_age >", value, "cusAge");
            return (Criteria) this;
        }

        public Criteria andCusAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("cus_age >=", value, "cusAge");
            return (Criteria) this;
        }

        public Criteria andCusAgeLessThan(Integer value) {
            addCriterion("cus_age <", value, "cusAge");
            return (Criteria) this;
        }

        public Criteria andCusAgeLessThanOrEqualTo(Integer value) {
            addCriterion("cus_age <=", value, "cusAge");
            return (Criteria) this;
        }

        public Criteria andCusAgeIn(List<Integer> values) {
            addCriterion("cus_age in", values, "cusAge");
            return (Criteria) this;
        }

        public Criteria andCusAgeNotIn(List<Integer> values) {
            addCriterion("cus_age not in", values, "cusAge");
            return (Criteria) this;
        }

        public Criteria andCusAgeBetween(Integer value1, Integer value2) {
            addCriterion("cus_age between", value1, value2, "cusAge");
            return (Criteria) this;
        }

        public Criteria andCusAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("cus_age not between", value1, value2, "cusAge");
            return (Criteria) this;
        }

        public Criteria andCusPhoneIsNull() {
            addCriterion("cus_phone is null");
            return (Criteria) this;
        }

        public Criteria andCusPhoneIsNotNull() {
            addCriterion("cus_phone is not null");
            return (Criteria) this;
        }

        public Criteria andCusPhoneEqualTo(Long value) {
            addCriterion("cus_phone =", value, "cusPhone");
            return (Criteria) this;
        }

        public Criteria andCusPhoneNotEqualTo(Long value) {
            addCriterion("cus_phone <>", value, "cusPhone");
            return (Criteria) this;
        }

        public Criteria andCusPhoneGreaterThan(Long value) {
            addCriterion("cus_phone >", value, "cusPhone");
            return (Criteria) this;
        }

        public Criteria andCusPhoneGreaterThanOrEqualTo(Long value) {
            addCriterion("cus_phone >=", value, "cusPhone");
            return (Criteria) this;
        }

        public Criteria andCusPhoneLessThan(Long value) {
            addCriterion("cus_phone <", value, "cusPhone");
            return (Criteria) this;
        }

        public Criteria andCusPhoneLessThanOrEqualTo(Long value) {
            addCriterion("cus_phone <=", value, "cusPhone");
            return (Criteria) this;
        }

        public Criteria andCusPhoneIn(List<Long> values) {
            addCriterion("cus_phone in", values, "cusPhone");
            return (Criteria) this;
        }

        public Criteria andCusPhoneNotIn(List<Long> values) {
            addCriterion("cus_phone not in", values, "cusPhone");
            return (Criteria) this;
        }

        public Criteria andCusPhoneBetween(Long value1, Long value2) {
            addCriterion("cus_phone between", value1, value2, "cusPhone");
            return (Criteria) this;
        }

        public Criteria andCusPhoneNotBetween(Long value1, Long value2) {
            addCriterion("cus_phone not between", value1, value2, "cusPhone");
            return (Criteria) this;
        }

        public Criteria andCusAddressIsNull() {
            addCriterion("cus_address is null");
            return (Criteria) this;
        }

        public Criteria andCusAddressIsNotNull() {
            addCriterion("cus_address is not null");
            return (Criteria) this;
        }

        public Criteria andCusAddressEqualTo(String value) {
            addCriterion("cus_address =", value, "cusAddress");
            return (Criteria) this;
        }

        public Criteria andCusAddressNotEqualTo(String value) {
            addCriterion("cus_address <>", value, "cusAddress");
            return (Criteria) this;
        }

        public Criteria andCusAddressGreaterThan(String value) {
            addCriterion("cus_address >", value, "cusAddress");
            return (Criteria) this;
        }

        public Criteria andCusAddressGreaterThanOrEqualTo(String value) {
            addCriterion("cus_address >=", value, "cusAddress");
            return (Criteria) this;
        }

        public Criteria andCusAddressLessThan(String value) {
            addCriterion("cus_address <", value, "cusAddress");
            return (Criteria) this;
        }

        public Criteria andCusAddressLessThanOrEqualTo(String value) {
            addCriterion("cus_address <=", value, "cusAddress");
            return (Criteria) this;
        }

        public Criteria andCusAddressLike(String value) {
            addCriterion("cus_address like", value, "cusAddress");
            return (Criteria) this;
        }

        public Criteria andCusAddressNotLike(String value) {
            addCriterion("cus_address not like", value, "cusAddress");
            return (Criteria) this;
        }

        public Criteria andCusAddressIn(List<String> values) {
            addCriterion("cus_address in", values, "cusAddress");
            return (Criteria) this;
        }

        public Criteria andCusAddressNotIn(List<String> values) {
            addCriterion("cus_address not in", values, "cusAddress");
            return (Criteria) this;
        }

        public Criteria andCusAddressBetween(String value1, String value2) {
            addCriterion("cus_address between", value1, value2, "cusAddress");
            return (Criteria) this;
        }

        public Criteria andCusAddressNotBetween(String value1, String value2) {
            addCriterion("cus_address not between", value1, value2, "cusAddress");
            return (Criteria) this;
        }

        public Criteria andCusEfficacyIsNull() {
            addCriterion("cus_efficacy is null");
            return (Criteria) this;
        }

        public Criteria andCusEfficacyIsNotNull() {
            addCriterion("cus_efficacy is not null");
            return (Criteria) this;
        }

        public Criteria andCusEfficacyEqualTo(Byte value) {
            addCriterion("cus_efficacy =", value, "cusEfficacy");
            return (Criteria) this;
        }

        public Criteria andCusEfficacyNotEqualTo(Byte value) {
            addCriterion("cus_efficacy <>", value, "cusEfficacy");
            return (Criteria) this;
        }

        public Criteria andCusEfficacyGreaterThan(Byte value) {
            addCriterion("cus_efficacy >", value, "cusEfficacy");
            return (Criteria) this;
        }

        public Criteria andCusEfficacyGreaterThanOrEqualTo(Byte value) {
            addCriterion("cus_efficacy >=", value, "cusEfficacy");
            return (Criteria) this;
        }

        public Criteria andCusEfficacyLessThan(Byte value) {
            addCriterion("cus_efficacy <", value, "cusEfficacy");
            return (Criteria) this;
        }

        public Criteria andCusEfficacyLessThanOrEqualTo(Byte value) {
            addCriterion("cus_efficacy <=", value, "cusEfficacy");
            return (Criteria) this;
        }

        public Criteria andCusEfficacyIn(List<Byte> values) {
            addCriterion("cus_efficacy in", values, "cusEfficacy");
            return (Criteria) this;
        }

        public Criteria andCusEfficacyNotIn(List<Byte> values) {
            addCriterion("cus_efficacy not in", values, "cusEfficacy");
            return (Criteria) this;
        }

        public Criteria andCusEfficacyBetween(Byte value1, Byte value2) {
            addCriterion("cus_efficacy between", value1, value2, "cusEfficacy");
            return (Criteria) this;
        }

        public Criteria andCusEfficacyNotBetween(Byte value1, Byte value2) {
            addCriterion("cus_efficacy not between", value1, value2, "cusEfficacy");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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