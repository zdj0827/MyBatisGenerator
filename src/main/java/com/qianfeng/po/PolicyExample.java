package com.qianfeng.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PolicyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PolicyExample() {
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

        public Criteria andPoIdIsNull() {
            addCriterion("po_id is null");
            return (Criteria) this;
        }

        public Criteria andPoIdIsNotNull() {
            addCriterion("po_id is not null");
            return (Criteria) this;
        }

        public Criteria andPoIdEqualTo(Integer value) {
            addCriterion("po_id =", value, "poId");
            return (Criteria) this;
        }

        public Criteria andPoIdNotEqualTo(Integer value) {
            addCriterion("po_id <>", value, "poId");
            return (Criteria) this;
        }

        public Criteria andPoIdGreaterThan(Integer value) {
            addCriterion("po_id >", value, "poId");
            return (Criteria) this;
        }

        public Criteria andPoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("po_id >=", value, "poId");
            return (Criteria) this;
        }

        public Criteria andPoIdLessThan(Integer value) {
            addCriterion("po_id <", value, "poId");
            return (Criteria) this;
        }

        public Criteria andPoIdLessThanOrEqualTo(Integer value) {
            addCriterion("po_id <=", value, "poId");
            return (Criteria) this;
        }

        public Criteria andPoIdIn(List<Integer> values) {
            addCriterion("po_id in", values, "poId");
            return (Criteria) this;
        }

        public Criteria andPoIdNotIn(List<Integer> values) {
            addCriterion("po_id not in", values, "poId");
            return (Criteria) this;
        }

        public Criteria andPoIdBetween(Integer value1, Integer value2) {
            addCriterion("po_id between", value1, value2, "poId");
            return (Criteria) this;
        }

        public Criteria andPoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("po_id not between", value1, value2, "poId");
            return (Criteria) this;
        }

        public Criteria andPoUserIsNull() {
            addCriterion("po_user is null");
            return (Criteria) this;
        }

        public Criteria andPoUserIsNotNull() {
            addCriterion("po_user is not null");
            return (Criteria) this;
        }

        public Criteria andPoUserEqualTo(Integer value) {
            addCriterion("po_user =", value, "poUser");
            return (Criteria) this;
        }

        public Criteria andPoUserNotEqualTo(Integer value) {
            addCriterion("po_user <>", value, "poUser");
            return (Criteria) this;
        }

        public Criteria andPoUserGreaterThan(Integer value) {
            addCriterion("po_user >", value, "poUser");
            return (Criteria) this;
        }

        public Criteria andPoUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("po_user >=", value, "poUser");
            return (Criteria) this;
        }

        public Criteria andPoUserLessThan(Integer value) {
            addCriterion("po_user <", value, "poUser");
            return (Criteria) this;
        }

        public Criteria andPoUserLessThanOrEqualTo(Integer value) {
            addCriterion("po_user <=", value, "poUser");
            return (Criteria) this;
        }

        public Criteria andPoUserIn(List<Integer> values) {
            addCriterion("po_user in", values, "poUser");
            return (Criteria) this;
        }

        public Criteria andPoUserNotIn(List<Integer> values) {
            addCriterion("po_user not in", values, "poUser");
            return (Criteria) this;
        }

        public Criteria andPoUserBetween(Integer value1, Integer value2) {
            addCriterion("po_user between", value1, value2, "poUser");
            return (Criteria) this;
        }

        public Criteria andPoUserNotBetween(Integer value1, Integer value2) {
            addCriterion("po_user not between", value1, value2, "poUser");
            return (Criteria) this;
        }

        public Criteria andPoBeneIsNull() {
            addCriterion("po_bene is null");
            return (Criteria) this;
        }

        public Criteria andPoBeneIsNotNull() {
            addCriterion("po_bene is not null");
            return (Criteria) this;
        }

        public Criteria andPoBeneEqualTo(String value) {
            addCriterion("po_bene =", value, "poBene");
            return (Criteria) this;
        }

        public Criteria andPoBeneNotEqualTo(String value) {
            addCriterion("po_bene <>", value, "poBene");
            return (Criteria) this;
        }

        public Criteria andPoBeneGreaterThan(String value) {
            addCriterion("po_bene >", value, "poBene");
            return (Criteria) this;
        }

        public Criteria andPoBeneGreaterThanOrEqualTo(String value) {
            addCriterion("po_bene >=", value, "poBene");
            return (Criteria) this;
        }

        public Criteria andPoBeneLessThan(String value) {
            addCriterion("po_bene <", value, "poBene");
            return (Criteria) this;
        }

        public Criteria andPoBeneLessThanOrEqualTo(String value) {
            addCriterion("po_bene <=", value, "poBene");
            return (Criteria) this;
        }

        public Criteria andPoBeneLike(String value) {
            addCriterion("po_bene like", value, "poBene");
            return (Criteria) this;
        }

        public Criteria andPoBeneNotLike(String value) {
            addCriterion("po_bene not like", value, "poBene");
            return (Criteria) this;
        }

        public Criteria andPoBeneIn(List<String> values) {
            addCriterion("po_bene in", values, "poBene");
            return (Criteria) this;
        }

        public Criteria andPoBeneNotIn(List<String> values) {
            addCriterion("po_bene not in", values, "poBene");
            return (Criteria) this;
        }

        public Criteria andPoBeneBetween(String value1, String value2) {
            addCriterion("po_bene between", value1, value2, "poBene");
            return (Criteria) this;
        }

        public Criteria andPoBeneNotBetween(String value1, String value2) {
            addCriterion("po_bene not between", value1, value2, "poBene");
            return (Criteria) this;
        }

        public Criteria andPoInsIsNull() {
            addCriterion("po_ins is null");
            return (Criteria) this;
        }

        public Criteria andPoInsIsNotNull() {
            addCriterion("po_ins is not null");
            return (Criteria) this;
        }

        public Criteria andPoInsEqualTo(Integer value) {
            addCriterion("po_ins =", value, "poIns");
            return (Criteria) this;
        }

        public Criteria andPoInsNotEqualTo(Integer value) {
            addCriterion("po_ins <>", value, "poIns");
            return (Criteria) this;
        }

        public Criteria andPoInsGreaterThan(Integer value) {
            addCriterion("po_ins >", value, "poIns");
            return (Criteria) this;
        }

        public Criteria andPoInsGreaterThanOrEqualTo(Integer value) {
            addCriterion("po_ins >=", value, "poIns");
            return (Criteria) this;
        }

        public Criteria andPoInsLessThan(Integer value) {
            addCriterion("po_ins <", value, "poIns");
            return (Criteria) this;
        }

        public Criteria andPoInsLessThanOrEqualTo(Integer value) {
            addCriterion("po_ins <=", value, "poIns");
            return (Criteria) this;
        }

        public Criteria andPoInsIn(List<Integer> values) {
            addCriterion("po_ins in", values, "poIns");
            return (Criteria) this;
        }

        public Criteria andPoInsNotIn(List<Integer> values) {
            addCriterion("po_ins not in", values, "poIns");
            return (Criteria) this;
        }

        public Criteria andPoInsBetween(Integer value1, Integer value2) {
            addCriterion("po_ins between", value1, value2, "poIns");
            return (Criteria) this;
        }

        public Criteria andPoInsNotBetween(Integer value1, Integer value2) {
            addCriterion("po_ins not between", value1, value2, "poIns");
            return (Criteria) this;
        }

        public Criteria andPoDateIsNull() {
            addCriterion("po_date is null");
            return (Criteria) this;
        }

        public Criteria andPoDateIsNotNull() {
            addCriterion("po_date is not null");
            return (Criteria) this;
        }

        public Criteria andPoDateEqualTo(Date value) {
            addCriterionForJDBCDate("po_date =", value, "poDate");
            return (Criteria) this;
        }

        public Criteria andPoDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("po_date <>", value, "poDate");
            return (Criteria) this;
        }

        public Criteria andPoDateGreaterThan(Date value) {
            addCriterionForJDBCDate("po_date >", value, "poDate");
            return (Criteria) this;
        }

        public Criteria andPoDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("po_date >=", value, "poDate");
            return (Criteria) this;
        }

        public Criteria andPoDateLessThan(Date value) {
            addCriterionForJDBCDate("po_date <", value, "poDate");
            return (Criteria) this;
        }

        public Criteria andPoDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("po_date <=", value, "poDate");
            return (Criteria) this;
        }

        public Criteria andPoDateIn(List<Date> values) {
            addCriterionForJDBCDate("po_date in", values, "poDate");
            return (Criteria) this;
        }

        public Criteria andPoDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("po_date not in", values, "poDate");
            return (Criteria) this;
        }

        public Criteria andPoDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("po_date between", value1, value2, "poDate");
            return (Criteria) this;
        }

        public Criteria andPoDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("po_date not between", value1, value2, "poDate");
            return (Criteria) this;
        }

        public Criteria andPoExpireIsNull() {
            addCriterion("po_expire is null");
            return (Criteria) this;
        }

        public Criteria andPoExpireIsNotNull() {
            addCriterion("po_expire is not null");
            return (Criteria) this;
        }

        public Criteria andPoExpireEqualTo(Integer value) {
            addCriterion("po_expire =", value, "poExpire");
            return (Criteria) this;
        }

        public Criteria andPoExpireNotEqualTo(Integer value) {
            addCriterion("po_expire <>", value, "poExpire");
            return (Criteria) this;
        }

        public Criteria andPoExpireGreaterThan(Integer value) {
            addCriterion("po_expire >", value, "poExpire");
            return (Criteria) this;
        }

        public Criteria andPoExpireGreaterThanOrEqualTo(Integer value) {
            addCriterion("po_expire >=", value, "poExpire");
            return (Criteria) this;
        }

        public Criteria andPoExpireLessThan(Integer value) {
            addCriterion("po_expire <", value, "poExpire");
            return (Criteria) this;
        }

        public Criteria andPoExpireLessThanOrEqualTo(Integer value) {
            addCriterion("po_expire <=", value, "poExpire");
            return (Criteria) this;
        }

        public Criteria andPoExpireIn(List<Integer> values) {
            addCriterion("po_expire in", values, "poExpire");
            return (Criteria) this;
        }

        public Criteria andPoExpireNotIn(List<Integer> values) {
            addCriterion("po_expire not in", values, "poExpire");
            return (Criteria) this;
        }

        public Criteria andPoExpireBetween(Integer value1, Integer value2) {
            addCriterion("po_expire between", value1, value2, "poExpire");
            return (Criteria) this;
        }

        public Criteria andPoExpireNotBetween(Integer value1, Integer value2) {
            addCriterion("po_expire not between", value1, value2, "poExpire");
            return (Criteria) this;
        }

        public Criteria andPoChargeIsNull() {
            addCriterion("po_charge is null");
            return (Criteria) this;
        }

        public Criteria andPoChargeIsNotNull() {
            addCriterion("po_charge is not null");
            return (Criteria) this;
        }

        public Criteria andPoChargeEqualTo(Integer value) {
            addCriterion("po_charge =", value, "poCharge");
            return (Criteria) this;
        }

        public Criteria andPoChargeNotEqualTo(Integer value) {
            addCriterion("po_charge <>", value, "poCharge");
            return (Criteria) this;
        }

        public Criteria andPoChargeGreaterThan(Integer value) {
            addCriterion("po_charge >", value, "poCharge");
            return (Criteria) this;
        }

        public Criteria andPoChargeGreaterThanOrEqualTo(Integer value) {
            addCriterion("po_charge >=", value, "poCharge");
            return (Criteria) this;
        }

        public Criteria andPoChargeLessThan(Integer value) {
            addCriterion("po_charge <", value, "poCharge");
            return (Criteria) this;
        }

        public Criteria andPoChargeLessThanOrEqualTo(Integer value) {
            addCriterion("po_charge <=", value, "poCharge");
            return (Criteria) this;
        }

        public Criteria andPoChargeIn(List<Integer> values) {
            addCriterion("po_charge in", values, "poCharge");
            return (Criteria) this;
        }

        public Criteria andPoChargeNotIn(List<Integer> values) {
            addCriterion("po_charge not in", values, "poCharge");
            return (Criteria) this;
        }

        public Criteria andPoChargeBetween(Integer value1, Integer value2) {
            addCriterion("po_charge between", value1, value2, "poCharge");
            return (Criteria) this;
        }

        public Criteria andPoChargeNotBetween(Integer value1, Integer value2) {
            addCriterion("po_charge not between", value1, value2, "poCharge");
            return (Criteria) this;
        }

        public Criteria andPoAmendsIsNull() {
            addCriterion("po_amends is null");
            return (Criteria) this;
        }

        public Criteria andPoAmendsIsNotNull() {
            addCriterion("po_amends is not null");
            return (Criteria) this;
        }

        public Criteria andPoAmendsEqualTo(Integer value) {
            addCriterion("po_amends =", value, "poAmends");
            return (Criteria) this;
        }

        public Criteria andPoAmendsNotEqualTo(Integer value) {
            addCriterion("po_amends <>", value, "poAmends");
            return (Criteria) this;
        }

        public Criteria andPoAmendsGreaterThan(Integer value) {
            addCriterion("po_amends >", value, "poAmends");
            return (Criteria) this;
        }

        public Criteria andPoAmendsGreaterThanOrEqualTo(Integer value) {
            addCriterion("po_amends >=", value, "poAmends");
            return (Criteria) this;
        }

        public Criteria andPoAmendsLessThan(Integer value) {
            addCriterion("po_amends <", value, "poAmends");
            return (Criteria) this;
        }

        public Criteria andPoAmendsLessThanOrEqualTo(Integer value) {
            addCriterion("po_amends <=", value, "poAmends");
            return (Criteria) this;
        }

        public Criteria andPoAmendsIn(List<Integer> values) {
            addCriterion("po_amends in", values, "poAmends");
            return (Criteria) this;
        }

        public Criteria andPoAmendsNotIn(List<Integer> values) {
            addCriterion("po_amends not in", values, "poAmends");
            return (Criteria) this;
        }

        public Criteria andPoAmendsBetween(Integer value1, Integer value2) {
            addCriterion("po_amends between", value1, value2, "poAmends");
            return (Criteria) this;
        }

        public Criteria andPoAmendsNotBetween(Integer value1, Integer value2) {
            addCriterion("po_amends not between", value1, value2, "poAmends");
            return (Criteria) this;
        }

        public Criteria andPoEfficacyIsNull() {
            addCriterion("po_efficacy is null");
            return (Criteria) this;
        }

        public Criteria andPoEfficacyIsNotNull() {
            addCriterion("po_efficacy is not null");
            return (Criteria) this;
        }

        public Criteria andPoEfficacyEqualTo(Byte value) {
            addCriterion("po_efficacy =", value, "poEfficacy");
            return (Criteria) this;
        }

        public Criteria andPoEfficacyNotEqualTo(Byte value) {
            addCriterion("po_efficacy <>", value, "poEfficacy");
            return (Criteria) this;
        }

        public Criteria andPoEfficacyGreaterThan(Byte value) {
            addCriterion("po_efficacy >", value, "poEfficacy");
            return (Criteria) this;
        }

        public Criteria andPoEfficacyGreaterThanOrEqualTo(Byte value) {
            addCriterion("po_efficacy >=", value, "poEfficacy");
            return (Criteria) this;
        }

        public Criteria andPoEfficacyLessThan(Byte value) {
            addCriterion("po_efficacy <", value, "poEfficacy");
            return (Criteria) this;
        }

        public Criteria andPoEfficacyLessThanOrEqualTo(Byte value) {
            addCriterion("po_efficacy <=", value, "poEfficacy");
            return (Criteria) this;
        }

        public Criteria andPoEfficacyIn(List<Byte> values) {
            addCriterion("po_efficacy in", values, "poEfficacy");
            return (Criteria) this;
        }

        public Criteria andPoEfficacyNotIn(List<Byte> values) {
            addCriterion("po_efficacy not in", values, "poEfficacy");
            return (Criteria) this;
        }

        public Criteria andPoEfficacyBetween(Byte value1, Byte value2) {
            addCriterion("po_efficacy between", value1, value2, "poEfficacy");
            return (Criteria) this;
        }

        public Criteria andPoEfficacyNotBetween(Byte value1, Byte value2) {
            addCriterion("po_efficacy not between", value1, value2, "poEfficacy");
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