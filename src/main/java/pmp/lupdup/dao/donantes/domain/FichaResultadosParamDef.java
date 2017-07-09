package pmp.lupdup.dao.donantes.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import pmp.lupdup.general.util.CadenaUtil;

public class FichaResultadosParamDef {
	
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;
    
    public FichaResultadosParamDef() {
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
        
                
        
        public Criteria andSrlIdFichaEqualTo(Integer value) {
            addCriterion("id_ficha =", value, "id_ficha");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdFichaNotEqualTo(Integer value) {
            addCriterion("id_ficha <>", value, "id_ficha");
            return (Criteria) this;
        }
        
        
        public Criteria andSrlIdFichaIsNull() {
            addCriterion("id_ficha is null");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdFichaIsNotNull() {
            addCriterion("id_ficha is not null");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdFichaGreaterThan(Integer value) {
            addCriterion("id_ficha >", value, "id_ficha");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdFichaGreaterThanOrEqualTo(Integer value) {
            addCriterion("id_ficha >=", value, "id_ficha");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdFichaLessThan(Integer value) {
            addCriterion("id_ficha <", value, "id_ficha");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdFichaLessThanOrEqualTo(Integer value) {
            addCriterion("id_ficha <=", value, "id_ficha");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdFichaIn(List<Integer> values) {
            addCriterion("id_ficha in", values, "id_ficha");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdFichaNotIn(List<Integer> values) {
            addCriterion("id_ficha not in", values, "id_ficha");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdFichaBetween(Integer value1, Integer value2) {
            addCriterion("id_ficha between", value1, value2, "id_ficha");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdFichaNotBetween(Integer value1, Integer value2) {
            addCriterion("id_ficha not between", value1, value2, "id_ficha");
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
        
        
        public Criteria andIntIdImagenEqualTo(Integer value) {
            addCriterion("id_imagen =", value, "id_imagen");
            return (Criteria) this;
        }
        
        public Criteria andIntIdImagenNotEqualTo(Integer value) {
            addCriterion("id_imagen <>", value, "id_imagen");
            return (Criteria) this;
        }
        
        
        public Criteria andIntIdImagenIsNull() {
            addCriterion("id_imagen is null");
            return (Criteria) this;
        }
        
        public Criteria andIntIdImagenIsNotNull() {
            addCriterion("id_imagen is not null");
            return (Criteria) this;
        }
        
        public Criteria andIntIdImagenGreaterThan(Integer value) {
            addCriterion("id_imagen >", value, "id_imagen");
            return (Criteria) this;
        }
        
        public Criteria andIntIdImagenGreaterThanOrEqualTo(Integer value) {
            addCriterion("id_imagen >=", value, "id_imagen");
            return (Criteria) this;
        }
        
        public Criteria andIntIdImagenLessThan(Integer value) {
            addCriterion("id_imagen <", value, "id_imagen");
            return (Criteria) this;
        }
        
        public Criteria andIntIdImagenLessThanOrEqualTo(Integer value) {
            addCriterion("id_imagen <=", value, "id_imagen");
            return (Criteria) this;
        }
        
        public Criteria andIntIdImagenIn(List<Integer> values) {
            addCriterion("id_imagen in", values, "id_imagen");
            return (Criteria) this;
        }
        
        public Criteria andIntIdImagenNotIn(List<Integer> values) {
            addCriterion("id_imagen not in", values, "id_imagen");
            return (Criteria) this;
        }
        
        public Criteria andIntIdImagenBetween(Integer value1, Integer value2) {
            addCriterion("id_imagen between", value1, value2, "id_imagen");
            return (Criteria) this;
        }
        
        public Criteria andIntIdImagenNotBetween(Integer value1, Integer value2) {
            addCriterion("id_imagen not between", value1, value2, "id_imagen");
            return (Criteria) this;
        }
        
        
        public Criteria andDteFecAnalisisEqualTo(Date value) {
            addCriterion("fec_analisis =", value, "fec_analisis");
            return (Criteria) this;
        }
        
        public Criteria andDteFecAnalisisNotEqualTo(Date value) {
            addCriterion("fec_analisis <>", value, "fec_analisis");
            return (Criteria) this;
        }
        
        
        public Criteria andDteFecAnalisisIsNull() {
            addCriterion("fec_analisis is null");
            return (Criteria) this;
        }
        
        public Criteria andDteFecAnalisisIsNotNull() {
            addCriterion("fec_analisis is not null");
            return (Criteria) this;
        }
        
        public Criteria andDteFecAnalisisGreaterThan(Date value) {
            addCriterion("fec_analisis >", value, "fec_analisis");
            return (Criteria) this;
        }
        
        public Criteria andDteFecAnalisisGreaterThanOrEqualTo(Date value) {
            addCriterion("fec_analisis >=", value, "fec_analisis");
            return (Criteria) this;
        }
        
        public Criteria andDteFecAnalisisLessThan(Date value) {
            addCriterion("fec_analisis <", value, "fec_analisis");
            return (Criteria) this;
        }
        
        public Criteria andDteFecAnalisisLessThanOrEqualTo(Date value) {
            addCriterion("fec_analisis <=", value, "fec_analisis");
            return (Criteria) this;
        }
        
        public Criteria andDteFecAnalisisIn(List<Date> values) {
            addCriterion("fec_analisis in", values, "fec_analisis");
            return (Criteria) this;
        }
        
        public Criteria andDteFecAnalisisNotIn(List<Date> values) {
            addCriterion("fec_analisis not in", values, "fec_analisis");
            return (Criteria) this;
        }
        
        public Criteria andDteFecAnalisisBetween(Date value1, Date value2) {
            addCriterion("fec_analisis between", value1, value2, "fec_analisis");
            return (Criteria) this;
        }
        
        public Criteria andDteFecAnalisisNotBetween(Date value1, Date value2) {
            addCriterion("fec_analisis not between", value1, value2, "fec_analisis");
            return (Criteria) this;
        }
        
        
        public Criteria andStrHorAnalisisLike(String value) {
            addCriterion("upper(hor_analisis) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "hor_analisis");
            return (Criteria) this;
        }
        
        public Criteria andStrHorAnalisisNotLike(String value) {
            addCriterion("hor_analisis not like", "%" + CadenaUtil.getStr(value) + "%", "hor_analisis");
            return (Criteria) this;
        }
        
        public Criteria andStrHorAnalisisEqualTo(String value) {
            addCriterion("hor_analisis =", CadenaUtil.getStr(value), "hor_analisis");
            return (Criteria) this;
        }
        
        public Criteria andStrHorAnalisisNotEqualTo(String value) {
            addCriterion("hor_analisis <>", CadenaUtil.getStr(value), "hor_analisis");
            return (Criteria) this;
        }
        
        
        public Criteria andStrHorAnalisisIsNull() {
            addCriterion("hor_analisis is null");
            return (Criteria) this;
        }
        
        public Criteria andStrHorAnalisisIsNotNull() {
            addCriterion("hor_analisis is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrHorAnalisisGreaterThan(String value) {
            addCriterion("hor_analisis >", value, "hor_analisis");
            return (Criteria) this;
        }
        
        public Criteria andStrHorAnalisisGreaterThanOrEqualTo(String value) {
            addCriterion("hor_analisis >=", value, "hor_analisis");
            return (Criteria) this;
        }
        
        public Criteria andStrHorAnalisisLessThan(String value) {
            addCriterion("hor_analisis <", value, "hor_analisis");
            return (Criteria) this;
        }
        
        public Criteria andStrHorAnalisisLessThanOrEqualTo(String value) {
            addCriterion("hor_analisis <=", value, "hor_analisis");
            return (Criteria) this;
        }
        
        public Criteria andStrHorAnalisisIn(List<String> values) {
            addCriterion("hor_analisis in", values, "hor_analisis");
            return (Criteria) this;
        }
        
        public Criteria andStrHorAnalisisNotIn(List<String> values) {
            addCriterion("hor_analisis not in", values, "hor_analisis");
            return (Criteria) this;
        }
        
        public Criteria andStrHorAnalisisBetween(String value1, String value2) {
            addCriterion("hor_analisis between", value1, value2, "hor_analisis");
            return (Criteria) this;
        }
        
        public Criteria andStrHorAnalisisNotBetween(String value1, String value2) {
            addCriterion("hor_analisis not between", value1, value2, "hor_analisis");
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
        
        
        public Criteria andIntNumUnidadesEqualTo(Integer value) {
            addCriterion("num_unidades =", value, "num_unidades");
            return (Criteria) this;
        }
        
        public Criteria andIntNumUnidadesNotEqualTo(Integer value) {
            addCriterion("num_unidades <>", value, "num_unidades");
            return (Criteria) this;
        }
        
        
        public Criteria andIntNumUnidadesIsNull() {
            addCriterion("num_unidades is null");
            return (Criteria) this;
        }
        
        public Criteria andIntNumUnidadesIsNotNull() {
            addCriterion("num_unidades is not null");
            return (Criteria) this;
        }
        
        public Criteria andIntNumUnidadesGreaterThan(Integer value) {
            addCriterion("num_unidades >", value, "num_unidades");
            return (Criteria) this;
        }
        
        public Criteria andIntNumUnidadesGreaterThanOrEqualTo(Integer value) {
            addCriterion("num_unidades >=", value, "num_unidades");
            return (Criteria) this;
        }
        
        public Criteria andIntNumUnidadesLessThan(Integer value) {
            addCriterion("num_unidades <", value, "num_unidades");
            return (Criteria) this;
        }
        
        public Criteria andIntNumUnidadesLessThanOrEqualTo(Integer value) {
            addCriterion("num_unidades <=", value, "num_unidades");
            return (Criteria) this;
        }
        
        public Criteria andIntNumUnidadesIn(List<Integer> values) {
            addCriterion("num_unidades in", values, "num_unidades");
            return (Criteria) this;
        }
        
        public Criteria andIntNumUnidadesNotIn(List<Integer> values) {
            addCriterion("num_unidades not in", values, "num_unidades");
            return (Criteria) this;
        }
        
        public Criteria andIntNumUnidadesBetween(Integer value1, Integer value2) {
            addCriterion("num_unidades between", value1, value2, "num_unidades");
            return (Criteria) this;
        }
        
        public Criteria andIntNumUnidadesNotBetween(Integer value1, Integer value2) {
            addCriterion("num_unidades not between", value1, value2, "num_unidades");
            return (Criteria) this;
        }
        
        public Criteria andIntIdCitaEqualTo(Integer value) {
            addCriterion("id_cita =", value, "id_cita");
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
