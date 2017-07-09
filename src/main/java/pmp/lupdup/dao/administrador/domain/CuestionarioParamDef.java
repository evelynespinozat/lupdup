package pmp.lupdup.dao.administrador.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import pmp.lupdup.general.util.CadenaUtil;

public class CuestionarioParamDef {
	
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;
    
    public CuestionarioParamDef() {
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
        
                
        
        public Criteria andSrlIdCuestionarioEqualTo(Integer value) {
            addCriterion("id_cuestionario =", value, "id_cuestionario");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdCuestionarioNotEqualTo(Integer value) {
            addCriterion("id_cuestionario <>", value, "id_cuestionario");
            return (Criteria) this;
        }
        
        
        public Criteria andSrlIdCuestionarioIsNull() {
            addCriterion("id_cuestionario is null");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdCuestionarioIsNotNull() {
            addCriterion("id_cuestionario is not null");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdCuestionarioGreaterThan(Integer value) {
            addCriterion("id_cuestionario >", value, "id_cuestionario");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdCuestionarioGreaterThanOrEqualTo(Integer value) {
            addCriterion("id_cuestionario >=", value, "id_cuestionario");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdCuestionarioLessThan(Integer value) {
            addCriterion("id_cuestionario <", value, "id_cuestionario");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdCuestionarioLessThanOrEqualTo(Integer value) {
            addCriterion("id_cuestionario <=", value, "id_cuestionario");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdCuestionarioIn(List<Integer> values) {
            addCriterion("id_cuestionario in", values, "id_cuestionario");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdCuestionarioNotIn(List<Integer> values) {
            addCriterion("id_cuestionario not in", values, "id_cuestionario");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdCuestionarioBetween(Integer value1, Integer value2) {
            addCriterion("id_cuestionario between", value1, value2, "id_cuestionario");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdCuestionarioNotBetween(Integer value1, Integer value2) {
            addCriterion("id_cuestionario not between", value1, value2, "id_cuestionario");
            return (Criteria) this;
        }
        
        
        public Criteria andStrDesCuestionarioLike(String value) {
            addCriterion("upper(des_cuestionario) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "des_cuestionario");
            return (Criteria) this;
        }
        
        public Criteria andStrDesCuestionarioNotLike(String value) {
            addCriterion("des_cuestionario not like", "%" + CadenaUtil.getStr(value) + "%", "des_cuestionario");
            return (Criteria) this;
        }
        
        public Criteria andStrDesCuestionarioEqualTo(String value) {
            addCriterion("des_cuestionario =", CadenaUtil.getStr(value), "des_cuestionario");
            return (Criteria) this;
        }
        
        public Criteria andStrDesCuestionarioNotEqualTo(String value) {
            addCriterion("des_cuestionario <>", CadenaUtil.getStr(value), "des_cuestionario");
            return (Criteria) this;
        }
        
        
        public Criteria andStrDesCuestionarioIsNull() {
            addCriterion("des_cuestionario is null");
            return (Criteria) this;
        }
        
        public Criteria andStrDesCuestionarioIsNotNull() {
            addCriterion("des_cuestionario is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrDesCuestionarioGreaterThan(String value) {
            addCriterion("des_cuestionario >", value, "des_cuestionario");
            return (Criteria) this;
        }
        
        public Criteria andStrDesCuestionarioGreaterThanOrEqualTo(String value) {
            addCriterion("des_cuestionario >=", value, "des_cuestionario");
            return (Criteria) this;
        }
        
        public Criteria andStrDesCuestionarioLessThan(String value) {
            addCriterion("des_cuestionario <", value, "des_cuestionario");
            return (Criteria) this;
        }
        
        public Criteria andStrDesCuestionarioLessThanOrEqualTo(String value) {
            addCriterion("des_cuestionario <=", value, "des_cuestionario");
            return (Criteria) this;
        }
        
        public Criteria andStrDesCuestionarioIn(List<String> values) {
            addCriterion("des_cuestionario in", values, "des_cuestionario");
            return (Criteria) this;
        }
        
        public Criteria andStrDesCuestionarioNotIn(List<String> values) {
            addCriterion("des_cuestionario not in", values, "des_cuestionario");
            return (Criteria) this;
        }
        
        public Criteria andStrDesCuestionarioBetween(String value1, String value2) {
            addCriterion("des_cuestionario between", value1, value2, "des_cuestionario");
            return (Criteria) this;
        }
        
        public Criteria andStrDesCuestionarioNotBetween(String value1, String value2) {
            addCriterion("des_cuestionario not between", value1, value2, "des_cuestionario");
            return (Criteria) this;
        }
        
        
        public Criteria andIntIndTipoEqualTo(Integer value) {
            addCriterion("ind_tipo =", value, "ind_tipo");
            return (Criteria) this;
        }
        
        public Criteria andIntIndTipoNotEqualTo(Integer value) {
            addCriterion("ind_tipo <>", value, "ind_tipo");
            return (Criteria) this;
        }
        
        
        public Criteria andIntIndTipoIsNull() {
            addCriterion("ind_tipo is null");
            return (Criteria) this;
        }
        
        public Criteria andIntIndTipoIsNotNull() {
            addCriterion("ind_tipo is not null");
            return (Criteria) this;
        }
        
        public Criteria andIntIndTipoGreaterThan(Integer value) {
            addCriterion("ind_tipo >", value, "ind_tipo");
            return (Criteria) this;
        }
        
        public Criteria andIntIndTipoGreaterThanOrEqualTo(Integer value) {
            addCriterion("ind_tipo >=", value, "ind_tipo");
            return (Criteria) this;
        }
        
        public Criteria andIntIndTipoLessThan(Integer value) {
            addCriterion("ind_tipo <", value, "ind_tipo");
            return (Criteria) this;
        }
        
        public Criteria andIntIndTipoLessThanOrEqualTo(Integer value) {
            addCriterion("ind_tipo <=", value, "ind_tipo");
            return (Criteria) this;
        }
        
        public Criteria andIntIndTipoIn(List<Integer> values) {
            addCriterion("ind_tipo in", values, "ind_tipo");
            return (Criteria) this;
        }
        
        public Criteria andIntIndTipoNotIn(List<Integer> values) {
            addCriterion("ind_tipo not in", values, "ind_tipo");
            return (Criteria) this;
        }
        
        public Criteria andIntIndTipoBetween(Integer value1, Integer value2) {
            addCriterion("ind_tipo between", value1, value2, "ind_tipo");
            return (Criteria) this;
        }
        
        public Criteria andIntIndTipoNotBetween(Integer value1, Integer value2) {
            addCriterion("ind_tipo not between", value1, value2, "ind_tipo");
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
