package pmp.lupdup.dao.administrador.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import pmp.lupdup.general.util.CadenaUtil;

public class CatalogoParamDef {
	
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;
    
    public CatalogoParamDef() {
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
        
                
        
        public Criteria andSrlIdCatalogoEqualTo(Integer value) {
            addCriterion("id_catalogo =", value, "id_catalogo");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdCatalogoNotEqualTo(Integer value) {
            addCriterion("id_catalogo <>", value, "id_catalogo");
            return (Criteria) this;
        }
        
        
        public Criteria andSrlIdCatalogoIsNull() {
            addCriterion("id_catalogo is null");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdCatalogoIsNotNull() {
            addCriterion("id_catalogo is not null");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdCatalogoGreaterThan(Integer value) {
            addCriterion("id_catalogo >", value, "id_catalogo");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdCatalogoGreaterThanOrEqualTo(Integer value) {
            addCriterion("id_catalogo >=", value, "id_catalogo");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdCatalogoLessThan(Integer value) {
            addCriterion("id_catalogo <", value, "id_catalogo");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdCatalogoLessThanOrEqualTo(Integer value) {
            addCriterion("id_catalogo <=", value, "id_catalogo");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdCatalogoIn(List<Integer> values) {
            addCriterion("id_catalogo in", values, "id_catalogo");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdCatalogoNotIn(List<Integer> values) {
            addCriterion("id_catalogo not in", values, "id_catalogo");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdCatalogoBetween(Integer value1, Integer value2) {
            addCriterion("id_catalogo between", value1, value2, "id_catalogo");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdCatalogoNotBetween(Integer value1, Integer value2) {
            addCriterion("id_catalogo not between", value1, value2, "id_catalogo");
            return (Criteria) this;
        }
        
        
        public Criteria andStrDesIndicadorLike(String value) {
            addCriterion("upper(des_indicador) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "des_indicador");
            return (Criteria) this;
        }
        
        public Criteria andStrDesIndicadorNotLike(String value) {
            addCriterion("des_indicador not like", "%" + CadenaUtil.getStr(value) + "%", "des_indicador");
            return (Criteria) this;
        }
        
        public Criteria andStrDesIndicadorEqualTo(String value) {
            addCriterion("des_indicador =", CadenaUtil.getStr(value), "des_indicador");
            return (Criteria) this;
        }
        
        public Criteria andStrDesIndicadorNotEqualTo(String value) {
            addCriterion("des_indicador <>", CadenaUtil.getStr(value), "des_indicador");
            return (Criteria) this;
        }
        
        
        public Criteria andStrDesIndicadorIsNull() {
            addCriterion("des_indicador is null");
            return (Criteria) this;
        }
        
        public Criteria andStrDesIndicadorIsNotNull() {
            addCriterion("des_indicador is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrDesIndicadorGreaterThan(String value) {
            addCriterion("des_indicador >", value, "des_indicador");
            return (Criteria) this;
        }
        
        public Criteria andStrDesIndicadorGreaterThanOrEqualTo(String value) {
            addCriterion("des_indicador >=", value, "des_indicador");
            return (Criteria) this;
        }
        
        public Criteria andStrDesIndicadorLessThan(String value) {
            addCriterion("des_indicador <", value, "des_indicador");
            return (Criteria) this;
        }
        
        public Criteria andStrDesIndicadorLessThanOrEqualTo(String value) {
            addCriterion("des_indicador <=", value, "des_indicador");
            return (Criteria) this;
        }
        
        public Criteria andStrDesIndicadorIn(List<String> values) {
            addCriterion("des_indicador in", values, "des_indicador");
            return (Criteria) this;
        }
        
        public Criteria andStrDesIndicadorNotIn(List<String> values) {
            addCriterion("des_indicador not in", values, "des_indicador");
            return (Criteria) this;
        }
        
        public Criteria andStrDesIndicadorBetween(String value1, String value2) {
            addCriterion("des_indicador between", value1, value2, "des_indicador");
            return (Criteria) this;
        }
        
        public Criteria andStrDesIndicadorNotBetween(String value1, String value2) {
            addCriterion("des_indicador not between", value1, value2, "des_indicador");
            return (Criteria) this;
        }
        
        
        public Criteria andStrNomIndicadorLike(String value) {
            addCriterion("upper(nom_indicador) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "nom_indicador");
            return (Criteria) this;
        }
        
        public Criteria andStrNomIndicadorNotLike(String value) {
            addCriterion("nom_indicador not like", "%" + CadenaUtil.getStr(value) + "%", "nom_indicador");
            return (Criteria) this;
        }
        
        public Criteria andStrNomIndicadorEqualTo(String value) {
            addCriterion("nom_indicador =", CadenaUtil.getStr(value), "nom_indicador");
            return (Criteria) this;
        }
        
        public Criteria andStrNomIndicadorNotEqualTo(String value) {
            addCriterion("nom_indicador <>", CadenaUtil.getStr(value), "nom_indicador");
            return (Criteria) this;
        }
        
        
        public Criteria andStrNomIndicadorIsNull() {
            addCriterion("nom_indicador is null");
            return (Criteria) this;
        }
        
        public Criteria andStrNomIndicadorIsNotNull() {
            addCriterion("nom_indicador is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrNomIndicadorGreaterThan(String value) {
            addCriterion("nom_indicador >", value, "nom_indicador");
            return (Criteria) this;
        }
        
        public Criteria andStrNomIndicadorGreaterThanOrEqualTo(String value) {
            addCriterion("nom_indicador >=", value, "nom_indicador");
            return (Criteria) this;
        }
        
        public Criteria andStrNomIndicadorLessThan(String value) {
            addCriterion("nom_indicador <", value, "nom_indicador");
            return (Criteria) this;
        }
        
        public Criteria andStrNomIndicadorLessThanOrEqualTo(String value) {
            addCriterion("nom_indicador <=", value, "nom_indicador");
            return (Criteria) this;
        }
        
        public Criteria andStrNomIndicadorIn(List<String> values) {
            addCriterion("nom_indicador in", values, "nom_indicador");
            return (Criteria) this;
        }
        
        public Criteria andStrNomIndicadorNotIn(List<String> values) {
            addCriterion("nom_indicador not in", values, "nom_indicador");
            return (Criteria) this;
        }
        
        public Criteria andStrNomIndicadorBetween(String value1, String value2) {
            addCriterion("nom_indicador between", value1, value2, "nom_indicador");
            return (Criteria) this;
        }
        
        public Criteria andStrNomIndicadorNotBetween(String value1, String value2) {
            addCriterion("nom_indicador not between", value1, value2, "nom_indicador");
            return (Criteria) this;
        }
        
        
        public Criteria andStrNomAbreviaturaLike(String value) {
            addCriterion("upper(nom_abreviatura) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "nom_abreviatura");
            return (Criteria) this;
        }
        
        public Criteria andStrNomAbreviaturaNotLike(String value) {
            addCriterion("nom_abreviatura not like", "%" + CadenaUtil.getStr(value) + "%", "nom_abreviatura");
            return (Criteria) this;
        }
        
        public Criteria andStrNomAbreviaturaEqualTo(String value) {
            addCriterion("nom_abreviatura =", CadenaUtil.getStr(value), "nom_abreviatura");
            return (Criteria) this;
        }
        
        public Criteria andStrNomAbreviaturaNotEqualTo(String value) {
            addCriterion("nom_abreviatura <>", CadenaUtil.getStr(value), "nom_abreviatura");
            return (Criteria) this;
        }
        
        
        public Criteria andStrNomAbreviaturaIsNull() {
            addCriterion("nom_abreviatura is null");
            return (Criteria) this;
        }
        
        public Criteria andStrNomAbreviaturaIsNotNull() {
            addCriterion("nom_abreviatura is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrNomAbreviaturaGreaterThan(String value) {
            addCriterion("nom_abreviatura >", value, "nom_abreviatura");
            return (Criteria) this;
        }
        
        public Criteria andStrNomAbreviaturaGreaterThanOrEqualTo(String value) {
            addCriterion("nom_abreviatura >=", value, "nom_abreviatura");
            return (Criteria) this;
        }
        
        public Criteria andStrNomAbreviaturaLessThan(String value) {
            addCriterion("nom_abreviatura <", value, "nom_abreviatura");
            return (Criteria) this;
        }
        
        public Criteria andStrNomAbreviaturaLessThanOrEqualTo(String value) {
            addCriterion("nom_abreviatura <=", value, "nom_abreviatura");
            return (Criteria) this;
        }
        
        public Criteria andStrNomAbreviaturaIn(List<String> values) {
            addCriterion("nom_abreviatura in", values, "nom_abreviatura");
            return (Criteria) this;
        }
        
        public Criteria andStrNomAbreviaturaNotIn(List<String> values) {
            addCriterion("nom_abreviatura not in", values, "nom_abreviatura");
            return (Criteria) this;
        }
        
        public Criteria andStrNomAbreviaturaBetween(String value1, String value2) {
            addCriterion("nom_abreviatura between", value1, value2, "nom_abreviatura");
            return (Criteria) this;
        }
        
        public Criteria andStrNomAbreviaturaNotBetween(String value1, String value2) {
            addCriterion("nom_abreviatura not between", value1, value2, "nom_abreviatura");
            return (Criteria) this;
        }
        
        
        public Criteria andIntNumValorEqualTo(Integer value) {
            addCriterion("num_valor =", value, "num_valor");
            return (Criteria) this;
        }
        
        public Criteria andIntNumValorNotEqualTo(Integer value) {
            addCriterion("num_valor <>", value, "num_valor");
            return (Criteria) this;
        }
        
        
        public Criteria andIntNumValorIsNull() {
            addCriterion("num_valor is null");
            return (Criteria) this;
        }
        
        public Criteria andIntNumValorIsNotNull() {
            addCriterion("num_valor is not null");
            return (Criteria) this;
        }
        
        public Criteria andIntNumValorGreaterThan(Integer value) {
            addCriterion("num_valor >", value, "num_valor");
            return (Criteria) this;
        }
        
        public Criteria andIntNumValorGreaterThanOrEqualTo(Integer value) {
            addCriterion("num_valor >=", value, "num_valor");
            return (Criteria) this;
        }
        
        public Criteria andIntNumValorLessThan(Integer value) {
            addCriterion("num_valor <", value, "num_valor");
            return (Criteria) this;
        }
        
        public Criteria andIntNumValorLessThanOrEqualTo(Integer value) {
            addCriterion("num_valor <=", value, "num_valor");
            return (Criteria) this;
        }
        
        public Criteria andIntNumValorIn(List<Integer> values) {
            addCriterion("num_valor in", values, "num_valor");
            return (Criteria) this;
        }
        
        public Criteria andIntNumValorNotIn(List<Integer> values) {
            addCriterion("num_valor not in", values, "num_valor");
            return (Criteria) this;
        }
        
        public Criteria andIntNumValorBetween(Integer value1, Integer value2) {
            addCriterion("num_valor between", value1, value2, "num_valor");
            return (Criteria) this;
        }
        
        public Criteria andIntNumValorNotBetween(Integer value1, Integer value2) {
            addCriterion("num_valor not between", value1, value2, "num_valor");
            return (Criteria) this;
        }
        
        
        public Criteria andIntCodIndicadorEqualTo(Integer value) {
            addCriterion("cod_indicador =", value, "cod_indicador");
            return (Criteria) this;
        }
        
        public Criteria andIntCodIndicadorNotEqualTo(Integer value) {
            addCriterion("cod_indicador <>", value, "cod_indicador");
            return (Criteria) this;
        }
        
        
        public Criteria andIntCodIndicadorIsNull() {
            addCriterion("cod_indicador is null");
            return (Criteria) this;
        }
        
        public Criteria andIntCodIndicadorIsNotNull() {
            addCriterion("cod_indicador is not null");
            return (Criteria) this;
        }
        
        public Criteria andIntCodIndicadorGreaterThan(Integer value) {
            addCriterion("cod_indicador >", value, "cod_indicador");
            return (Criteria) this;
        }
        
        public Criteria andIntCodIndicadorGreaterThanOrEqualTo(Integer value) {
            addCriterion("cod_indicador >=", value, "cod_indicador");
            return (Criteria) this;
        }
        
        public Criteria andIntCodIndicadorLessThan(Integer value) {
            addCriterion("cod_indicador <", value, "cod_indicador");
            return (Criteria) this;
        }
        
        public Criteria andIntCodIndicadorLessThanOrEqualTo(Integer value) {
            addCriterion("cod_indicador <=", value, "cod_indicador");
            return (Criteria) this;
        }
        
        public Criteria andIntCodIndicadorIn(List<Integer> values) {
            addCriterion("cod_indicador in", values, "cod_indicador");
            return (Criteria) this;
        }
        
        public Criteria andIntCodIndicadorNotIn(List<Integer> values) {
            addCriterion("cod_indicador not in", values, "cod_indicador");
            return (Criteria) this;
        }
        
        public Criteria andIntCodIndicadorBetween(Integer value1, Integer value2) {
            addCriterion("cod_indicador between", value1, value2, "cod_indicador");
            return (Criteria) this;
        }
        
        public Criteria andIntCodIndicadorNotBetween(Integer value1, Integer value2) {
            addCriterion("cod_indicador not between", value1, value2, "cod_indicador");
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
