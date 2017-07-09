package pmp.lupdup.dao.administrador.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import pmp.lupdup.general.util.CadenaUtil;

public class EntidadColaboradoraParamDef {
	
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;
    
    public EntidadColaboradoraParamDef() {
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
        
                
        
        public Criteria andSrlIdEntidadcolaboradoraEqualTo(Integer value) {
            addCriterion("id_entidadcolaboradora =", value, "id_entidadcolaboradora");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdEntidadcolaboradoraNotEqualTo(Integer value) {
            addCriterion("id_entidadcolaboradora <>", value, "id_entidadcolaboradora");
            return (Criteria) this;
        }
        
        
        public Criteria andSrlIdEntidadcolaboradoraIsNull() {
            addCriterion("id_entidadcolaboradora is null");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdEntidadcolaboradoraIsNotNull() {
            addCriterion("id_entidadcolaboradora is not null");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdEntidadcolaboradoraGreaterThan(Integer value) {
            addCriterion("id_entidadcolaboradora >", value, "id_entidadcolaboradora");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdEntidadcolaboradoraGreaterThanOrEqualTo(Integer value) {
            addCriterion("id_entidadcolaboradora >=", value, "id_entidadcolaboradora");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdEntidadcolaboradoraLessThan(Integer value) {
            addCriterion("id_entidadcolaboradora <", value, "id_entidadcolaboradora");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdEntidadcolaboradoraLessThanOrEqualTo(Integer value) {
            addCriterion("id_entidadcolaboradora <=", value, "id_entidadcolaboradora");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdEntidadcolaboradoraIn(List<Integer> values) {
            addCriterion("id_entidadcolaboradora in", values, "id_entidadcolaboradora");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdEntidadcolaboradoraNotIn(List<Integer> values) {
            addCriterion("id_entidadcolaboradora not in", values, "id_entidadcolaboradora");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdEntidadcolaboradoraBetween(Integer value1, Integer value2) {
            addCriterion("id_entidadcolaboradora between", value1, value2, "id_entidadcolaboradora");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdEntidadcolaboradoraNotBetween(Integer value1, Integer value2) {
            addCriterion("id_entidadcolaboradora not between", value1, value2, "id_entidadcolaboradora");
            return (Criteria) this;
        }
        
        
        public Criteria andStrNomNombreLike(String value) {
            addCriterion("upper(nom_nombre) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "nom_nombre");
            return (Criteria) this;
        }
        
        public Criteria andStrNomNombreNotLike(String value) {
            addCriterion("nom_nombre not like", "%" + CadenaUtil.getStr(value) + "%", "nom_nombre");
            return (Criteria) this;
        }
        
        public Criteria andStrNomNombreEqualTo(String value) {
            addCriterion("nom_nombre =", CadenaUtil.getStr(value), "nom_nombre");
            return (Criteria) this;
        }
        
        public Criteria andStrNomNombreNotEqualTo(String value) {
            addCriterion("nom_nombre <>", CadenaUtil.getStr(value), "nom_nombre");
            return (Criteria) this;
        }
        
        
        public Criteria andStrNomNombreIsNull() {
            addCriterion("nom_nombre is null");
            return (Criteria) this;
        }
        
        public Criteria andStrNomNombreIsNotNull() {
            addCriterion("nom_nombre is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrNomNombreGreaterThan(String value) {
            addCriterion("nom_nombre >", value, "nom_nombre");
            return (Criteria) this;
        }
        
        public Criteria andStrNomNombreGreaterThanOrEqualTo(String value) {
            addCriterion("nom_nombre >=", value, "nom_nombre");
            return (Criteria) this;
        }
        
        public Criteria andStrNomNombreLessThan(String value) {
            addCriterion("nom_nombre <", value, "nom_nombre");
            return (Criteria) this;
        }
        
        public Criteria andStrNomNombreLessThanOrEqualTo(String value) {
            addCriterion("nom_nombre <=", value, "nom_nombre");
            return (Criteria) this;
        }
        
        public Criteria andStrNomNombreIn(List<String> values) {
            addCriterion("nom_nombre in", values, "nom_nombre");
            return (Criteria) this;
        }
        
        public Criteria andStrNomNombreNotIn(List<String> values) {
            addCriterion("nom_nombre not in", values, "nom_nombre");
            return (Criteria) this;
        }
        
        public Criteria andStrNomNombreBetween(String value1, String value2) {
            addCriterion("nom_nombre between", value1, value2, "nom_nombre");
            return (Criteria) this;
        }
        
        public Criteria andStrNomNombreNotBetween(String value1, String value2) {
            addCriterion("nom_nombre not between", value1, value2, "nom_nombre");
            return (Criteria) this;
        }
        
        public Criteria andStrIndEstadoEqualTo(String value) {
            addCriterion("ind_estado =", value, "ind_estado");
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
