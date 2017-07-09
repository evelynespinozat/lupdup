package pmp.lupdup.dao.ecooperante.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import pmp.lupdup.general.util.CadenaUtil;

public class ClubDonanteCampaniaParamDef {
	
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;
    
    public ClubDonanteCampaniaParamDef() {
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
        
                
        
        public Criteria andIntIdCampaniaEqualTo(Integer value) {
            addCriterion("id_campania =", value, "id_campania");
            return (Criteria) this;
        }
        
        public Criteria andIntIdCampaniaNotEqualTo(Integer value) {
            addCriterion("id_campania <>", value, "id_campania");
            return (Criteria) this;
        }
        
        
        public Criteria andIntIdCampaniaIsNull() {
            addCriterion("id_campania is null");
            return (Criteria) this;
        }
        
        public Criteria andIntIdCampaniaIsNotNull() {
            addCriterion("id_campania is not null");
            return (Criteria) this;
        }
        
        public Criteria andIntIdCampaniaGreaterThan(Integer value) {
            addCriterion("id_campania >", value, "id_campania");
            return (Criteria) this;
        }
        
        public Criteria andIntIdCampaniaGreaterThanOrEqualTo(Integer value) {
            addCriterion("id_campania >=", value, "id_campania");
            return (Criteria) this;
        }
        
        public Criteria andIntIdCampaniaLessThan(Integer value) {
            addCriterion("id_campania <", value, "id_campania");
            return (Criteria) this;
        }
        
        public Criteria andIntIdCampaniaLessThanOrEqualTo(Integer value) {
            addCriterion("id_campania <=", value, "id_campania");
            return (Criteria) this;
        }
        
        public Criteria andIntIdCampaniaIn(List<Integer> values) {
            addCriterion("id_campania in", values, "id_campania");
            return (Criteria) this;
        }
        
        public Criteria andIntIdCampaniaNotIn(List<Integer> values) {
            addCriterion("id_campania not in", values, "id_campania");
            return (Criteria) this;
        }
        
        public Criteria andIntIdCampaniaBetween(Integer value1, Integer value2) {
            addCriterion("id_campania between", value1, value2, "id_campania");
            return (Criteria) this;
        }
        
        public Criteria andIntIdCampaniaNotBetween(Integer value1, Integer value2) {
            addCriterion("id_campania not between", value1, value2, "id_campania");
            return (Criteria) this;
        }
        
        
        public Criteria andIntIdDonanteEqualTo(Integer value) {
            addCriterion("id_donante =", value, "id_donante");
            return (Criteria) this;
        }
        
        public Criteria andIntIdDonanteNotEqualTo(Integer value) {
            addCriterion("id_donante <>", value, "id_donante");
            return (Criteria) this;
        }
        
        
        public Criteria andIntIdDonanteIsNull() {
            addCriterion("id_donante is null");
            return (Criteria) this;
        }
        
        public Criteria andIntIdDonanteIsNotNull() {
            addCriterion("id_donante is not null");
            return (Criteria) this;
        }
        
        public Criteria andIntIdDonanteGreaterThan(Integer value) {
            addCriterion("id_donante >", value, "id_donante");
            return (Criteria) this;
        }
        
        public Criteria andIntIdDonanteGreaterThanOrEqualTo(Integer value) {
            addCriterion("id_donante >=", value, "id_donante");
            return (Criteria) this;
        }
        
        public Criteria andIntIdDonanteLessThan(Integer value) {
            addCriterion("id_donante <", value, "id_donante");
            return (Criteria) this;
        }
        
        public Criteria andIntIdDonanteLessThanOrEqualTo(Integer value) {
            addCriterion("id_donante <=", value, "id_donante");
            return (Criteria) this;
        }
        
        public Criteria andIntIdDonanteIn(List<Integer> values) {
            addCriterion("id_donante in", values, "id_donante");
            return (Criteria) this;
        }
        
        public Criteria andIntIdDonanteNotIn(List<Integer> values) {
            addCriterion("id_donante not in", values, "id_donante");
            return (Criteria) this;
        }
        
        public Criteria andIntIdDonanteBetween(Integer value1, Integer value2) {
            addCriterion("id_donante between", value1, value2, "id_donante");
            return (Criteria) this;
        }
        
        public Criteria andIntIdDonanteNotBetween(Integer value1, Integer value2) {
            addCriterion("id_donante not between", value1, value2, "id_donante");
            return (Criteria) this;
        }
        
        
        public Criteria andIntIndEstadoEqualTo(Integer value) {
            addCriterion("ind_estado =", value, "ind_estado");
            return (Criteria) this;
        }
        
        public Criteria andIntIndEstadoNotEqualTo(Integer value) {
            addCriterion("ind_estado <>", value, "ind_estado");
            return (Criteria) this;
        }
        
        
        public Criteria andIntIndEstadoIsNull() {
            addCriterion("ind_estado is null");
            return (Criteria) this;
        }
        
        public Criteria andIntIndEstadoIsNotNull() {
            addCriterion("ind_estado is not null");
            return (Criteria) this;
        }
        
        public Criteria andIntIndEstadoGreaterThan(Integer value) {
            addCriterion("ind_estado >", value, "ind_estado");
            return (Criteria) this;
        }
        
        public Criteria andIntIndEstadoGreaterThanOrEqualTo(Integer value) {
            addCriterion("ind_estado >=", value, "ind_estado");
            return (Criteria) this;
        }
        
        public Criteria andIntIndEstadoLessThan(Integer value) {
            addCriterion("ind_estado <", value, "ind_estado");
            return (Criteria) this;
        }
        
        public Criteria andIntIndEstadoLessThanOrEqualTo(Integer value) {
            addCriterion("ind_estado <=", value, "ind_estado");
            return (Criteria) this;
        }
        
        public Criteria andIntIndEstadoIn(List<Integer> values) {
            addCriterion("ind_estado in", values, "ind_estado");
            return (Criteria) this;
        }
        
        public Criteria andIntIndEstadoNotIn(List<Integer> values) {
            addCriterion("ind_estado not in", values, "ind_estado");
            return (Criteria) this;
        }
        
        public Criteria andIntIndEstadoBetween(Integer value1, Integer value2) {
            addCriterion("ind_estado between", value1, value2, "ind_estado");
            return (Criteria) this;
        }
        
        public Criteria andIntIndEstadoNotBetween(Integer value1, Integer value2) {
            addCriterion("ind_estado not between", value1, value2, "ind_estado");
            return (Criteria) this;
        }
        
        
        public Criteria andStrDesDocumentoLike(String value) {
            addCriterion("upper(des_documento) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "des_documento");
            return (Criteria) this;
        }
        
        public Criteria andStrDesDocumentoNotLike(String value) {
            addCriterion("des_documento not like", "%" + CadenaUtil.getStr(value) + "%", "des_documento");
            return (Criteria) this;
        }
        
        public Criteria andStrDesDocumentoEqualTo(String value) {
            addCriterion("des_documento =", CadenaUtil.getStr(value), "des_documento");
            return (Criteria) this;
        }
        
        public Criteria andStrDesDocumentoNotEqualTo(String value) {
            addCriterion("des_documento <>", CadenaUtil.getStr(value), "des_documento");
            return (Criteria) this;
        }
        
        
        public Criteria andStrDesDocumentoIsNull() {
            addCriterion("des_documento is null");
            return (Criteria) this;
        }
        
        public Criteria andStrDesDocumentoIsNotNull() {
            addCriterion("des_documento is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrDesDocumentoGreaterThan(String value) {
            addCriterion("des_documento >", value, "des_documento");
            return (Criteria) this;
        }
        
        public Criteria andStrDesDocumentoGreaterThanOrEqualTo(String value) {
            addCriterion("des_documento >=", value, "des_documento");
            return (Criteria) this;
        }
        
        public Criteria andStrDesDocumentoLessThan(String value) {
            addCriterion("des_documento <", value, "des_documento");
            return (Criteria) this;
        }
        
        public Criteria andStrDesDocumentoLessThanOrEqualTo(String value) {
            addCriterion("des_documento <=", value, "des_documento");
            return (Criteria) this;
        }
        
        public Criteria andStrDesDocumentoIn(List<String> values) {
            addCriterion("des_documento in", values, "des_documento");
            return (Criteria) this;
        }
        
        public Criteria andStrDesDocumentoNotIn(List<String> values) {
            addCriterion("des_documento not in", values, "des_documento");
            return (Criteria) this;
        }
        
        public Criteria andStrDesDocumentoBetween(String value1, String value2) {
            addCriterion("des_documento between", value1, value2, "des_documento");
            return (Criteria) this;
        }
        
        public Criteria andStrDesDocumentoNotBetween(String value1, String value2) {
            addCriterion("des_documento not between", value1, value2, "des_documento");
            return (Criteria) this;
        }
        
        
        public Criteria andDblNumPrecioEqualTo(Double value) {
            addCriterion("num_precio =", value, "num_precio");
            return (Criteria) this;
        }
        
        public Criteria andDblNumPrecioNotEqualTo(Double value) {
            addCriterion("num_precio <>", value, "num_precio");
            return (Criteria) this;
        }
        
        
        public Criteria andDblNumPrecioIsNull() {
            addCriterion("num_precio is null");
            return (Criteria) this;
        }
        
        public Criteria andDblNumPrecioIsNotNull() {
            addCriterion("num_precio is not null");
            return (Criteria) this;
        }
        
        public Criteria andDblNumPrecioGreaterThan(Double value) {
            addCriterion("num_precio >", value, "num_precio");
            return (Criteria) this;
        }
        
        public Criteria andDblNumPrecioGreaterThanOrEqualTo(Double value) {
            addCriterion("num_precio >=", value, "num_precio");
            return (Criteria) this;
        }
        
        public Criteria andDblNumPrecioLessThan(Double value) {
            addCriterion("num_precio <", value, "num_precio");
            return (Criteria) this;
        }
        
        public Criteria andDblNumPrecioLessThanOrEqualTo(Double value) {
            addCriterion("num_precio <=", value, "num_precio");
            return (Criteria) this;
        }
        
        public Criteria andDblNumPrecioIn(List<Double> values) {
            addCriterion("num_precio in", values, "num_precio");
            return (Criteria) this;
        }
        
        public Criteria andDblNumPrecioNotIn(List<Double> values) {
            addCriterion("num_precio not in", values, "num_precio");
            return (Criteria) this;
        }
        
        public Criteria andDblNumPrecioBetween(Double value1, Double value2) {
            addCriterion("num_precio between", value1, value2, "num_precio");
            return (Criteria) this;
        }
        
        public Criteria andDblNumPrecioNotBetween(Double value1, Double value2) {
            addCriterion("num_precio not between", value1, value2, "num_precio");
            return (Criteria) this;
        }
        
        
        public Criteria andDblNumPrecioPanpaniaEqualTo(Double value) {
            addCriterion("num_precio_panpania =", value, "num_precio_panpania");
            return (Criteria) this;
        }
        
        public Criteria andDblNumPrecioPanpaniaNotEqualTo(Double value) {
            addCriterion("num_precio_panpania <>", value, "num_precio_panpania");
            return (Criteria) this;
        }
        
        
        public Criteria andDblNumPrecioPanpaniaIsNull() {
            addCriterion("num_precio_panpania is null");
            return (Criteria) this;
        }
        
        public Criteria andDblNumPrecioPanpaniaIsNotNull() {
            addCriterion("num_precio_panpania is not null");
            return (Criteria) this;
        }
        
        public Criteria andDblNumPrecioPanpaniaGreaterThan(Double value) {
            addCriterion("num_precio_panpania >", value, "num_precio_panpania");
            return (Criteria) this;
        }
        
        public Criteria andDblNumPrecioPanpaniaGreaterThanOrEqualTo(Double value) {
            addCriterion("num_precio_panpania >=", value, "num_precio_panpania");
            return (Criteria) this;
        }
        
        public Criteria andDblNumPrecioPanpaniaLessThan(Double value) {
            addCriterion("num_precio_panpania <", value, "num_precio_panpania");
            return (Criteria) this;
        }
        
        public Criteria andDblNumPrecioPanpaniaLessThanOrEqualTo(Double value) {
            addCriterion("num_precio_panpania <=", value, "num_precio_panpania");
            return (Criteria) this;
        }
        
        public Criteria andDblNumPrecioPanpaniaIn(List<Double> values) {
            addCriterion("num_precio_panpania in", values, "num_precio_panpania");
            return (Criteria) this;
        }
        
        public Criteria andDblNumPrecioPanpaniaNotIn(List<Double> values) {
            addCriterion("num_precio_panpania not in", values, "num_precio_panpania");
            return (Criteria) this;
        }
        
        public Criteria andDblNumPrecioPanpaniaBetween(Double value1, Double value2) {
            addCriterion("num_precio_panpania between", value1, value2, "num_precio_panpania");
            return (Criteria) this;
        }
        
        public Criteria andDblNumPrecioPanpaniaNotBetween(Double value1, Double value2) {
            addCriterion("num_precio_panpania not between", value1, value2, "num_precio_panpania");
            return (Criteria) this;
        }
        
        
        public Criteria andStrDesComentarioLike(String value) {
            addCriterion("upper(des_comentario) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "des_comentario");
            return (Criteria) this;
        }
        
        public Criteria andStrDesComentarioNotLike(String value) {
            addCriterion("des_comentario not like", "%" + CadenaUtil.getStr(value) + "%", "des_comentario");
            return (Criteria) this;
        }
        
        public Criteria andStrDesComentarioEqualTo(String value) {
            addCriterion("des_comentario =", CadenaUtil.getStr(value), "des_comentario");
            return (Criteria) this;
        }
        
        public Criteria andStrDesComentarioNotEqualTo(String value) {
            addCriterion("des_comentario <>", CadenaUtil.getStr(value), "des_comentario");
            return (Criteria) this;
        }
        
        
        public Criteria andStrDesComentarioIsNull() {
            addCriterion("des_comentario is null");
            return (Criteria) this;
        }
        
        public Criteria andStrDesComentarioIsNotNull() {
            addCriterion("des_comentario is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrDesComentarioGreaterThan(String value) {
            addCriterion("des_comentario >", value, "des_comentario");
            return (Criteria) this;
        }
        
        public Criteria andStrDesComentarioGreaterThanOrEqualTo(String value) {
            addCriterion("des_comentario >=", value, "des_comentario");
            return (Criteria) this;
        }
        
        public Criteria andStrDesComentarioLessThan(String value) {
            addCriterion("des_comentario <", value, "des_comentario");
            return (Criteria) this;
        }
        
        public Criteria andStrDesComentarioLessThanOrEqualTo(String value) {
            addCriterion("des_comentario <=", value, "des_comentario");
            return (Criteria) this;
        }
        
        public Criteria andStrDesComentarioIn(List<String> values) {
            addCriterion("des_comentario in", values, "des_comentario");
            return (Criteria) this;
        }
        
        public Criteria andStrDesComentarioNotIn(List<String> values) {
            addCriterion("des_comentario not in", values, "des_comentario");
            return (Criteria) this;
        }
        
        public Criteria andStrDesComentarioBetween(String value1, String value2) {
            addCriterion("des_comentario between", value1, value2, "des_comentario");
            return (Criteria) this;
        }
        
        public Criteria andStrDesComentarioNotBetween(String value1, String value2) {
            addCriterion("des_comentario not between", value1, value2, "des_comentario");
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
