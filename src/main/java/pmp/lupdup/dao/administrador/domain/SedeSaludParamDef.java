package pmp.lupdup.dao.administrador.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

import pmp.lupdup.dao.administrador.domain.CentroSaludParamDef.Criteria;
import pmp.lupdup.general.util.CadenaUtil;

public class SedeSaludParamDef {
	
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;
    
    public SedeSaludParamDef() {
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
        
                
        
        public Criteria andSrlIdSedesaludEqualTo(Integer value) {
            addCriterion("id_sedesalud =", value, "id_sedesalud");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdSedesaludNotEqualTo(Integer value) {
            addCriterion("id_sedesalud <>", value, "id_sedesalud");
            return (Criteria) this;
        }
        
        
        public Criteria andSrlIdSedesaludIsNull() {
            addCriterion("id_sedesalud is null");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdSedesaludIsNotNull() {
            addCriterion("id_sedesalud is not null");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdSedesaludGreaterThan(Integer value) {
            addCriterion("id_sedesalud >", value, "id_sedesalud");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdSedesaludGreaterThanOrEqualTo(Integer value) {
            addCriterion("id_sedesalud >=", value, "id_sedesalud");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdSedesaludLessThan(Integer value) {
            addCriterion("id_sedesalud <", value, "id_sedesalud");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdSedesaludLessThanOrEqualTo(Integer value) {
            addCriterion("id_sedesalud <=", value, "id_sedesalud");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdSedesaludIn(List<Integer> values) {
            addCriterion("id_sedesalud in", values, "id_sedesalud");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdSedesaludNotIn(List<Integer> values) {
            addCriterion("id_sedesalud not in", values, "id_sedesalud");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdSedesaludBetween(Integer value1, Integer value2) {
            addCriterion("id_sedesalud between", value1, value2, "id_sedesalud");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdSedesaludNotBetween(Integer value1, Integer value2) {
            addCriterion("id_sedesalud not between", value1, value2, "id_sedesalud");
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
        
        
        public Criteria andStrDesDireccionLike(String value) {
            addCriterion("upper(des_direccion) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "des_direccion");
            return (Criteria) this;
        }
        
        public Criteria andStrDesDireccionNotLike(String value) {
            addCriterion("des_direccion not like", "%" + CadenaUtil.getStr(value) + "%", "des_direccion");
            return (Criteria) this;
        }
        
        public Criteria andStrDesDireccionEqualTo(String value) {
            addCriterion("des_direccion =", CadenaUtil.getStr(value), "des_direccion");
            return (Criteria) this;
        }
        
        public Criteria andStrDesDireccionNotEqualTo(String value) {
            addCriterion("des_direccion <>", CadenaUtil.getStr(value), "des_direccion");
            return (Criteria) this;
        }
        
        
        public Criteria andStrDesDireccionIsNull() {
            addCriterion("des_direccion is null");
            return (Criteria) this;
        }
        
        public Criteria andStrDesDireccionIsNotNull() {
            addCriterion("des_direccion is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrDesDireccionGreaterThan(String value) {
            addCriterion("des_direccion >", value, "des_direccion");
            return (Criteria) this;
        }
        
        public Criteria andStrDesDireccionGreaterThanOrEqualTo(String value) {
            addCriterion("des_direccion >=", value, "des_direccion");
            return (Criteria) this;
        }
        
        public Criteria andStrDesDireccionLessThan(String value) {
            addCriterion("des_direccion <", value, "des_direccion");
            return (Criteria) this;
        }
        
        public Criteria andStrDesDireccionLessThanOrEqualTo(String value) {
            addCriterion("des_direccion <=", value, "des_direccion");
            return (Criteria) this;
        }
        
        public Criteria andStrDesDireccionIn(List<String> values) {
            addCriterion("des_direccion in", values, "des_direccion");
            return (Criteria) this;
        }
        
        public Criteria andStrDesDireccionNotIn(List<String> values) {
            addCriterion("des_direccion not in", values, "des_direccion");
            return (Criteria) this;
        }
        
        public Criteria andStrDesDireccionBetween(String value1, String value2) {
            addCriterion("des_direccion between", value1, value2, "des_direccion");
            return (Criteria) this;
        }
        
        public Criteria andStrDesDireccionNotBetween(String value1, String value2) {
            addCriterion("des_direccion not between", value1, value2, "des_direccion");
            return (Criteria) this;
        }
        
        
        public Criteria andStrNumTelefonoLike(String value) {
            addCriterion("upper(num_telefono) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "num_telefono");
            return (Criteria) this;
        }
        
        public Criteria andStrNumTelefonoNotLike(String value) {
            addCriterion("num_telefono not like", "%" + CadenaUtil.getStr(value) + "%", "num_telefono");
            return (Criteria) this;
        }
        
        public Criteria andStrNumTelefonoEqualTo(String value) {
            addCriterion("num_telefono =", CadenaUtil.getStr(value), "num_telefono");
            return (Criteria) this;
        }
        
        public Criteria andStrNumTelefonoNotEqualTo(String value) {
            addCriterion("num_telefono <>", CadenaUtil.getStr(value), "num_telefono");
            return (Criteria) this;
        }
        
        
        public Criteria andStrNumTelefonoIsNull() {
            addCriterion("num_telefono is null");
            return (Criteria) this;
        }
        
        public Criteria andStrNumTelefonoIsNotNull() {
            addCriterion("num_telefono is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrNumTelefonoGreaterThan(String value) {
            addCriterion("num_telefono >", value, "num_telefono");
            return (Criteria) this;
        }
        
        public Criteria andStrNumTelefonoGreaterThanOrEqualTo(String value) {
            addCriterion("num_telefono >=", value, "num_telefono");
            return (Criteria) this;
        }
        
        public Criteria andStrNumTelefonoLessThan(String value) {
            addCriterion("num_telefono <", value, "num_telefono");
            return (Criteria) this;
        }
        
        public Criteria andStrNumTelefonoLessThanOrEqualTo(String value) {
            addCriterion("num_telefono <=", value, "num_telefono");
            return (Criteria) this;
        }
        
        public Criteria andStrNumTelefonoIn(List<String> values) {
            addCriterion("num_telefono in", values, "num_telefono");
            return (Criteria) this;
        }
        
        public Criteria andStrNumTelefonoNotIn(List<String> values) {
            addCriterion("num_telefono not in", values, "num_telefono");
            return (Criteria) this;
        }
        
        public Criteria andStrNumTelefonoBetween(String value1, String value2) {
            addCriterion("num_telefono between", value1, value2, "num_telefono");
            return (Criteria) this;
        }
        
        public Criteria andStrNumTelefonoNotBetween(String value1, String value2) {
            addCriterion("num_telefono not between", value1, value2, "num_telefono");
            return (Criteria) this;
        }
        
        
        public Criteria andStrNumCelularLike(String value) {
            addCriterion("upper(num_celular) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "num_celular");
            return (Criteria) this;
        }
        
        public Criteria andStrNumCelularNotLike(String value) {
            addCriterion("num_celular not like", "%" + CadenaUtil.getStr(value) + "%", "num_celular");
            return (Criteria) this;
        }
        
        public Criteria andStrNumCelularEqualTo(String value) {
            addCriterion("num_celular =", CadenaUtil.getStr(value), "num_celular");
            return (Criteria) this;
        }
        
        public Criteria andStrNumCelularNotEqualTo(String value) {
            addCriterion("num_celular <>", CadenaUtil.getStr(value), "num_celular");
            return (Criteria) this;
        }
        
        
        public Criteria andStrNumCelularIsNull() {
            addCriterion("num_celular is null");
            return (Criteria) this;
        }
        
        public Criteria andStrNumCelularIsNotNull() {
            addCriterion("num_celular is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrNumCelularGreaterThan(String value) {
            addCriterion("num_celular >", value, "num_celular");
            return (Criteria) this;
        }
        
        public Criteria andStrNumCelularGreaterThanOrEqualTo(String value) {
            addCriterion("num_celular >=", value, "num_celular");
            return (Criteria) this;
        }
        
        public Criteria andStrNumCelularLessThan(String value) {
            addCriterion("num_celular <", value, "num_celular");
            return (Criteria) this;
        }
        
        public Criteria andStrNumCelularLessThanOrEqualTo(String value) {
            addCriterion("num_celular <=", value, "num_celular");
            return (Criteria) this;
        }
        
        public Criteria andStrNumCelularIn(List<String> values) {
            addCriterion("num_celular in", values, "num_celular");
            return (Criteria) this;
        }
        
        public Criteria andStrNumCelularNotIn(List<String> values) {
            addCriterion("num_celular not in", values, "num_celular");
            return (Criteria) this;
        }
        
        public Criteria andStrNumCelularBetween(String value1, String value2) {
            addCriterion("num_celular between", value1, value2, "num_celular");
            return (Criteria) this;
        }
        
        public Criteria andStrNumCelularNotBetween(String value1, String value2) {
            addCriterion("num_celular not between", value1, value2, "num_celular");
            return (Criteria) this;
        }
        
        
        public Criteria andIntIdCentrosaludEqualTo(Integer value) {
            addCriterion("id_centrosalud =", value, "id_centrosalud");
            return (Criteria) this;
        }
        
        public Criteria andIntIdCentrosaludNotEqualTo(Integer value) {
            addCriterion("id_centrosalud <>", value, "id_centrosalud");
            return (Criteria) this;
        }
        
        
        public Criteria andIntIdCentrosaludIsNull() {
            addCriterion("id_centrosalud is null");
            return (Criteria) this;
        }
        
        public Criteria andIntIdCentrosaludIsNotNull() {
            addCriterion("id_centrosalud is not null");
            return (Criteria) this;
        }
        
        public Criteria andIntIdCentrosaludGreaterThan(Integer value) {
            addCriterion("id_centrosalud >", value, "id_centrosalud");
            return (Criteria) this;
        }
        
        public Criteria andIntIdCentrosaludGreaterThanOrEqualTo(Integer value) {
            addCriterion("id_centrosalud >=", value, "id_centrosalud");
            return (Criteria) this;
        }
        
        public Criteria andIntIdCentrosaludLessThan(Integer value) {
            addCriterion("id_centrosalud <", value, "id_centrosalud");
            return (Criteria) this;
        }
        
        public Criteria andIntIdCentrosaludLessThanOrEqualTo(Integer value) {
            addCriterion("id_centrosalud <=", value, "id_centrosalud");
            return (Criteria) this;
        }
        
        public Criteria andIntIdCentrosaludIn(List<Integer> values) {
            addCriterion("id_centrosalud in", values, "id_centrosalud");
            return (Criteria) this;
        }
        
        public Criteria andIntIdCentrosaludNotIn(List<Integer> values) {
            addCriterion("id_centrosalud not in", values, "id_centrosalud");
            return (Criteria) this;
        }
        
        public Criteria andIntIdCentrosaludBetween(Integer value1, Integer value2) {
            addCriterion("id_centrosalud between", value1, value2, "id_centrosalud");
            return (Criteria) this;
        }
        
        public Criteria andIntIdCentrosaludNotBetween(Integer value1, Integer value2) {
            addCriterion("id_centrosalud not between", value1, value2, "id_centrosalud");
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
