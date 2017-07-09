package pmp.lupdup.dao.donantes.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import pmp.lupdup.general.util.CadenaUtil;

public class AllegadosParamDef {
	
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;
    
    public AllegadosParamDef() {
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
        
                
        
        public Criteria andSrlIdAllegadosEqualTo(Integer value) {
            addCriterion("id_allegados =", value, "id_allegados");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdAllegadosNotEqualTo(Integer value) {
            addCriterion("id_allegados <>", value, "id_allegados");
            return (Criteria) this;
        }
        
        
        public Criteria andSrlIdAllegadosIsNull() {
            addCriterion("id_allegados is null");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdAllegadosIsNotNull() {
            addCriterion("id_allegados is not null");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdAllegadosGreaterThan(Integer value) {
            addCriterion("id_allegados >", value, "id_allegados");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdAllegadosGreaterThanOrEqualTo(Integer value) {
            addCriterion("id_allegados >=", value, "id_allegados");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdAllegadosLessThan(Integer value) {
            addCriterion("id_allegados <", value, "id_allegados");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdAllegadosLessThanOrEqualTo(Integer value) {
            addCriterion("id_allegados <=", value, "id_allegados");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdAllegadosIn(List<Integer> values) {
            addCriterion("id_allegados in", values, "id_allegados");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdAllegadosNotIn(List<Integer> values) {
            addCriterion("id_allegados not in", values, "id_allegados");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdAllegadosBetween(Integer value1, Integer value2) {
            addCriterion("id_allegados between", value1, value2, "id_allegados");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdAllegadosNotBetween(Integer value1, Integer value2) {
            addCriterion("id_allegados not between", value1, value2, "id_allegados");
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
        
        
        public Criteria andDteFecUltimaModificacionEqualTo(Date value) {
            addCriterion("fec_ultimamodificacion =", value, "fec_ultimamodificacion");
            return (Criteria) this;
        }
        
        public Criteria andDteFecUltimaModificacionNotEqualTo(Date value) {
            addCriterion("fec_ultimamodificacion <>", value, "fec_ultimamodificacion");
            return (Criteria) this;
        }
        
        
        public Criteria andDteFecUltimaModificacionIsNull() {
            addCriterion("fec_ultimamodificacion is null");
            return (Criteria) this;
        }
        
        public Criteria andDteFecUltimaModificacionIsNotNull() {
            addCriterion("fec_ultimamodificacion is not null");
            return (Criteria) this;
        }
        
        public Criteria andDteFecUltimaModificacionGreaterThan(Date value) {
            addCriterion("fec_ultimamodificacion >", value, "fec_ultimamodificacion");
            return (Criteria) this;
        }
        
        public Criteria andDteFecUltimaModificacionGreaterThanOrEqualTo(Date value) {
            addCriterion("fec_ultimamodificacion >=", value, "fec_ultimamodificacion");
            return (Criteria) this;
        }
        
        public Criteria andDteFecUltimaModificacionLessThan(Date value) {
            addCriterion("fec_ultimamodificacion <", value, "fec_ultimamodificacion");
            return (Criteria) this;
        }
        
        public Criteria andDteFecUltimaModificacionLessThanOrEqualTo(Date value) {
            addCriterion("fec_ultimamodificacion <=", value, "fec_ultimamodificacion");
            return (Criteria) this;
        }
        
        public Criteria andDteFecUltimaModificacionIn(List<Date> values) {
            addCriterion("fec_ultimamodificacion in", values, "fec_ultimamodificacion");
            return (Criteria) this;
        }
        
        public Criteria andDteFecUltimaModificacionNotIn(List<Date> values) {
            addCriterion("fec_ultimamodificacion not in", values, "fec_ultimamodificacion");
            return (Criteria) this;
        }
        
        public Criteria andDteFecUltimaModificacionBetween(Date value1, Date value2) {
            addCriterion("fec_ultimamodificacion between", value1, value2, "fec_ultimamodificacion");
            return (Criteria) this;
        }
        
        public Criteria andDteFecUltimaModificacionNotBetween(Date value1, Date value2) {
            addCriterion("fec_ultimamodificacion not between", value1, value2, "fec_ultimamodificacion");
            return (Criteria) this;
        }
        
        
        public Criteria andStrNomNombreLike(String value) {
            addCriterion("upper(nom_nombre) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "nom_nombre");
            return (Criteria) this;
        }
        
        public Criteria andStrNomNombreNotLike(String value) {
            addCriterion("nom_nombre not like", "%" + CadenaUtil.getStr(value) + "%", "nom_nombre");
            return (Criteria) this;
        }
        
        public Criteria andStrNomNombreEqualTo(String value) {
            addCriterion("nom_nombre =", CadenaUtil.getStr(value), "nom_nombre");
            return (Criteria) this;
        }
        
        public Criteria andStrNomNombreNotEqualTo(String value) {
            addCriterion("nom_nombre <>", CadenaUtil.getStr(value), "nom_nombre");
            return (Criteria) this;
        }
        
        
        public Criteria andStrNomNombreIsNull() {
            addCriterion("nom_nombre is null");
            return (Criteria) this;
        }
        
        public Criteria andStrNomNombreIsNotNull() {
            addCriterion("nom_nombre is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrNomNombreGreaterThan(String value) {
            addCriterion("nom_nombre >", value, "nom_nombre");
            return (Criteria) this;
        }
        
        public Criteria andStrNomNombreGreaterThanOrEqualTo(String value) {
            addCriterion("nom_nombre >=", value, "nom_nombre");
            return (Criteria) this;
        }
        
        public Criteria andStrNomNombreLessThan(String value) {
            addCriterion("nom_nombre <", value, "nom_nombre");
            return (Criteria) this;
        }
        
        public Criteria andStrNomNombreLessThanOrEqualTo(String value) {
            addCriterion("nom_nombre <=", value, "nom_nombre");
            return (Criteria) this;
        }
        
        public Criteria andStrNomNombreIn(List<String> values) {
            addCriterion("nom_nombre in", values, "nom_nombre");
            return (Criteria) this;
        }
        
        public Criteria andStrNomNombreNotIn(List<String> values) {
            addCriterion("nom_nombre not in", values, "nom_nombre");
            return (Criteria) this;
        }
        
        public Criteria andStrNomNombreBetween(String value1, String value2) {
            addCriterion("nom_nombre between", value1, value2, "nom_nombre");
            return (Criteria) this;
        }
        
        public Criteria andStrNomNombreNotBetween(String value1, String value2) {
            addCriterion("nom_nombre not between", value1, value2, "nom_nombre");
            return (Criteria) this;
        }
        
        
        public Criteria andStrNomAppaternoLike(String value) {
            addCriterion("upper(nom_appaterno) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "nom_appaterno");
            return (Criteria) this;
        }
        
        public Criteria andStrNomAppaternoNotLike(String value) {
            addCriterion("nom_appaterno not like", "%" + CadenaUtil.getStr(value) + "%", "nom_appaterno");
            return (Criteria) this;
        }
        
        public Criteria andStrNomAppaternoEqualTo(String value) {
            addCriterion("nom_appaterno =", CadenaUtil.getStr(value), "nom_appaterno");
            return (Criteria) this;
        }
        
        public Criteria andStrNomAppaternoNotEqualTo(String value) {
            addCriterion("nom_appaterno <>", CadenaUtil.getStr(value), "nom_appaterno");
            return (Criteria) this;
        }
        
        
        public Criteria andStrNomAppaternoIsNull() {
            addCriterion("nom_appaterno is null");
            return (Criteria) this;
        }
        
        public Criteria andStrNomAppaternoIsNotNull() {
            addCriterion("nom_appaterno is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrNomAppaternoGreaterThan(String value) {
            addCriterion("nom_appaterno >", value, "nom_appaterno");
            return (Criteria) this;
        }
        
        public Criteria andStrNomAppaternoGreaterThanOrEqualTo(String value) {
            addCriterion("nom_appaterno >=", value, "nom_appaterno");
            return (Criteria) this;
        }
        
        public Criteria andStrNomAppaternoLessThan(String value) {
            addCriterion("nom_appaterno <", value, "nom_appaterno");
            return (Criteria) this;
        }
        
        public Criteria andStrNomAppaternoLessThanOrEqualTo(String value) {
            addCriterion("nom_appaterno <=", value, "nom_appaterno");
            return (Criteria) this;
        }
        
        public Criteria andStrNomAppaternoIn(List<String> values) {
            addCriterion("nom_appaterno in", values, "nom_appaterno");
            return (Criteria) this;
        }
        
        public Criteria andStrNomAppaternoNotIn(List<String> values) {
            addCriterion("nom_appaterno not in", values, "nom_appaterno");
            return (Criteria) this;
        }
        
        public Criteria andStrNomAppaternoBetween(String value1, String value2) {
            addCriterion("nom_appaterno between", value1, value2, "nom_appaterno");
            return (Criteria) this;
        }
        
        public Criteria andStrNomAppaternoNotBetween(String value1, String value2) {
            addCriterion("nom_appaterno not between", value1, value2, "nom_appaterno");
            return (Criteria) this;
        }
        
        
        public Criteria andStrNomApmaternoLike(String value) {
            addCriterion("upper(nom_apmaterno) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "nom_apmaterno");
            return (Criteria) this;
        }
        
        public Criteria andStrNomApmaternoNotLike(String value) {
            addCriterion("nom_apmaterno not like", "%" + CadenaUtil.getStr(value) + "%", "nom_apmaterno");
            return (Criteria) this;
        }
        
        public Criteria andStrNomApmaternoEqualTo(String value) {
            addCriterion("nom_apmaterno =", CadenaUtil.getStr(value), "nom_apmaterno");
            return (Criteria) this;
        }
        
        public Criteria andStrNomApmaternoNotEqualTo(String value) {
            addCriterion("nom_apmaterno <>", CadenaUtil.getStr(value), "nom_apmaterno");
            return (Criteria) this;
        }
        
        
        public Criteria andStrNomApmaternoIsNull() {
            addCriterion("nom_apmaterno is null");
            return (Criteria) this;
        }
        
        public Criteria andStrNomApmaternoIsNotNull() {
            addCriterion("nom_apmaterno is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrNomApmaternoGreaterThan(String value) {
            addCriterion("nom_apmaterno >", value, "nom_apmaterno");
            return (Criteria) this;
        }
        
        public Criteria andStrNomApmaternoGreaterThanOrEqualTo(String value) {
            addCriterion("nom_apmaterno >=", value, "nom_apmaterno");
            return (Criteria) this;
        }
        
        public Criteria andStrNomApmaternoLessThan(String value) {
            addCriterion("nom_apmaterno <", value, "nom_apmaterno");
            return (Criteria) this;
        }
        
        public Criteria andStrNomApmaternoLessThanOrEqualTo(String value) {
            addCriterion("nom_apmaterno <=", value, "nom_apmaterno");
            return (Criteria) this;
        }
        
        public Criteria andStrNomApmaternoIn(List<String> values) {
            addCriterion("nom_apmaterno in", values, "nom_apmaterno");
            return (Criteria) this;
        }
        
        public Criteria andStrNomApmaternoNotIn(List<String> values) {
            addCriterion("nom_apmaterno not in", values, "nom_apmaterno");
            return (Criteria) this;
        }
        
        public Criteria andStrNomApmaternoBetween(String value1, String value2) {
            addCriterion("nom_apmaterno between", value1, value2, "nom_apmaterno");
            return (Criteria) this;
        }
        
        public Criteria andStrNomApmaternoNotBetween(String value1, String value2) {
            addCriterion("nom_apmaterno not between", value1, value2, "nom_apmaterno");
            return (Criteria) this;
        }
        
        
        public Criteria andDteFecNacimientoEqualTo(Date value) {
            addCriterion("fec_nacimiento =", value, "fec_nacimiento");
            return (Criteria) this;
        }
        
        public Criteria andDteFecNacimientoNotEqualTo(Date value) {
            addCriterion("fec_nacimiento <>", value, "fec_nacimiento");
            return (Criteria) this;
        }
        
        
        public Criteria andDteFecNacimientoIsNull() {
            addCriterion("fec_nacimiento is null");
            return (Criteria) this;
        }
        
        public Criteria andDteFecNacimientoIsNotNull() {
            addCriterion("fec_nacimiento is not null");
            return (Criteria) this;
        }
        
        public Criteria andDteFecNacimientoGreaterThan(Date value) {
            addCriterion("fec_nacimiento >", value, "fec_nacimiento");
            return (Criteria) this;
        }
        
        public Criteria andDteFecNacimientoGreaterThanOrEqualTo(Date value) {
            addCriterion("fec_nacimiento >=", value, "fec_nacimiento");
            return (Criteria) this;
        }
        
        public Criteria andDteFecNacimientoLessThan(Date value) {
            addCriterion("fec_nacimiento <", value, "fec_nacimiento");
            return (Criteria) this;
        }
        
        public Criteria andDteFecNacimientoLessThanOrEqualTo(Date value) {
            addCriterion("fec_nacimiento <=", value, "fec_nacimiento");
            return (Criteria) this;
        }
        
        public Criteria andDteFecNacimientoIn(List<Date> values) {
            addCriterion("fec_nacimiento in", values, "fec_nacimiento");
            return (Criteria) this;
        }
        
        public Criteria andDteFecNacimientoNotIn(List<Date> values) {
            addCriterion("fec_nacimiento not in", values, "fec_nacimiento");
            return (Criteria) this;
        }
        
        public Criteria andDteFecNacimientoBetween(Date value1, Date value2) {
            addCriterion("fec_nacimiento between", value1, value2, "fec_nacimiento");
            return (Criteria) this;
        }
        
        public Criteria andDteFecNacimientoNotBetween(Date value1, Date value2) {
            addCriterion("fec_nacimiento not between", value1, value2, "fec_nacimiento");
            return (Criteria) this;
        }
        
        
        public Criteria andStrNumCelularLike(String value) {
            addCriterion("upper(num_celular) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "num_celular");
            return (Criteria) this;
        }
        
        public Criteria andStrNumCelularNotLike(String value) {
            addCriterion("num_celular not like", "%" + CadenaUtil.getStr(value) + "%", "num_celular");
            return (Criteria) this;
        }
        
        public Criteria andStrNumCelularEqualTo(String value) {
            addCriterion("num_celular =", CadenaUtil.getStr(value), "num_celular");
            return (Criteria) this;
        }
        
        public Criteria andStrNumCelularNotEqualTo(String value) {
            addCriterion("num_celular <>", CadenaUtil.getStr(value), "num_celular");
            return (Criteria) this;
        }
        
        
        public Criteria andStrNumCelularIsNull() {
            addCriterion("num_celular is null");
            return (Criteria) this;
        }
        
        public Criteria andStrNumCelularIsNotNull() {
            addCriterion("num_celular is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrNumCelularGreaterThan(String value) {
            addCriterion("num_celular >", value, "num_celular");
            return (Criteria) this;
        }
        
        public Criteria andStrNumCelularGreaterThanOrEqualTo(String value) {
            addCriterion("num_celular >=", value, "num_celular");
            return (Criteria) this;
        }
        
        public Criteria andStrNumCelularLessThan(String value) {
            addCriterion("num_celular <", value, "num_celular");
            return (Criteria) this;
        }
        
        public Criteria andStrNumCelularLessThanOrEqualTo(String value) {
            addCriterion("num_celular <=", value, "num_celular");
            return (Criteria) this;
        }
        
        public Criteria andStrNumCelularIn(List<String> values) {
            addCriterion("num_celular in", values, "num_celular");
            return (Criteria) this;
        }
        
        public Criteria andStrNumCelularNotIn(List<String> values) {
            addCriterion("num_celular not in", values, "num_celular");
            return (Criteria) this;
        }
        
        public Criteria andStrNumCelularBetween(String value1, String value2) {
            addCriterion("num_celular between", value1, value2, "num_celular");
            return (Criteria) this;
        }
        
        public Criteria andStrNumCelularNotBetween(String value1, String value2) {
            addCriterion("num_celular not between", value1, value2, "num_celular");
            return (Criteria) this;
        }
        
        
        public Criteria andStrNumTelefonoLike(String value) {
            addCriterion("upper(num_telefono) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "num_telefono");
            return (Criteria) this;
        }
        
        public Criteria andStrNumTelefonoNotLike(String value) {
            addCriterion("num_telefono not like", "%" + CadenaUtil.getStr(value) + "%", "num_telefono");
            return (Criteria) this;
        }
        
        public Criteria andStrNumTelefonoEqualTo(String value) {
            addCriterion("num_telefono =", CadenaUtil.getStr(value), "num_telefono");
            return (Criteria) this;
        }
        
        public Criteria andStrNumTelefonoNotEqualTo(String value) {
            addCriterion("num_telefono <>", CadenaUtil.getStr(value), "num_telefono");
            return (Criteria) this;
        }
        
        
        public Criteria andStrNumTelefonoIsNull() {
            addCriterion("num_telefono is null");
            return (Criteria) this;
        }
        
        public Criteria andStrNumTelefonoIsNotNull() {
            addCriterion("num_telefono is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrNumTelefonoGreaterThan(String value) {
            addCriterion("num_telefono >", value, "num_telefono");
            return (Criteria) this;
        }
        
        public Criteria andStrNumTelefonoGreaterThanOrEqualTo(String value) {
            addCriterion("num_telefono >=", value, "num_telefono");
            return (Criteria) this;
        }
        
        public Criteria andStrNumTelefonoLessThan(String value) {
            addCriterion("num_telefono <", value, "num_telefono");
            return (Criteria) this;
        }
        
        public Criteria andStrNumTelefonoLessThanOrEqualTo(String value) {
            addCriterion("num_telefono <=", value, "num_telefono");
            return (Criteria) this;
        }
        
        public Criteria andStrNumTelefonoIn(List<String> values) {
            addCriterion("num_telefono in", values, "num_telefono");
            return (Criteria) this;
        }
        
        public Criteria andStrNumTelefonoNotIn(List<String> values) {
            addCriterion("num_telefono not in", values, "num_telefono");
            return (Criteria) this;
        }
        
        public Criteria andStrNumTelefonoBetween(String value1, String value2) {
            addCriterion("num_telefono between", value1, value2, "num_telefono");
            return (Criteria) this;
        }
        
        public Criteria andStrNumTelefonoNotBetween(String value1, String value2) {
            addCriterion("num_telefono not between", value1, value2, "num_telefono");
            return (Criteria) this;
        }
        
        
        public Criteria andStrDesCorreoelectronicoLike(String value) {
            addCriterion("upper(des_correoelectronico) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "des_correoelectronico");
            return (Criteria) this;
        }
        
        public Criteria andStrDesCorreoelectronicoNotLike(String value) {
            addCriterion("des_correoelectronico not like", "%" + CadenaUtil.getStr(value) + "%", "des_correoelectronico");
            return (Criteria) this;
        }
        
        public Criteria andStrDesCorreoelectronicoEqualTo(String value) {
            addCriterion("des_correoelectronico =", CadenaUtil.getStr(value), "des_correoelectronico");
            return (Criteria) this;
        }
        
        public Criteria andStrDesCorreoelectronicoNotEqualTo(String value) {
            addCriterion("des_correoelectronico <>", CadenaUtil.getStr(value), "des_correoelectronico");
            return (Criteria) this;
        }
        
        
        public Criteria andStrDesCorreoelectronicoIsNull() {
            addCriterion("des_correoelectronico is null");
            return (Criteria) this;
        }
        
        public Criteria andStrDesCorreoelectronicoIsNotNull() {
            addCriterion("des_correoelectronico is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrDesCorreoelectronicoGreaterThan(String value) {
            addCriterion("des_correoelectronico >", value, "des_correoelectronico");
            return (Criteria) this;
        }
        
        public Criteria andStrDesCorreoelectronicoGreaterThanOrEqualTo(String value) {
            addCriterion("des_correoelectronico >=", value, "des_correoelectronico");
            return (Criteria) this;
        }
        
        public Criteria andStrDesCorreoelectronicoLessThan(String value) {
            addCriterion("des_correoelectronico <", value, "des_correoelectronico");
            return (Criteria) this;
        }
        
        public Criteria andStrDesCorreoelectronicoLessThanOrEqualTo(String value) {
            addCriterion("des_correoelectronico <=", value, "des_correoelectronico");
            return (Criteria) this;
        }
        
        public Criteria andStrDesCorreoelectronicoIn(List<String> values) {
            addCriterion("des_correoelectronico in", values, "des_correoelectronico");
            return (Criteria) this;
        }
        
        public Criteria andStrDesCorreoelectronicoNotIn(List<String> values) {
            addCriterion("des_correoelectronico not in", values, "des_correoelectronico");
            return (Criteria) this;
        }
        
        public Criteria andStrDesCorreoelectronicoBetween(String value1, String value2) {
            addCriterion("des_correoelectronico between", value1, value2, "des_correoelectronico");
            return (Criteria) this;
        }
        
        public Criteria andStrDesCorreoelectronicoNotBetween(String value1, String value2) {
            addCriterion("des_correoelectronico not between", value1, value2, "des_correoelectronico");
            return (Criteria) this;
        }
        
        
        public Criteria andStrNumDniLike(String value) {
            addCriterion("upper(num_dni) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "num_dni");
            return (Criteria) this;
        }
        
        public Criteria andStrNumDniNotLike(String value) {
            addCriterion("num_dni not like", "%" + CadenaUtil.getStr(value) + "%", "num_dni");
            return (Criteria) this;
        }
        
        public Criteria andStrNumDniEqualTo(String value) {
            addCriterion("num_dni =", CadenaUtil.getStr(value), "num_dni");
            return (Criteria) this;
        }
        
        public Criteria andStrNumDniNotEqualTo(String value) {
            addCriterion("num_dni <>", CadenaUtil.getStr(value), "num_dni");
            return (Criteria) this;
        }
        
        
        public Criteria andStrNumDniIsNull() {
            addCriterion("num_dni is null");
            return (Criteria) this;
        }
        
        public Criteria andStrNumDniIsNotNull() {
            addCriterion("num_dni is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrNumDniGreaterThan(String value) {
            addCriterion("num_dni >", value, "num_dni");
            return (Criteria) this;
        }
        
        public Criteria andStrNumDniGreaterThanOrEqualTo(String value) {
            addCriterion("num_dni >=", value, "num_dni");
            return (Criteria) this;
        }
        
        public Criteria andStrNumDniLessThan(String value) {
            addCriterion("num_dni <", value, "num_dni");
            return (Criteria) this;
        }
        
        public Criteria andStrNumDniLessThanOrEqualTo(String value) {
            addCriterion("num_dni <=", value, "num_dni");
            return (Criteria) this;
        }
        
        public Criteria andStrNumDniIn(List<String> values) {
            addCriterion("num_dni in", values, "num_dni");
            return (Criteria) this;
        }
        
        public Criteria andStrNumDniNotIn(List<String> values) {
            addCriterion("num_dni not in", values, "num_dni");
            return (Criteria) this;
        }
        
        public Criteria andStrNumDniBetween(String value1, String value2) {
            addCriterion("num_dni between", value1, value2, "num_dni");
            return (Criteria) this;
        }
        
        public Criteria andStrNumDniNotBetween(String value1, String value2) {
            addCriterion("num_dni not between", value1, value2, "num_dni");
            return (Criteria) this;
        }
        
        
        public Criteria andIntIdTipoparienteEqualTo(Integer value) {
            addCriterion("id_tipopariente =", value, "id_tipopariente");
            return (Criteria) this;
        }
        
        public Criteria andIntIdTipoparienteNotEqualTo(Integer value) {
            addCriterion("id_tipopariente <>", value, "id_tipopariente");
            return (Criteria) this;
        }
        
        
        public Criteria andIntIdTipoparienteIsNull() {
            addCriterion("id_tipopariente is null");
            return (Criteria) this;
        }
        
        public Criteria andIntIdTipoparienteIsNotNull() {
            addCriterion("id_tipopariente is not null");
            return (Criteria) this;
        }
        
        public Criteria andIntIdTipoparienteGreaterThan(Integer value) {
            addCriterion("id_tipopariente >", value, "id_tipopariente");
            return (Criteria) this;
        }
        
        public Criteria andIntIdTipoparienteGreaterThanOrEqualTo(Integer value) {
            addCriterion("id_tipopariente >=", value, "id_tipopariente");
            return (Criteria) this;
        }
        
        public Criteria andIntIdTipoparienteLessThan(Integer value) {
            addCriterion("id_tipopariente <", value, "id_tipopariente");
            return (Criteria) this;
        }
        
        public Criteria andIntIdTipoparienteLessThanOrEqualTo(Integer value) {
            addCriterion("id_tipopariente <=", value, "id_tipopariente");
            return (Criteria) this;
        }
        
        public Criteria andIntIdTipoparienteIn(List<Integer> values) {
            addCriterion("id_tipopariente in", values, "id_tipopariente");
            return (Criteria) this;
        }
        
        public Criteria andIntIdTipoparienteNotIn(List<Integer> values) {
            addCriterion("id_tipopariente not in", values, "id_tipopariente");
            return (Criteria) this;
        }
        
        public Criteria andIntIdTipoparienteBetween(Integer value1, Integer value2) {
            addCriterion("id_tipopariente between", value1, value2, "id_tipopariente");
            return (Criteria) this;
        }
        
        public Criteria andIntIdTipoparienteNotBetween(Integer value1, Integer value2) {
            addCriterion("id_tipopariente not between", value1, value2, "id_tipopariente");
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
