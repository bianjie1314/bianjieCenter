package com.dhd.schedule.pojo;

import java.util.ArrayList;
import java.util.List;

public class DhdScheduleCronExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DhdScheduleCronExample() {
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

        public Criteria andCronIdIsNull() {
            addCriterion("cron_id is null");
            return (Criteria) this;
        }

        public Criteria andCronIdIsNotNull() {
            addCriterion("cron_id is not null");
            return (Criteria) this;
        }

        public Criteria andCronIdEqualTo(Integer value) {
            addCriterion("cron_id =", value, "cronId");
            return (Criteria) this;
        }

        public Criteria andCronIdNotEqualTo(Integer value) {
            addCriterion("cron_id <>", value, "cronId");
            return (Criteria) this;
        }

        public Criteria andCronIdGreaterThan(Integer value) {
            addCriterion("cron_id >", value, "cronId");
            return (Criteria) this;
        }

        public Criteria andCronIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cron_id >=", value, "cronId");
            return (Criteria) this;
        }

        public Criteria andCronIdLessThan(Integer value) {
            addCriterion("cron_id <", value, "cronId");
            return (Criteria) this;
        }

        public Criteria andCronIdLessThanOrEqualTo(Integer value) {
            addCriterion("cron_id <=", value, "cronId");
            return (Criteria) this;
        }

        public Criteria andCronIdIn(List<Integer> values) {
            addCriterion("cron_id in", values, "cronId");
            return (Criteria) this;
        }

        public Criteria andCronIdNotIn(List<Integer> values) {
            addCriterion("cron_id not in", values, "cronId");
            return (Criteria) this;
        }

        public Criteria andCronIdBetween(Integer value1, Integer value2) {
            addCriterion("cron_id between", value1, value2, "cronId");
            return (Criteria) this;
        }

        public Criteria andCronIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cron_id not between", value1, value2, "cronId");
            return (Criteria) this;
        }

        public Criteria andCronKeyIsNull() {
            addCriterion("cron_key is null");
            return (Criteria) this;
        }

        public Criteria andCronKeyIsNotNull() {
            addCriterion("cron_key is not null");
            return (Criteria) this;
        }

        public Criteria andCronKeyEqualTo(String value) {
            addCriterion("cron_key =", value, "cronKey");
            return (Criteria) this;
        }

        public Criteria andCronKeyNotEqualTo(String value) {
            addCriterion("cron_key <>", value, "cronKey");
            return (Criteria) this;
        }

        public Criteria andCronKeyGreaterThan(String value) {
            addCriterion("cron_key >", value, "cronKey");
            return (Criteria) this;
        }

        public Criteria andCronKeyGreaterThanOrEqualTo(String value) {
            addCriterion("cron_key >=", value, "cronKey");
            return (Criteria) this;
        }

        public Criteria andCronKeyLessThan(String value) {
            addCriterion("cron_key <", value, "cronKey");
            return (Criteria) this;
        }

        public Criteria andCronKeyLessThanOrEqualTo(String value) {
            addCriterion("cron_key <=", value, "cronKey");
            return (Criteria) this;
        }

        public Criteria andCronKeyLike(String value) {
            addCriterion("cron_key like", value, "cronKey");
            return (Criteria) this;
        }

        public Criteria andCronKeyNotLike(String value) {
            addCriterion("cron_key not like", value, "cronKey");
            return (Criteria) this;
        }

        public Criteria andCronKeyIn(List<String> values) {
            addCriterion("cron_key in", values, "cronKey");
            return (Criteria) this;
        }

        public Criteria andCronKeyNotIn(List<String> values) {
            addCriterion("cron_key not in", values, "cronKey");
            return (Criteria) this;
        }

        public Criteria andCronKeyBetween(String value1, String value2) {
            addCriterion("cron_key between", value1, value2, "cronKey");
            return (Criteria) this;
        }

        public Criteria andCronKeyNotBetween(String value1, String value2) {
            addCriterion("cron_key not between", value1, value2, "cronKey");
            return (Criteria) this;
        }

        public Criteria andCronExpressionIsNull() {
            addCriterion("cron_expression is null");
            return (Criteria) this;
        }

        public Criteria andCronExpressionIsNotNull() {
            addCriterion("cron_expression is not null");
            return (Criteria) this;
        }

        public Criteria andCronExpressionEqualTo(String value) {
            addCriterion("cron_expression =", value, "cronExpression");
            return (Criteria) this;
        }

        public Criteria andCronExpressionNotEqualTo(String value) {
            addCriterion("cron_expression <>", value, "cronExpression");
            return (Criteria) this;
        }

        public Criteria andCronExpressionGreaterThan(String value) {
            addCriterion("cron_expression >", value, "cronExpression");
            return (Criteria) this;
        }

        public Criteria andCronExpressionGreaterThanOrEqualTo(String value) {
            addCriterion("cron_expression >=", value, "cronExpression");
            return (Criteria) this;
        }

        public Criteria andCronExpressionLessThan(String value) {
            addCriterion("cron_expression <", value, "cronExpression");
            return (Criteria) this;
        }

        public Criteria andCronExpressionLessThanOrEqualTo(String value) {
            addCriterion("cron_expression <=", value, "cronExpression");
            return (Criteria) this;
        }

        public Criteria andCronExpressionLike(String value) {
            addCriterion("cron_expression like", value, "cronExpression");
            return (Criteria) this;
        }

        public Criteria andCronExpressionNotLike(String value) {
            addCriterion("cron_expression not like", value, "cronExpression");
            return (Criteria) this;
        }

        public Criteria andCronExpressionIn(List<String> values) {
            addCriterion("cron_expression in", values, "cronExpression");
            return (Criteria) this;
        }

        public Criteria andCronExpressionNotIn(List<String> values) {
            addCriterion("cron_expression not in", values, "cronExpression");
            return (Criteria) this;
        }

        public Criteria andCronExpressionBetween(String value1, String value2) {
            addCriterion("cron_expression between", value1, value2, "cronExpression");
            return (Criteria) this;
        }

        public Criteria andCronExpressionNotBetween(String value1, String value2) {
            addCriterion("cron_expression not between", value1, value2, "cronExpression");
            return (Criteria) this;
        }

        public Criteria andTaskExplainIsNull() {
            addCriterion("task_explain is null");
            return (Criteria) this;
        }

        public Criteria andTaskExplainIsNotNull() {
            addCriterion("task_explain is not null");
            return (Criteria) this;
        }

        public Criteria andTaskExplainEqualTo(String value) {
            addCriterion("task_explain =", value, "taskExplain");
            return (Criteria) this;
        }

        public Criteria andTaskExplainNotEqualTo(String value) {
            addCriterion("task_explain <>", value, "taskExplain");
            return (Criteria) this;
        }

        public Criteria andTaskExplainGreaterThan(String value) {
            addCriterion("task_explain >", value, "taskExplain");
            return (Criteria) this;
        }

        public Criteria andTaskExplainGreaterThanOrEqualTo(String value) {
            addCriterion("task_explain >=", value, "taskExplain");
            return (Criteria) this;
        }

        public Criteria andTaskExplainLessThan(String value) {
            addCriterion("task_explain <", value, "taskExplain");
            return (Criteria) this;
        }

        public Criteria andTaskExplainLessThanOrEqualTo(String value) {
            addCriterion("task_explain <=", value, "taskExplain");
            return (Criteria) this;
        }

        public Criteria andTaskExplainLike(String value) {
            addCriterion("task_explain like", value, "taskExplain");
            return (Criteria) this;
        }

        public Criteria andTaskExplainNotLike(String value) {
            addCriterion("task_explain not like", value, "taskExplain");
            return (Criteria) this;
        }

        public Criteria andTaskExplainIn(List<String> values) {
            addCriterion("task_explain in", values, "taskExplain");
            return (Criteria) this;
        }

        public Criteria andTaskExplainNotIn(List<String> values) {
            addCriterion("task_explain not in", values, "taskExplain");
            return (Criteria) this;
        }

        public Criteria andTaskExplainBetween(String value1, String value2) {
            addCriterion("task_explain between", value1, value2, "taskExplain");
            return (Criteria) this;
        }

        public Criteria andTaskExplainNotBetween(String value1, String value2) {
            addCriterion("task_explain not between", value1, value2, "taskExplain");
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