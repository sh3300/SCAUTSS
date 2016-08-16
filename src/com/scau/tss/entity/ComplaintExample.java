package com.scau.tss.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ComplaintExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ComplaintExample() {
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

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTouristIdIsNull() {
            addCriterion("tourist_id is null");
            return (Criteria) this;
        }

        public Criteria andTouristIdIsNotNull() {
            addCriterion("tourist_id is not null");
            return (Criteria) this;
        }

        public Criteria andTouristIdEqualTo(String value) {
            addCriterion("tourist_id =", value, "touristId");
            return (Criteria) this;
        }

        public Criteria andTouristIdNotEqualTo(String value) {
            addCriterion("tourist_id <>", value, "touristId");
            return (Criteria) this;
        }

        public Criteria andTouristIdGreaterThan(String value) {
            addCriterion("tourist_id >", value, "touristId");
            return (Criteria) this;
        }

        public Criteria andTouristIdGreaterThanOrEqualTo(String value) {
            addCriterion("tourist_id >=", value, "touristId");
            return (Criteria) this;
        }

        public Criteria andTouristIdLessThan(String value) {
            addCriterion("tourist_id <", value, "touristId");
            return (Criteria) this;
        }

        public Criteria andTouristIdLessThanOrEqualTo(String value) {
            addCriterion("tourist_id <=", value, "touristId");
            return (Criteria) this;
        }

        public Criteria andTouristIdLike(String value) {
            addCriterion("tourist_id like", value, "touristId");
            return (Criteria) this;
        }

        public Criteria andTouristIdNotLike(String value) {
            addCriterion("tourist_id not like", value, "touristId");
            return (Criteria) this;
        }

        public Criteria andTouristIdIn(List<String> values) {
            addCriterion("tourist_id in", values, "touristId");
            return (Criteria) this;
        }

        public Criteria andTouristIdNotIn(List<String> values) {
            addCriterion("tourist_id not in", values, "touristId");
            return (Criteria) this;
        }

        public Criteria andTouristIdBetween(String value1, String value2) {
            addCriterion("tourist_id between", value1, value2, "touristId");
            return (Criteria) this;
        }

        public Criteria andTouristIdNotBetween(String value1, String value2) {
            addCriterion("tourist_id not between", value1, value2, "touristId");
            return (Criteria) this;
        }

        public Criteria andTimesIsNull() {
            addCriterion("times is null");
            return (Criteria) this;
        }

        public Criteria andTimesIsNotNull() {
            addCriterion("times is not null");
            return (Criteria) this;
        }

        public Criteria andTimesEqualTo(Date value) {
            addCriterionForJDBCDate("times =", value, "times");
            return (Criteria) this;
        }

        public Criteria andTimesNotEqualTo(Date value) {
            addCriterionForJDBCDate("times <>", value, "times");
            return (Criteria) this;
        }

        public Criteria andTimesGreaterThan(Date value) {
            addCriterionForJDBCDate("times >", value, "times");
            return (Criteria) this;
        }

        public Criteria andTimesGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("times >=", value, "times");
            return (Criteria) this;
        }

        public Criteria andTimesLessThan(Date value) {
            addCriterionForJDBCDate("times <", value, "times");
            return (Criteria) this;
        }

        public Criteria andTimesLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("times <=", value, "times");
            return (Criteria) this;
        }

        public Criteria andTimesIn(List<Date> values) {
            addCriterionForJDBCDate("times in", values, "times");
            return (Criteria) this;
        }

        public Criteria andTimesNotIn(List<Date> values) {
            addCriterionForJDBCDate("times not in", values, "times");
            return (Criteria) this;
        }

        public Criteria andTimesBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("times between", value1, value2, "times");
            return (Criteria) this;
        }

        public Criteria andTimesNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("times not between", value1, value2, "times");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("state like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("state not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andAccessIsNull() {
            addCriterion("access is null");
            return (Criteria) this;
        }

        public Criteria andAccessIsNotNull() {
            addCriterion("access is not null");
            return (Criteria) this;
        }

        public Criteria andAccessEqualTo(Integer value) {
            addCriterion("access =", value, "access");
            return (Criteria) this;
        }

        public Criteria andAccessNotEqualTo(Integer value) {
            addCriterion("access <>", value, "access");
            return (Criteria) this;
        }

        public Criteria andAccessGreaterThan(Integer value) {
            addCriterion("access >", value, "access");
            return (Criteria) this;
        }

        public Criteria andAccessGreaterThanOrEqualTo(Integer value) {
            addCriterion("access >=", value, "access");
            return (Criteria) this;
        }

        public Criteria andAccessLessThan(Integer value) {
            addCriterion("access <", value, "access");
            return (Criteria) this;
        }

        public Criteria andAccessLessThanOrEqualTo(Integer value) {
            addCriterion("access <=", value, "access");
            return (Criteria) this;
        }

        public Criteria andAccessIn(List<Integer> values) {
            addCriterion("access in", values, "access");
            return (Criteria) this;
        }

        public Criteria andAccessNotIn(List<Integer> values) {
            addCriterion("access not in", values, "access");
            return (Criteria) this;
        }

        public Criteria andAccessBetween(Integer value1, Integer value2) {
            addCriterion("access between", value1, value2, "access");
            return (Criteria) this;
        }

        public Criteria andAccessNotBetween(Integer value1, Integer value2) {
            addCriterion("access not between", value1, value2, "access");
            return (Criteria) this;
        }

        public Criteria andExaminerIdIsNull() {
            addCriterion("examiner_id is null");
            return (Criteria) this;
        }

        public Criteria andExaminerIdIsNotNull() {
            addCriterion("examiner_id is not null");
            return (Criteria) this;
        }

        public Criteria andExaminerIdEqualTo(String value) {
            addCriterion("examiner_id =", value, "examinerId");
            return (Criteria) this;
        }

        public Criteria andExaminerIdNotEqualTo(String value) {
            addCriterion("examiner_id <>", value, "examinerId");
            return (Criteria) this;
        }

        public Criteria andExaminerIdGreaterThan(String value) {
            addCriterion("examiner_id >", value, "examinerId");
            return (Criteria) this;
        }

        public Criteria andExaminerIdGreaterThanOrEqualTo(String value) {
            addCriterion("examiner_id >=", value, "examinerId");
            return (Criteria) this;
        }

        public Criteria andExaminerIdLessThan(String value) {
            addCriterion("examiner_id <", value, "examinerId");
            return (Criteria) this;
        }

        public Criteria andExaminerIdLessThanOrEqualTo(String value) {
            addCriterion("examiner_id <=", value, "examinerId");
            return (Criteria) this;
        }

        public Criteria andExaminerIdLike(String value) {
            addCriterion("examiner_id like", value, "examinerId");
            return (Criteria) this;
        }

        public Criteria andExaminerIdNotLike(String value) {
            addCriterion("examiner_id not like", value, "examinerId");
            return (Criteria) this;
        }

        public Criteria andExaminerIdIn(List<String> values) {
            addCriterion("examiner_id in", values, "examinerId");
            return (Criteria) this;
        }

        public Criteria andExaminerIdNotIn(List<String> values) {
            addCriterion("examiner_id not in", values, "examinerId");
            return (Criteria) this;
        }

        public Criteria andExaminerIdBetween(String value1, String value2) {
            addCriterion("examiner_id between", value1, value2, "examinerId");
            return (Criteria) this;
        }

        public Criteria andExaminerIdNotBetween(String value1, String value2) {
            addCriterion("examiner_id not between", value1, value2, "examinerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdIsNull() {
            addCriterion("manager_id is null");
            return (Criteria) this;
        }

        public Criteria andManagerIdIsNotNull() {
            addCriterion("manager_id is not null");
            return (Criteria) this;
        }

        public Criteria andManagerIdEqualTo(String value) {
            addCriterion("manager_id =", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdNotEqualTo(String value) {
            addCriterion("manager_id <>", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdGreaterThan(String value) {
            addCriterion("manager_id >", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdGreaterThanOrEqualTo(String value) {
            addCriterion("manager_id >=", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdLessThan(String value) {
            addCriterion("manager_id <", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdLessThanOrEqualTo(String value) {
            addCriterion("manager_id <=", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdLike(String value) {
            addCriterion("manager_id like", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdNotLike(String value) {
            addCriterion("manager_id not like", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdIn(List<String> values) {
            addCriterion("manager_id in", values, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdNotIn(List<String> values) {
            addCriterion("manager_id not in", values, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdBetween(String value1, String value2) {
            addCriterion("manager_id between", value1, value2, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdNotBetween(String value1, String value2) {
            addCriterion("manager_id not between", value1, value2, "managerId");
            return (Criteria) this;
        }

        public Criteria andResultIdIsNull() {
            addCriterion("result_id is null");
            return (Criteria) this;
        }

        public Criteria andResultIdIsNotNull() {
            addCriterion("result_id is not null");
            return (Criteria) this;
        }

        public Criteria andResultIdEqualTo(String value) {
            addCriterion("result_id =", value, "resultId");
            return (Criteria) this;
        }

        public Criteria andResultIdNotEqualTo(String value) {
            addCriterion("result_id <>", value, "resultId");
            return (Criteria) this;
        }

        public Criteria andResultIdGreaterThan(String value) {
            addCriterion("result_id >", value, "resultId");
            return (Criteria) this;
        }

        public Criteria andResultIdGreaterThanOrEqualTo(String value) {
            addCriterion("result_id >=", value, "resultId");
            return (Criteria) this;
        }

        public Criteria andResultIdLessThan(String value) {
            addCriterion("result_id <", value, "resultId");
            return (Criteria) this;
        }

        public Criteria andResultIdLessThanOrEqualTo(String value) {
            addCriterion("result_id <=", value, "resultId");
            return (Criteria) this;
        }

        public Criteria andResultIdLike(String value) {
            addCriterion("result_id like", value, "resultId");
            return (Criteria) this;
        }

        public Criteria andResultIdNotLike(String value) {
            addCriterion("result_id not like", value, "resultId");
            return (Criteria) this;
        }

        public Criteria andResultIdIn(List<String> values) {
            addCriterion("result_id in", values, "resultId");
            return (Criteria) this;
        }

        public Criteria andResultIdNotIn(List<String> values) {
            addCriterion("result_id not in", values, "resultId");
            return (Criteria) this;
        }

        public Criteria andResultIdBetween(String value1, String value2) {
            addCriterion("result_id between", value1, value2, "resultId");
            return (Criteria) this;
        }

        public Criteria andResultIdNotBetween(String value1, String value2) {
            addCriterion("result_id not between", value1, value2, "resultId");
            return (Criteria) this;
        }

        public Criteria andResIdIsNull() {
            addCriterion("res_id is null");
            return (Criteria) this;
        }

        public Criteria andResIdIsNotNull() {
            addCriterion("res_id is not null");
            return (Criteria) this;
        }

        public Criteria andResIdEqualTo(Integer value) {
            addCriterion("res_id =", value, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdNotEqualTo(Integer value) {
            addCriterion("res_id <>", value, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdGreaterThan(Integer value) {
            addCriterion("res_id >", value, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("res_id >=", value, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdLessThan(Integer value) {
            addCriterion("res_id <", value, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdLessThanOrEqualTo(Integer value) {
            addCriterion("res_id <=", value, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdIn(List<Integer> values) {
            addCriterion("res_id in", values, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdNotIn(List<Integer> values) {
            addCriterion("res_id not in", values, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdBetween(Integer value1, Integer value2) {
            addCriterion("res_id between", value1, value2, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdNotBetween(Integer value1, Integer value2) {
            addCriterion("res_id not between", value1, value2, "resId");
            return (Criteria) this;
        }

        public Criteria andFilesIdIsNull() {
            addCriterion("files_id is null");
            return (Criteria) this;
        }

        public Criteria andFilesIdIsNotNull() {
            addCriterion("files_id is not null");
            return (Criteria) this;
        }

        public Criteria andFilesIdEqualTo(Integer value) {
            addCriterion("files_id =", value, "filesId");
            return (Criteria) this;
        }

        public Criteria andFilesIdNotEqualTo(Integer value) {
            addCriterion("files_id <>", value, "filesId");
            return (Criteria) this;
        }

        public Criteria andFilesIdGreaterThan(Integer value) {
            addCriterion("files_id >", value, "filesId");
            return (Criteria) this;
        }

        public Criteria andFilesIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("files_id >=", value, "filesId");
            return (Criteria) this;
        }

        public Criteria andFilesIdLessThan(Integer value) {
            addCriterion("files_id <", value, "filesId");
            return (Criteria) this;
        }

        public Criteria andFilesIdLessThanOrEqualTo(Integer value) {
            addCriterion("files_id <=", value, "filesId");
            return (Criteria) this;
        }

        public Criteria andFilesIdIn(List<Integer> values) {
            addCriterion("files_id in", values, "filesId");
            return (Criteria) this;
        }

        public Criteria andFilesIdNotIn(List<Integer> values) {
            addCriterion("files_id not in", values, "filesId");
            return (Criteria) this;
        }

        public Criteria andFilesIdBetween(Integer value1, Integer value2) {
            addCriterion("files_id between", value1, value2, "filesId");
            return (Criteria) this;
        }

        public Criteria andFilesIdNotBetween(Integer value1, Integer value2) {
            addCriterion("files_id not between", value1, value2, "filesId");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNull() {
            addCriterion("deleted is null");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNotNull() {
            addCriterion("deleted is not null");
            return (Criteria) this;
        }

        public Criteria andDeletedEqualTo(Byte value) {
            addCriterion("deleted =", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotEqualTo(Byte value) {
            addCriterion("deleted <>", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThan(Byte value) {
            addCriterion("deleted >", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThanOrEqualTo(Byte value) {
            addCriterion("deleted >=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThan(Byte value) {
            addCriterion("deleted <", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThanOrEqualTo(Byte value) {
            addCriterion("deleted <=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedIn(List<Byte> values) {
            addCriterion("deleted in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotIn(List<Byte> values) {
            addCriterion("deleted not in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedBetween(Byte value1, Byte value2) {
            addCriterion("deleted between", value1, value2, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotBetween(Byte value1, Byte value2) {
            addCriterion("deleted not between", value1, value2, "deleted");
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