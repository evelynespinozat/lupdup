package pmp.lupdup.dao.administrador.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import pmp.lupdup.general.util.CadenaUtil;

public class UbigeoParamDef {
	
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;
    
    public UbigeoParamDef() {
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
        
                
        
        public Criteria andSrlIdUbigeoEqualTo(Integer value) {
            addCriterion("id_ubigeo =", value, "id_ubigeo");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdUbigeoNotEqualTo(Integer value) {
            addCriterion("id_ubigeo <>", value, "id_ubigeo");
            return (Criteria) this;
        }
        
        
        public Criteria andSrlIdUbigeoIsNull() {
            addCriterion("id_ubigeo is null");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdUbigeoIsNotNull() {
            addCriterion("id_ubigeo is not null");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdUbigeoGreaterThan(Integer value) {
            addCriterion("id_ubigeo >", value, "id_ubigeo");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdUbigeoGreaterThanOrEqualTo(Integer value) {
            addCriterion("id_ubigeo >=", value, "id_ubigeo");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdUbigeoLessThan(Integer value) {
            addCriterion("id_ubigeo <", value, "id_ubigeo");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdUbigeoLessThanOrEqualTo(Integer value) {
            addCriterion("id_ubigeo <=", value, "id_ubigeo");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdUbigeoIn(List<Integer> values) {
            addCriterion("id_ubigeo in", values, "id_ubigeo");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdUbigeoNotIn(List<Integer> values) {
            addCriterion("id_ubigeo not in", values, "id_ubigeo");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdUbigeoBetween(Integer value1, Integer value2) {
            addCriterion("id_ubigeo between", value1, value2, "id_ubigeo");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdUbigeoNotBetween(Integer value1, Integer value2) {
            addCriterion("id_ubigeo not between", value1, value2, "id_ubigeo");
            return (Criteria) this;
        }
        
        
        public Criteria andIntIdDepartamentoEqualTo(Integer value) {
            addCriterion("id_departamento =", value, "id_departamento");
            return (Criteria) this;
        }
        
        public Criteria andIntIdDepartamentoNotEqualTo(Integer value) {
            addCriterion("id_departamento <>", value, "id_departamento");
            return (Criteria) this;
        }
        
        
        public Criteria andIntIdDepartamentoIsNull() {
            addCriterion("id_departamento is null");
            return (Criteria) this;
        }
        
        public Criteria andIntIdDepartamentoIsNotNull() {
            addCriterion("id_departamento is not null");
            return (Criteria) this;
        }
        
        public Criteria andIntIdDepartamentoGreaterThan(Integer value) {
            addCriterion("id_departamento >", value, "id_departamento");
            return (Criteria) this;
        }
        
        public Criteria andIntIdDepartamentoGreaterThanOrEqualTo(Integer value) {
            addCriterion("id_departamento >=", value, "id_departamento");
            return (Criteria) this;
        }
        
        public Criteria andIntIdDepartamentoLessThan(Integer value) {
            addCriterion("id_departamento <", value, "id_departamento");
            return (Criteria) this;
        }
        
        public Criteria andIntIdDepartamentoLessThanOrEqualTo(Integer value) {
            addCriterion("id_departamento <=", value, "id_departamento");
            return (Criteria) this;
        }
        
        public Criteria andIntIdDepartamentoIn(List<Integer> values) {
            addCriterion("id_departamento in", values, "id_departamento");
            return (Criteria) this;
        }
        
        public Criteria andIntIdDepartamentoNotIn(List<Integer> values) {
            addCriterion("id_departamento not in", values, "id_departamento");
            return (Criteria) this;
        }
        
        public Criteria andIntIdDepartamentoBetween(Integer value1, Integer value2) {
            addCriterion("id_departamento between", value1, value2, "id_departamento");
            return (Criteria) this;
        }
        
        public Criteria andIntIdDepartamentoNotBetween(Integer value1, Integer value2) {
            addCriterion("id_departamento not between", value1, value2, "id_departamento");
            return (Criteria) this;
        }
        
        
        public Criteria andIntIdProvinciaEqualTo(Integer value) {
            addCriterion("id_provincia =", value, "id_provincia");
            return (Criteria) this;
        }
        
        public Criteria andIntIdProvinciaNotEqualTo(Integer value) {
            addCriterion("id_provincia <>", value, "id_provincia");
            return (Criteria) this;
        }
        
        
        public Criteria andIntIdProvinciaIsNull() {
            addCriterion("id_provincia is null");
            return (Criteria) this;
        }
        
        public Criteria andIntIdProvinciaIsNotNull() {
            addCriterion("id_provincia is not null");
            return (Criteria) this;
        }
        
        public Criteria andIntIdProvinciaGreaterThan(Integer value) {
            addCriterion("id_provincia >", value, "id_provincia");
            return (Criteria) this;
        }
        
        public Criteria andIntIdProvinciaGreaterThanOrEqualTo(Integer value) {
            addCriterion("id_provincia >=", value, "id_provincia");
            return (Criteria) this;
        }
        
        public Criteria andIntIdProvinciaLessThan(Integer value) {
            addCriterion("id_provincia <", value, "id_provincia");
            return (Criteria) this;
        }
        
        public Criteria andIntIdProvinciaLessThanOrEqualTo(Integer value) {
            addCriterion("id_provincia <=", value, "id_provincia");
            return (Criteria) this;
        }
        
        public Criteria andIntIdProvinciaIn(List<Integer> values) {
            addCriterion("id_provincia in", values, "id_provincia");
            return (Criteria) this;
        }
        
        public Criteria andIntIdProvinciaNotIn(List<Integer> values) {
            addCriterion("id_provincia not in", values, "id_provincia");
            return (Criteria) this;
        }
        
        public Criteria andIntIdProvinciaBetween(Integer value1, Integer value2) {
            addCriterion("id_provincia between", value1, value2, "id_provincia");
            return (Criteria) this;
        }
        
        public Criteria andIntIdProvinciaNotBetween(Integer value1, Integer value2) {
            addCriterion("id_provincia not between", value1, value2, "id_provincia");
            return (Criteria) this;
        }
        
        
        public Criteria andIntIdDistritoEqualTo(Integer value) {
            addCriterion("id_distrito =", value, "id_distrito");
            return (Criteria) this;
        }
        
        public Criteria andIntIdDistritoNotEqualTo(Integer value) {
            addCriterion("id_distrito <>", value, "id_distrito");
            return (Criteria) this;
        }
        
        
        public Criteria andIntIdDistritoIsNull() {
            addCriterion("id_distrito is null");
            return (Criteria) this;
        }
        
        public Criteria andIntIdDistritoIsNotNull() {
            addCriterion("id_distrito is not null");
            return (Criteria) this;
        }
        
        public Criteria andIntIdDistritoGreaterThan(Integer value) {
            addCriterion("id_distrito >", value, "id_distrito");
            return (Criteria) this;
        }
        
        public Criteria andIntIdDistritoGreaterThanOrEqualTo(Integer value) {
            addCriterion("id_distrito >=", value, "id_distrito");
            return (Criteria) this;
        }
        
        public Criteria andIntIdDistritoLessThan(Integer value) {
            addCriterion("id_distrito <", value, "id_distrito");
            return (Criteria) this;
        }
        
        public Criteria andIntIdDistritoLessThanOrEqualTo(Integer value) {
            addCriterion("id_distrito <=", value, "id_distrito");
            return (Criteria) this;
        }
        
        public Criteria andIntIdDistritoIn(List<Integer> values) {
            addCriterion("id_distrito in", values, "id_distrito");
            return (Criteria) this;
        }
        
        public Criteria andIntIdDistritoNotIn(List<Integer> values) {
            addCriterion("id_distrito not in", values, "id_distrito");
            return (Criteria) this;
        }
        
        public Criteria andIntIdDistritoBetween(Integer value1, Integer value2) {
            addCriterion("id_distrito between", value1, value2, "id_distrito");
            return (Criteria) this;
        }
        
        public Criteria andIntIdDistritoNotBetween(Integer value1, Integer value2) {
            addCriterion("id_distrito not between", value1, value2, "id_distrito");
            return (Criteria) this;
        }
        
        
        public Criteria andStrDesUbigeoLike(String value) {
            addCriterion("upper(des_ubigeo) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "des_ubigeo");
            return (Criteria) this;
        }
        
        public Criteria andStrDesUbigeoNotLike(String value) {
            addCriterion("des_ubigeo not like", "%" + CadenaUtil.getStr(value) + "%", "des_ubigeo");
            return (Criteria) this;
        }
        
        public Criteria andStrDesUbigeoEqualTo(String value) {
            addCriterion("des_ubigeo =", CadenaUtil.getStr(value), "des_ubigeo");
            return (Criteria) this;
        }
        
        public Criteria andStrDesUbigeoNotEqualTo(String value) {
            addCriterion("des_ubigeo <>", CadenaUtil.getStr(value), "des_ubigeo");
            return (Criteria) this;
        }
        
        
        public Criteria andStrDesUbigeoIsNull() {
            addCriterion("des_ubigeo is null");
            return (Criteria) this;
        }
        
        public Criteria andStrDesUbigeoIsNotNull() {
            addCriterion("des_ubigeo is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrDesUbigeoGreaterThan(String value) {
            addCriterion("des_ubigeo >", value, "des_ubigeo");
            return (Criteria) this;
        }
        
        public Criteria andStrDesUbigeoGreaterThanOrEqualTo(String value) {
            addCriterion("des_ubigeo >=", value, "des_ubigeo");
            return (Criteria) this;
        }
        
        public Criteria andStrDesUbigeoLessThan(String value) {
            addCriterion("des_ubigeo <", value, "des_ubigeo");
            return (Criteria) this;
        }
        
        public Criteria andStrDesUbigeoLessThanOrEqualTo(String value) {
            addCriterion("des_ubigeo <=", value, "des_ubigeo");
            return (Criteria) this;
        }
        
        public Criteria andStrDesUbigeoIn(List<String> values) {
            addCriterion("des_ubigeo in", values, "des_ubigeo");
            return (Criteria) this;
        }
        
        public Criteria andStrDesUbigeoNotIn(List<String> values) {
            addCriterion("des_ubigeo not in", values, "des_ubigeo");
            return (Criteria) this;
        }
        
        public Criteria andStrDesUbigeoBetween(String value1, String value2) {
            addCriterion("des_ubigeo between", value1, value2, "des_ubigeo");
            return (Criteria) this;
        }
        
        public Criteria andStrDesUbigeoNotBetween(String value1, String value2) {
            addCriterion("des_ubigeo not between", value1, value2, "des_ubigeo");
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
