package pmp.lupdup.dao.administrador.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import pmp.lupdup.general.util.CadenaUtil;

public class ImagenParamDef {
	
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;
    
    public ImagenParamDef() {
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
        
                
        
        public Criteria andSrlIdImagenEqualTo(Integer value) {
            addCriterion("id_imagen =", value, "id_imagen");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdImagenNotEqualTo(Integer value) {
            addCriterion("id_imagen <>", value, "id_imagen");
            return (Criteria) this;
        }
        
        
        public Criteria andSrlIdImagenIsNull() {
            addCriterion("id_imagen is null");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdImagenIsNotNull() {
            addCriterion("id_imagen is not null");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdImagenGreaterThan(Integer value) {
            addCriterion("id_imagen >", value, "id_imagen");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdImagenGreaterThanOrEqualTo(Integer value) {
            addCriterion("id_imagen >=", value, "id_imagen");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdImagenLessThan(Integer value) {
            addCriterion("id_imagen <", value, "id_imagen");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdImagenLessThanOrEqualTo(Integer value) {
            addCriterion("id_imagen <=", value, "id_imagen");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdImagenIn(List<Integer> values) {
            addCriterion("id_imagen in", values, "id_imagen");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdImagenNotIn(List<Integer> values) {
            addCriterion("id_imagen not in", values, "id_imagen");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdImagenBetween(Integer value1, Integer value2) {
            addCriterion("id_imagen between", value1, value2, "id_imagen");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdImagenNotBetween(Integer value1, Integer value2) {
            addCriterion("id_imagen not between", value1, value2, "id_imagen");
            return (Criteria) this;
        }
        
        
        public Criteria andStrNomDescripcionLike(String value) {
            addCriterion("upper(nom_descripcion) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "nom_descripcion");
            return (Criteria) this;
        }
        
        public Criteria andStrNomDescripcionNotLike(String value) {
            addCriterion("nom_descripcion not like", "%" + CadenaUtil.getStr(value) + "%", "nom_descripcion");
            return (Criteria) this;
        }
        
        public Criteria andStrNomDescripcionEqualTo(String value) {
            addCriterion("nom_descripcion =", CadenaUtil.getStr(value), "nom_descripcion");
            return (Criteria) this;
        }
        
        public Criteria andStrNomDescripcionNotEqualTo(String value) {
            addCriterion("nom_descripcion <>", CadenaUtil.getStr(value), "nom_descripcion");
            return (Criteria) this;
        }
        
        
        public Criteria andStrNomDescripcionIsNull() {
            addCriterion("nom_descripcion is null");
            return (Criteria) this;
        }
        
        public Criteria andStrNomDescripcionIsNotNull() {
            addCriterion("nom_descripcion is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrNomDescripcionGreaterThan(String value) {
            addCriterion("nom_descripcion >", value, "nom_descripcion");
            return (Criteria) this;
        }
        
        public Criteria andStrNomDescripcionGreaterThanOrEqualTo(String value) {
            addCriterion("nom_descripcion >=", value, "nom_descripcion");
            return (Criteria) this;
        }
        
        public Criteria andStrNomDescripcionLessThan(String value) {
            addCriterion("nom_descripcion <", value, "nom_descripcion");
            return (Criteria) this;
        }
        
        public Criteria andStrNomDescripcionLessThanOrEqualTo(String value) {
            addCriterion("nom_descripcion <=", value, "nom_descripcion");
            return (Criteria) this;
        }
        
        public Criteria andStrNomDescripcionIn(List<String> values) {
            addCriterion("nom_descripcion in", values, "nom_descripcion");
            return (Criteria) this;
        }
        
        public Criteria andStrNomDescripcionNotIn(List<String> values) {
            addCriterion("nom_descripcion not in", values, "nom_descripcion");
            return (Criteria) this;
        }
        
        public Criteria andStrNomDescripcionBetween(String value1, String value2) {
            addCriterion("nom_descripcion between", value1, value2, "nom_descripcion");
            return (Criteria) this;
        }
        
        public Criteria andStrNomDescripcionNotBetween(String value1, String value2) {
            addCriterion("nom_descripcion not between", value1, value2, "nom_descripcion");
            return (Criteria) this;
        }
        
        
        public Criteria andStrNomExtensionLike(String value) {
            addCriterion("upper(nom_extension) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "nom_extension");
            return (Criteria) this;
        }
        
        public Criteria andStrNomExtensionNotLike(String value) {
            addCriterion("nom_extension not like", "%" + CadenaUtil.getStr(value) + "%", "nom_extension");
            return (Criteria) this;
        }
        
        public Criteria andStrNomExtensionEqualTo(String value) {
            addCriterion("nom_extension =", CadenaUtil.getStr(value), "nom_extension");
            return (Criteria) this;
        }
        
        public Criteria andStrNomExtensionNotEqualTo(String value) {
            addCriterion("nom_extension <>", CadenaUtil.getStr(value), "nom_extension");
            return (Criteria) this;
        }
        
        
        public Criteria andStrNomExtensionIsNull() {
            addCriterion("nom_extension is null");
            return (Criteria) this;
        }
        
        public Criteria andStrNomExtensionIsNotNull() {
            addCriterion("nom_extension is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrNomExtensionGreaterThan(String value) {
            addCriterion("nom_extension >", value, "nom_extension");
            return (Criteria) this;
        }
        
        public Criteria andStrNomExtensionGreaterThanOrEqualTo(String value) {
            addCriterion("nom_extension >=", value, "nom_extension");
            return (Criteria) this;
        }
        
        public Criteria andStrNomExtensionLessThan(String value) {
            addCriterion("nom_extension <", value, "nom_extension");
            return (Criteria) this;
        }
        
        public Criteria andStrNomExtensionLessThanOrEqualTo(String value) {
            addCriterion("nom_extension <=", value, "nom_extension");
            return (Criteria) this;
        }
        
        public Criteria andStrNomExtensionIn(List<String> values) {
            addCriterion("nom_extension in", values, "nom_extension");
            return (Criteria) this;
        }
        
        public Criteria andStrNomExtensionNotIn(List<String> values) {
            addCriterion("nom_extension not in", values, "nom_extension");
            return (Criteria) this;
        }
        
        public Criteria andStrNomExtensionBetween(String value1, String value2) {
            addCriterion("nom_extension between", value1, value2, "nom_extension");
            return (Criteria) this;
        }
        
        public Criteria andStrNomExtensionNotBetween(String value1, String value2) {
            addCriterion("nom_extension not between", value1, value2, "nom_extension");
            return (Criteria) this;
        }
        
        
        public Criteria andLngNomFechaUltimaModEqualTo(Long value) {
            addCriterion("num_fecha_ult_mod =", value, "num_fecha_ult_mod");
            return (Criteria) this;
        }
        
        public Criteria andLngNomFechaUltimaModNotEqualTo(Long value) {
            addCriterion("num_fecha_ult_mod <>", value, "num_fecha_ult_mod");
            return (Criteria) this;
        }
        
        
        public Criteria andLngNomFechaUltimaModIsNull() {
            addCriterion("num_fecha_ult_mod is null");
            return (Criteria) this;
        }
        
        public Criteria andLngNomFechaUltimaModIsNotNull() {
            addCriterion("num_fecha_ult_mod is not null");
            return (Criteria) this;
        }
        
        public Criteria andLngNomFechaUltimaModGreaterThan(Long value) {
            addCriterion("num_fecha_ult_mod >", value, "num_fecha_ult_mod");
            return (Criteria) this;
        }
        
        public Criteria andLngNomFechaUltimaModGreaterThanOrEqualTo(Long value) {
            addCriterion("num_fecha_ult_mod >=", value, "num_fecha_ult_mod");
            return (Criteria) this;
        }
        
        public Criteria andLngNomFechaUltimaModLessThan(Long value) {
            addCriterion("num_fecha_ult_mod <", value, "num_fecha_ult_mod");
            return (Criteria) this;
        }
        
        public Criteria andLngNomFechaUltimaModLessThanOrEqualTo(Long value) {
            addCriterion("num_fecha_ult_mod <=", value, "num_fecha_ult_mod");
            return (Criteria) this;
        }
        
        public Criteria andLngNomFechaUltimaModIn(List<Long> values) {
            addCriterion("num_fecha_ult_mod in", values, "num_fecha_ult_mod");
            return (Criteria) this;
        }
        
        public Criteria andLngNomFechaUltimaModNotIn(List<Long> values) {
            addCriterion("num_fecha_ult_mod not in", values, "num_fecha_ult_mod");
            return (Criteria) this;
        }
        
        public Criteria andLngNomFechaUltimaModBetween(Long value1, Long value2) {
            addCriterion("num_fecha_ult_mod between", value1, value2, "num_fecha_ult_mod");
            return (Criteria) this;
        }
        
        public Criteria andLngNomFechaUltimaModNotBetween(Long value1, Long value2) {
            addCriterion("num_fecha_ult_mod not between", value1, value2, "num_fecha_ult_mod");
            return (Criteria) this;
        }
        
        
        public Criteria andStrNomHashLike(String value) {
            addCriterion("upper(nom_hash) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "nom_hash");
            return (Criteria) this;
        }
        
        public Criteria andStrNomHashNotLike(String value) {
            addCriterion("nom_hash not like", "%" + CadenaUtil.getStr(value) + "%", "nom_hash");
            return (Criteria) this;
        }
        
        public Criteria andStrNomHashEqualTo(String value) {
            addCriterion("nom_hash =", CadenaUtil.getStr(value), "nom_hash");
            return (Criteria) this;
        }
        
        public Criteria andStrNomHashNotEqualTo(String value) {
            addCriterion("nom_hash <>", CadenaUtil.getStr(value), "nom_hash");
            return (Criteria) this;
        }
        
        
        public Criteria andStrNomHashIsNull() {
            addCriterion("nom_hash is null");
            return (Criteria) this;
        }
        
        public Criteria andStrNomHashIsNotNull() {
            addCriterion("nom_hash is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrNomHashGreaterThan(String value) {
            addCriterion("nom_hash >", value, "nom_hash");
            return (Criteria) this;
        }
        
        public Criteria andStrNomHashGreaterThanOrEqualTo(String value) {
            addCriterion("nom_hash >=", value, "nom_hash");
            return (Criteria) this;
        }
        
        public Criteria andStrNomHashLessThan(String value) {
            addCriterion("nom_hash <", value, "nom_hash");
            return (Criteria) this;
        }
        
        public Criteria andStrNomHashLessThanOrEqualTo(String value) {
            addCriterion("nom_hash <=", value, "nom_hash");
            return (Criteria) this;
        }
        
        public Criteria andStrNomHashIn(List<String> values) {
            addCriterion("nom_hash in", values, "nom_hash");
            return (Criteria) this;
        }
        
        public Criteria andStrNomHashNotIn(List<String> values) {
            addCriterion("nom_hash not in", values, "nom_hash");
            return (Criteria) this;
        }
        
        public Criteria andStrNomHashBetween(String value1, String value2) {
            addCriterion("nom_hash between", value1, value2, "nom_hash");
            return (Criteria) this;
        }
        
        public Criteria andStrNomHashNotBetween(String value1, String value2) {
            addCriterion("nom_hash not between", value1, value2, "nom_hash");
            return (Criteria) this;
        }
        
        
        public Criteria andStrNomCodigoLike(String value) {
            addCriterion("upper(nom_codigo) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "nom_codigo");
            return (Criteria) this;
        }
        
        public Criteria andStrNomCodigoNotLike(String value) {
            addCriterion("nom_codigo not like", "%" + CadenaUtil.getStr(value) + "%", "nom_codigo");
            return (Criteria) this;
        }
        
        public Criteria andStrNomCodigoEqualTo(String value) {
            addCriterion("nom_codigo =", CadenaUtil.getStr(value), "nom_codigo");
            return (Criteria) this;
        }
        
        public Criteria andStrNomCodigoNotEqualTo(String value) {
            addCriterion("nom_codigo <>", CadenaUtil.getStr(value), "nom_codigo");
            return (Criteria) this;
        }
        
        
        public Criteria andStrNomCodigoIsNull() {
            addCriterion("nom_codigo is null");
            return (Criteria) this;
        }
        
        public Criteria andStrNomCodigoIsNotNull() {
            addCriterion("nom_codigo is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrNomCodigoGreaterThan(String value) {
            addCriterion("nom_codigo >", value, "nom_codigo");
            return (Criteria) this;
        }
        
        public Criteria andStrNomCodigoGreaterThanOrEqualTo(String value) {
            addCriterion("nom_codigo >=", value, "nom_codigo");
            return (Criteria) this;
        }
        
        public Criteria andStrNomCodigoLessThan(String value) {
            addCriterion("nom_codigo <", value, "nom_codigo");
            return (Criteria) this;
        }
        
        public Criteria andStrNomCodigoLessThanOrEqualTo(String value) {
            addCriterion("nom_codigo <=", value, "nom_codigo");
            return (Criteria) this;
        }
        
        public Criteria andStrNomCodigoIn(List<String> values) {
            addCriterion("nom_codigo in", values, "nom_codigo");
            return (Criteria) this;
        }
        
        public Criteria andStrNomCodigoNotIn(List<String> values) {
            addCriterion("nom_codigo not in", values, "nom_codigo");
            return (Criteria) this;
        }
        
        public Criteria andStrNomCodigoBetween(String value1, String value2) {
            addCriterion("nom_codigo between", value1, value2, "nom_codigo");
            return (Criteria) this;
        }
        
        public Criteria andStrNomCodigoNotBetween(String value1, String value2) {
            addCriterion("nom_codigo not between", value1, value2, "nom_codigo");
            return (Criteria) this;
        }
        
        
        public Criteria andLngNumTamanioEqualTo(Long value) {
            addCriterion("num_tamanio =", value, "num_tamanio");
            return (Criteria) this;
        }
        
        public Criteria andLngNumTamanioNotEqualTo(Long value) {
            addCriterion("num_tamanio <>", value, "num_tamanio");
            return (Criteria) this;
        }
        
        
        public Criteria andLngNumTamanioIsNull() {
            addCriterion("num_tamanio is null");
            return (Criteria) this;
        }
        
        public Criteria andLngNumTamanioIsNotNull() {
            addCriterion("num_tamanio is not null");
            return (Criteria) this;
        }
        
        public Criteria andLngNumTamanioGreaterThan(Long value) {
            addCriterion("num_tamanio >", value, "num_tamanio");
            return (Criteria) this;
        }
        
        public Criteria andLngNumTamanioGreaterThanOrEqualTo(Long value) {
            addCriterion("num_tamanio >=", value, "num_tamanio");
            return (Criteria) this;
        }
        
        public Criteria andLngNumTamanioLessThan(Long value) {
            addCriterion("num_tamanio <", value, "num_tamanio");
            return (Criteria) this;
        }
        
        public Criteria andLngNumTamanioLessThanOrEqualTo(Long value) {
            addCriterion("num_tamanio <=", value, "num_tamanio");
            return (Criteria) this;
        }
        
        public Criteria andLngNumTamanioIn(List<Long> values) {
            addCriterion("num_tamanio in", values, "num_tamanio");
            return (Criteria) this;
        }
        
        public Criteria andLngNumTamanioNotIn(List<Long> values) {
            addCriterion("num_tamanio not in", values, "num_tamanio");
            return (Criteria) this;
        }
        
        public Criteria andLngNumTamanioBetween(Long value1, Long value2) {
            addCriterion("num_tamanio between", value1, value2, "num_tamanio");
            return (Criteria) this;
        }
        
        public Criteria andLngNumTamanioNotBetween(Long value1, Long value2) {
            addCriterion("num_tamanio not between", value1, value2, "num_tamanio");
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
