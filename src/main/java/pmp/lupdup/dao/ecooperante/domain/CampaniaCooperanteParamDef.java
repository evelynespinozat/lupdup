package pmp.lupdup.dao.ecooperante.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import pmp.lupdup.general.util.CadenaUtil;

public class CampaniaCooperanteParamDef {
	
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;
    
    public CampaniaCooperanteParamDef() {
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
        
                
        
        public Criteria andSrlIdCampaniaEqualTo(Integer value) {
            addCriterion("id_campania =", value, "id_campania");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdCampaniaNotEqualTo(Integer value) {
            addCriterion("id_campania <>", value, "id_campania");
            return (Criteria) this;
        }
        
        
        public Criteria andSrlIdCampaniaIsNull() {
            addCriterion("id_campania is null");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdCampaniaIsNotNull() {
            addCriterion("id_campania is not null");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdCampaniaGreaterThan(Integer value) {
            addCriterion("id_campania >", value, "id_campania");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdCampaniaGreaterThanOrEqualTo(Integer value) {
            addCriterion("id_campania >=", value, "id_campania");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdCampaniaLessThan(Integer value) {
            addCriterion("id_campania <", value, "id_campania");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdCampaniaLessThanOrEqualTo(Integer value) {
            addCriterion("id_campania <=", value, "id_campania");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdCampaniaIn(List<Integer> values) {
            addCriterion("id_campania in", values, "id_campania");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdCampaniaNotIn(List<Integer> values) {
            addCriterion("id_campania not in", values, "id_campania");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdCampaniaBetween(Integer value1, Integer value2) {
            addCriterion("id_campania between", value1, value2, "id_campania");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdCampaniaNotBetween(Integer value1, Integer value2) {
            addCriterion("id_campania not between", value1, value2, "id_campania");
            return (Criteria) this;
        }
        
        
        public Criteria andIntIdEntidadcolaboradoraEqualTo(Integer value) {
            addCriterion("id_entidadcolaboradora =", value, "id_entidadcolaboradora");
            return (Criteria) this;
        }
        
        public Criteria andIntIdEntidadcolaboradoraNotEqualTo(Integer value) {
            addCriterion("id_entidadcolaboradora <>", value, "id_entidadcolaboradora");
            return (Criteria) this;
        }
        
        
        public Criteria andIntIdEntidadcolaboradoraIsNull() {
            addCriterion("id_entidadcolaboradora is null");
            return (Criteria) this;
        }
        
        public Criteria andIntIdEntidadcolaboradoraIsNotNull() {
            addCriterion("id_entidadcolaboradora is not null");
            return (Criteria) this;
        }
        
        public Criteria andIntIdEntidadcolaboradoraGreaterThan(Integer value) {
            addCriterion("id_entidadcolaboradora >", value, "id_entidadcolaboradora");
            return (Criteria) this;
        }
        
        public Criteria andIntIdEntidadcolaboradoraGreaterThanOrEqualTo(Integer value) {
            addCriterion("id_entidadcolaboradora >=", value, "id_entidadcolaboradora");
            return (Criteria) this;
        }
        
        public Criteria andIntIdEntidadcolaboradoraLessThan(Integer value) {
            addCriterion("id_entidadcolaboradora <", value, "id_entidadcolaboradora");
            return (Criteria) this;
        }
        
        public Criteria andIntIdEntidadcolaboradoraLessThanOrEqualTo(Integer value) {
            addCriterion("id_entidadcolaboradora <=", value, "id_entidadcolaboradora");
            return (Criteria) this;
        }
        
        public Criteria andIntIdEntidadcolaboradoraIn(List<Integer> values) {
            addCriterion("id_entidadcolaboradora in", values, "id_entidadcolaboradora");
            return (Criteria) this;
        }
        
        public Criteria andIntIdEntidadcolaboradoraNotIn(List<Integer> values) {
            addCriterion("id_entidadcolaboradora not in", values, "id_entidadcolaboradora");
            return (Criteria) this;
        }
        
        public Criteria andIntIdEntidadcolaboradoraBetween(Integer value1, Integer value2) {
            addCriterion("id_entidadcolaboradora between", value1, value2, "id_entidadcolaboradora");
            return (Criteria) this;
        }
        
        public Criteria andIntIdEntidadcolaboradoraNotBetween(Integer value1, Integer value2) {
            addCriterion("id_entidadcolaboradora not between", value1, value2, "id_entidadcolaboradora");
            return (Criteria) this;
        }
        
        
        public Criteria andStrDesCampaniaLike(String value) {
            addCriterion("upper(des_campania) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "des_campania");
            return (Criteria) this;
        }
        
        public Criteria andStrDesCampaniaNotLike(String value) {
            addCriterion("des_campania not like", "%" + CadenaUtil.getStr(value) + "%", "des_campania");
            return (Criteria) this;
        }
        
        public Criteria andStrDesCampaniaEqualTo(String value) {
            addCriterion("des_campania =", CadenaUtil.getStr(value), "des_campania");
            return (Criteria) this;
        }
        
        public Criteria andStrDesCampaniaNotEqualTo(String value) {
            addCriterion("des_campania <>", CadenaUtil.getStr(value), "des_campania");
            return (Criteria) this;
        }
        
        
        public Criteria andStrDesCampaniaIsNull() {
            addCriterion("des_campania is null");
            return (Criteria) this;
        }
        
        public Criteria andStrDesCampaniaIsNotNull() {
            addCriterion("des_campania is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrDesCampaniaGreaterThan(String value) {
            addCriterion("des_campania >", value, "des_campania");
            return (Criteria) this;
        }
        
        public Criteria andStrDesCampaniaGreaterThanOrEqualTo(String value) {
            addCriterion("des_campania >=", value, "des_campania");
            return (Criteria) this;
        }
        
        public Criteria andStrDesCampaniaLessThan(String value) {
            addCriterion("des_campania <", value, "des_campania");
            return (Criteria) this;
        }
        
        public Criteria andStrDesCampaniaLessThanOrEqualTo(String value) {
            addCriterion("des_campania <=", value, "des_campania");
            return (Criteria) this;
        }
        
        public Criteria andStrDesCampaniaIn(List<String> values) {
            addCriterion("des_campania in", values, "des_campania");
            return (Criteria) this;
        }
        
        public Criteria andStrDesCampaniaNotIn(List<String> values) {
            addCriterion("des_campania not in", values, "des_campania");
            return (Criteria) this;
        }
        
        public Criteria andStrDesCampaniaBetween(String value1, String value2) {
            addCriterion("des_campania between", value1, value2, "des_campania");
            return (Criteria) this;
        }
        
        public Criteria andStrDesCampaniaNotBetween(String value1, String value2) {
            addCriterion("des_campania not between", value1, value2, "des_campania");
            return (Criteria) this;
        }
        
        
        public Criteria andIntCntAsignadaEqualTo(Integer value) {
            addCriterion("cnt_asignada =", value, "cnt_asignada");
            return (Criteria) this;
        }
        
        public Criteria andIntCntAsignadaNotEqualTo(Integer value) {
            addCriterion("cnt_asignada <>", value, "cnt_asignada");
            return (Criteria) this;
        }
        
        
        public Criteria andIntCntAsignadaIsNull() {
            addCriterion("cnt_asignada is null");
            return (Criteria) this;
        }
        
        public Criteria andIntCntAsignadaIsNotNull() {
            addCriterion("cnt_asignada is not null");
            return (Criteria) this;
        }
        
        public Criteria andIntCntAsignadaGreaterThan(Integer value) {
            addCriterion("cnt_asignada >", value, "cnt_asignada");
            return (Criteria) this;
        }
        
        public Criteria andIntCntAsignadaGreaterThanOrEqualTo(Integer value) {
            addCriterion("cnt_asignada >=", value, "cnt_asignada");
            return (Criteria) this;
        }
        
        public Criteria andIntCntAsignadaLessThan(Integer value) {
            addCriterion("cnt_asignada <", value, "cnt_asignada");
            return (Criteria) this;
        }
        
        public Criteria andIntCntAsignadaLessThanOrEqualTo(Integer value) {
            addCriterion("cnt_asignada <=", value, "cnt_asignada");
            return (Criteria) this;
        }
        
        public Criteria andIntCntAsignadaIn(List<Integer> values) {
            addCriterion("cnt_asignada in", values, "cnt_asignada");
            return (Criteria) this;
        }
        
        public Criteria andIntCntAsignadaNotIn(List<Integer> values) {
            addCriterion("cnt_asignada not in", values, "cnt_asignada");
            return (Criteria) this;
        }
        
        public Criteria andIntCntAsignadaBetween(Integer value1, Integer value2) {
            addCriterion("cnt_asignada between", value1, value2, "cnt_asignada");
            return (Criteria) this;
        }
        
        public Criteria andIntCntAsignadaNotBetween(Integer value1, Integer value2) {
            addCriterion("cnt_asignada not between", value1, value2, "cnt_asignada");
            return (Criteria) this;
        }
        
        
        public Criteria andIntCntDisponibleEqualTo(Integer value) {
            addCriterion("cnt_disponible =", value, "cnt_disponible");
            return (Criteria) this;
        }
        
        public Criteria andIntCntDisponibleNotEqualTo(Integer value) {
            addCriterion("cnt_disponible <>", value, "cnt_disponible");
            return (Criteria) this;
        }
        
        
        public Criteria andIntCntDisponibleIsNull() {
            addCriterion("cnt_disponible is null");
            return (Criteria) this;
        }
        
        public Criteria andIntCntDisponibleIsNotNull() {
            addCriterion("cnt_disponible is not null");
            return (Criteria) this;
        }
        
        public Criteria andIntCntDisponibleGreaterThan(Integer value) {
            addCriterion("cnt_disponible >", value, "cnt_disponible");
            return (Criteria) this;
        }
        
        public Criteria andIntCntDisponibleGreaterThanOrEqualTo(Integer value) {
            addCriterion("cnt_disponible >=", value, "cnt_disponible");
            return (Criteria) this;
        }
        
        public Criteria andIntCntDisponibleLessThan(Integer value) {
            addCriterion("cnt_disponible <", value, "cnt_disponible");
            return (Criteria) this;
        }
        
        public Criteria andIntCntDisponibleLessThanOrEqualTo(Integer value) {
            addCriterion("cnt_disponible <=", value, "cnt_disponible");
            return (Criteria) this;
        }
        
        public Criteria andIntCntDisponibleIn(List<Integer> values) {
            addCriterion("cnt_disponible in", values, "cnt_disponible");
            return (Criteria) this;
        }
        
        public Criteria andIntCntDisponibleNotIn(List<Integer> values) {
            addCriterion("cnt_disponible not in", values, "cnt_disponible");
            return (Criteria) this;
        }
        
        public Criteria andIntCntDisponibleBetween(Integer value1, Integer value2) {
            addCriterion("cnt_disponible between", value1, value2, "cnt_disponible");
            return (Criteria) this;
        }
        
        public Criteria andIntCntDisponibleNotBetween(Integer value1, Integer value2) {
            addCriterion("cnt_disponible not between", value1, value2, "cnt_disponible");
            return (Criteria) this;
        }
        
        
        public Criteria andDteFecInicioEqualTo(Date value) {
            addCriterion("fec_inicio =", value, "fec_inicio");
            return (Criteria) this;
        }
        
        public Criteria andDteFecInicioNotEqualTo(Date value) {
            addCriterion("fec_inicio <>", value, "fec_inicio");
            return (Criteria) this;
        }
        
        
        public Criteria andDteFecInicioIsNull() {
            addCriterion("fec_inicio is null");
            return (Criteria) this;
        }
        
        public Criteria andDteFecInicioIsNotNull() {
            addCriterion("fec_inicio is not null");
            return (Criteria) this;
        }
        
        public Criteria andDteFecInicioGreaterThan(Date value) {
            addCriterion("fec_inicio >", value, "fec_inicio");
            return (Criteria) this;
        }
        
        public Criteria andDteFecInicioGreaterThanOrEqualTo(Date value) {
            addCriterion("fec_inicio >=", value, "fec_inicio");
            return (Criteria) this;
        }
        
        public Criteria andDteFecInicioLessThan(Date value) {
            addCriterion("fec_inicio <", value, "fec_inicio");
            return (Criteria) this;
        }
        
        public Criteria andDteFecInicioLessThanOrEqualTo(Date value) {
            addCriterion("fec_inicio <=", value, "fec_inicio");
            return (Criteria) this;
        }
        
        public Criteria andDteFecInicioIn(List<Date> values) {
            addCriterion("fec_inicio in", values, "fec_inicio");
            return (Criteria) this;
        }
        
        public Criteria andDteFecInicioNotIn(List<Date> values) {
            addCriterion("fec_inicio not in", values, "fec_inicio");
            return (Criteria) this;
        }
        
        public Criteria andDteFecInicioBetween(Date value1, Date value2) {
            addCriterion("fec_inicio between", value1, value2, "fec_inicio");
            return (Criteria) this;
        }
        
        public Criteria andDteFecInicioNotBetween(Date value1, Date value2) {
            addCriterion("fec_inicio not between", value1, value2, "fec_inicio");
            return (Criteria) this;
        }
        
        
        public Criteria andDteFecFinEqualTo(Date value) {
            addCriterion("fec_fin =", value, "fec_fin");
            return (Criteria) this;
        }
        
        public Criteria andDteFecFinNotEqualTo(Date value) {
            addCriterion("fec_fin <>", value, "fec_fin");
            return (Criteria) this;
        }
        
        
        public Criteria andDteFecFinIsNull() {
            addCriterion("fec_fin is null");
            return (Criteria) this;
        }
        
        public Criteria andDteFecFinIsNotNull() {
            addCriterion("fec_fin is not null");
            return (Criteria) this;
        }
        
        public Criteria andDteFecFinGreaterThan(Date value) {
            addCriterion("fec_fin >", value, "fec_fin");
            return (Criteria) this;
        }
        
        public Criteria andDteFecFinGreaterThanOrEqualTo(Date value) {
            addCriterion("fec_fin >=", value, "fec_fin");
            return (Criteria) this;
        }
        
        public Criteria andDteFecFinLessThan(Date value) {
            addCriterion("fec_fin <", value, "fec_fin");
            return (Criteria) this;
        }
        
        public Criteria andDteFecFinLessThanOrEqualTo(Date value) {
            addCriterion("fec_fin <=", value, "fec_fin");
            return (Criteria) this;
        }
        
        public Criteria andDteFecFinIn(List<Date> values) {
            addCriterion("fec_fin in", values, "fec_fin");
            return (Criteria) this;
        }
        
        public Criteria andDteFecFinNotIn(List<Date> values) {
            addCriterion("fec_fin not in", values, "fec_fin");
            return (Criteria) this;
        }
        
        public Criteria andDteFecFinBetween(Date value1, Date value2) {
            addCriterion("fec_fin between", value1, value2, "fec_fin");
            return (Criteria) this;
        }
        
        public Criteria andDteFecFinNotBetween(Date value1, Date value2) {
            addCriterion("fec_fin not between", value1, value2, "fec_fin");
            return (Criteria) this;
        }
        
        
        public Criteria andIntIndActivoEqualTo(Integer value) {
            addCriterion("ind_activo =", value, "ind_activo");
            return (Criteria) this;
        }
        
        public Criteria andIntIndActivoNotEqualTo(Integer value) {
            addCriterion("ind_activo <>", value, "ind_activo");
            return (Criteria) this;
        }
        
        
        public Criteria andIntIndActivoIsNull() {
            addCriterion("ind_activo is null");
            return (Criteria) this;
        }
        
        public Criteria andIntIndActivoIsNotNull() {
            addCriterion("ind_activo is not null");
            return (Criteria) this;
        }
        
        public Criteria andIntIndActivoGreaterThan(Integer value) {
            addCriterion("ind_activo >", value, "ind_activo");
            return (Criteria) this;
        }
        
        public Criteria andIntIndActivoGreaterThanOrEqualTo(Integer value) {
            addCriterion("ind_activo >=", value, "ind_activo");
            return (Criteria) this;
        }
        
        public Criteria andIntIndActivoLessThan(Integer value) {
            addCriterion("ind_activo <", value, "ind_activo");
            return (Criteria) this;
        }
        
        public Criteria andIntIndActivoLessThanOrEqualTo(Integer value) {
            addCriterion("ind_activo <=", value, "ind_activo");
            return (Criteria) this;
        }
        
        public Criteria andIntIndActivoIn(List<Integer> values) {
            addCriterion("ind_activo in", values, "ind_activo");
            return (Criteria) this;
        }
        
        public Criteria andIntIndActivoNotIn(List<Integer> values) {
            addCriterion("ind_activo not in", values, "ind_activo");
            return (Criteria) this;
        }
        
        public Criteria andIntIndActivoBetween(Integer value1, Integer value2) {
            addCriterion("ind_activo between", value1, value2, "ind_activo");
            return (Criteria) this;
        }
        
        public Criteria andIntIndActivoNotBetween(Integer value1, Integer value2) {
            addCriterion("ind_activo not between", value1, value2, "ind_activo");
            return (Criteria) this;
        }
        
        
        public Criteria andIntNumDescuentoEqualTo(Integer value) {
            addCriterion("num_descuento =", value, "num_descuento");
            return (Criteria) this;
        }
        
        public Criteria andIntNumDescuentoNotEqualTo(Integer value) {
            addCriterion("num_descuento <>", value, "num_descuento");
            return (Criteria) this;
        }
        
        
        public Criteria andIntNumDescuentoIsNull() {
            addCriterion("num_descuento is null");
            return (Criteria) this;
        }
        
        public Criteria andIntNumDescuentoIsNotNull() {
            addCriterion("num_descuento is not null");
            return (Criteria) this;
        }
        
        public Criteria andIntNumDescuentoGreaterThan(Integer value) {
            addCriterion("num_descuento >", value, "num_descuento");
            return (Criteria) this;
        }
        
        public Criteria andIntNumDescuentoGreaterThanOrEqualTo(Integer value) {
            addCriterion("num_descuento >=", value, "num_descuento");
            return (Criteria) this;
        }
        
        public Criteria andIntNumDescuentoLessThan(Integer value) {
            addCriterion("num_descuento <", value, "num_descuento");
            return (Criteria) this;
        }
        
        public Criteria andIntNumDescuentoLessThanOrEqualTo(Integer value) {
            addCriterion("num_descuento <=", value, "num_descuento");
            return (Criteria) this;
        }
        
        public Criteria andIntNumDescuentoIn(List<Integer> values) {
            addCriterion("num_descuento in", values, "num_descuento");
            return (Criteria) this;
        }
        
        public Criteria andIntNumDescuentoNotIn(List<Integer> values) {
            addCriterion("num_descuento not in", values, "num_descuento");
            return (Criteria) this;
        }
        
        public Criteria andIntNumDescuentoBetween(Integer value1, Integer value2) {
            addCriterion("num_descuento between", value1, value2, "num_descuento");
            return (Criteria) this;
        }
        
        public Criteria andIntNumDescuentoNotBetween(Integer value1, Integer value2) {
            addCriterion("num_descuento not between", value1, value2, "num_descuento");
            return (Criteria) this;
        }
        
        
        public Criteria andStrDesRegaloLike(String value) {
            addCriterion("upper(des_regalo) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "des_regalo");
            return (Criteria) this;
        }
        
        public Criteria andStrDesRegaloNotLike(String value) {
            addCriterion("des_regalo not like", "%" + CadenaUtil.getStr(value) + "%", "des_regalo");
            return (Criteria) this;
        }
        
        public Criteria andStrDesRegaloEqualTo(String value) {
            addCriterion("des_regalo =", CadenaUtil.getStr(value), "des_regalo");
            return (Criteria) this;
        }
        
        public Criteria andStrDesRegaloNotEqualTo(String value) {
            addCriterion("des_regalo <>", CadenaUtil.getStr(value), "des_regalo");
            return (Criteria) this;
        }
        
        
        public Criteria andStrDesRegaloIsNull() {
            addCriterion("des_regalo is null");
            return (Criteria) this;
        }
        
        public Criteria andStrDesRegaloIsNotNull() {
            addCriterion("des_regalo is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrDesRegaloGreaterThan(String value) {
            addCriterion("des_regalo >", value, "des_regalo");
            return (Criteria) this;
        }
        
        public Criteria andStrDesRegaloGreaterThanOrEqualTo(String value) {
            addCriterion("des_regalo >=", value, "des_regalo");
            return (Criteria) this;
        }
        
        public Criteria andStrDesRegaloLessThan(String value) {
            addCriterion("des_regalo <", value, "des_regalo");
            return (Criteria) this;
        }
        
        public Criteria andStrDesRegaloLessThanOrEqualTo(String value) {
            addCriterion("des_regalo <=", value, "des_regalo");
            return (Criteria) this;
        }
        
        public Criteria andStrDesRegaloIn(List<String> values) {
            addCriterion("des_regalo in", values, "des_regalo");
            return (Criteria) this;
        }
        
        public Criteria andStrDesRegaloNotIn(List<String> values) {
            addCriterion("des_regalo not in", values, "des_regalo");
            return (Criteria) this;
        }
        
        public Criteria andStrDesRegaloBetween(String value1, String value2) {
            addCriterion("des_regalo between", value1, value2, "des_regalo");
            return (Criteria) this;
        }
        
        public Criteria andStrDesRegaloNotBetween(String value1, String value2) {
            addCriterion("des_regalo not between", value1, value2, "des_regalo");
            return (Criteria) this;
        }
        
        
        public Criteria andIntCntMinpuntosEqualTo(Integer value) {
            addCriterion("cnt_minpuntos =", value, "cnt_minpuntos");
            return (Criteria) this;
        }
        
        public Criteria andIntCntMinpuntosNotEqualTo(Integer value) {
            addCriterion("cnt_minpuntos <>", value, "cnt_minpuntos");
            return (Criteria) this;
        }
        
        
        public Criteria andIntCntMinpuntosIsNull() {
            addCriterion("cnt_minpuntos is null");
            return (Criteria) this;
        }
        
        public Criteria andIntCntMinpuntosIsNotNull() {
            addCriterion("cnt_minpuntos is not null");
            return (Criteria) this;
        }
        
        public Criteria andIntCntMinpuntosGreaterThan(Integer value) {
            addCriterion("cnt_minpuntos >", value, "cnt_minpuntos");
            return (Criteria) this;
        }
        
        public Criteria andIntCntMinpuntosGreaterThanOrEqualTo(Integer value) {
            addCriterion("cnt_minpuntos >=", value, "cnt_minpuntos");
            return (Criteria) this;
        }
        
        public Criteria andIntCntMinpuntosLessThan(Integer value) {
            addCriterion("cnt_minpuntos <", value, "cnt_minpuntos");
            return (Criteria) this;
        }
        
        public Criteria andIntCntMinpuntosLessThanOrEqualTo(Integer value) {
            addCriterion("cnt_minpuntos <=", value, "cnt_minpuntos");
            return (Criteria) this;
        }
        
        public Criteria andIntCntMinpuntosIn(List<Integer> values) {
            addCriterion("cnt_minpuntos in", values, "cnt_minpuntos");
            return (Criteria) this;
        }
        
        public Criteria andIntCntMinpuntosNotIn(List<Integer> values) {
            addCriterion("cnt_minpuntos not in", values, "cnt_minpuntos");
            return (Criteria) this;
        }
        
        public Criteria andIntCntMinpuntosBetween(Integer value1, Integer value2) {
            addCriterion("cnt_minpuntos between", value1, value2, "cnt_minpuntos");
            return (Criteria) this;
        }
        
        public Criteria andIntCntMinpuntosNotBetween(Integer value1, Integer value2) {
            addCriterion("cnt_minpuntos not between", value1, value2, "cnt_minpuntos");
            return (Criteria) this;
        }
        
        
        public Criteria andIntCntGustaEqualTo(Integer value) {
            addCriterion("cnt_gusta =", value, "cnt_gusta");
            return (Criteria) this;
        }
        
        public Criteria andIntCntGustaNotEqualTo(Integer value) {
            addCriterion("cnt_gusta <>", value, "cnt_gusta");
            return (Criteria) this;
        }
        
        
        public Criteria andIntCntGustaIsNull() {
            addCriterion("cnt_gusta is null");
            return (Criteria) this;
        }
        
        public Criteria andIntCntGustaIsNotNull() {
            addCriterion("cnt_gusta is not null");
            return (Criteria) this;
        }
        
        public Criteria andIntCntGustaGreaterThan(Integer value) {
            addCriterion("cnt_gusta >", value, "cnt_gusta");
            return (Criteria) this;
        }
        
        public Criteria andIntCntGustaGreaterThanOrEqualTo(Integer value) {
            addCriterion("cnt_gusta >=", value, "cnt_gusta");
            return (Criteria) this;
        }
        
        public Criteria andIntCntGustaLessThan(Integer value) {
            addCriterion("cnt_gusta <", value, "cnt_gusta");
            return (Criteria) this;
        }
        
        public Criteria andIntCntGustaLessThanOrEqualTo(Integer value) {
            addCriterion("cnt_gusta <=", value, "cnt_gusta");
            return (Criteria) this;
        }
        
        public Criteria andIntCntGustaIn(List<Integer> values) {
            addCriterion("cnt_gusta in", values, "cnt_gusta");
            return (Criteria) this;
        }
        
        public Criteria andIntCntGustaNotIn(List<Integer> values) {
            addCriterion("cnt_gusta not in", values, "cnt_gusta");
            return (Criteria) this;
        }
        
        public Criteria andIntCntGustaBetween(Integer value1, Integer value2) {
            addCriterion("cnt_gusta between", value1, value2, "cnt_gusta");
            return (Criteria) this;
        }
        
        public Criteria andIntCntGustaNotBetween(Integer value1, Integer value2) {
            addCriterion("cnt_gusta not between", value1, value2, "cnt_gusta");
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
