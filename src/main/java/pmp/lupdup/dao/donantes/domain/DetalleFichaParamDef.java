package pmp.lupdup.dao.donantes.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import pmp.lupdup.general.util.CadenaUtil;

public class DetalleFichaParamDef {
	
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;
    
    public DetalleFichaParamDef() {
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
        
                
        
        public Criteria andSrlIdDetallefichaEqualTo(Integer value) {
            addCriterion("id_detalleficha =", value, "id_detalleficha");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdDetallefichaNotEqualTo(Integer value) {
            addCriterion("id_detalleficha <>", value, "id_detalleficha");
            return (Criteria) this;
        }
        
        
        public Criteria andSrlIdDetallefichaIsNull() {
            addCriterion("id_detalleficha is null");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdDetallefichaIsNotNull() {
            addCriterion("id_detalleficha is not null");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdDetallefichaGreaterThan(Integer value) {
            addCriterion("id_detalleficha >", value, "id_detalleficha");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdDetallefichaGreaterThanOrEqualTo(Integer value) {
            addCriterion("id_detalleficha >=", value, "id_detalleficha");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdDetallefichaLessThan(Integer value) {
            addCriterion("id_detalleficha <", value, "id_detalleficha");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdDetallefichaLessThanOrEqualTo(Integer value) {
            addCriterion("id_detalleficha <=", value, "id_detalleficha");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdDetallefichaIn(List<Integer> values) {
            addCriterion("id_detalleficha in", values, "id_detalleficha");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdDetallefichaNotIn(List<Integer> values) {
            addCriterion("id_detalleficha not in", values, "id_detalleficha");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdDetallefichaBetween(Integer value1, Integer value2) {
            addCriterion("id_detalleficha between", value1, value2, "id_detalleficha");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdDetallefichaNotBetween(Integer value1, Integer value2) {
            addCriterion("id_detalleficha not between", value1, value2, "id_detalleficha");
            return (Criteria) this;
        }
        
        
        public Criteria andIntIdFichaEqualTo(Integer value) {
            addCriterion("id_ficha =", value, "id_ficha");
            return (Criteria) this;
        }
        
        public Criteria andIntIdFichaNotEqualTo(Integer value) {
            addCriterion("id_ficha <>", value, "id_ficha");
            return (Criteria) this;
        }
        
        
        public Criteria andIntIdFichaIsNull() {
            addCriterion("id_ficha is null");
            return (Criteria) this;
        }
        
        public Criteria andIntIdFichaIsNotNull() {
            addCriterion("id_ficha is not null");
            return (Criteria) this;
        }
        
        public Criteria andIntIdFichaGreaterThan(Integer value) {
            addCriterion("id_ficha >", value, "id_ficha");
            return (Criteria) this;
        }
        
        public Criteria andIntIdFichaGreaterThanOrEqualTo(Integer value) {
            addCriterion("id_ficha >=", value, "id_ficha");
            return (Criteria) this;
        }
        
        public Criteria andIntIdFichaLessThan(Integer value) {
            addCriterion("id_ficha <", value, "id_ficha");
            return (Criteria) this;
        }
        
        public Criteria andIntIdFichaLessThanOrEqualTo(Integer value) {
            addCriterion("id_ficha <=", value, "id_ficha");
            return (Criteria) this;
        }
        
        public Criteria andIntIdFichaIn(List<Integer> values) {
            addCriterion("id_ficha in", values, "id_ficha");
            return (Criteria) this;
        }
        
        public Criteria andIntIdFichaNotIn(List<Integer> values) {
            addCriterion("id_ficha not in", values, "id_ficha");
            return (Criteria) this;
        }
        
        public Criteria andIntIdFichaBetween(Integer value1, Integer value2) {
            addCriterion("id_ficha between", value1, value2, "id_ficha");
            return (Criteria) this;
        }
        
        public Criteria andIntIdFichaNotBetween(Integer value1, Integer value2) {
            addCriterion("id_ficha not between", value1, value2, "id_ficha");
            return (Criteria) this;
        }
        
        
        public Criteria andIntNumHematiesEqualTo(Integer value) {
            addCriterion("num_hematies =", value, "num_hematies");
            return (Criteria) this;
        }
        
        public Criteria andIntNumHematiesNotEqualTo(Integer value) {
            addCriterion("num_hematies <>", value, "num_hematies");
            return (Criteria) this;
        }
        
        
        public Criteria andIntNumHematiesIsNull() {
            addCriterion("num_hematies is null");
            return (Criteria) this;
        }
        
        public Criteria andIntNumHematiesIsNotNull() {
            addCriterion("num_hematies is not null");
            return (Criteria) this;
        }
        
        public Criteria andIntNumHematiesGreaterThan(Integer value) {
            addCriterion("num_hematies >", value, "num_hematies");
            return (Criteria) this;
        }
        
        public Criteria andIntNumHematiesGreaterThanOrEqualTo(Integer value) {
            addCriterion("num_hematies >=", value, "num_hematies");
            return (Criteria) this;
        }
        
        public Criteria andIntNumHematiesLessThan(Integer value) {
            addCriterion("num_hematies <", value, "num_hematies");
            return (Criteria) this;
        }
        
        public Criteria andIntNumHematiesLessThanOrEqualTo(Integer value) {
            addCriterion("num_hematies <=", value, "num_hematies");
            return (Criteria) this;
        }
        
        public Criteria andIntNumHematiesIn(List<Integer> values) {
            addCriterion("num_hematies in", values, "num_hematies");
            return (Criteria) this;
        }
        
        public Criteria andIntNumHematiesNotIn(List<Integer> values) {
            addCriterion("num_hematies not in", values, "num_hematies");
            return (Criteria) this;
        }
        
        public Criteria andIntNumHematiesBetween(Integer value1, Integer value2) {
            addCriterion("num_hematies between", value1, value2, "num_hematies");
            return (Criteria) this;
        }
        
        public Criteria andIntNumHematiesNotBetween(Integer value1, Integer value2) {
            addCriterion("num_hematies not between", value1, value2, "num_hematies");
            return (Criteria) this;
        }
        
        
        public Criteria andIntNumHemoglobinaEqualTo(Integer value) {
            addCriterion("num_hemoglobina =", value, "num_hemoglobina");
            return (Criteria) this;
        }
        
        public Criteria andIntNumHemoglobinaNotEqualTo(Integer value) {
            addCriterion("num_hemoglobina <>", value, "num_hemoglobina");
            return (Criteria) this;
        }
        
        
        public Criteria andIntNumHemoglobinaIsNull() {
            addCriterion("num_hemoglobina is null");
            return (Criteria) this;
        }
        
        public Criteria andIntNumHemoglobinaIsNotNull() {
            addCriterion("num_hemoglobina is not null");
            return (Criteria) this;
        }
        
        public Criteria andIntNumHemoglobinaGreaterThan(Integer value) {
            addCriterion("num_hemoglobina >", value, "num_hemoglobina");
            return (Criteria) this;
        }
        
        public Criteria andIntNumHemoglobinaGreaterThanOrEqualTo(Integer value) {
            addCriterion("num_hemoglobina >=", value, "num_hemoglobina");
            return (Criteria) this;
        }
        
        public Criteria andIntNumHemoglobinaLessThan(Integer value) {
            addCriterion("num_hemoglobina <", value, "num_hemoglobina");
            return (Criteria) this;
        }
        
        public Criteria andIntNumHemoglobinaLessThanOrEqualTo(Integer value) {
            addCriterion("num_hemoglobina <=", value, "num_hemoglobina");
            return (Criteria) this;
        }
        
        public Criteria andIntNumHemoglobinaIn(List<Integer> values) {
            addCriterion("num_hemoglobina in", values, "num_hemoglobina");
            return (Criteria) this;
        }
        
        public Criteria andIntNumHemoglobinaNotIn(List<Integer> values) {
            addCriterion("num_hemoglobina not in", values, "num_hemoglobina");
            return (Criteria) this;
        }
        
        public Criteria andIntNumHemoglobinaBetween(Integer value1, Integer value2) {
            addCriterion("num_hemoglobina between", value1, value2, "num_hemoglobina");
            return (Criteria) this;
        }
        
        public Criteria andIntNumHemoglobinaNotBetween(Integer value1, Integer value2) {
            addCriterion("num_hemoglobina not between", value1, value2, "num_hemoglobina");
            return (Criteria) this;
        }
        
        
        public Criteria andIntNumHematocritoEqualTo(Integer value) {
            addCriterion("num_hematocrito =", value, "num_hematocrito");
            return (Criteria) this;
        }
        
        public Criteria andIntNumHematocritoNotEqualTo(Integer value) {
            addCriterion("num_hematocrito <>", value, "num_hematocrito");
            return (Criteria) this;
        }
        
        
        public Criteria andIntNumHematocritoIsNull() {
            addCriterion("num_hematocrito is null");
            return (Criteria) this;
        }
        
        public Criteria andIntNumHematocritoIsNotNull() {
            addCriterion("num_hematocrito is not null");
            return (Criteria) this;
        }
        
        public Criteria andIntNumHematocritoGreaterThan(Integer value) {
            addCriterion("num_hematocrito >", value, "num_hematocrito");
            return (Criteria) this;
        }
        
        public Criteria andIntNumHematocritoGreaterThanOrEqualTo(Integer value) {
            addCriterion("num_hematocrito >=", value, "num_hematocrito");
            return (Criteria) this;
        }
        
        public Criteria andIntNumHematocritoLessThan(Integer value) {
            addCriterion("num_hematocrito <", value, "num_hematocrito");
            return (Criteria) this;
        }
        
        public Criteria andIntNumHematocritoLessThanOrEqualTo(Integer value) {
            addCriterion("num_hematocrito <=", value, "num_hematocrito");
            return (Criteria) this;
        }
        
        public Criteria andIntNumHematocritoIn(List<Integer> values) {
            addCriterion("num_hematocrito in", values, "num_hematocrito");
            return (Criteria) this;
        }
        
        public Criteria andIntNumHematocritoNotIn(List<Integer> values) {
            addCriterion("num_hematocrito not in", values, "num_hematocrito");
            return (Criteria) this;
        }
        
        public Criteria andIntNumHematocritoBetween(Integer value1, Integer value2) {
            addCriterion("num_hematocrito between", value1, value2, "num_hematocrito");
            return (Criteria) this;
        }
        
        public Criteria andIntNumHematocritoNotBetween(Integer value1, Integer value2) {
            addCriterion("num_hematocrito not between", value1, value2, "num_hematocrito");
            return (Criteria) this;
        }
        
        
        public Criteria andIntNumVcmEqualTo(Integer value) {
            addCriterion("num_vcm =", value, "num_vcm");
            return (Criteria) this;
        }
        
        public Criteria andIntNumVcmNotEqualTo(Integer value) {
            addCriterion("num_vcm <>", value, "num_vcm");
            return (Criteria) this;
        }
        
        
        public Criteria andIntNumVcmIsNull() {
            addCriterion("num_vcm is null");
            return (Criteria) this;
        }
        
        public Criteria andIntNumVcmIsNotNull() {
            addCriterion("num_vcm is not null");
            return (Criteria) this;
        }
        
        public Criteria andIntNumVcmGreaterThan(Integer value) {
            addCriterion("num_vcm >", value, "num_vcm");
            return (Criteria) this;
        }
        
        public Criteria andIntNumVcmGreaterThanOrEqualTo(Integer value) {
            addCriterion("num_vcm >=", value, "num_vcm");
            return (Criteria) this;
        }
        
        public Criteria andIntNumVcmLessThan(Integer value) {
            addCriterion("num_vcm <", value, "num_vcm");
            return (Criteria) this;
        }
        
        public Criteria andIntNumVcmLessThanOrEqualTo(Integer value) {
            addCriterion("num_vcm <=", value, "num_vcm");
            return (Criteria) this;
        }
        
        public Criteria andIntNumVcmIn(List<Integer> values) {
            addCriterion("num_vcm in", values, "num_vcm");
            return (Criteria) this;
        }
        
        public Criteria andIntNumVcmNotIn(List<Integer> values) {
            addCriterion("num_vcm not in", values, "num_vcm");
            return (Criteria) this;
        }
        
        public Criteria andIntNumVcmBetween(Integer value1, Integer value2) {
            addCriterion("num_vcm between", value1, value2, "num_vcm");
            return (Criteria) this;
        }
        
        public Criteria andIntNumVcmNotBetween(Integer value1, Integer value2) {
            addCriterion("num_vcm not between", value1, value2, "num_vcm");
            return (Criteria) this;
        }
        
        
        public Criteria andIntNumChmEqualTo(Integer value) {
            addCriterion("num_chm =", value, "num_chm");
            return (Criteria) this;
        }
        
        public Criteria andIntNumChmNotEqualTo(Integer value) {
            addCriterion("num_chm <>", value, "num_chm");
            return (Criteria) this;
        }
        
        
        public Criteria andIntNumChmIsNull() {
            addCriterion("num_chm is null");
            return (Criteria) this;
        }
        
        public Criteria andIntNumChmIsNotNull() {
            addCriterion("num_chm is not null");
            return (Criteria) this;
        }
        
        public Criteria andIntNumChmGreaterThan(Integer value) {
            addCriterion("num_chm >", value, "num_chm");
            return (Criteria) this;
        }
        
        public Criteria andIntNumChmGreaterThanOrEqualTo(Integer value) {
            addCriterion("num_chm >=", value, "num_chm");
            return (Criteria) this;
        }
        
        public Criteria andIntNumChmLessThan(Integer value) {
            addCriterion("num_chm <", value, "num_chm");
            return (Criteria) this;
        }
        
        public Criteria andIntNumChmLessThanOrEqualTo(Integer value) {
            addCriterion("num_chm <=", value, "num_chm");
            return (Criteria) this;
        }
        
        public Criteria andIntNumChmIn(List<Integer> values) {
            addCriterion("num_chm in", values, "num_chm");
            return (Criteria) this;
        }
        
        public Criteria andIntNumChmNotIn(List<Integer> values) {
            addCriterion("num_chm not in", values, "num_chm");
            return (Criteria) this;
        }
        
        public Criteria andIntNumChmBetween(Integer value1, Integer value2) {
            addCriterion("num_chm between", value1, value2, "num_chm");
            return (Criteria) this;
        }
        
        public Criteria andIntNumChmNotBetween(Integer value1, Integer value2) {
            addCriterion("num_chm not between", value1, value2, "num_chm");
            return (Criteria) this;
        }
        
        
        public Criteria andIntNumLinfocitosEqualTo(Integer value) {
            addCriterion("num_linfocitos =", value, "num_linfocitos");
            return (Criteria) this;
        }
        
        public Criteria andIntNumLinfocitosNotEqualTo(Integer value) {
            addCriterion("num_linfocitos <>", value, "num_linfocitos");
            return (Criteria) this;
        }
        
        
        public Criteria andIntNumLinfocitosIsNull() {
            addCriterion("num_linfocitos is null");
            return (Criteria) this;
        }
        
        public Criteria andIntNumLinfocitosIsNotNull() {
            addCriterion("num_linfocitos is not null");
            return (Criteria) this;
        }
        
        public Criteria andIntNumLinfocitosGreaterThan(Integer value) {
            addCriterion("num_linfocitos >", value, "num_linfocitos");
            return (Criteria) this;
        }
        
        public Criteria andIntNumLinfocitosGreaterThanOrEqualTo(Integer value) {
            addCriterion("num_linfocitos >=", value, "num_linfocitos");
            return (Criteria) this;
        }
        
        public Criteria andIntNumLinfocitosLessThan(Integer value) {
            addCriterion("num_linfocitos <", value, "num_linfocitos");
            return (Criteria) this;
        }
        
        public Criteria andIntNumLinfocitosLessThanOrEqualTo(Integer value) {
            addCriterion("num_linfocitos <=", value, "num_linfocitos");
            return (Criteria) this;
        }
        
        public Criteria andIntNumLinfocitosIn(List<Integer> values) {
            addCriterion("num_linfocitos in", values, "num_linfocitos");
            return (Criteria) this;
        }
        
        public Criteria andIntNumLinfocitosNotIn(List<Integer> values) {
            addCriterion("num_linfocitos not in", values, "num_linfocitos");
            return (Criteria) this;
        }
        
        public Criteria andIntNumLinfocitosBetween(Integer value1, Integer value2) {
            addCriterion("num_linfocitos between", value1, value2, "num_linfocitos");
            return (Criteria) this;
        }
        
        public Criteria andIntNumLinfocitosNotBetween(Integer value1, Integer value2) {
            addCriterion("num_linfocitos not between", value1, value2, "num_linfocitos");
            return (Criteria) this;
        }
        
        
        public Criteria andIntNumPlaquetasEqualTo(Integer value) {
            addCriterion("num_plaquetas =", value, "num_plaquetas");
            return (Criteria) this;
        }
        
        public Criteria andIntNumPlaquetasNotEqualTo(Integer value) {
            addCriterion("num_plaquetas <>", value, "num_plaquetas");
            return (Criteria) this;
        }
        
        
        public Criteria andIntNumPlaquetasIsNull() {
            addCriterion("num_plaquetas is null");
            return (Criteria) this;
        }
        
        public Criteria andIntNumPlaquetasIsNotNull() {
            addCriterion("num_plaquetas is not null");
            return (Criteria) this;
        }
        
        public Criteria andIntNumPlaquetasGreaterThan(Integer value) {
            addCriterion("num_plaquetas >", value, "num_plaquetas");
            return (Criteria) this;
        }
        
        public Criteria andIntNumPlaquetasGreaterThanOrEqualTo(Integer value) {
            addCriterion("num_plaquetas >=", value, "num_plaquetas");
            return (Criteria) this;
        }
        
        public Criteria andIntNumPlaquetasLessThan(Integer value) {
            addCriterion("num_plaquetas <", value, "num_plaquetas");
            return (Criteria) this;
        }
        
        public Criteria andIntNumPlaquetasLessThanOrEqualTo(Integer value) {
            addCriterion("num_plaquetas <=", value, "num_plaquetas");
            return (Criteria) this;
        }
        
        public Criteria andIntNumPlaquetasIn(List<Integer> values) {
            addCriterion("num_plaquetas in", values, "num_plaquetas");
            return (Criteria) this;
        }
        
        public Criteria andIntNumPlaquetasNotIn(List<Integer> values) {
            addCriterion("num_plaquetas not in", values, "num_plaquetas");
            return (Criteria) this;
        }
        
        public Criteria andIntNumPlaquetasBetween(Integer value1, Integer value2) {
            addCriterion("num_plaquetas between", value1, value2, "num_plaquetas");
            return (Criteria) this;
        }
        
        public Criteria andIntNumPlaquetasNotBetween(Integer value1, Integer value2) {
            addCriterion("num_plaquetas not between", value1, value2, "num_plaquetas");
            return (Criteria) this;
        }
        
        
        public Criteria andIntNumLeucocitosEqualTo(Integer value) {
            addCriterion("num_leucocitos =", value, "num_leucocitos");
            return (Criteria) this;
        }
        
        public Criteria andIntNumLeucocitosNotEqualTo(Integer value) {
            addCriterion("num_leucocitos <>", value, "num_leucocitos");
            return (Criteria) this;
        }
        
        
        public Criteria andIntNumLeucocitosIsNull() {
            addCriterion("num_leucocitos is null");
            return (Criteria) this;
        }
        
        public Criteria andIntNumLeucocitosIsNotNull() {
            addCriterion("num_leucocitos is not null");
            return (Criteria) this;
        }
        
        public Criteria andIntNumLeucocitosGreaterThan(Integer value) {
            addCriterion("num_leucocitos >", value, "num_leucocitos");
            return (Criteria) this;
        }
        
        public Criteria andIntNumLeucocitosGreaterThanOrEqualTo(Integer value) {
            addCriterion("num_leucocitos >=", value, "num_leucocitos");
            return (Criteria) this;
        }
        
        public Criteria andIntNumLeucocitosLessThan(Integer value) {
            addCriterion("num_leucocitos <", value, "num_leucocitos");
            return (Criteria) this;
        }
        
        public Criteria andIntNumLeucocitosLessThanOrEqualTo(Integer value) {
            addCriterion("num_leucocitos <=", value, "num_leucocitos");
            return (Criteria) this;
        }
        
        public Criteria andIntNumLeucocitosIn(List<Integer> values) {
            addCriterion("num_leucocitos in", values, "num_leucocitos");
            return (Criteria) this;
        }
        
        public Criteria andIntNumLeucocitosNotIn(List<Integer> values) {
            addCriterion("num_leucocitos not in", values, "num_leucocitos");
            return (Criteria) this;
        }
        
        public Criteria andIntNumLeucocitosBetween(Integer value1, Integer value2) {
            addCriterion("num_leucocitos between", value1, value2, "num_leucocitos");
            return (Criteria) this;
        }
        
        public Criteria andIntNumLeucocitosNotBetween(Integer value1, Integer value2) {
            addCriterion("num_leucocitos not between", value1, value2, "num_leucocitos");
            return (Criteria) this;
        }
        
        
        public Criteria andIntNumNeutrofilosEqualTo(Integer value) {
            addCriterion("num_neutrofilos =", value, "num_neutrofilos");
            return (Criteria) this;
        }
        
        public Criteria andIntNumNeutrofilosNotEqualTo(Integer value) {
            addCriterion("num_neutrofilos <>", value, "num_neutrofilos");
            return (Criteria) this;
        }
        
        
        public Criteria andIntNumNeutrofilosIsNull() {
            addCriterion("num_neutrofilos is null");
            return (Criteria) this;
        }
        
        public Criteria andIntNumNeutrofilosIsNotNull() {
            addCriterion("num_neutrofilos is not null");
            return (Criteria) this;
        }
        
        public Criteria andIntNumNeutrofilosGreaterThan(Integer value) {
            addCriterion("num_neutrofilos >", value, "num_neutrofilos");
            return (Criteria) this;
        }
        
        public Criteria andIntNumNeutrofilosGreaterThanOrEqualTo(Integer value) {
            addCriterion("num_neutrofilos >=", value, "num_neutrofilos");
            return (Criteria) this;
        }
        
        public Criteria andIntNumNeutrofilosLessThan(Integer value) {
            addCriterion("num_neutrofilos <", value, "num_neutrofilos");
            return (Criteria) this;
        }
        
        public Criteria andIntNumNeutrofilosLessThanOrEqualTo(Integer value) {
            addCriterion("num_neutrofilos <=", value, "num_neutrofilos");
            return (Criteria) this;
        }
        
        public Criteria andIntNumNeutrofilosIn(List<Integer> values) {
            addCriterion("num_neutrofilos in", values, "num_neutrofilos");
            return (Criteria) this;
        }
        
        public Criteria andIntNumNeutrofilosNotIn(List<Integer> values) {
            addCriterion("num_neutrofilos not in", values, "num_neutrofilos");
            return (Criteria) this;
        }
        
        public Criteria andIntNumNeutrofilosBetween(Integer value1, Integer value2) {
            addCriterion("num_neutrofilos between", value1, value2, "num_neutrofilos");
            return (Criteria) this;
        }
        
        public Criteria andIntNumNeutrofilosNotBetween(Integer value1, Integer value2) {
            addCriterion("num_neutrofilos not between", value1, value2, "num_neutrofilos");
            return (Criteria) this;
        }
        
        
        public Criteria andIntNumEosinofilosEqualTo(Integer value) {
            addCriterion("num_eosinofilos =", value, "num_eosinofilos");
            return (Criteria) this;
        }
        
        public Criteria andIntNumEosinofilosNotEqualTo(Integer value) {
            addCriterion("num_eosinofilos <>", value, "num_eosinofilos");
            return (Criteria) this;
        }
        
        
        public Criteria andIntNumEosinofilosIsNull() {
            addCriterion("num_eosinofilos is null");
            return (Criteria) this;
        }
        
        public Criteria andIntNumEosinofilosIsNotNull() {
            addCriterion("num_eosinofilos is not null");
            return (Criteria) this;
        }
        
        public Criteria andIntNumEosinofilosGreaterThan(Integer value) {
            addCriterion("num_eosinofilos >", value, "num_eosinofilos");
            return (Criteria) this;
        }
        
        public Criteria andIntNumEosinofilosGreaterThanOrEqualTo(Integer value) {
            addCriterion("num_eosinofilos >=", value, "num_eosinofilos");
            return (Criteria) this;
        }
        
        public Criteria andIntNumEosinofilosLessThan(Integer value) {
            addCriterion("num_eosinofilos <", value, "num_eosinofilos");
            return (Criteria) this;
        }
        
        public Criteria andIntNumEosinofilosLessThanOrEqualTo(Integer value) {
            addCriterion("num_eosinofilos <=", value, "num_eosinofilos");
            return (Criteria) this;
        }
        
        public Criteria andIntNumEosinofilosIn(List<Integer> values) {
            addCriterion("num_eosinofilos in", values, "num_eosinofilos");
            return (Criteria) this;
        }
        
        public Criteria andIntNumEosinofilosNotIn(List<Integer> values) {
            addCriterion("num_eosinofilos not in", values, "num_eosinofilos");
            return (Criteria) this;
        }
        
        public Criteria andIntNumEosinofilosBetween(Integer value1, Integer value2) {
            addCriterion("num_eosinofilos between", value1, value2, "num_eosinofilos");
            return (Criteria) this;
        }
        
        public Criteria andIntNumEosinofilosNotBetween(Integer value1, Integer value2) {
            addCriterion("num_eosinofilos not between", value1, value2, "num_eosinofilos");
            return (Criteria) this;
        }
        
        
        public Criteria andIntNumVsgEqualTo(Integer value) {
            addCriterion("num_vsg =", value, "num_vsg");
            return (Criteria) this;
        }
        
        public Criteria andIntNumVsgNotEqualTo(Integer value) {
            addCriterion("num_vsg <>", value, "num_vsg");
            return (Criteria) this;
        }
        
        
        public Criteria andIntNumVsgIsNull() {
            addCriterion("num_vsg is null");
            return (Criteria) this;
        }
        
        public Criteria andIntNumVsgIsNotNull() {
            addCriterion("num_vsg is not null");
            return (Criteria) this;
        }
        
        public Criteria andIntNumVsgGreaterThan(Integer value) {
            addCriterion("num_vsg >", value, "num_vsg");
            return (Criteria) this;
        }
        
        public Criteria andIntNumVsgGreaterThanOrEqualTo(Integer value) {
            addCriterion("num_vsg >=", value, "num_vsg");
            return (Criteria) this;
        }
        
        public Criteria andIntNumVsgLessThan(Integer value) {
            addCriterion("num_vsg <", value, "num_vsg");
            return (Criteria) this;
        }
        
        public Criteria andIntNumVsgLessThanOrEqualTo(Integer value) {
            addCriterion("num_vsg <=", value, "num_vsg");
            return (Criteria) this;
        }
        
        public Criteria andIntNumVsgIn(List<Integer> values) {
            addCriterion("num_vsg in", values, "num_vsg");
            return (Criteria) this;
        }
        
        public Criteria andIntNumVsgNotIn(List<Integer> values) {
            addCriterion("num_vsg not in", values, "num_vsg");
            return (Criteria) this;
        }
        
        public Criteria andIntNumVsgBetween(Integer value1, Integer value2) {
            addCriterion("num_vsg between", value1, value2, "num_vsg");
            return (Criteria) this;
        }
        
        public Criteria andIntNumVsgNotBetween(Integer value1, Integer value2) {
            addCriterion("num_vsg not between", value1, value2, "num_vsg");
            return (Criteria) this;
        }
        
        
        public Criteria andIntNumGlucosaEqualTo(Integer value) {
            addCriterion("num_glucosa =", value, "num_glucosa");
            return (Criteria) this;
        }
        
        public Criteria andIntNumGlucosaNotEqualTo(Integer value) {
            addCriterion("num_glucosa <>", value, "num_glucosa");
            return (Criteria) this;
        }
        
        
        public Criteria andIntNumGlucosaIsNull() {
            addCriterion("num_glucosa is null");
            return (Criteria) this;
        }
        
        public Criteria andIntNumGlucosaIsNotNull() {
            addCriterion("num_glucosa is not null");
            return (Criteria) this;
        }
        
        public Criteria andIntNumGlucosaGreaterThan(Integer value) {
            addCriterion("num_glucosa >", value, "num_glucosa");
            return (Criteria) this;
        }
        
        public Criteria andIntNumGlucosaGreaterThanOrEqualTo(Integer value) {
            addCriterion("num_glucosa >=", value, "num_glucosa");
            return (Criteria) this;
        }
        
        public Criteria andIntNumGlucosaLessThan(Integer value) {
            addCriterion("num_glucosa <", value, "num_glucosa");
            return (Criteria) this;
        }
        
        public Criteria andIntNumGlucosaLessThanOrEqualTo(Integer value) {
            addCriterion("num_glucosa <=", value, "num_glucosa");
            return (Criteria) this;
        }
        
        public Criteria andIntNumGlucosaIn(List<Integer> values) {
            addCriterion("num_glucosa in", values, "num_glucosa");
            return (Criteria) this;
        }
        
        public Criteria andIntNumGlucosaNotIn(List<Integer> values) {
            addCriterion("num_glucosa not in", values, "num_glucosa");
            return (Criteria) this;
        }
        
        public Criteria andIntNumGlucosaBetween(Integer value1, Integer value2) {
            addCriterion("num_glucosa between", value1, value2, "num_glucosa");
            return (Criteria) this;
        }
        
        public Criteria andIntNumGlucosaNotBetween(Integer value1, Integer value2) {
            addCriterion("num_glucosa not between", value1, value2, "num_glucosa");
            return (Criteria) this;
        }
        
        
        public Criteria andIntNumUreaEqualTo(Integer value) {
            addCriterion("num_urea =", value, "num_urea");
            return (Criteria) this;
        }
        
        public Criteria andIntNumUreaNotEqualTo(Integer value) {
            addCriterion("num_urea <>", value, "num_urea");
            return (Criteria) this;
        }
        
        
        public Criteria andIntNumUreaIsNull() {
            addCriterion("num_urea is null");
            return (Criteria) this;
        }
        
        public Criteria andIntNumUreaIsNotNull() {
            addCriterion("num_urea is not null");
            return (Criteria) this;
        }
        
        public Criteria andIntNumUreaGreaterThan(Integer value) {
            addCriterion("num_urea >", value, "num_urea");
            return (Criteria) this;
        }
        
        public Criteria andIntNumUreaGreaterThanOrEqualTo(Integer value) {
            addCriterion("num_urea >=", value, "num_urea");
            return (Criteria) this;
        }
        
        public Criteria andIntNumUreaLessThan(Integer value) {
            addCriterion("num_urea <", value, "num_urea");
            return (Criteria) this;
        }
        
        public Criteria andIntNumUreaLessThanOrEqualTo(Integer value) {
            addCriterion("num_urea <=", value, "num_urea");
            return (Criteria) this;
        }
        
        public Criteria andIntNumUreaIn(List<Integer> values) {
            addCriterion("num_urea in", values, "num_urea");
            return (Criteria) this;
        }
        
        public Criteria andIntNumUreaNotIn(List<Integer> values) {
            addCriterion("num_urea not in", values, "num_urea");
            return (Criteria) this;
        }
        
        public Criteria andIntNumUreaBetween(Integer value1, Integer value2) {
            addCriterion("num_urea between", value1, value2, "num_urea");
            return (Criteria) this;
        }
        
        public Criteria andIntNumUreaNotBetween(Integer value1, Integer value2) {
            addCriterion("num_urea not between", value1, value2, "num_urea");
            return (Criteria) this;
        }
        
        
        public Criteria andIntNumAcisouricoEqualTo(Integer value) {
            addCriterion("num_acisourico =", value, "num_acisourico");
            return (Criteria) this;
        }
        
        public Criteria andIntNumAcisouricoNotEqualTo(Integer value) {
            addCriterion("num_acisourico <>", value, "num_acisourico");
            return (Criteria) this;
        }
        
        
        public Criteria andIntNumAcisouricoIsNull() {
            addCriterion("num_acisourico is null");
            return (Criteria) this;
        }
        
        public Criteria andIntNumAcisouricoIsNotNull() {
            addCriterion("num_acisourico is not null");
            return (Criteria) this;
        }
        
        public Criteria andIntNumAcisouricoGreaterThan(Integer value) {
            addCriterion("num_acisourico >", value, "num_acisourico");
            return (Criteria) this;
        }
        
        public Criteria andIntNumAcisouricoGreaterThanOrEqualTo(Integer value) {
            addCriterion("num_acisourico >=", value, "num_acisourico");
            return (Criteria) this;
        }
        
        public Criteria andIntNumAcisouricoLessThan(Integer value) {
            addCriterion("num_acisourico <", value, "num_acisourico");
            return (Criteria) this;
        }
        
        public Criteria andIntNumAcisouricoLessThanOrEqualTo(Integer value) {
            addCriterion("num_acisourico <=", value, "num_acisourico");
            return (Criteria) this;
        }
        
        public Criteria andIntNumAcisouricoIn(List<Integer> values) {
            addCriterion("num_acisourico in", values, "num_acisourico");
            return (Criteria) this;
        }
        
        public Criteria andIntNumAcisouricoNotIn(List<Integer> values) {
            addCriterion("num_acisourico not in", values, "num_acisourico");
            return (Criteria) this;
        }
        
        public Criteria andIntNumAcisouricoBetween(Integer value1, Integer value2) {
            addCriterion("num_acisourico between", value1, value2, "num_acisourico");
            return (Criteria) this;
        }
        
        public Criteria andIntNumAcisouricoNotBetween(Integer value1, Integer value2) {
            addCriterion("num_acisourico not between", value1, value2, "num_acisourico");
            return (Criteria) this;
        }
        
        
        public Criteria andIntNumCreatininaEqualTo(Integer value) {
            addCriterion("num_creatinina =", value, "num_creatinina");
            return (Criteria) this;
        }
        
        public Criteria andIntNumCreatininaNotEqualTo(Integer value) {
            addCriterion("num_creatinina <>", value, "num_creatinina");
            return (Criteria) this;
        }
        
        
        public Criteria andIntNumCreatininaIsNull() {
            addCriterion("num_creatinina is null");
            return (Criteria) this;
        }
        
        public Criteria andIntNumCreatininaIsNotNull() {
            addCriterion("num_creatinina is not null");
            return (Criteria) this;
        }
        
        public Criteria andIntNumCreatininaGreaterThan(Integer value) {
            addCriterion("num_creatinina >", value, "num_creatinina");
            return (Criteria) this;
        }
        
        public Criteria andIntNumCreatininaGreaterThanOrEqualTo(Integer value) {
            addCriterion("num_creatinina >=", value, "num_creatinina");
            return (Criteria) this;
        }
        
        public Criteria andIntNumCreatininaLessThan(Integer value) {
            addCriterion("num_creatinina <", value, "num_creatinina");
            return (Criteria) this;
        }
        
        public Criteria andIntNumCreatininaLessThanOrEqualTo(Integer value) {
            addCriterion("num_creatinina <=", value, "num_creatinina");
            return (Criteria) this;
        }
        
        public Criteria andIntNumCreatininaIn(List<Integer> values) {
            addCriterion("num_creatinina in", values, "num_creatinina");
            return (Criteria) this;
        }
        
        public Criteria andIntNumCreatininaNotIn(List<Integer> values) {
            addCriterion("num_creatinina not in", values, "num_creatinina");
            return (Criteria) this;
        }
        
        public Criteria andIntNumCreatininaBetween(Integer value1, Integer value2) {
            addCriterion("num_creatinina between", value1, value2, "num_creatinina");
            return (Criteria) this;
        }
        
        public Criteria andIntNumCreatininaNotBetween(Integer value1, Integer value2) {
            addCriterion("num_creatinina not between", value1, value2, "num_creatinina");
            return (Criteria) this;
        }
        
        
        public Criteria andIntNumColesterolEqualTo(Integer value) {
            addCriterion("num_colesterol =", value, "num_colesterol");
            return (Criteria) this;
        }
        
        public Criteria andIntNumColesterolNotEqualTo(Integer value) {
            addCriterion("num_colesterol <>", value, "num_colesterol");
            return (Criteria) this;
        }
        
        
        public Criteria andIntNumColesterolIsNull() {
            addCriterion("num_colesterol is null");
            return (Criteria) this;
        }
        
        public Criteria andIntNumColesterolIsNotNull() {
            addCriterion("num_colesterol is not null");
            return (Criteria) this;
        }
        
        public Criteria andIntNumColesterolGreaterThan(Integer value) {
            addCriterion("num_colesterol >", value, "num_colesterol");
            return (Criteria) this;
        }
        
        public Criteria andIntNumColesterolGreaterThanOrEqualTo(Integer value) {
            addCriterion("num_colesterol >=", value, "num_colesterol");
            return (Criteria) this;
        }
        
        public Criteria andIntNumColesterolLessThan(Integer value) {
            addCriterion("num_colesterol <", value, "num_colesterol");
            return (Criteria) this;
        }
        
        public Criteria andIntNumColesterolLessThanOrEqualTo(Integer value) {
            addCriterion("num_colesterol <=", value, "num_colesterol");
            return (Criteria) this;
        }
        
        public Criteria andIntNumColesterolIn(List<Integer> values) {
            addCriterion("num_colesterol in", values, "num_colesterol");
            return (Criteria) this;
        }
        
        public Criteria andIntNumColesterolNotIn(List<Integer> values) {
            addCriterion("num_colesterol not in", values, "num_colesterol");
            return (Criteria) this;
        }
        
        public Criteria andIntNumColesterolBetween(Integer value1, Integer value2) {
            addCriterion("num_colesterol between", value1, value2, "num_colesterol");
            return (Criteria) this;
        }
        
        public Criteria andIntNumColesterolNotBetween(Integer value1, Integer value2) {
            addCriterion("num_colesterol not between", value1, value2, "num_colesterol");
            return (Criteria) this;
        }
        
        
        public Criteria andIntNumHdlEqualTo(Integer value) {
            addCriterion("num_hdl =", value, "num_hdl");
            return (Criteria) this;
        }
        
        public Criteria andIntNumHdlNotEqualTo(Integer value) {
            addCriterion("num_hdl <>", value, "num_hdl");
            return (Criteria) this;
        }
        
        
        public Criteria andIntNumHdlIsNull() {
            addCriterion("num_hdl is null");
            return (Criteria) this;
        }
        
        public Criteria andIntNumHdlIsNotNull() {
            addCriterion("num_hdl is not null");
            return (Criteria) this;
        }
        
        public Criteria andIntNumHdlGreaterThan(Integer value) {
            addCriterion("num_hdl >", value, "num_hdl");
            return (Criteria) this;
        }
        
        public Criteria andIntNumHdlGreaterThanOrEqualTo(Integer value) {
            addCriterion("num_hdl >=", value, "num_hdl");
            return (Criteria) this;
        }
        
        public Criteria andIntNumHdlLessThan(Integer value) {
            addCriterion("num_hdl <", value, "num_hdl");
            return (Criteria) this;
        }
        
        public Criteria andIntNumHdlLessThanOrEqualTo(Integer value) {
            addCriterion("num_hdl <=", value, "num_hdl");
            return (Criteria) this;
        }
        
        public Criteria andIntNumHdlIn(List<Integer> values) {
            addCriterion("num_hdl in", values, "num_hdl");
            return (Criteria) this;
        }
        
        public Criteria andIntNumHdlNotIn(List<Integer> values) {
            addCriterion("num_hdl not in", values, "num_hdl");
            return (Criteria) this;
        }
        
        public Criteria andIntNumHdlBetween(Integer value1, Integer value2) {
            addCriterion("num_hdl between", value1, value2, "num_hdl");
            return (Criteria) this;
        }
        
        public Criteria andIntNumHdlNotBetween(Integer value1, Integer value2) {
            addCriterion("num_hdl not between", value1, value2, "num_hdl");
            return (Criteria) this;
        }
        
        
        public Criteria andIntNumLdlEqualTo(Integer value) {
            addCriterion("num_ldl =", value, "num_ldl");
            return (Criteria) this;
        }
        
        public Criteria andIntNumLdlNotEqualTo(Integer value) {
            addCriterion("num_ldl <>", value, "num_ldl");
            return (Criteria) this;
        }
        
        
        public Criteria andIntNumLdlIsNull() {
            addCriterion("num_ldl is null");
            return (Criteria) this;
        }
        
        public Criteria andIntNumLdlIsNotNull() {
            addCriterion("num_ldl is not null");
            return (Criteria) this;
        }
        
        public Criteria andIntNumLdlGreaterThan(Integer value) {
            addCriterion("num_ldl >", value, "num_ldl");
            return (Criteria) this;
        }
        
        public Criteria andIntNumLdlGreaterThanOrEqualTo(Integer value) {
            addCriterion("num_ldl >=", value, "num_ldl");
            return (Criteria) this;
        }
        
        public Criteria andIntNumLdlLessThan(Integer value) {
            addCriterion("num_ldl <", value, "num_ldl");
            return (Criteria) this;
        }
        
        public Criteria andIntNumLdlLessThanOrEqualTo(Integer value) {
            addCriterion("num_ldl <=", value, "num_ldl");
            return (Criteria) this;
        }
        
        public Criteria andIntNumLdlIn(List<Integer> values) {
            addCriterion("num_ldl in", values, "num_ldl");
            return (Criteria) this;
        }
        
        public Criteria andIntNumLdlNotIn(List<Integer> values) {
            addCriterion("num_ldl not in", values, "num_ldl");
            return (Criteria) this;
        }
        
        public Criteria andIntNumLdlBetween(Integer value1, Integer value2) {
            addCriterion("num_ldl between", value1, value2, "num_ldl");
            return (Criteria) this;
        }
        
        public Criteria andIntNumLdlNotBetween(Integer value1, Integer value2) {
            addCriterion("num_ldl not between", value1, value2, "num_ldl");
            return (Criteria) this;
        }
        
        
        public Criteria andIntNumTrigliceridosEqualTo(Integer value) {
            addCriterion("num_trigliceridos =", value, "num_trigliceridos");
            return (Criteria) this;
        }
        
        public Criteria andIntNumTrigliceridosNotEqualTo(Integer value) {
            addCriterion("num_trigliceridos <>", value, "num_trigliceridos");
            return (Criteria) this;
        }
        
        
        public Criteria andIntNumTrigliceridosIsNull() {
            addCriterion("num_trigliceridos is null");
            return (Criteria) this;
        }
        
        public Criteria andIntNumTrigliceridosIsNotNull() {
            addCriterion("num_trigliceridos is not null");
            return (Criteria) this;
        }
        
        public Criteria andIntNumTrigliceridosGreaterThan(Integer value) {
            addCriterion("num_trigliceridos >", value, "num_trigliceridos");
            return (Criteria) this;
        }
        
        public Criteria andIntNumTrigliceridosGreaterThanOrEqualTo(Integer value) {
            addCriterion("num_trigliceridos >=", value, "num_trigliceridos");
            return (Criteria) this;
        }
        
        public Criteria andIntNumTrigliceridosLessThan(Integer value) {
            addCriterion("num_trigliceridos <", value, "num_trigliceridos");
            return (Criteria) this;
        }
        
        public Criteria andIntNumTrigliceridosLessThanOrEqualTo(Integer value) {
            addCriterion("num_trigliceridos <=", value, "num_trigliceridos");
            return (Criteria) this;
        }
        
        public Criteria andIntNumTrigliceridosIn(List<Integer> values) {
            addCriterion("num_trigliceridos in", values, "num_trigliceridos");
            return (Criteria) this;
        }
        
        public Criteria andIntNumTrigliceridosNotIn(List<Integer> values) {
            addCriterion("num_trigliceridos not in", values, "num_trigliceridos");
            return (Criteria) this;
        }
        
        public Criteria andIntNumTrigliceridosBetween(Integer value1, Integer value2) {
            addCriterion("num_trigliceridos between", value1, value2, "num_trigliceridos");
            return (Criteria) this;
        }
        
        public Criteria andIntNumTrigliceridosNotBetween(Integer value1, Integer value2) {
            addCriterion("num_trigliceridos not between", value1, value2, "num_trigliceridos");
            return (Criteria) this;
        }
        
        
        public Criteria andIntNumTransaminasaGotEqualTo(Integer value) {
            addCriterion("num_transaminasa_got =", value, "num_transaminasa_got");
            return (Criteria) this;
        }
        
        public Criteria andIntNumTransaminasaGotNotEqualTo(Integer value) {
            addCriterion("num_transaminasa_got <>", value, "num_transaminasa_got");
            return (Criteria) this;
        }
        
        
        public Criteria andIntNumTransaminasaGotIsNull() {
            addCriterion("num_transaminasa_got is null");
            return (Criteria) this;
        }
        
        public Criteria andIntNumTransaminasaGotIsNotNull() {
            addCriterion("num_transaminasa_got is not null");
            return (Criteria) this;
        }
        
        public Criteria andIntNumTransaminasaGotGreaterThan(Integer value) {
            addCriterion("num_transaminasa_got >", value, "num_transaminasa_got");
            return (Criteria) this;
        }
        
        public Criteria andIntNumTransaminasaGotGreaterThanOrEqualTo(Integer value) {
            addCriterion("num_transaminasa_got >=", value, "num_transaminasa_got");
            return (Criteria) this;
        }
        
        public Criteria andIntNumTransaminasaGotLessThan(Integer value) {
            addCriterion("num_transaminasa_got <", value, "num_transaminasa_got");
            return (Criteria) this;
        }
        
        public Criteria andIntNumTransaminasaGotLessThanOrEqualTo(Integer value) {
            addCriterion("num_transaminasa_got <=", value, "num_transaminasa_got");
            return (Criteria) this;
        }
        
        public Criteria andIntNumTransaminasaGotIn(List<Integer> values) {
            addCriterion("num_transaminasa_got in", values, "num_transaminasa_got");
            return (Criteria) this;
        }
        
        public Criteria andIntNumTransaminasaGotNotIn(List<Integer> values) {
            addCriterion("num_transaminasa_got not in", values, "num_transaminasa_got");
            return (Criteria) this;
        }
        
        public Criteria andIntNumTransaminasaGotBetween(Integer value1, Integer value2) {
            addCriterion("num_transaminasa_got between", value1, value2, "num_transaminasa_got");
            return (Criteria) this;
        }
        
        public Criteria andIntNumTransaminasaGotNotBetween(Integer value1, Integer value2) {
            addCriterion("num_transaminasa_got not between", value1, value2, "num_transaminasa_got");
            return (Criteria) this;
        }
        
        
        public Criteria andIntNumTransaminasaGptEqualTo(Integer value) {
            addCriterion("num_transaminasa_gpt =", value, "num_transaminasa_gpt");
            return (Criteria) this;
        }
        
        public Criteria andIntNumTransaminasaGptNotEqualTo(Integer value) {
            addCriterion("num_transaminasa_gpt <>", value, "num_transaminasa_gpt");
            return (Criteria) this;
        }
        
        
        public Criteria andIntNumTransaminasaGptIsNull() {
            addCriterion("num_transaminasa_gpt is null");
            return (Criteria) this;
        }
        
        public Criteria andIntNumTransaminasaGptIsNotNull() {
            addCriterion("num_transaminasa_gpt is not null");
            return (Criteria) this;
        }
        
        public Criteria andIntNumTransaminasaGptGreaterThan(Integer value) {
            addCriterion("num_transaminasa_gpt >", value, "num_transaminasa_gpt");
            return (Criteria) this;
        }
        
        public Criteria andIntNumTransaminasaGptGreaterThanOrEqualTo(Integer value) {
            addCriterion("num_transaminasa_gpt >=", value, "num_transaminasa_gpt");
            return (Criteria) this;
        }
        
        public Criteria andIntNumTransaminasaGptLessThan(Integer value) {
            addCriterion("num_transaminasa_gpt <", value, "num_transaminasa_gpt");
            return (Criteria) this;
        }
        
        public Criteria andIntNumTransaminasaGptLessThanOrEqualTo(Integer value) {
            addCriterion("num_transaminasa_gpt <=", value, "num_transaminasa_gpt");
            return (Criteria) this;
        }
        
        public Criteria andIntNumTransaminasaGptIn(List<Integer> values) {
            addCriterion("num_transaminasa_gpt in", values, "num_transaminasa_gpt");
            return (Criteria) this;
        }
        
        public Criteria andIntNumTransaminasaGptNotIn(List<Integer> values) {
            addCriterion("num_transaminasa_gpt not in", values, "num_transaminasa_gpt");
            return (Criteria) this;
        }
        
        public Criteria andIntNumTransaminasaGptBetween(Integer value1, Integer value2) {
            addCriterion("num_transaminasa_gpt between", value1, value2, "num_transaminasa_gpt");
            return (Criteria) this;
        }
        
        public Criteria andIntNumTransaminasaGptNotBetween(Integer value1, Integer value2) {
            addCriterion("num_transaminasa_gpt not between", value1, value2, "num_transaminasa_gpt");
            return (Criteria) this;
        }
        
        
        public Criteria andIntNumTransaminasaGgtEqualTo(Integer value) {
            addCriterion("num_transaminasa_ggt =", value, "num_transaminasa_ggt");
            return (Criteria) this;
        }
        
        public Criteria andIntNumTransaminasaGgtNotEqualTo(Integer value) {
            addCriterion("num_transaminasa_ggt <>", value, "num_transaminasa_ggt");
            return (Criteria) this;
        }
        
        
        public Criteria andIntNumTransaminasaGgtIsNull() {
            addCriterion("num_transaminasa_ggt is null");
            return (Criteria) this;
        }
        
        public Criteria andIntNumTransaminasaGgtIsNotNull() {
            addCriterion("num_transaminasa_ggt is not null");
            return (Criteria) this;
        }
        
        public Criteria andIntNumTransaminasaGgtGreaterThan(Integer value) {
            addCriterion("num_transaminasa_ggt >", value, "num_transaminasa_ggt");
            return (Criteria) this;
        }
        
        public Criteria andIntNumTransaminasaGgtGreaterThanOrEqualTo(Integer value) {
            addCriterion("num_transaminasa_ggt >=", value, "num_transaminasa_ggt");
            return (Criteria) this;
        }
        
        public Criteria andIntNumTransaminasaGgtLessThan(Integer value) {
            addCriterion("num_transaminasa_ggt <", value, "num_transaminasa_ggt");
            return (Criteria) this;
        }
        
        public Criteria andIntNumTransaminasaGgtLessThanOrEqualTo(Integer value) {
            addCriterion("num_transaminasa_ggt <=", value, "num_transaminasa_ggt");
            return (Criteria) this;
        }
        
        public Criteria andIntNumTransaminasaGgtIn(List<Integer> values) {
            addCriterion("num_transaminasa_ggt in", values, "num_transaminasa_ggt");
            return (Criteria) this;
        }
        
        public Criteria andIntNumTransaminasaGgtNotIn(List<Integer> values) {
            addCriterion("num_transaminasa_ggt not in", values, "num_transaminasa_ggt");
            return (Criteria) this;
        }
        
        public Criteria andIntNumTransaminasaGgtBetween(Integer value1, Integer value2) {
            addCriterion("num_transaminasa_ggt between", value1, value2, "num_transaminasa_ggt");
            return (Criteria) this;
        }
        
        public Criteria andIntNumTransaminasaGgtNotBetween(Integer value1, Integer value2) {
            addCriterion("num_transaminasa_ggt not between", value1, value2, "num_transaminasa_ggt");
            return (Criteria) this;
        }
        
        
        public Criteria andIntNumFosfatasaAlcalinaEqualTo(Integer value) {
            addCriterion("num_fosfatasa_alcalina =", value, "num_fosfatasa_alcalina");
            return (Criteria) this;
        }
        
        public Criteria andIntNumFosfatasaAlcalinaNotEqualTo(Integer value) {
            addCriterion("num_fosfatasa_alcalina <>", value, "num_fosfatasa_alcalina");
            return (Criteria) this;
        }
        
        
        public Criteria andIntNumFosfatasaAlcalinaIsNull() {
            addCriterion("num_fosfatasa_alcalina is null");
            return (Criteria) this;
        }
        
        public Criteria andIntNumFosfatasaAlcalinaIsNotNull() {
            addCriterion("num_fosfatasa_alcalina is not null");
            return (Criteria) this;
        }
        
        public Criteria andIntNumFosfatasaAlcalinaGreaterThan(Integer value) {
            addCriterion("num_fosfatasa_alcalina >", value, "num_fosfatasa_alcalina");
            return (Criteria) this;
        }
        
        public Criteria andIntNumFosfatasaAlcalinaGreaterThanOrEqualTo(Integer value) {
            addCriterion("num_fosfatasa_alcalina >=", value, "num_fosfatasa_alcalina");
            return (Criteria) this;
        }
        
        public Criteria andIntNumFosfatasaAlcalinaLessThan(Integer value) {
            addCriterion("num_fosfatasa_alcalina <", value, "num_fosfatasa_alcalina");
            return (Criteria) this;
        }
        
        public Criteria andIntNumFosfatasaAlcalinaLessThanOrEqualTo(Integer value) {
            addCriterion("num_fosfatasa_alcalina <=", value, "num_fosfatasa_alcalina");
            return (Criteria) this;
        }
        
        public Criteria andIntNumFosfatasaAlcalinaIn(List<Integer> values) {
            addCriterion("num_fosfatasa_alcalina in", values, "num_fosfatasa_alcalina");
            return (Criteria) this;
        }
        
        public Criteria andIntNumFosfatasaAlcalinaNotIn(List<Integer> values) {
            addCriterion("num_fosfatasa_alcalina not in", values, "num_fosfatasa_alcalina");
            return (Criteria) this;
        }
        
        public Criteria andIntNumFosfatasaAlcalinaBetween(Integer value1, Integer value2) {
            addCriterion("num_fosfatasa_alcalina between", value1, value2, "num_fosfatasa_alcalina");
            return (Criteria) this;
        }
        
        public Criteria andIntNumFosfatasaAlcalinaNotBetween(Integer value1, Integer value2) {
            addCriterion("num_fosfatasa_alcalina not between", value1, value2, "num_fosfatasa_alcalina");
            return (Criteria) this;
        }
        
        
        public Criteria andIntNumCalcioEqualTo(Integer value) {
            addCriterion("num_calcio =", value, "num_calcio");
            return (Criteria) this;
        }
        
        public Criteria andIntNumCalcioNotEqualTo(Integer value) {
            addCriterion("num_calcio <>", value, "num_calcio");
            return (Criteria) this;
        }
        
        
        public Criteria andIntNumCalcioIsNull() {
            addCriterion("num_calcio is null");
            return (Criteria) this;
        }
        
        public Criteria andIntNumCalcioIsNotNull() {
            addCriterion("num_calcio is not null");
            return (Criteria) this;
        }
        
        public Criteria andIntNumCalcioGreaterThan(Integer value) {
            addCriterion("num_calcio >", value, "num_calcio");
            return (Criteria) this;
        }
        
        public Criteria andIntNumCalcioGreaterThanOrEqualTo(Integer value) {
            addCriterion("num_calcio >=", value, "num_calcio");
            return (Criteria) this;
        }
        
        public Criteria andIntNumCalcioLessThan(Integer value) {
            addCriterion("num_calcio <", value, "num_calcio");
            return (Criteria) this;
        }
        
        public Criteria andIntNumCalcioLessThanOrEqualTo(Integer value) {
            addCriterion("num_calcio <=", value, "num_calcio");
            return (Criteria) this;
        }
        
        public Criteria andIntNumCalcioIn(List<Integer> values) {
            addCriterion("num_calcio in", values, "num_calcio");
            return (Criteria) this;
        }
        
        public Criteria andIntNumCalcioNotIn(List<Integer> values) {
            addCriterion("num_calcio not in", values, "num_calcio");
            return (Criteria) this;
        }
        
        public Criteria andIntNumCalcioBetween(Integer value1, Integer value2) {
            addCriterion("num_calcio between", value1, value2, "num_calcio");
            return (Criteria) this;
        }
        
        public Criteria andIntNumCalcioNotBetween(Integer value1, Integer value2) {
            addCriterion("num_calcio not between", value1, value2, "num_calcio");
            return (Criteria) this;
        }
        
        
        public Criteria andIntNumHierroEqualTo(Integer value) {
            addCriterion("num_hierro =", value, "num_hierro");
            return (Criteria) this;
        }
        
        public Criteria andIntNumHierroNotEqualTo(Integer value) {
            addCriterion("num_hierro <>", value, "num_hierro");
            return (Criteria) this;
        }
        
        
        public Criteria andIntNumHierroIsNull() {
            addCriterion("num_hierro is null");
            return (Criteria) this;
        }
        
        public Criteria andIntNumHierroIsNotNull() {
            addCriterion("num_hierro is not null");
            return (Criteria) this;
        }
        
        public Criteria andIntNumHierroGreaterThan(Integer value) {
            addCriterion("num_hierro >", value, "num_hierro");
            return (Criteria) this;
        }
        
        public Criteria andIntNumHierroGreaterThanOrEqualTo(Integer value) {
            addCriterion("num_hierro >=", value, "num_hierro");
            return (Criteria) this;
        }
        
        public Criteria andIntNumHierroLessThan(Integer value) {
            addCriterion("num_hierro <", value, "num_hierro");
            return (Criteria) this;
        }
        
        public Criteria andIntNumHierroLessThanOrEqualTo(Integer value) {
            addCriterion("num_hierro <=", value, "num_hierro");
            return (Criteria) this;
        }
        
        public Criteria andIntNumHierroIn(List<Integer> values) {
            addCriterion("num_hierro in", values, "num_hierro");
            return (Criteria) this;
        }
        
        public Criteria andIntNumHierroNotIn(List<Integer> values) {
            addCriterion("num_hierro not in", values, "num_hierro");
            return (Criteria) this;
        }
        
        public Criteria andIntNumHierroBetween(Integer value1, Integer value2) {
            addCriterion("num_hierro between", value1, value2, "num_hierro");
            return (Criteria) this;
        }
        
        public Criteria andIntNumHierroNotBetween(Integer value1, Integer value2) {
            addCriterion("num_hierro not between", value1, value2, "num_hierro");
            return (Criteria) this;
        }
        
        
        public Criteria andIntNumPotacioEqualTo(Integer value) {
            addCriterion("num_potacio =", value, "num_potacio");
            return (Criteria) this;
        }
        
        public Criteria andIntNumPotacioNotEqualTo(Integer value) {
            addCriterion("num_potacio <>", value, "num_potacio");
            return (Criteria) this;
        }
        
        
        public Criteria andIntNumPotacioIsNull() {
            addCriterion("num_potacio is null");
            return (Criteria) this;
        }
        
        public Criteria andIntNumPotacioIsNotNull() {
            addCriterion("num_potacio is not null");
            return (Criteria) this;
        }
        
        public Criteria andIntNumPotacioGreaterThan(Integer value) {
            addCriterion("num_potacio >", value, "num_potacio");
            return (Criteria) this;
        }
        
        public Criteria andIntNumPotacioGreaterThanOrEqualTo(Integer value) {
            addCriterion("num_potacio >=", value, "num_potacio");
            return (Criteria) this;
        }
        
        public Criteria andIntNumPotacioLessThan(Integer value) {
            addCriterion("num_potacio <", value, "num_potacio");
            return (Criteria) this;
        }
        
        public Criteria andIntNumPotacioLessThanOrEqualTo(Integer value) {
            addCriterion("num_potacio <=", value, "num_potacio");
            return (Criteria) this;
        }
        
        public Criteria andIntNumPotacioIn(List<Integer> values) {
            addCriterion("num_potacio in", values, "num_potacio");
            return (Criteria) this;
        }
        
        public Criteria andIntNumPotacioNotIn(List<Integer> values) {
            addCriterion("num_potacio not in", values, "num_potacio");
            return (Criteria) this;
        }
        
        public Criteria andIntNumPotacioBetween(Integer value1, Integer value2) {
            addCriterion("num_potacio between", value1, value2, "num_potacio");
            return (Criteria) this;
        }
        
        public Criteria andIntNumPotacioNotBetween(Integer value1, Integer value2) {
            addCriterion("num_potacio not between", value1, value2, "num_potacio");
            return (Criteria) this;
        }
        
        
        public Criteria andIntNumSodioEqualTo(Integer value) {
            addCriterion("num_sodio =", value, "num_sodio");
            return (Criteria) this;
        }
        
        public Criteria andIntNumSodioNotEqualTo(Integer value) {
            addCriterion("num_sodio <>", value, "num_sodio");
            return (Criteria) this;
        }
        
        
        public Criteria andIntNumSodioIsNull() {
            addCriterion("num_sodio is null");
            return (Criteria) this;
        }
        
        public Criteria andIntNumSodioIsNotNull() {
            addCriterion("num_sodio is not null");
            return (Criteria) this;
        }
        
        public Criteria andIntNumSodioGreaterThan(Integer value) {
            addCriterion("num_sodio >", value, "num_sodio");
            return (Criteria) this;
        }
        
        public Criteria andIntNumSodioGreaterThanOrEqualTo(Integer value) {
            addCriterion("num_sodio >=", value, "num_sodio");
            return (Criteria) this;
        }
        
        public Criteria andIntNumSodioLessThan(Integer value) {
            addCriterion("num_sodio <", value, "num_sodio");
            return (Criteria) this;
        }
        
        public Criteria andIntNumSodioLessThanOrEqualTo(Integer value) {
            addCriterion("num_sodio <=", value, "num_sodio");
            return (Criteria) this;
        }
        
        public Criteria andIntNumSodioIn(List<Integer> values) {
            addCriterion("num_sodio in", values, "num_sodio");
            return (Criteria) this;
        }
        
        public Criteria andIntNumSodioNotIn(List<Integer> values) {
            addCriterion("num_sodio not in", values, "num_sodio");
            return (Criteria) this;
        }
        
        public Criteria andIntNumSodioBetween(Integer value1, Integer value2) {
            addCriterion("num_sodio between", value1, value2, "num_sodio");
            return (Criteria) this;
        }
        
        public Criteria andIntNumSodioNotBetween(Integer value1, Integer value2) {
            addCriterion("num_sodio not between", value1, value2, "num_sodio");
            return (Criteria) this;
        }
        
        
        public Criteria andIntNumBilirrubinaEqualTo(Integer value) {
            addCriterion("num_bilirrubina =", value, "num_bilirrubina");
            return (Criteria) this;
        }
        
        public Criteria andIntNumBilirrubinaNotEqualTo(Integer value) {
            addCriterion("num_bilirrubina <>", value, "num_bilirrubina");
            return (Criteria) this;
        }
        
        
        public Criteria andIntNumBilirrubinaIsNull() {
            addCriterion("num_bilirrubina is null");
            return (Criteria) this;
        }
        
        public Criteria andIntNumBilirrubinaIsNotNull() {
            addCriterion("num_bilirrubina is not null");
            return (Criteria) this;
        }
        
        public Criteria andIntNumBilirrubinaGreaterThan(Integer value) {
            addCriterion("num_bilirrubina >", value, "num_bilirrubina");
            return (Criteria) this;
        }
        
        public Criteria andIntNumBilirrubinaGreaterThanOrEqualTo(Integer value) {
            addCriterion("num_bilirrubina >=", value, "num_bilirrubina");
            return (Criteria) this;
        }
        
        public Criteria andIntNumBilirrubinaLessThan(Integer value) {
            addCriterion("num_bilirrubina <", value, "num_bilirrubina");
            return (Criteria) this;
        }
        
        public Criteria andIntNumBilirrubinaLessThanOrEqualTo(Integer value) {
            addCriterion("num_bilirrubina <=", value, "num_bilirrubina");
            return (Criteria) this;
        }
        
        public Criteria andIntNumBilirrubinaIn(List<Integer> values) {
            addCriterion("num_bilirrubina in", values, "num_bilirrubina");
            return (Criteria) this;
        }
        
        public Criteria andIntNumBilirrubinaNotIn(List<Integer> values) {
            addCriterion("num_bilirrubina not in", values, "num_bilirrubina");
            return (Criteria) this;
        }
        
        public Criteria andIntNumBilirrubinaBetween(Integer value1, Integer value2) {
            addCriterion("num_bilirrubina between", value1, value2, "num_bilirrubina");
            return (Criteria) this;
        }
        
        public Criteria andIntNumBilirrubinaNotBetween(Integer value1, Integer value2) {
            addCriterion("num_bilirrubina not between", value1, value2, "num_bilirrubina");
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
