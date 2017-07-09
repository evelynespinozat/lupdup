package pmp.lupdup.dao.administrador.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import pmp.lupdup.general.util.CadenaUtil;

public class CentroSaludParamDef {
	
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;
    
    public CentroSaludParamDef() {
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
        
                
        
        public Criteria andSrlIdCentrosaludEqualTo(Integer value) {
            addCriterion("id_centrosalud =", value, "id_centrosalud");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdCentrosaludNotEqualTo(Integer value) {
            addCriterion("id_centrosalud <>", value, "id_centrosalud");
            return (Criteria) this;
        }
        
        
        public Criteria andSrlIdCentrosaludIsNull() {
            addCriterion("id_centrosalud is null");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdCentrosaludIsNotNull() {
            addCriterion("id_centrosalud is not null");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdCentrosaludGreaterThan(Integer value) {
            addCriterion("id_centrosalud >", value, "id_centrosalud");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdCentrosaludGreaterThanOrEqualTo(Integer value) {
            addCriterion("id_centrosalud >=", value, "id_centrosalud");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdCentrosaludLessThan(Integer value) {
            addCriterion("id_centrosalud <", value, "id_centrosalud");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdCentrosaludLessThanOrEqualTo(Integer value) {
            addCriterion("id_centrosalud <=", value, "id_centrosalud");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdCentrosaludIn(List<Integer> values) {
            addCriterion("id_centrosalud in", values, "id_centrosalud");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdCentrosaludNotIn(List<Integer> values) {
            addCriterion("id_centrosalud not in", values, "id_centrosalud");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdCentrosaludBetween(Integer value1, Integer value2) {
            addCriterion("id_centrosalud between", value1, value2, "id_centrosalud");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdCentrosaludNotBetween(Integer value1, Integer value2) {
            addCriterion("id_centrosalud not between", value1, value2, "id_centrosalud");
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
        
        
        public Criteria andIntIndTipoentidadEqualTo(Integer value) {
            addCriterion("ind_tipoentidad =", value, "ind_tipoentidad");
            return (Criteria) this;
        }
        
        public Criteria andIntIndTipoentidadNotEqualTo(Integer value) {
            addCriterion("ind_tipoentidad <>", value, "ind_tipoentidad");
            return (Criteria) this;
        }
        
        
        public Criteria andIntIndTipoentidadIsNull() {
            addCriterion("ind_tipoentidad is null");
            return (Criteria) this;
        }
        
        public Criteria andIntIndTipoentidadIsNotNull() {
            addCriterion("ind_tipoentidad is not null");
            return (Criteria) this;
        }
        
        public Criteria andIntIndTipoentidadGreaterThan(Integer value) {
            addCriterion("ind_tipoentidad >", value, "ind_tipoentidad");
            return (Criteria) this;
        }
        
        public Criteria andIntIndTipoentidadGreaterThanOrEqualTo(Integer value) {
            addCriterion("ind_tipoentidad >=", value, "ind_tipoentidad");
            return (Criteria) this;
        }
        
        public Criteria andIntIndTipoentidadLessThan(Integer value) {
            addCriterion("ind_tipoentidad <", value, "ind_tipoentidad");
            return (Criteria) this;
        }
        
        public Criteria andIntIndTipoentidadLessThanOrEqualTo(Integer value) {
            addCriterion("ind_tipoentidad <=", value, "ind_tipoentidad");
            return (Criteria) this;
        }
        
        public Criteria andIntIndTipoentidadIn(List<Integer> values) {
            addCriterion("ind_tipoentidad in", values, "ind_tipoentidad");
            return (Criteria) this;
        }
        
        public Criteria andIntIndTipoentidadNotIn(List<Integer> values) {
            addCriterion("ind_tipoentidad not in", values, "ind_tipoentidad");
            return (Criteria) this;
        }
        
        public Criteria andIntIndTipoentidadBetween(Integer value1, Integer value2) {
            addCriterion("ind_tipoentidad between", value1, value2, "ind_tipoentidad");
            return (Criteria) this;
        }
        
        public Criteria andIntIndTipoentidadNotBetween(Integer value1, Integer value2) {
            addCriterion("ind_tipoentidad not between", value1, value2, "ind_tipoentidad");
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
