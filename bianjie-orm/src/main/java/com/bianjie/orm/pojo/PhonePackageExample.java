package com.bianjie.orm.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PhonePackageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PhonePackageExample() {
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

        public Criteria andMvnoIsNull() {
            addCriterion("mvno is null");
            return (Criteria) this;
        }

        public Criteria andMvnoIsNotNull() {
            addCriterion("mvno is not null");
            return (Criteria) this;
        }

        public Criteria andMvnoEqualTo(String value) {
            addCriterion("mvno =", value, "mvno");
            return (Criteria) this;
        }

        public Criteria andMvnoNotEqualTo(String value) {
            addCriterion("mvno <>", value, "mvno");
            return (Criteria) this;
        }

        public Criteria andMvnoGreaterThan(String value) {
            addCriterion("mvno >", value, "mvno");
            return (Criteria) this;
        }

        public Criteria andMvnoGreaterThanOrEqualTo(String value) {
            addCriterion("mvno >=", value, "mvno");
            return (Criteria) this;
        }

        public Criteria andMvnoLessThan(String value) {
            addCriterion("mvno <", value, "mvno");
            return (Criteria) this;
        }

        public Criteria andMvnoLessThanOrEqualTo(String value) {
            addCriterion("mvno <=", value, "mvno");
            return (Criteria) this;
        }

        public Criteria andMvnoLike(String value) {
            addCriterion("mvno like", value, "mvno");
            return (Criteria) this;
        }

        public Criteria andMvnoNotLike(String value) {
            addCriterion("mvno not like", value, "mvno");
            return (Criteria) this;
        }

        public Criteria andMvnoIn(List<String> values) {
            addCriterion("mvno in", values, "mvno");
            return (Criteria) this;
        }

        public Criteria andMvnoNotIn(List<String> values) {
            addCriterion("mvno not in", values, "mvno");
            return (Criteria) this;
        }

        public Criteria andMvnoBetween(String value1, String value2) {
            addCriterion("mvno between", value1, value2, "mvno");
            return (Criteria) this;
        }

        public Criteria andMvnoNotBetween(String value1, String value2) {
            addCriterion("mvno not between", value1, value2, "mvno");
            return (Criteria) this;
        }

        public Criteria andMnoIsNull() {
            addCriterion("mno is null");
            return (Criteria) this;
        }

        public Criteria andMnoIsNotNull() {
            addCriterion("mno is not null");
            return (Criteria) this;
        }

        public Criteria andMnoEqualTo(Integer value) {
            addCriterion("mno =", value, "mno");
            return (Criteria) this;
        }

        public Criteria andMnoNotEqualTo(Integer value) {
            addCriterion("mno <>", value, "mno");
            return (Criteria) this;
        }

        public Criteria andMnoGreaterThan(Integer value) {
            addCriterion("mno >", value, "mno");
            return (Criteria) this;
        }

        public Criteria andMnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("mno >=", value, "mno");
            return (Criteria) this;
        }

        public Criteria andMnoLessThan(Integer value) {
            addCriterion("mno <", value, "mno");
            return (Criteria) this;
        }

        public Criteria andMnoLessThanOrEqualTo(Integer value) {
            addCriterion("mno <=", value, "mno");
            return (Criteria) this;
        }

        public Criteria andMnoIn(List<Integer> values) {
            addCriterion("mno in", values, "mno");
            return (Criteria) this;
        }

        public Criteria andMnoNotIn(List<Integer> values) {
            addCriterion("mno not in", values, "mno");
            return (Criteria) this;
        }

        public Criteria andMnoBetween(Integer value1, Integer value2) {
            addCriterion("mno between", value1, value2, "mno");
            return (Criteria) this;
        }

        public Criteria andMnoNotBetween(Integer value1, Integer value2) {
            addCriterion("mno not between", value1, value2, "mno");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNull() {
            addCriterion("category is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNotNull() {
            addCriterion("category is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryEqualTo(Byte value) {
            addCriterion("category =", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotEqualTo(Byte value) {
            addCriterion("category <>", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThan(Byte value) {
            addCriterion("category >", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThanOrEqualTo(Byte value) {
            addCriterion("category >=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThan(Byte value) {
            addCriterion("category <", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThanOrEqualTo(Byte value) {
            addCriterion("category <=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryIn(List<Byte> values) {
            addCriterion("category in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotIn(List<Byte> values) {
            addCriterion("category not in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryBetween(Byte value1, Byte value2) {
            addCriterion("category between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotBetween(Byte value1, Byte value2) {
            addCriterion("category not between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andOptionalIsNull() {
            addCriterion("optional is null");
            return (Criteria) this;
        }

        public Criteria andOptionalIsNotNull() {
            addCriterion("optional is not null");
            return (Criteria) this;
        }

        public Criteria andOptionalEqualTo(Boolean value) {
            addCriterion("optional =", value, "optional");
            return (Criteria) this;
        }

        public Criteria andOptionalNotEqualTo(Boolean value) {
            addCriterion("optional <>", value, "optional");
            return (Criteria) this;
        }

        public Criteria andOptionalGreaterThan(Boolean value) {
            addCriterion("optional >", value, "optional");
            return (Criteria) this;
        }

        public Criteria andOptionalGreaterThanOrEqualTo(Boolean value) {
            addCriterion("optional >=", value, "optional");
            return (Criteria) this;
        }

        public Criteria andOptionalLessThan(Boolean value) {
            addCriterion("optional <", value, "optional");
            return (Criteria) this;
        }

        public Criteria andOptionalLessThanOrEqualTo(Boolean value) {
            addCriterion("optional <=", value, "optional");
            return (Criteria) this;
        }

        public Criteria andOptionalIn(List<Boolean> values) {
            addCriterion("optional in", values, "optional");
            return (Criteria) this;
        }

        public Criteria andOptionalNotIn(List<Boolean> values) {
            addCriterion("optional not in", values, "optional");
            return (Criteria) this;
        }

        public Criteria andOptionalBetween(Boolean value1, Boolean value2) {
            addCriterion("optional between", value1, value2, "optional");
            return (Criteria) this;
        }

        public Criteria andOptionalNotBetween(Boolean value1, Boolean value2) {
            addCriterion("optional not between", value1, value2, "optional");
            return (Criteria) this;
        }

        public Criteria andLowFeeIsNull() {
            addCriterion("low_fee is null");
            return (Criteria) this;
        }

        public Criteria andLowFeeIsNotNull() {
            addCriterion("low_fee is not null");
            return (Criteria) this;
        }

        public Criteria andLowFeeEqualTo(Integer value) {
            addCriterion("low_fee =", value, "lowFee");
            return (Criteria) this;
        }

        public Criteria andLowFeeNotEqualTo(Integer value) {
            addCriterion("low_fee <>", value, "lowFee");
            return (Criteria) this;
        }

        public Criteria andLowFeeGreaterThan(Integer value) {
            addCriterion("low_fee >", value, "lowFee");
            return (Criteria) this;
        }

        public Criteria andLowFeeGreaterThanOrEqualTo(Integer value) {
            addCriterion("low_fee >=", value, "lowFee");
            return (Criteria) this;
        }

        public Criteria andLowFeeLessThan(Integer value) {
            addCriterion("low_fee <", value, "lowFee");
            return (Criteria) this;
        }

        public Criteria andLowFeeLessThanOrEqualTo(Integer value) {
            addCriterion("low_fee <=", value, "lowFee");
            return (Criteria) this;
        }

        public Criteria andLowFeeIn(List<Integer> values) {
            addCriterion("low_fee in", values, "lowFee");
            return (Criteria) this;
        }

        public Criteria andLowFeeNotIn(List<Integer> values) {
            addCriterion("low_fee not in", values, "lowFee");
            return (Criteria) this;
        }

        public Criteria andLowFeeBetween(Integer value1, Integer value2) {
            addCriterion("low_fee between", value1, value2, "lowFee");
            return (Criteria) this;
        }

        public Criteria andLowFeeNotBetween(Integer value1, Integer value2) {
            addCriterion("low_fee not between", value1, value2, "lowFee");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNull() {
            addCriterion("money is null");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNotNull() {
            addCriterion("money is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyEqualTo(Integer value) {
            addCriterion("money =", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotEqualTo(Integer value) {
            addCriterion("money <>", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThan(Integer value) {
            addCriterion("money >", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("money >=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThan(Integer value) {
            addCriterion("money <", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThanOrEqualTo(Integer value) {
            addCriterion("money <=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyIn(List<Integer> values) {
            addCriterion("money in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotIn(List<Integer> values) {
            addCriterion("money not in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyBetween(Integer value1, Integer value2) {
            addCriterion("money between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("money not between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andExtCodeIsNull() {
            addCriterion("ext_code is null");
            return (Criteria) this;
        }

        public Criteria andExtCodeIsNotNull() {
            addCriterion("ext_code is not null");
            return (Criteria) this;
        }

        public Criteria andExtCodeEqualTo(String value) {
            addCriterion("ext_code =", value, "extCode");
            return (Criteria) this;
        }

        public Criteria andExtCodeNotEqualTo(String value) {
            addCriterion("ext_code <>", value, "extCode");
            return (Criteria) this;
        }

        public Criteria andExtCodeGreaterThan(String value) {
            addCriterion("ext_code >", value, "extCode");
            return (Criteria) this;
        }

        public Criteria andExtCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ext_code >=", value, "extCode");
            return (Criteria) this;
        }

        public Criteria andExtCodeLessThan(String value) {
            addCriterion("ext_code <", value, "extCode");
            return (Criteria) this;
        }

        public Criteria andExtCodeLessThanOrEqualTo(String value) {
            addCriterion("ext_code <=", value, "extCode");
            return (Criteria) this;
        }

        public Criteria andExtCodeLike(String value) {
            addCriterion("ext_code like", value, "extCode");
            return (Criteria) this;
        }

        public Criteria andExtCodeNotLike(String value) {
            addCriterion("ext_code not like", value, "extCode");
            return (Criteria) this;
        }

        public Criteria andExtCodeIn(List<String> values) {
            addCriterion("ext_code in", values, "extCode");
            return (Criteria) this;
        }

        public Criteria andExtCodeNotIn(List<String> values) {
            addCriterion("ext_code not in", values, "extCode");
            return (Criteria) this;
        }

        public Criteria andExtCodeBetween(String value1, String value2) {
            addCriterion("ext_code between", value1, value2, "extCode");
            return (Criteria) this;
        }

        public Criteria andExtCodeNotBetween(String value1, String value2) {
            addCriterion("ext_code not between", value1, value2, "extCode");
            return (Criteria) this;
        }

        public Criteria andExtNameIsNull() {
            addCriterion("ext_name is null");
            return (Criteria) this;
        }

        public Criteria andExtNameIsNotNull() {
            addCriterion("ext_name is not null");
            return (Criteria) this;
        }

        public Criteria andExtNameEqualTo(String value) {
            addCriterion("ext_name =", value, "extName");
            return (Criteria) this;
        }

        public Criteria andExtNameNotEqualTo(String value) {
            addCriterion("ext_name <>", value, "extName");
            return (Criteria) this;
        }

        public Criteria andExtNameGreaterThan(String value) {
            addCriterion("ext_name >", value, "extName");
            return (Criteria) this;
        }

        public Criteria andExtNameGreaterThanOrEqualTo(String value) {
            addCriterion("ext_name >=", value, "extName");
            return (Criteria) this;
        }

        public Criteria andExtNameLessThan(String value) {
            addCriterion("ext_name <", value, "extName");
            return (Criteria) this;
        }

        public Criteria andExtNameLessThanOrEqualTo(String value) {
            addCriterion("ext_name <=", value, "extName");
            return (Criteria) this;
        }

        public Criteria andExtNameLike(String value) {
            addCriterion("ext_name like", value, "extName");
            return (Criteria) this;
        }

        public Criteria andExtNameNotLike(String value) {
            addCriterion("ext_name not like", value, "extName");
            return (Criteria) this;
        }

        public Criteria andExtNameIn(List<String> values) {
            addCriterion("ext_name in", values, "extName");
            return (Criteria) this;
        }

        public Criteria andExtNameNotIn(List<String> values) {
            addCriterion("ext_name not in", values, "extName");
            return (Criteria) this;
        }

        public Criteria andExtNameBetween(String value1, String value2) {
            addCriterion("ext_name between", value1, value2, "extName");
            return (Criteria) this;
        }

        public Criteria andExtNameNotBetween(String value1, String value2) {
            addCriterion("ext_name not between", value1, value2, "extName");
            return (Criteria) this;
        }

        public Criteria andExtLowFeeIsNull() {
            addCriterion("ext_low_fee is null");
            return (Criteria) this;
        }

        public Criteria andExtLowFeeIsNotNull() {
            addCriterion("ext_low_fee is not null");
            return (Criteria) this;
        }

        public Criteria andExtLowFeeEqualTo(Integer value) {
            addCriterion("ext_low_fee =", value, "extLowFee");
            return (Criteria) this;
        }

        public Criteria andExtLowFeeNotEqualTo(Integer value) {
            addCriterion("ext_low_fee <>", value, "extLowFee");
            return (Criteria) this;
        }

        public Criteria andExtLowFeeGreaterThan(Integer value) {
            addCriterion("ext_low_fee >", value, "extLowFee");
            return (Criteria) this;
        }

        public Criteria andExtLowFeeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ext_low_fee >=", value, "extLowFee");
            return (Criteria) this;
        }

        public Criteria andExtLowFeeLessThan(Integer value) {
            addCriterion("ext_low_fee <", value, "extLowFee");
            return (Criteria) this;
        }

        public Criteria andExtLowFeeLessThanOrEqualTo(Integer value) {
            addCriterion("ext_low_fee <=", value, "extLowFee");
            return (Criteria) this;
        }

        public Criteria andExtLowFeeIn(List<Integer> values) {
            addCriterion("ext_low_fee in", values, "extLowFee");
            return (Criteria) this;
        }

        public Criteria andExtLowFeeNotIn(List<Integer> values) {
            addCriterion("ext_low_fee not in", values, "extLowFee");
            return (Criteria) this;
        }

        public Criteria andExtLowFeeBetween(Integer value1, Integer value2) {
            addCriterion("ext_low_fee between", value1, value2, "extLowFee");
            return (Criteria) this;
        }

        public Criteria andExtLowFeeNotBetween(Integer value1, Integer value2) {
            addCriterion("ext_low_fee not between", value1, value2, "extLowFee");
            return (Criteria) this;
        }

        public Criteria andExtMoneyIsNull() {
            addCriterion("ext_money is null");
            return (Criteria) this;
        }

        public Criteria andExtMoneyIsNotNull() {
            addCriterion("ext_money is not null");
            return (Criteria) this;
        }

        public Criteria andExtMoneyEqualTo(Integer value) {
            addCriterion("ext_money =", value, "extMoney");
            return (Criteria) this;
        }

        public Criteria andExtMoneyNotEqualTo(Integer value) {
            addCriterion("ext_money <>", value, "extMoney");
            return (Criteria) this;
        }

        public Criteria andExtMoneyGreaterThan(Integer value) {
            addCriterion("ext_money >", value, "extMoney");
            return (Criteria) this;
        }

        public Criteria andExtMoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("ext_money >=", value, "extMoney");
            return (Criteria) this;
        }

        public Criteria andExtMoneyLessThan(Integer value) {
            addCriterion("ext_money <", value, "extMoney");
            return (Criteria) this;
        }

        public Criteria andExtMoneyLessThanOrEqualTo(Integer value) {
            addCriterion("ext_money <=", value, "extMoney");
            return (Criteria) this;
        }

        public Criteria andExtMoneyIn(List<Integer> values) {
            addCriterion("ext_money in", values, "extMoney");
            return (Criteria) this;
        }

        public Criteria andExtMoneyNotIn(List<Integer> values) {
            addCriterion("ext_money not in", values, "extMoney");
            return (Criteria) this;
        }

        public Criteria andExtMoneyBetween(Integer value1, Integer value2) {
            addCriterion("ext_money between", value1, value2, "extMoney");
            return (Criteria) this;
        }

        public Criteria andExtMoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("ext_money not between", value1, value2, "extMoney");
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

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Byte value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Byte value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Byte value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Byte value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Byte value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Byte> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Byte> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Byte value1, Byte value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andNbrTypeIsNull() {
            addCriterion("nbr_type is null");
            return (Criteria) this;
        }

        public Criteria andNbrTypeIsNotNull() {
            addCriterion("nbr_type is not null");
            return (Criteria) this;
        }

        public Criteria andNbrTypeEqualTo(Byte value) {
            addCriterion("nbr_type =", value, "nbrType");
            return (Criteria) this;
        }

        public Criteria andNbrTypeNotEqualTo(Byte value) {
            addCriterion("nbr_type <>", value, "nbrType");
            return (Criteria) this;
        }

        public Criteria andNbrTypeGreaterThan(Byte value) {
            addCriterion("nbr_type >", value, "nbrType");
            return (Criteria) this;
        }

        public Criteria andNbrTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("nbr_type >=", value, "nbrType");
            return (Criteria) this;
        }

        public Criteria andNbrTypeLessThan(Byte value) {
            addCriterion("nbr_type <", value, "nbrType");
            return (Criteria) this;
        }

        public Criteria andNbrTypeLessThanOrEqualTo(Byte value) {
            addCriterion("nbr_type <=", value, "nbrType");
            return (Criteria) this;
        }

        public Criteria andNbrTypeIn(List<Byte> values) {
            addCriterion("nbr_type in", values, "nbrType");
            return (Criteria) this;
        }

        public Criteria andNbrTypeNotIn(List<Byte> values) {
            addCriterion("nbr_type not in", values, "nbrType");
            return (Criteria) this;
        }

        public Criteria andNbrTypeBetween(Byte value1, Byte value2) {
            addCriterion("nbr_type between", value1, value2, "nbrType");
            return (Criteria) this;
        }

        public Criteria andNbrTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("nbr_type not between", value1, value2, "nbrType");
            return (Criteria) this;
        }

        public Criteria andServTypeIsNull() {
            addCriterion("serv_type is null");
            return (Criteria) this;
        }

        public Criteria andServTypeIsNotNull() {
            addCriterion("serv_type is not null");
            return (Criteria) this;
        }

        public Criteria andServTypeEqualTo(Byte value) {
            addCriterion("serv_type =", value, "servType");
            return (Criteria) this;
        }

        public Criteria andServTypeNotEqualTo(Byte value) {
            addCriterion("serv_type <>", value, "servType");
            return (Criteria) this;
        }

        public Criteria andServTypeGreaterThan(Byte value) {
            addCriterion("serv_type >", value, "servType");
            return (Criteria) this;
        }

        public Criteria andServTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("serv_type >=", value, "servType");
            return (Criteria) this;
        }

        public Criteria andServTypeLessThan(Byte value) {
            addCriterion("serv_type <", value, "servType");
            return (Criteria) this;
        }

        public Criteria andServTypeLessThanOrEqualTo(Byte value) {
            addCriterion("serv_type <=", value, "servType");
            return (Criteria) this;
        }

        public Criteria andServTypeIn(List<Byte> values) {
            addCriterion("serv_type in", values, "servType");
            return (Criteria) this;
        }

        public Criteria andServTypeNotIn(List<Byte> values) {
            addCriterion("serv_type not in", values, "servType");
            return (Criteria) this;
        }

        public Criteria andServTypeBetween(Byte value1, Byte value2) {
            addCriterion("serv_type between", value1, value2, "servType");
            return (Criteria) this;
        }

        public Criteria andServTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("serv_type not between", value1, value2, "servType");
            return (Criteria) this;
        }

        public Criteria andParentCodeIsNull() {
            addCriterion("parent_code is null");
            return (Criteria) this;
        }

        public Criteria andParentCodeIsNotNull() {
            addCriterion("parent_code is not null");
            return (Criteria) this;
        }

        public Criteria andParentCodeEqualTo(String value) {
            addCriterion("parent_code =", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeNotEqualTo(String value) {
            addCriterion("parent_code <>", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeGreaterThan(String value) {
            addCriterion("parent_code >", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeGreaterThanOrEqualTo(String value) {
            addCriterion("parent_code >=", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeLessThan(String value) {
            addCriterion("parent_code <", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeLessThanOrEqualTo(String value) {
            addCriterion("parent_code <=", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeLike(String value) {
            addCriterion("parent_code like", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeNotLike(String value) {
            addCriterion("parent_code not like", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeIn(List<String> values) {
            addCriterion("parent_code in", values, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeNotIn(List<String> values) {
            addCriterion("parent_code not in", values, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeBetween(String value1, String value2) {
            addCriterion("parent_code between", value1, value2, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeNotBetween(String value1, String value2) {
            addCriterion("parent_code not between", value1, value2, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentServTypeIsNull() {
            addCriterion("parent_serv_type is null");
            return (Criteria) this;
        }

        public Criteria andParentServTypeIsNotNull() {
            addCriterion("parent_serv_type is not null");
            return (Criteria) this;
        }

        public Criteria andParentServTypeEqualTo(Byte value) {
            addCriterion("parent_serv_type =", value, "parentServType");
            return (Criteria) this;
        }

        public Criteria andParentServTypeNotEqualTo(Byte value) {
            addCriterion("parent_serv_type <>", value, "parentServType");
            return (Criteria) this;
        }

        public Criteria andParentServTypeGreaterThan(Byte value) {
            addCriterion("parent_serv_type >", value, "parentServType");
            return (Criteria) this;
        }

        public Criteria andParentServTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("parent_serv_type >=", value, "parentServType");
            return (Criteria) this;
        }

        public Criteria andParentServTypeLessThan(Byte value) {
            addCriterion("parent_serv_type <", value, "parentServType");
            return (Criteria) this;
        }

        public Criteria andParentServTypeLessThanOrEqualTo(Byte value) {
            addCriterion("parent_serv_type <=", value, "parentServType");
            return (Criteria) this;
        }

        public Criteria andParentServTypeIn(List<Byte> values) {
            addCriterion("parent_serv_type in", values, "parentServType");
            return (Criteria) this;
        }

        public Criteria andParentServTypeNotIn(List<Byte> values) {
            addCriterion("parent_serv_type not in", values, "parentServType");
            return (Criteria) this;
        }

        public Criteria andParentServTypeBetween(Byte value1, Byte value2) {
            addCriterion("parent_serv_type between", value1, value2, "parentServType");
            return (Criteria) this;
        }

        public Criteria andParentServTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("parent_serv_type not between", value1, value2, "parentServType");
            return (Criteria) this;
        }

        public Criteria andServiceDescIsNull() {
            addCriterion("service_desc is null");
            return (Criteria) this;
        }

        public Criteria andServiceDescIsNotNull() {
            addCriterion("service_desc is not null");
            return (Criteria) this;
        }

        public Criteria andServiceDescEqualTo(String value) {
            addCriterion("service_desc =", value, "serviceDesc");
            return (Criteria) this;
        }

        public Criteria andServiceDescNotEqualTo(String value) {
            addCriterion("service_desc <>", value, "serviceDesc");
            return (Criteria) this;
        }

        public Criteria andServiceDescGreaterThan(String value) {
            addCriterion("service_desc >", value, "serviceDesc");
            return (Criteria) this;
        }

        public Criteria andServiceDescGreaterThanOrEqualTo(String value) {
            addCriterion("service_desc >=", value, "serviceDesc");
            return (Criteria) this;
        }

        public Criteria andServiceDescLessThan(String value) {
            addCriterion("service_desc <", value, "serviceDesc");
            return (Criteria) this;
        }

        public Criteria andServiceDescLessThanOrEqualTo(String value) {
            addCriterion("service_desc <=", value, "serviceDesc");
            return (Criteria) this;
        }

        public Criteria andServiceDescLike(String value) {
            addCriterion("service_desc like", value, "serviceDesc");
            return (Criteria) this;
        }

        public Criteria andServiceDescNotLike(String value) {
            addCriterion("service_desc not like", value, "serviceDesc");
            return (Criteria) this;
        }

        public Criteria andServiceDescIn(List<String> values) {
            addCriterion("service_desc in", values, "serviceDesc");
            return (Criteria) this;
        }

        public Criteria andServiceDescNotIn(List<String> values) {
            addCriterion("service_desc not in", values, "serviceDesc");
            return (Criteria) this;
        }

        public Criteria andServiceDescBetween(String value1, String value2) {
            addCriterion("service_desc between", value1, value2, "serviceDesc");
            return (Criteria) this;
        }

        public Criteria andServiceDescNotBetween(String value1, String value2) {
            addCriterion("service_desc not between", value1, value2, "serviceDesc");
            return (Criteria) this;
        }

        public Criteria andDefaultFlagIsNull() {
            addCriterion("default_flag is null");
            return (Criteria) this;
        }

        public Criteria andDefaultFlagIsNotNull() {
            addCriterion("default_flag is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultFlagEqualTo(Boolean value) {
            addCriterion("default_flag =", value, "defaultFlag");
            return (Criteria) this;
        }

        public Criteria andDefaultFlagNotEqualTo(Boolean value) {
            addCriterion("default_flag <>", value, "defaultFlag");
            return (Criteria) this;
        }

        public Criteria andDefaultFlagGreaterThan(Boolean value) {
            addCriterion("default_flag >", value, "defaultFlag");
            return (Criteria) this;
        }

        public Criteria andDefaultFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("default_flag >=", value, "defaultFlag");
            return (Criteria) this;
        }

        public Criteria andDefaultFlagLessThan(Boolean value) {
            addCriterion("default_flag <", value, "defaultFlag");
            return (Criteria) this;
        }

        public Criteria andDefaultFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("default_flag <=", value, "defaultFlag");
            return (Criteria) this;
        }

        public Criteria andDefaultFlagIn(List<Boolean> values) {
            addCriterion("default_flag in", values, "defaultFlag");
            return (Criteria) this;
        }

        public Criteria andDefaultFlagNotIn(List<Boolean> values) {
            addCriterion("default_flag not in", values, "defaultFlag");
            return (Criteria) this;
        }

        public Criteria andDefaultFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("default_flag between", value1, value2, "defaultFlag");
            return (Criteria) this;
        }

        public Criteria andDefaultFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("default_flag not between", value1, value2, "defaultFlag");
            return (Criteria) this;
        }

        public Criteria andTagIsNull() {
            addCriterion("tag is null");
            return (Criteria) this;
        }

        public Criteria andTagIsNotNull() {
            addCriterion("tag is not null");
            return (Criteria) this;
        }

        public Criteria andTagEqualTo(String value) {
            addCriterion("tag =", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotEqualTo(String value) {
            addCriterion("tag <>", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagGreaterThan(String value) {
            addCriterion("tag >", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagGreaterThanOrEqualTo(String value) {
            addCriterion("tag >=", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagLessThan(String value) {
            addCriterion("tag <", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagLessThanOrEqualTo(String value) {
            addCriterion("tag <=", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagLike(String value) {
            addCriterion("tag like", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotLike(String value) {
            addCriterion("tag not like", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagIn(List<String> values) {
            addCriterion("tag in", values, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotIn(List<String> values) {
            addCriterion("tag not in", values, "tag");
            return (Criteria) this;
        }

        public Criteria andTagBetween(String value1, String value2) {
            addCriterion("tag between", value1, value2, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotBetween(String value1, String value2) {
            addCriterion("tag not between", value1, value2, "tag");
            return (Criteria) this;
        }

        public Criteria andCreatorIdIsNull() {
            addCriterion("creator_id is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIdIsNotNull() {
            addCriterion("creator_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorIdEqualTo(Integer value) {
            addCriterion("creator_id =", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdNotEqualTo(Integer value) {
            addCriterion("creator_id <>", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdGreaterThan(Integer value) {
            addCriterion("creator_id >", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("creator_id >=", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdLessThan(Integer value) {
            addCriterion("creator_id <", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdLessThanOrEqualTo(Integer value) {
            addCriterion("creator_id <=", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdIn(List<Integer> values) {
            addCriterion("creator_id in", values, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdNotIn(List<Integer> values) {
            addCriterion("creator_id not in", values, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdBetween(Integer value1, Integer value2) {
            addCriterion("creator_id between", value1, value2, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("creator_id not between", value1, value2, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andModifierIdIsNull() {
            addCriterion("modifier_id is null");
            return (Criteria) this;
        }

        public Criteria andModifierIdIsNotNull() {
            addCriterion("modifier_id is not null");
            return (Criteria) this;
        }

        public Criteria andModifierIdEqualTo(Integer value) {
            addCriterion("modifier_id =", value, "modifierId");
            return (Criteria) this;
        }

        public Criteria andModifierIdNotEqualTo(Integer value) {
            addCriterion("modifier_id <>", value, "modifierId");
            return (Criteria) this;
        }

        public Criteria andModifierIdGreaterThan(Integer value) {
            addCriterion("modifier_id >", value, "modifierId");
            return (Criteria) this;
        }

        public Criteria andModifierIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("modifier_id >=", value, "modifierId");
            return (Criteria) this;
        }

        public Criteria andModifierIdLessThan(Integer value) {
            addCriterion("modifier_id <", value, "modifierId");
            return (Criteria) this;
        }

        public Criteria andModifierIdLessThanOrEqualTo(Integer value) {
            addCriterion("modifier_id <=", value, "modifierId");
            return (Criteria) this;
        }

        public Criteria andModifierIdIn(List<Integer> values) {
            addCriterion("modifier_id in", values, "modifierId");
            return (Criteria) this;
        }

        public Criteria andModifierIdNotIn(List<Integer> values) {
            addCriterion("modifier_id not in", values, "modifierId");
            return (Criteria) this;
        }

        public Criteria andModifierIdBetween(Integer value1, Integer value2) {
            addCriterion("modifier_id between", value1, value2, "modifierId");
            return (Criteria) this;
        }

        public Criteria andModifierIdNotBetween(Integer value1, Integer value2) {
            addCriterion("modifier_id not between", value1, value2, "modifierId");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNull() {
            addCriterion("modify_time is null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNotNull() {
            addCriterion("modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeEqualTo(Date value) {
            addCriterion("modify_time =", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotEqualTo(Date value) {
            addCriterion("modify_time <>", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThan(Date value) {
            addCriterion("modify_time >", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("modify_time >=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThan(Date value) {
            addCriterion("modify_time <", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("modify_time <=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIn(List<Date> values) {
            addCriterion("modify_time in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotIn(List<Date> values) {
            addCriterion("modify_time not in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeBetween(Date value1, Date value2) {
            addCriterion("modify_time between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("modify_time not between", value1, value2, "modifyTime");
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