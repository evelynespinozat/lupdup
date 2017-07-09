package pmp.lupdup.dao.donantes.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import pmp.lupdup.general.util.CadenaUtil;

public class CuestionarioRptaParamDef {
	
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;
    
    public CuestionarioRptaParamDef() {
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
        
                
        
        public Criteria andSrlIdDonantecuestionariorptaEqualTo(Integer value) {
            addCriterion("id_donantecuestionariorpta =", value, "id_donantecuestionariorpta");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdDonantecuestionariorptaNotEqualTo(Integer value) {
            addCriterion("id_donantecuestionariorpta <>", value, "id_donantecuestionariorpta");
            return (Criteria) this;
        }
        
        
        public Criteria andSrlIdDonantecuestionariorptaIsNull() {
            addCriterion("id_donantecuestionariorpta is null");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdDonantecuestionariorptaIsNotNull() {
            addCriterion("id_donantecuestionariorpta is not null");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdDonantecuestionariorptaGreaterThan(Integer value) {
            addCriterion("id_donantecuestionariorpta >", value, "id_donantecuestionariorpta");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdDonantecuestionariorptaGreaterThanOrEqualTo(Integer value) {
            addCriterion("id_donantecuestionariorpta >=", value, "id_donantecuestionariorpta");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdDonantecuestionariorptaLessThan(Integer value) {
            addCriterion("id_donantecuestionariorpta <", value, "id_donantecuestionariorpta");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdDonantecuestionariorptaLessThanOrEqualTo(Integer value) {
            addCriterion("id_donantecuestionariorpta <=", value, "id_donantecuestionariorpta");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdDonantecuestionariorptaIn(List<Integer> values) {
            addCriterion("id_donantecuestionariorpta in", values, "id_donantecuestionariorpta");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdDonantecuestionariorptaNotIn(List<Integer> values) {
            addCriterion("id_donantecuestionariorpta not in", values, "id_donantecuestionariorpta");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdDonantecuestionariorptaBetween(Integer value1, Integer value2) {
            addCriterion("id_donantecuestionariorpta between", value1, value2, "id_donantecuestionariorpta");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdDonantecuestionariorptaNotBetween(Integer value1, Integer value2) {
            addCriterion("id_donantecuestionariorpta not between", value1, value2, "id_donantecuestionariorpta");
            return (Criteria) this;
        }
        
        
        public Criteria andIntIdCuestionarioEqualTo(Integer value) {
            addCriterion("id_cuestionario =", value, "id_cuestionario");
            return (Criteria) this;
        }
        
        public Criteria andIntIdCuestionarioNotEqualTo(Integer value) {
            addCriterion("id_cuestionario <>", value, "id_cuestionario");
            return (Criteria) this;
        }
        
        
        public Criteria andIntIdCuestionarioIsNull() {
            addCriterion("id_cuestionario is null");
            return (Criteria) this;
        }
        
        public Criteria andIntIdCuestionarioIsNotNull() {
            addCriterion("id_cuestionario is not null");
            return (Criteria) this;
        }
        
        public Criteria andIntIdCuestionarioGreaterThan(Integer value) {
            addCriterion("id_cuestionario >", value, "id_cuestionario");
            return (Criteria) this;
        }
        
        public Criteria andIntIdCuestionarioGreaterThanOrEqualTo(Integer value) {
            addCriterion("id_cuestionario >=", value, "id_cuestionario");
            return (Criteria) this;
        }
        
        public Criteria andIntIdCuestionarioLessThan(Integer value) {
            addCriterion("id_cuestionario <", value, "id_cuestionario");
            return (Criteria) this;
        }
        
        public Criteria andIntIdCuestionarioLessThanOrEqualTo(Integer value) {
            addCriterion("id_cuestionario <=", value, "id_cuestionario");
            return (Criteria) this;
        }
        
        public Criteria andIntIdCuestionarioIn(List<Integer> values) {
            addCriterion("id_cuestionario in", values, "id_cuestionario");
            return (Criteria) this;
        }
        
        public Criteria andIntIdCuestionarioNotIn(List<Integer> values) {
            addCriterion("id_cuestionario not in", values, "id_cuestionario");
            return (Criteria) this;
        }
        
        public Criteria andIntIdCuestionarioBetween(Integer value1, Integer value2) {
            addCriterion("id_cuestionario between", value1, value2, "id_cuestionario");
            return (Criteria) this;
        }
        
        public Criteria andIntIdCuestionarioNotBetween(Integer value1, Integer value2) {
            addCriterion("id_cuestionario not between", value1, value2, "id_cuestionario");
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
        
        
        public Criteria andStrEsCheckLike(String value) {
            addCriterion("upper(es_check) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "es_check");
            return (Criteria) this;
        }
        
        public Criteria andStrEsCheckNotLike(String value) {
            addCriterion("es_check not like", "%" + CadenaUtil.getStr(value) + "%", "es_check");
            return (Criteria) this;
        }
        
        public Criteria andStrEsCheckEqualTo(String value) {
            addCriterion("es_check =", CadenaUtil.getStr(value), "es_check");
            return (Criteria) this;
        }
        
        public Criteria andStrEsCheckNotEqualTo(String value) {
            addCriterion("es_check <>", CadenaUtil.getStr(value), "es_check");
            return (Criteria) this;
        }
        
        
        public Criteria andStrEsCheckIsNull() {
            addCriterion("es_check is null");
            return (Criteria) this;
        }
        
        public Criteria andStrEsCheckIsNotNull() {
            addCriterion("es_check is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrEsCheckGreaterThan(String value) {
            addCriterion("es_check >", value, "es_check");
            return (Criteria) this;
        }
        
        public Criteria andStrEsCheckGreaterThanOrEqualTo(String value) {
            addCriterion("es_check >=", value, "es_check");
            return (Criteria) this;
        }
        
        public Criteria andStrEsCheckLessThan(String value) {
            addCriterion("es_check <", value, "es_check");
            return (Criteria) this;
        }
        
        public Criteria andStrEsCheckLessThanOrEqualTo(String value) {
            addCriterion("es_check <=", value, "es_check");
            return (Criteria) this;
        }
        
        public Criteria andStrEsCheckIn(List<String> values) {
            addCriterion("es_check in", values, "es_check");
            return (Criteria) this;
        }
        
        public Criteria andStrEsCheckNotIn(List<String> values) {
            addCriterion("es_check not in", values, "es_check");
            return (Criteria) this;
        }
        
        public Criteria andStrEsCheckBetween(String value1, String value2) {
            addCriterion("es_check between", value1, value2, "es_check");
            return (Criteria) this;
        }
        
        public Criteria andStrEsCheckNotBetween(String value1, String value2) {
            addCriterion("es_check not between", value1, value2, "es_check");
            return (Criteria) this;
        }
        
        
        public Criteria andStrDesRespuestaLike(String value) {
            addCriterion("upper(des_respuesta) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "des_respuesta");
            return (Criteria) this;
        }
        
        public Criteria andStrDesRespuestaNotLike(String value) {
            addCriterion("des_respuesta not like", "%" + CadenaUtil.getStr(value) + "%", "des_respuesta");
            return (Criteria) this;
        }
        
        public Criteria andStrDesRespuestaEqualTo(String value) {
            addCriterion("des_respuesta =", CadenaUtil.getStr(value), "des_respuesta");
            return (Criteria) this;
        }
        
        public Criteria andStrDesRespuestaNotEqualTo(String value) {
            addCriterion("des_respuesta <>", CadenaUtil.getStr(value), "des_respuesta");
            return (Criteria) this;
        }
        
        
        public Criteria andStrDesRespuestaIsNull() {
            addCriterion("des_respuesta is null");
            return (Criteria) this;
        }
        
        public Criteria andStrDesRespuestaIsNotNull() {
            addCriterion("des_respuesta is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrDesRespuestaGreaterThan(String value) {
            addCriterion("des_respuesta >", value, "des_respuesta");
            return (Criteria) this;
        }
        
        public Criteria andStrDesRespuestaGreaterThanOrEqualTo(String value) {
            addCriterion("des_respuesta >=", value, "des_respuesta");
            return (Criteria) this;
        }
        
        public Criteria andStrDesRespuestaLessThan(String value) {
            addCriterion("des_respuesta <", value, "des_respuesta");
            return (Criteria) this;
        }
        
        public Criteria andStrDesRespuestaLessThanOrEqualTo(String value) {
            addCriterion("des_respuesta <=", value, "des_respuesta");
            return (Criteria) this;
        }
        
        public Criteria andStrDesRespuestaIn(List<String> values) {
            addCriterion("des_respuesta in", values, "des_respuesta");
            return (Criteria) this;
        }
        
        public Criteria andStrDesRespuestaNotIn(List<String> values) {
            addCriterion("des_respuesta not in", values, "des_respuesta");
            return (Criteria) this;
        }
        
        public Criteria andStrDesRespuestaBetween(String value1, String value2) {
            addCriterion("des_respuesta between", value1, value2, "des_respuesta");
            return (Criteria) this;
        }
        
        public Criteria andStrDesRespuestaNotBetween(String value1, String value2) {
            addCriterion("des_respuesta not between", value1, value2, "des_respuesta");
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
