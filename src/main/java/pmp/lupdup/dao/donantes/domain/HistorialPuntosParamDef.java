package pmp.lupdup.dao.donantes.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import pmp.lupdup.general.util.CadenaUtil;

public class HistorialPuntosParamDef {
	
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;
    
    public HistorialPuntosParamDef() {
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
        
                
        
        public Criteria andSrlIdHistorialpuntosEqualTo(Integer value) {
            addCriterion("id_historialpuntos =", value, "id_historialpuntos");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdHistorialpuntosNotEqualTo(Integer value) {
            addCriterion("id_historialpuntos <>", value, "id_historialpuntos");
            return (Criteria) this;
        }
        
        
        public Criteria andSrlIdHistorialpuntosIsNull() {
            addCriterion("id_historialpuntos is null");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdHistorialpuntosIsNotNull() {
            addCriterion("id_historialpuntos is not null");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdHistorialpuntosGreaterThan(Integer value) {
            addCriterion("id_historialpuntos >", value, "id_historialpuntos");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdHistorialpuntosGreaterThanOrEqualTo(Integer value) {
            addCriterion("id_historialpuntos >=", value, "id_historialpuntos");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdHistorialpuntosLessThan(Integer value) {
            addCriterion("id_historialpuntos <", value, "id_historialpuntos");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdHistorialpuntosLessThanOrEqualTo(Integer value) {
            addCriterion("id_historialpuntos <=", value, "id_historialpuntos");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdHistorialpuntosIn(List<Integer> values) {
            addCriterion("id_historialpuntos in", values, "id_historialpuntos");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdHistorialpuntosNotIn(List<Integer> values) {
            addCriterion("id_historialpuntos not in", values, "id_historialpuntos");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdHistorialpuntosBetween(Integer value1, Integer value2) {
            addCriterion("id_historialpuntos between", value1, value2, "id_historialpuntos");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdHistorialpuntosNotBetween(Integer value1, Integer value2) {
            addCriterion("id_historialpuntos not between", value1, value2, "id_historialpuntos");
            return (Criteria) this;
        }
        
        
        public Criteria andIntCntPuntoganadoEqualTo(Integer value) {
            addCriterion("cnt_puntoganado =", value, "cnt_puntoganado");
            return (Criteria) this;
        }
        
        public Criteria andIntCntPuntoganadoNotEqualTo(Integer value) {
            addCriterion("cnt_puntoganado <>", value, "cnt_puntoganado");
            return (Criteria) this;
        }
        
        
        public Criteria andIntCntPuntoganadoIsNull() {
            addCriterion("cnt_puntoganado is null");
            return (Criteria) this;
        }
        
        public Criteria andIntCntPuntoganadoIsNotNull() {
            addCriterion("cnt_puntoganado is not null");
            return (Criteria) this;
        }
        
        public Criteria andIntCntPuntoganadoGreaterThan(Integer value) {
            addCriterion("cnt_puntoganado >", value, "cnt_puntoganado");
            return (Criteria) this;
        }
        
        public Criteria andIntCntPuntoganadoGreaterThanOrEqualTo(Integer value) {
            addCriterion("cnt_puntoganado >=", value, "cnt_puntoganado");
            return (Criteria) this;
        }
        
        public Criteria andIntCntPuntoganadoLessThan(Integer value) {
            addCriterion("cnt_puntoganado <", value, "cnt_puntoganado");
            return (Criteria) this;
        }
        
        public Criteria andIntCntPuntoganadoLessThanOrEqualTo(Integer value) {
            addCriterion("cnt_puntoganado <=", value, "cnt_puntoganado");
            return (Criteria) this;
        }
        
        public Criteria andIntCntPuntoganadoIn(List<Integer> values) {
            addCriterion("cnt_puntoganado in", values, "cnt_puntoganado");
            return (Criteria) this;
        }
        
        public Criteria andIntCntPuntoganadoNotIn(List<Integer> values) {
            addCriterion("cnt_puntoganado not in", values, "cnt_puntoganado");
            return (Criteria) this;
        }
        
        public Criteria andIntCntPuntoganadoBetween(Integer value1, Integer value2) {
            addCriterion("cnt_puntoganado between", value1, value2, "cnt_puntoganado");
            return (Criteria) this;
        }
        
        public Criteria andIntCntPuntoganadoNotBetween(Integer value1, Integer value2) {
            addCriterion("cnt_puntoganado not between", value1, value2, "cnt_puntoganado");
            return (Criteria) this;
        }
        
        
        public Criteria andIntCntPuntoperdidoEqualTo(Integer value) {
            addCriterion("cnt_puntoperdido =", value, "cnt_puntoperdido");
            return (Criteria) this;
        }
        
        public Criteria andIntCntPuntoperdidoNotEqualTo(Integer value) {
            addCriterion("cnt_puntoperdido <>", value, "cnt_puntoperdido");
            return (Criteria) this;
        }
        
        
        public Criteria andIntCntPuntoperdidoIsNull() {
            addCriterion("cnt_puntoperdido is null");
            return (Criteria) this;
        }
        
        public Criteria andIntCntPuntoperdidoIsNotNull() {
            addCriterion("cnt_puntoperdido is not null");
            return (Criteria) this;
        }
        
        public Criteria andIntCntPuntoperdidoGreaterThan(Integer value) {
            addCriterion("cnt_puntoperdido >", value, "cnt_puntoperdido");
            return (Criteria) this;
        }
        
        public Criteria andIntCntPuntoperdidoGreaterThanOrEqualTo(Integer value) {
            addCriterion("cnt_puntoperdido >=", value, "cnt_puntoperdido");
            return (Criteria) this;
        }
        
        public Criteria andIntCntPuntoperdidoLessThan(Integer value) {
            addCriterion("cnt_puntoperdido <", value, "cnt_puntoperdido");
            return (Criteria) this;
        }
        
        public Criteria andIntCntPuntoperdidoLessThanOrEqualTo(Integer value) {
            addCriterion("cnt_puntoperdido <=", value, "cnt_puntoperdido");
            return (Criteria) this;
        }
        
        public Criteria andIntCntPuntoperdidoIn(List<Integer> values) {
            addCriterion("cnt_puntoperdido in", values, "cnt_puntoperdido");
            return (Criteria) this;
        }
        
        public Criteria andIntCntPuntoperdidoNotIn(List<Integer> values) {
            addCriterion("cnt_puntoperdido not in", values, "cnt_puntoperdido");
            return (Criteria) this;
        }
        
        public Criteria andIntCntPuntoperdidoBetween(Integer value1, Integer value2) {
            addCriterion("cnt_puntoperdido between", value1, value2, "cnt_puntoperdido");
            return (Criteria) this;
        }
        
        public Criteria andIntCntPuntoperdidoNotBetween(Integer value1, Integer value2) {
            addCriterion("cnt_puntoperdido not between", value1, value2, "cnt_puntoperdido");
            return (Criteria) this;
        }
        
        
        public Criteria andDteFecPuntoEqualTo(Date value) {
            addCriterion("fec_punto =", value, "fec_punto");
            return (Criteria) this;
        }
        
        public Criteria andDteFecPuntoNotEqualTo(Date value) {
            addCriterion("fec_punto <>", value, "fec_punto");
            return (Criteria) this;
        }
        
        
        public Criteria andDteFecPuntoIsNull() {
            addCriterion("fec_punto is null");
            return (Criteria) this;
        }
        
        public Criteria andDteFecPuntoIsNotNull() {
            addCriterion("fec_punto is not null");
            return (Criteria) this;
        }
        
        public Criteria andDteFecPuntoGreaterThan(Date value) {
            addCriterion("fec_punto >", value, "fec_punto");
            return (Criteria) this;
        }
        
        public Criteria andDteFecPuntoGreaterThanOrEqualTo(Date value) {
            addCriterion("fec_punto >=", value, "fec_punto");
            return (Criteria) this;
        }
        
        public Criteria andDteFecPuntoLessThan(Date value) {
            addCriterion("fec_punto <", value, "fec_punto");
            return (Criteria) this;
        }
        
        public Criteria andDteFecPuntoLessThanOrEqualTo(Date value) {
            addCriterion("fec_punto <=", value, "fec_punto");
            return (Criteria) this;
        }
        
        public Criteria andDteFecPuntoIn(List<Date> values) {
            addCriterion("fec_punto in", values, "fec_punto");
            return (Criteria) this;
        }
        
        public Criteria andDteFecPuntoNotIn(List<Date> values) {
            addCriterion("fec_punto not in", values, "fec_punto");
            return (Criteria) this;
        }
        
        public Criteria andDteFecPuntoBetween(Date value1, Date value2) {
            addCriterion("fec_punto between", value1, value2, "fec_punto");
            return (Criteria) this;
        }
        
        public Criteria andDteFecPuntoNotBetween(Date value1, Date value2) {
            addCriterion("fec_punto not between", value1, value2, "fec_punto");
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
        
        
        public Criteria andIntIndTipopuntoEqualTo(Integer value) {
            addCriterion("ind_tipopunto =", value, "ind_tipopunto");
            return (Criteria) this;
        }
        
        public Criteria andIntIndTipopuntoNotEqualTo(Integer value) {
            addCriterion("ind_tipopunto <>", value, "ind_tipopunto");
            return (Criteria) this;
        }
        
        
        public Criteria andIntIndTipopuntoIsNull() {
            addCriterion("ind_tipopunto is null");
            return (Criteria) this;
        }
        
        public Criteria andIntIndTipopuntoIsNotNull() {
            addCriterion("ind_tipopunto is not null");
            return (Criteria) this;
        }
        
        public Criteria andIntIndTipopuntoGreaterThan(Integer value) {
            addCriterion("ind_tipopunto >", value, "ind_tipopunto");
            return (Criteria) this;
        }
        
        public Criteria andIntIndTipopuntoGreaterThanOrEqualTo(Integer value) {
            addCriterion("ind_tipopunto >=", value, "ind_tipopunto");
            return (Criteria) this;
        }
        
        public Criteria andIntIndTipopuntoLessThan(Integer value) {
            addCriterion("ind_tipopunto <", value, "ind_tipopunto");
            return (Criteria) this;
        }
        
        public Criteria andIntIndTipopuntoLessThanOrEqualTo(Integer value) {
            addCriterion("ind_tipopunto <=", value, "ind_tipopunto");
            return (Criteria) this;
        }
        
        public Criteria andIntIndTipopuntoIn(List<Integer> values) {
            addCriterion("ind_tipopunto in", values, "ind_tipopunto");
            return (Criteria) this;
        }
        
        public Criteria andIntIndTipopuntoNotIn(List<Integer> values) {
            addCriterion("ind_tipopunto not in", values, "ind_tipopunto");
            return (Criteria) this;
        }
        
        public Criteria andIntIndTipopuntoBetween(Integer value1, Integer value2) {
            addCriterion("ind_tipopunto between", value1, value2, "ind_tipopunto");
            return (Criteria) this;
        }
        
        public Criteria andIntIndTipopuntoNotBetween(Integer value1, Integer value2) {
            addCriterion("ind_tipopunto not between", value1, value2, "ind_tipopunto");
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
