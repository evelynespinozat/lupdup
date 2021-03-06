package pmp.lupdup.dao.administrador.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import pmp.lupdup.general.util.CadenaUtil;

public class SedeEntidadColaboradoraUsuarioParamDef {
	
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;
    
    public SedeEntidadColaboradoraUsuarioParamDef() {
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
        
                
        
        public Criteria andIntIdUsuarioEqualTo(Integer value) {
            addCriterion("id_usuario =", value, "id_usuario");
            return (Criteria) this;
        }
        
        public Criteria andIntIdUsuarioNotEqualTo(Integer value) {
            addCriterion("id_usuario <>", value, "id_usuario");
            return (Criteria) this;
        }
        
        
        public Criteria andIntIdUsuarioIsNull() {
            addCriterion("id_usuario is null");
            return (Criteria) this;
        }
        
        public Criteria andIntIdUsuarioIsNotNull() {
            addCriterion("id_usuario is not null");
            return (Criteria) this;
        }
        
        public Criteria andIntIdUsuarioGreaterThan(Integer value) {
            addCriterion("id_usuario >", value, "id_usuario");
            return (Criteria) this;
        }
        
        public Criteria andIntIdUsuarioGreaterThanOrEqualTo(Integer value) {
            addCriterion("id_usuario >=", value, "id_usuario");
            return (Criteria) this;
        }
        
        public Criteria andIntIdUsuarioLessThan(Integer value) {
            addCriterion("id_usuario <", value, "id_usuario");
            return (Criteria) this;
        }
        
        public Criteria andIntIdUsuarioLessThanOrEqualTo(Integer value) {
            addCriterion("id_usuario <=", value, "id_usuario");
            return (Criteria) this;
        }
        
        public Criteria andIntIdUsuarioIn(List<Integer> values) {
            addCriterion("id_usuario in", values, "id_usuario");
            return (Criteria) this;
        }
        
        public Criteria andIntIdUsuarioNotIn(List<Integer> values) {
            addCriterion("id_usuario not in", values, "id_usuario");
            return (Criteria) this;
        }
        
        public Criteria andIntIdUsuarioBetween(Integer value1, Integer value2) {
            addCriterion("id_usuario between", value1, value2, "id_usuario");
            return (Criteria) this;
        }
        
        public Criteria andIntIdUsuarioNotBetween(Integer value1, Integer value2) {
            addCriterion("id_usuario not between", value1, value2, "id_usuario");
            return (Criteria) this;
        }
        
        
        public Criteria andIntIdSedeentidadEqualTo(Integer value) {
            addCriterion("id_sedeentidad =", value, "id_sedeentidad");
            return (Criteria) this;
        }
        
        public Criteria andIntIdSedeentidadNotEqualTo(Integer value) {
            addCriterion("id_sedeentidad <>", value, "id_sedeentidad");
            return (Criteria) this;
        }
        
        
        public Criteria andIntIdSedeentidadIsNull() {
            addCriterion("id_sedeentidad is null");
            return (Criteria) this;
        }
        
        public Criteria andIntIdSedeentidadIsNotNull() {
            addCriterion("id_sedeentidad is not null");
            return (Criteria) this;
        }
        
        public Criteria andIntIdSedeentidadGreaterThan(Integer value) {
            addCriterion("id_sedeentidad >", value, "id_sedeentidad");
            return (Criteria) this;
        }
        
        public Criteria andIntIdSedeentidadGreaterThanOrEqualTo(Integer value) {
            addCriterion("id_sedeentidad >=", value, "id_sedeentidad");
            return (Criteria) this;
        }
        
        public Criteria andIntIdSedeentidadLessThan(Integer value) {
            addCriterion("id_sedeentidad <", value, "id_sedeentidad");
            return (Criteria) this;
        }
        
        public Criteria andIntIdSedeentidadLessThanOrEqualTo(Integer value) {
            addCriterion("id_sedeentidad <=", value, "id_sedeentidad");
            return (Criteria) this;
        }
        
        public Criteria andIntIdSedeentidadIn(List<Integer> values) {
            addCriterion("id_sedeentidad in", values, "id_sedeentidad");
            return (Criteria) this;
        }
        
        public Criteria andIntIdSedeentidadNotIn(List<Integer> values) {
            addCriterion("id_sedeentidad not in", values, "id_sedeentidad");
            return (Criteria) this;
        }
        
        public Criteria andIntIdSedeentidadBetween(Integer value1, Integer value2) {
            addCriterion("id_sedeentidad between", value1, value2, "id_sedeentidad");
            return (Criteria) this;
        }
        
        public Criteria andIntIdSedeentidadNotBetween(Integer value1, Integer value2) {
            addCriterion("id_sedeentidad not between", value1, value2, "id_sedeentidad");
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
