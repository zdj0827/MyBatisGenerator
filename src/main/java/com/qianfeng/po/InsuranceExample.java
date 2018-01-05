package com.qianfeng.po;

import java.util.ArrayList;
import java.util.List;

public class InsuranceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InsuranceExample() {
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

        public Criteria andInsIdIsNull() {
            addCriterion("ins_id is null");
            return (Criteria) this;
        }

        public Criteria andInsIdIsNotNull() {
            addCriterion("ins_id is not null");
            return (Criteria) this;
        }

        public Criteria andInsIdEqualTo(Integer value) {
            addCriterion("ins_id =", value, "insId");
            return (Criteria) this;
        }

        public Criteria andInsIdNotEqualTo(Integer value) {
            addCriterion("ins_id <>", value, "insId");
            return (Criteria) this;
        }

        public Criteria andInsIdGreaterThan(Integer value) {
            addCriterion("ins_id >", value, "insId");
            return (Criteria) this;
        }

        public Criteria andInsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ins_id >=", value, "insId");
            return (Criteria) this;
        }

        public Criteria andInsIdLessThan(Integer value) {
            addCriterion("ins_id <", value, "insId");
            return (Criteria) this;
        }

        public Criteria andInsIdLessThanOrEqualTo(Integer value) {
            addCriterion("ins_id <=", value, "insId");
            return (Criteria) this;
        }

        public Criteria andInsIdIn(List<Integer> values) {
            addCriterion("ins_id in", values, "insId");
            return (Criteria) this;
        }

        public Criteria andInsIdNotIn(List<Integer> values) {
            addCriterion("ins_id not in", values, "insId");
            return (Criteria) this;
        }

        public Criteria andInsIdBetween(Integer value1, Integer value2) {
            addCriterion("ins_id between", value1, value2, "insId");
            return (Criteria) this;
        }

        public Criteria andInsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ins_id not between", value1, value2, "insId");
            return (Criteria) this;
        }

        public Criteria andInsNameIsNull() {
            addCriterion("ins_name is null");
            return (Criteria) this;
        }

        public Criteria andInsNameIsNotNull() {
            addCriterion("ins_name is not null");
            return (Criteria) this;
        }

        public Criteria andInsNameEqualTo(String value) {
            addCriterion("ins_name =", value, "insName");
            return (Criteria) this;
        }

        public Criteria andInsNameNotEqualTo(String value) {
            addCriterion("ins_name <>", value, "insName");
            return (Criteria) this;
        }

        public Criteria andInsNameGreaterThan(String value) {
            addCriterion("ins_name >", value, "insName");
            return (Criteria) this;
        }

        public Criteria andInsNameGreaterThanOrEqualTo(String value) {
            addCriterion("ins_name >=", value, "insName");
            return (Criteria) this;
        }

        public Criteria andInsNameLessThan(String value) {
            addCriterion("ins_name <", value, "insName");
            return (Criteria) this;
        }

        public Criteria andInsNameLessThanOrEqualTo(String value) {
            addCriterion("ins_name <=", value, "insName");
            return (Criteria) this;
        }

        public Criteria andInsNameLike(String value) {
            addCriterion("ins_name like", value, "insName");
            return (Criteria) this;
        }

        public Criteria andInsNameNotLike(String value) {
            addCriterion("ins_name not like", value, "insName");
            return (Criteria) this;
        }

        public Criteria andInsNameIn(List<String> values) {
            addCriterion("ins_name in", values, "insName");
            return (Criteria) this;
        }

        public Criteria andInsNameNotIn(List<String> values) {
            addCriterion("ins_name not in", values, "insName");
            return (Criteria) this;
        }

        public Criteria andInsNameBetween(String value1, String value2) {
            addCriterion("ins_name between", value1, value2, "insName");
            return (Criteria) this;
        }

        public Criteria andInsNameNotBetween(String value1, String value2) {
            addCriterion("ins_name not between", value1, value2, "insName");
            return (Criteria) this;
        }

        public Criteria andInsDescIsNull() {
            addCriterion("ins_desc is null");
            return (Criteria) this;
        }

        public Criteria andInsDescIsNotNull() {
            addCriterion("ins_desc is not null");
            return (Criteria) this;
        }

        public Criteria andInsDescEqualTo(String value) {
            addCriterion("ins_desc =", value, "insDesc");
            return (Criteria) this;
        }

        public Criteria andInsDescNotEqualTo(String value) {
            addCriterion("ins_desc <>", value, "insDesc");
            return (Criteria) this;
        }

        public Criteria andInsDescGreaterThan(String value) {
            addCriterion("ins_desc >", value, "insDesc");
            return (Criteria) this;
        }

        public Criteria andInsDescGreaterThanOrEqualTo(String value) {
            addCriterion("ins_desc >=", value, "insDesc");
            return (Criteria) this;
        }

        public Criteria andInsDescLessThan(String value) {
            addCriterion("ins_desc <", value, "insDesc");
            return (Criteria) this;
        }

        public Criteria andInsDescLessThanOrEqualTo(String value) {
            addCriterion("ins_desc <=", value, "insDesc");
            return (Criteria) this;
        }

        public Criteria andInsDescLike(String value) {
            addCriterion("ins_desc like", value, "insDesc");
            return (Criteria) this;
        }

        public Criteria andInsDescNotLike(String value) {
            addCriterion("ins_desc not like", value, "insDesc");
            return (Criteria) this;
        }

        public Criteria andInsDescIn(List<String> values) {
            addCriterion("ins_desc in", values, "insDesc");
            return (Criteria) this;
        }

        public Criteria andInsDescNotIn(List<String> values) {
            addCriterion("ins_desc not in", values, "insDesc");
            return (Criteria) this;
        }

        public Criteria andInsDescBetween(String value1, String value2) {
            addCriterion("ins_desc between", value1, value2, "insDesc");
            return (Criteria) this;
        }

        public Criteria andInsDescNotBetween(String value1, String value2) {
            addCriterion("ins_desc not between", value1, value2, "insDesc");
            return (Criteria) this;
        }

        public Criteria andInsEfficacyIsNull() {
            addCriterion("ins_efficacy is null");
            return (Criteria) this;
        }

        public Criteria andInsEfficacyIsNotNull() {
            addCriterion("ins_efficacy is not null");
            return (Criteria) this;
        }

        public Criteria andInsEfficacyEqualTo(Byte value) {
            addCriterion("ins_efficacy =", value, "insEfficacy");
            return (Criteria) this;
        }

        public Criteria andInsEfficacyNotEqualTo(Byte value) {
            addCriterion("ins_efficacy <>", value, "insEfficacy");
            return (Criteria) this;
        }

        public Criteria andInsEfficacyGreaterThan(Byte value) {
            addCriterion("ins_efficacy >", value, "insEfficacy");
            return (Criteria) this;
        }

        public Criteria andInsEfficacyGreaterThanOrEqualTo(Byte value) {
            addCriterion("ins_efficacy >=", value, "insEfficacy");
            return (Criteria) this;
        }

        public Criteria andInsEfficacyLessThan(Byte value) {
            addCriterion("ins_efficacy <", value, "insEfficacy");
            return (Criteria) this;
        }

        public Criteria andInsEfficacyLessThanOrEqualTo(Byte value) {
            addCriterion("ins_efficacy <=", value, "insEfficacy");
            return (Criteria) this;
        }

        public Criteria andInsEfficacyIn(List<Byte> values) {
            addCriterion("ins_efficacy in", values, "insEfficacy");
            return (Criteria) this;
        }

        public Criteria andInsEfficacyNotIn(List<Byte> values) {
            addCriterion("ins_efficacy not in", values, "insEfficacy");
            return (Criteria) this;
        }

        public Criteria andInsEfficacyBetween(Byte value1, Byte value2) {
            addCriterion("ins_efficacy between", value1, value2, "insEfficacy");
            return (Criteria) this;
        }

        public Criteria andInsEfficacyNotBetween(Byte value1, Byte value2) {
            addCriterion("ins_efficacy not between", value1, value2, "insEfficacy");
            return (Criteria) this;
        }

        public Criteria andInsCategoryIsNull() {
            addCriterion("ins_category is null");
            return (Criteria) this;
        }

        public Criteria andInsCategoryIsNotNull() {
            addCriterion("ins_category is not null");
            return (Criteria) this;
        }

        public Criteria andInsCategoryEqualTo(Integer value) {
            addCriterion("ins_category =", value, "insCategory");
            return (Criteria) this;
        }

        public Criteria andInsCategoryNotEqualTo(Integer value) {
            addCriterion("ins_category <>", value, "insCategory");
            return (Criteria) this;
        }

        public Criteria andInsCategoryGreaterThan(Integer value) {
            addCriterion("ins_category >", value, "insCategory");
            return (Criteria) this;
        }

        public Criteria andInsCategoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("ins_category >=", value, "insCategory");
            return (Criteria) this;
        }

        public Criteria andInsCategoryLessThan(Integer value) {
            addCriterion("ins_category <", value, "insCategory");
            return (Criteria) this;
        }

        public Criteria andInsCategoryLessThanOrEqualTo(Integer value) {
            addCriterion("ins_category <=", value, "insCategory");
            return (Criteria) this;
        }

        public Criteria andInsCategoryIn(List<Integer> values) {
            addCriterion("ins_category in", values, "insCategory");
            return (Criteria) this;
        }

        public Criteria andInsCategoryNotIn(List<Integer> values) {
            addCriterion("ins_category not in", values, "insCategory");
            return (Criteria) this;
        }

        public Criteria andInsCategoryBetween(Integer value1, Integer value2) {
            addCriterion("ins_category between", value1, value2, "insCategory");
            return (Criteria) this;
        }

        public Criteria andInsCategoryNotBetween(Integer value1, Integer value2) {
            addCriterion("ins_category not between", value1, value2, "insCategory");
            return (Criteria) this;
        }

        public Criteria andInsContentIsNull() {
            addCriterion("ins_content is null");
            return (Criteria) this;
        }

        public Criteria andInsContentIsNotNull() {
            addCriterion("ins_content is not null");
            return (Criteria) this;
        }

        public Criteria andInsContentEqualTo(String value) {
            addCriterion("ins_content =", value, "insContent");
            return (Criteria) this;
        }

        public Criteria andInsContentNotEqualTo(String value) {
            addCriterion("ins_content <>", value, "insContent");
            return (Criteria) this;
        }

        public Criteria andInsContentGreaterThan(String value) {
            addCriterion("ins_content >", value, "insContent");
            return (Criteria) this;
        }

        public Criteria andInsContentGreaterThanOrEqualTo(String value) {
            addCriterion("ins_content >=", value, "insContent");
            return (Criteria) this;
        }

        public Criteria andInsContentLessThan(String value) {
            addCriterion("ins_content <", value, "insContent");
            return (Criteria) this;
        }

        public Criteria andInsContentLessThanOrEqualTo(String value) {
            addCriterion("ins_content <=", value, "insContent");
            return (Criteria) this;
        }

        public Criteria andInsContentLike(String value) {
            addCriterion("ins_content like", value, "insContent");
            return (Criteria) this;
        }

        public Criteria andInsContentNotLike(String value) {
            addCriterion("ins_content not like", value, "insContent");
            return (Criteria) this;
        }

        public Criteria andInsContentIn(List<String> values) {
            addCriterion("ins_content in", values, "insContent");
            return (Criteria) this;
        }

        public Criteria andInsContentNotIn(List<String> values) {
            addCriterion("ins_content not in", values, "insContent");
            return (Criteria) this;
        }

        public Criteria andInsContentBetween(String value1, String value2) {
            addCriterion("ins_content between", value1, value2, "insContent");
            return (Criteria) this;
        }

        public Criteria andInsContentNotBetween(String value1, String value2) {
            addCriterion("ins_content not between", value1, value2, "insContent");
            return (Criteria) this;
        }

        public Criteria andInsAgeIsNull() {
            addCriterion("ins_age is null");
            return (Criteria) this;
        }

        public Criteria andInsAgeIsNotNull() {
            addCriterion("ins_age is not null");
            return (Criteria) this;
        }

        public Criteria andInsAgeEqualTo(String value) {
            addCriterion("ins_age =", value, "insAge");
            return (Criteria) this;
        }

        public Criteria andInsAgeNotEqualTo(String value) {
            addCriterion("ins_age <>", value, "insAge");
            return (Criteria) this;
        }

        public Criteria andInsAgeGreaterThan(String value) {
            addCriterion("ins_age >", value, "insAge");
            return (Criteria) this;
        }

        public Criteria andInsAgeGreaterThanOrEqualTo(String value) {
            addCriterion("ins_age >=", value, "insAge");
            return (Criteria) this;
        }

        public Criteria andInsAgeLessThan(String value) {
            addCriterion("ins_age <", value, "insAge");
            return (Criteria) this;
        }

        public Criteria andInsAgeLessThanOrEqualTo(String value) {
            addCriterion("ins_age <=", value, "insAge");
            return (Criteria) this;
        }

        public Criteria andInsAgeLike(String value) {
            addCriterion("ins_age like", value, "insAge");
            return (Criteria) this;
        }

        public Criteria andInsAgeNotLike(String value) {
            addCriterion("ins_age not like", value, "insAge");
            return (Criteria) this;
        }

        public Criteria andInsAgeIn(List<String> values) {
            addCriterion("ins_age in", values, "insAge");
            return (Criteria) this;
        }

        public Criteria andInsAgeNotIn(List<String> values) {
            addCriterion("ins_age not in", values, "insAge");
            return (Criteria) this;
        }

        public Criteria andInsAgeBetween(String value1, String value2) {
            addCriterion("ins_age between", value1, value2, "insAge");
            return (Criteria) this;
        }

        public Criteria andInsAgeNotBetween(String value1, String value2) {
            addCriterion("ins_age not between", value1, value2, "insAge");
            return (Criteria) this;
        }

        public Criteria andInsCharacterIsNull() {
            addCriterion("ins_character is null");
            return (Criteria) this;
        }

        public Criteria andInsCharacterIsNotNull() {
            addCriterion("ins_character is not null");
            return (Criteria) this;
        }

        public Criteria andInsCharacterEqualTo(String value) {
            addCriterion("ins_character =", value, "insCharacter");
            return (Criteria) this;
        }

        public Criteria andInsCharacterNotEqualTo(String value) {
            addCriterion("ins_character <>", value, "insCharacter");
            return (Criteria) this;
        }

        public Criteria andInsCharacterGreaterThan(String value) {
            addCriterion("ins_character >", value, "insCharacter");
            return (Criteria) this;
        }

        public Criteria andInsCharacterGreaterThanOrEqualTo(String value) {
            addCriterion("ins_character >=", value, "insCharacter");
            return (Criteria) this;
        }

        public Criteria andInsCharacterLessThan(String value) {
            addCriterion("ins_character <", value, "insCharacter");
            return (Criteria) this;
        }

        public Criteria andInsCharacterLessThanOrEqualTo(String value) {
            addCriterion("ins_character <=", value, "insCharacter");
            return (Criteria) this;
        }

        public Criteria andInsCharacterLike(String value) {
            addCriterion("ins_character like", value, "insCharacter");
            return (Criteria) this;
        }

        public Criteria andInsCharacterNotLike(String value) {
            addCriterion("ins_character not like", value, "insCharacter");
            return (Criteria) this;
        }

        public Criteria andInsCharacterIn(List<String> values) {
            addCriterion("ins_character in", values, "insCharacter");
            return (Criteria) this;
        }

        public Criteria andInsCharacterNotIn(List<String> values) {
            addCriterion("ins_character not in", values, "insCharacter");
            return (Criteria) this;
        }

        public Criteria andInsCharacterBetween(String value1, String value2) {
            addCriterion("ins_character between", value1, value2, "insCharacter");
            return (Criteria) this;
        }

        public Criteria andInsCharacterNotBetween(String value1, String value2) {
            addCriterion("ins_character not between", value1, value2, "insCharacter");
            return (Criteria) this;
        }

        public Criteria andInsTimeIsNull() {
            addCriterion("ins_time is null");
            return (Criteria) this;
        }

        public Criteria andInsTimeIsNotNull() {
            addCriterion("ins_time is not null");
            return (Criteria) this;
        }

        public Criteria andInsTimeEqualTo(String value) {
            addCriterion("ins_time =", value, "insTime");
            return (Criteria) this;
        }

        public Criteria andInsTimeNotEqualTo(String value) {
            addCriterion("ins_time <>", value, "insTime");
            return (Criteria) this;
        }

        public Criteria andInsTimeGreaterThan(String value) {
            addCriterion("ins_time >", value, "insTime");
            return (Criteria) this;
        }

        public Criteria andInsTimeGreaterThanOrEqualTo(String value) {
            addCriterion("ins_time >=", value, "insTime");
            return (Criteria) this;
        }

        public Criteria andInsTimeLessThan(String value) {
            addCriterion("ins_time <", value, "insTime");
            return (Criteria) this;
        }

        public Criteria andInsTimeLessThanOrEqualTo(String value) {
            addCriterion("ins_time <=", value, "insTime");
            return (Criteria) this;
        }

        public Criteria andInsTimeLike(String value) {
            addCriterion("ins_time like", value, "insTime");
            return (Criteria) this;
        }

        public Criteria andInsTimeNotLike(String value) {
            addCriterion("ins_time not like", value, "insTime");
            return (Criteria) this;
        }

        public Criteria andInsTimeIn(List<String> values) {
            addCriterion("ins_time in", values, "insTime");
            return (Criteria) this;
        }

        public Criteria andInsTimeNotIn(List<String> values) {
            addCriterion("ins_time not in", values, "insTime");
            return (Criteria) this;
        }

        public Criteria andInsTimeBetween(String value1, String value2) {
            addCriterion("ins_time between", value1, value2, "insTime");
            return (Criteria) this;
        }

        public Criteria andInsTimeNotBetween(String value1, String value2) {
            addCriterion("ins_time not between", value1, value2, "insTime");
            return (Criteria) this;
        }

        public Criteria andInsAmountIsNull() {
            addCriterion("ins_amount is null");
            return (Criteria) this;
        }

        public Criteria andInsAmountIsNotNull() {
            addCriterion("ins_amount is not null");
            return (Criteria) this;
        }

        public Criteria andInsAmountEqualTo(Integer value) {
            addCriterion("ins_amount =", value, "insAmount");
            return (Criteria) this;
        }

        public Criteria andInsAmountNotEqualTo(Integer value) {
            addCriterion("ins_amount <>", value, "insAmount");
            return (Criteria) this;
        }

        public Criteria andInsAmountGreaterThan(Integer value) {
            addCriterion("ins_amount >", value, "insAmount");
            return (Criteria) this;
        }

        public Criteria andInsAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("ins_amount >=", value, "insAmount");
            return (Criteria) this;
        }

        public Criteria andInsAmountLessThan(Integer value) {
            addCriterion("ins_amount <", value, "insAmount");
            return (Criteria) this;
        }

        public Criteria andInsAmountLessThanOrEqualTo(Integer value) {
            addCriterion("ins_amount <=", value, "insAmount");
            return (Criteria) this;
        }

        public Criteria andInsAmountIn(List<Integer> values) {
            addCriterion("ins_amount in", values, "insAmount");
            return (Criteria) this;
        }

        public Criteria andInsAmountNotIn(List<Integer> values) {
            addCriterion("ins_amount not in", values, "insAmount");
            return (Criteria) this;
        }

        public Criteria andInsAmountBetween(Integer value1, Integer value2) {
            addCriterion("ins_amount between", value1, value2, "insAmount");
            return (Criteria) this;
        }

        public Criteria andInsAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("ins_amount not between", value1, value2, "insAmount");
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