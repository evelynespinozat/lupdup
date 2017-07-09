package pmp.lupdup.dao.csalud.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

import pmp.lupdup.dao.donantes.domain.DonanteParamDef.Criteria;
import pmp.lupdup.general.util.CadenaUtil;

public class BandejaCitaParamDef {
	
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;
    
    public BandejaCitaParamDef() {
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
        
                
        
        public Criteria andSrlIdCitaEqualTo(Integer value) {
            addCriterion("id_cita =", value, "id_cita");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdCitaNotEqualTo(Integer value) {
            addCriterion("id_cita <>", value, "id_cita");
            return (Criteria) this;
        }
        
        
        public Criteria andSrlIdCitaIsNull() {
            addCriterion("id_cita is null");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdCitaIsNotNull() {
            addCriterion("id_cita is not null");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdCitaGreaterThan(Integer value) {
            addCriterion("id_cita >", value, "id_cita");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdCitaGreaterThanOrEqualTo(Integer value) {
            addCriterion("id_cita >=", value, "id_cita");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdCitaLessThan(Integer value) {
            addCriterion("id_cita <", value, "id_cita");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdCitaLessThanOrEqualTo(Integer value) {
            addCriterion("id_cita <=", value, "id_cita");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdCitaIn(List<Integer> values) {
            addCriterion("id_cita in", values, "id_cita");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdCitaNotIn(List<Integer> values) {
            addCriterion("id_cita not in", values, "id_cita");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdCitaBetween(Integer value1, Integer value2) {
            addCriterion("id_cita between", value1, value2, "id_cita");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdCitaNotBetween(Integer value1, Integer value2) {
            addCriterion("id_cita not between", value1, value2, "id_cita");
            return (Criteria) this;
        }
        
        
        public Criteria andIntIdSedeEqualTo(Integer value) {
            addCriterion("id_sede =", value, "id_sede");
            return (Criteria) this;
        }
        
        public Criteria andIntIdSedeNotEqualTo(Integer value) {
            addCriterion("id_sede <>", value, "id_sede");
            return (Criteria) this;
        }
        
        
        public Criteria andIntIdSedeIsNull() {
            addCriterion("id_sede is null");
            return (Criteria) this;
        }
        
        public Criteria andIntIdSedeIsNotNull() {
            addCriterion("id_sede is not null");
            return (Criteria) this;
        }
        
        public Criteria andIntIdSedeGreaterThan(Integer value) {
            addCriterion("id_sede >", value, "id_sede");
            return (Criteria) this;
        }
        
        public Criteria andIntIdSedeGreaterThanOrEqualTo(Integer value) {
            addCriterion("id_sede >=", value, "id_sede");
            return (Criteria) this;
        }
        
        public Criteria andIntIdSedeLessThan(Integer value) {
            addCriterion("id_sede <", value, "id_sede");
            return (Criteria) this;
        }
        
        public Criteria andIntIdSedeLessThanOrEqualTo(Integer value) {
            addCriterion("id_sede <=", value, "id_sede");
            return (Criteria) this;
        }
        
        public Criteria andIntIdSedeIn(List<Integer> values) {
            addCriterion("id_sede in", values, "id_sede");
            return (Criteria) this;
        }
        
        public Criteria andIntIdSedeNotIn(List<Integer> values) {
            addCriterion("id_sede not in", values, "id_sede");
            return (Criteria) this;
        }
        
        public Criteria andIntIdSedeBetween(Integer value1, Integer value2) {
            addCriterion("id_sede between", value1, value2, "id_sede");
            return (Criteria) this;
        }
        
        public Criteria andIntIdSedeNotBetween(Integer value1, Integer value2) {
            addCriterion("id_sede not between", value1, value2, "id_sede");
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
        
        
        public Criteria andDteFecCitaEqualTo(Date value) {
            addCriterion("fec_cita =", value, "fec_cita");
            return (Criteria) this;
        }
        
        public Criteria andDteFecCitaNotEqualTo(Date value) {
            addCriterion("fec_cita <>", value, "fec_cita");
            return (Criteria) this;
        }
        
        
        public Criteria andDteFecCitaIsNull() {
            addCriterion("fec_cita is null");
            return (Criteria) this;
        }
        
        public Criteria andDteFecCitaIsNotNull() {
            addCriterion("fec_cita is not null");
            return (Criteria) this;
        }
        
        public Criteria andDteFecCitaGreaterThan(Date value) {
            addCriterion("fec_cita >", value, "fec_cita");
            return (Criteria) this;
        }
        
        public Criteria andDteFecCitaGreaterThanOrEqualTo(Date value) {
            addCriterion("fec_cita >=", value, "fec_cita");
            return (Criteria) this;
        }
        
        public Criteria andDteFecCitaLessThan(Date value) {
            addCriterion("fec_cita <", value, "fec_cita");
            return (Criteria) this;
        }
        
        public Criteria andDteFecCitaLessThanOrEqualTo(Date value) {
            addCriterion("fec_cita <=", value, "fec_cita");
            return (Criteria) this;
        }
        
        public Criteria andDteFecCitaIn(List<Date> values) {
            addCriterion("fec_cita in", values, "fec_cita");
            return (Criteria) this;
        }
        
        public Criteria andDteFecCitaNotIn(List<Date> values) {
            addCriterion("fec_cita not in", values, "fec_cita");
            return (Criteria) this;
        }
        
        public Criteria andDteFecCitaBetween(Date value1, Date value2) {
            addCriterion("fec_cita between", value1, value2, "fec_cita");
            return (Criteria) this;
        }
        
        public Criteria andDteFecCitaNotBetween(Date value1, Date value2) {
            addCriterion("fec_cita not between", value1, value2, "fec_cita");
            return (Criteria) this;
        }
        
        
        public Criteria andStrHorCitaLike(String value) {
            addCriterion("upper(hor_cita) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "hor_cita");
            return (Criteria) this;
        }
        
        public Criteria andStrHorCitaNotLike(String value) {
            addCriterion("hor_cita not like", "%" + CadenaUtil.getStr(value) + "%", "hor_cita");
            return (Criteria) this;
        }
        
        public Criteria andStrHorCitaEqualTo(String value) {
            addCriterion("hor_cita =", CadenaUtil.getStr(value), "hor_cita");
            return (Criteria) this;
        }
        
        public Criteria andStrHorCitaNotEqualTo(String value) {
            addCriterion("hor_cita <>", CadenaUtil.getStr(value), "hor_cita");
            return (Criteria) this;
        }
        
        
        public Criteria andStrHorCitaIsNull() {
            addCriterion("hor_cita is null");
            return (Criteria) this;
        }
        
        public Criteria andStrHorCitaIsNotNull() {
            addCriterion("hor_cita is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrHorCitaGreaterThan(String value) {
            addCriterion("hor_cita >", value, "hor_cita");
            return (Criteria) this;
        }
        
        public Criteria andStrHorCitaGreaterThanOrEqualTo(String value) {
            addCriterion("hor_cita >=", value, "hor_cita");
            return (Criteria) this;
        }
        
        public Criteria andStrHorCitaLessThan(String value) {
            addCriterion("hor_cita <", value, "hor_cita");
            return (Criteria) this;
        }
        
        public Criteria andStrHorCitaLessThanOrEqualTo(String value) {
            addCriterion("hor_cita <=", value, "hor_cita");
            return (Criteria) this;
        }
        
        public Criteria andStrHorCitaIn(List<String> values) {
            addCriterion("hor_cita in", values, "hor_cita");
            return (Criteria) this;
        }
        
        public Criteria andStrHorCitaNotIn(List<String> values) {
            addCriterion("hor_cita not in", values, "hor_cita");
            return (Criteria) this;
        }
        
        public Criteria andStrHorCitaBetween(String value1, String value2) {
            addCriterion("hor_cita between", value1, value2, "hor_cita");
            return (Criteria) this;
        }
        
        public Criteria andStrHorCitaNotBetween(String value1, String value2) {
            addCriterion("hor_cita not between", value1, value2, "hor_cita");
            return (Criteria) this;
        }
        
        
        
        
        
        

        
        public Criteria andStrNomAppaternoLike(String value) {
            addCriterion("upper(d.nom_appaterno) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "nom_appaterno");
            return (Criteria) this;
        }
        
        public Criteria andStrNomApmaternoLike(String value) {
            addCriterion("upper(d.nom_apmaterno) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "nom_apmaterno");
            return (Criteria) this;
        }
        
        public Criteria andStrNomNombreLike(String value) {
            addCriterion("upper(d.nom_nombre) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "nom_nombre");
            return (Criteria) this;
        }

        public Criteria andStrNumDniLike(String value) {
            addCriterion("d.num_dni like", "%" + CadenaUtil.getStr(value) + "%", "num_dni");
            return (Criteria) this;
        }
        
        

        public Criteria andIntIdEstadoEqualTo(Integer value) {
            addCriterion("id_estado =", value, "id_estado");
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
