package pmp.lupdup.dao.donantes.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import pmp.lupdup.general.util.CadenaUtil;

public class DonanteParamDef {
	
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;
    
    public DonanteParamDef() {
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
        
                
        
        public Criteria andSrlIdDonanteEqualTo(Integer value) {
            addCriterion("id_donante =", value, "id_donante");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdDonanteNotEqualTo(Integer value) {
            addCriterion("id_donante <>", value, "id_donante");
            return (Criteria) this;
        }
        
        
        public Criteria andSrlIdDonanteIsNull() {
            addCriterion("id_donante is null");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdDonanteIsNotNull() {
            addCriterion("id_donante is not null");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdDonanteGreaterThan(Integer value) {
            addCriterion("id_donante >", value, "id_donante");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdDonanteGreaterThanOrEqualTo(Integer value) {
            addCriterion("id_donante >=", value, "id_donante");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdDonanteLessThan(Integer value) {
            addCriterion("id_donante <", value, "id_donante");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdDonanteLessThanOrEqualTo(Integer value) {
            addCriterion("id_donante <=", value, "id_donante");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdDonanteIn(List<Integer> values) {
            addCriterion("id_donante in", values, "id_donante");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdDonanteNotIn(List<Integer> values) {
            addCriterion("id_donante not in", values, "id_donante");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdDonanteBetween(Integer value1, Integer value2) {
            addCriterion("id_donante between", value1, value2, "id_donante");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdDonanteNotBetween(Integer value1, Integer value2) {
            addCriterion("id_donante not between", value1, value2, "id_donante");
            return (Criteria) this;
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
        
        
        public Criteria andIntIndEstadocivilEqualTo(Integer value) {
            addCriterion("ind_estadocivil =", value, "ind_estadocivil");
            return (Criteria) this;
        }
        
        public Criteria andIntIndEstadocivilNotEqualTo(Integer value) {
            addCriterion("ind_estadocivil <>", value, "ind_estadocivil");
            return (Criteria) this;
        }
        
        
        public Criteria andIntIndEstadocivilIsNull() {
            addCriterion("ind_estadocivil is null");
            return (Criteria) this;
        }
        
        public Criteria andIntIndEstadocivilIsNotNull() {
            addCriterion("ind_estadocivil is not null");
            return (Criteria) this;
        }
        
        public Criteria andIntIndEstadocivilGreaterThan(Integer value) {
            addCriterion("ind_estadocivil >", value, "ind_estadocivil");
            return (Criteria) this;
        }
        
        public Criteria andIntIndEstadocivilGreaterThanOrEqualTo(Integer value) {
            addCriterion("ind_estadocivil >=", value, "ind_estadocivil");
            return (Criteria) this;
        }
        
        public Criteria andIntIndEstadocivilLessThan(Integer value) {
            addCriterion("ind_estadocivil <", value, "ind_estadocivil");
            return (Criteria) this;
        }
        
        public Criteria andIntIndEstadocivilLessThanOrEqualTo(Integer value) {
            addCriterion("ind_estadocivil <=", value, "ind_estadocivil");
            return (Criteria) this;
        }
        
        public Criteria andIntIndEstadocivilIn(List<Integer> values) {
            addCriterion("ind_estadocivil in", values, "ind_estadocivil");
            return (Criteria) this;
        }
        
        public Criteria andIntIndEstadocivilNotIn(List<Integer> values) {
            addCriterion("ind_estadocivil not in", values, "ind_estadocivil");
            return (Criteria) this;
        }
        
        public Criteria andIntIndEstadocivilBetween(Integer value1, Integer value2) {
            addCriterion("ind_estadocivil between", value1, value2, "ind_estadocivil");
            return (Criteria) this;
        }
        
        public Criteria andIntIndEstadocivilNotBetween(Integer value1, Integer value2) {
            addCriterion("ind_estadocivil not between", value1, value2, "ind_estadocivil");
            return (Criteria) this;
        }
        
        
        public Criteria andIntIndSexoEqualTo(Integer value) {
            addCriterion("ind_sexo =", value, "ind_sexo");
            return (Criteria) this;
        }
        
        public Criteria andIntIndSexoNotEqualTo(Integer value) {
            addCriterion("ind_sexo <>", value, "ind_sexo");
            return (Criteria) this;
        }
        
        
        public Criteria andIntIndSexoIsNull() {
            addCriterion("ind_sexo is null");
            return (Criteria) this;
        }
        
        public Criteria andIntIndSexoIsNotNull() {
            addCriterion("ind_sexo is not null");
            return (Criteria) this;
        }
        
        public Criteria andIntIndSexoGreaterThan(Integer value) {
            addCriterion("ind_sexo >", value, "ind_sexo");
            return (Criteria) this;
        }
        
        public Criteria andIntIndSexoGreaterThanOrEqualTo(Integer value) {
            addCriterion("ind_sexo >=", value, "ind_sexo");
            return (Criteria) this;
        }
        
        public Criteria andIntIndSexoLessThan(Integer value) {
            addCriterion("ind_sexo <", value, "ind_sexo");
            return (Criteria) this;
        }
        
        public Criteria andIntIndSexoLessThanOrEqualTo(Integer value) {
            addCriterion("ind_sexo <=", value, "ind_sexo");
            return (Criteria) this;
        }
        
        public Criteria andIntIndSexoIn(List<Integer> values) {
            addCriterion("ind_sexo in", values, "ind_sexo");
            return (Criteria) this;
        }
        
        public Criteria andIntIndSexoNotIn(List<Integer> values) {
            addCriterion("ind_sexo not in", values, "ind_sexo");
            return (Criteria) this;
        }
        
        public Criteria andIntIndSexoBetween(Integer value1, Integer value2) {
            addCriterion("ind_sexo between", value1, value2, "ind_sexo");
            return (Criteria) this;
        }
        
        public Criteria andIntIndSexoNotBetween(Integer value1, Integer value2) {
            addCriterion("ind_sexo not between", value1, value2, "ind_sexo");
            return (Criteria) this;
        }
        
        
        public Criteria andIntDesGradoinstrucEqualTo(Integer value) {
            addCriterion("des_gradoinstruc =", value, "des_gradoinstruc");
            return (Criteria) this;
        }
        
        public Criteria andIntDesGradoinstrucNotEqualTo(Integer value) {
            addCriterion("des_gradoinstruc <>", value, "des_gradoinstruc");
            return (Criteria) this;
        }
        
        
        public Criteria andIntDesGradoinstrucIsNull() {
            addCriterion("des_gradoinstruc is null");
            return (Criteria) this;
        }
        
        public Criteria andIntDesGradoinstrucIsNotNull() {
            addCriterion("des_gradoinstruc is not null");
            return (Criteria) this;
        }
        
        public Criteria andIntDesGradoinstrucGreaterThan(Integer value) {
            addCriterion("des_gradoinstruc >", value, "des_gradoinstruc");
            return (Criteria) this;
        }
        
        public Criteria andIntDesGradoinstrucGreaterThanOrEqualTo(Integer value) {
            addCriterion("des_gradoinstruc >=", value, "des_gradoinstruc");
            return (Criteria) this;
        }
        
        public Criteria andIntDesGradoinstrucLessThan(Integer value) {
            addCriterion("des_gradoinstruc <", value, "des_gradoinstruc");
            return (Criteria) this;
        }
        
        public Criteria andIntDesGradoinstrucLessThanOrEqualTo(Integer value) {
            addCriterion("des_gradoinstruc <=", value, "des_gradoinstruc");
            return (Criteria) this;
        }
        
        public Criteria andIntDesGradoinstrucIn(List<Integer> values) {
            addCriterion("des_gradoinstruc in", values, "des_gradoinstruc");
            return (Criteria) this;
        }
        
        public Criteria andIntDesGradoinstrucNotIn(List<Integer> values) {
            addCriterion("des_gradoinstruc not in", values, "des_gradoinstruc");
            return (Criteria) this;
        }
        
        public Criteria andIntDesGradoinstrucBetween(Integer value1, Integer value2) {
            addCriterion("des_gradoinstruc between", value1, value2, "des_gradoinstruc");
            return (Criteria) this;
        }
        
        public Criteria andIntDesGradoinstrucNotBetween(Integer value1, Integer value2) {
            addCriterion("des_gradoinstruc not between", value1, value2, "des_gradoinstruc");
            return (Criteria) this;
        }
        
        
        public Criteria andStrDesOcupacionLike(String value) {
            addCriterion("upper(des_ocupacion) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "des_ocupacion");
            return (Criteria) this;
        }
        
        public Criteria andStrDesOcupacionNotLike(String value) {
            addCriterion("des_ocupacion not like", "%" + CadenaUtil.getStr(value) + "%", "des_ocupacion");
            return (Criteria) this;
        }
        
        public Criteria andStrDesOcupacionEqualTo(String value) {
            addCriterion("des_ocupacion =", CadenaUtil.getStr(value), "des_ocupacion");
            return (Criteria) this;
        }
        
        public Criteria andStrDesOcupacionNotEqualTo(String value) {
            addCriterion("des_ocupacion <>", CadenaUtil.getStr(value), "des_ocupacion");
            return (Criteria) this;
        }
        
        
        public Criteria andStrDesOcupacionIsNull() {
            addCriterion("des_ocupacion is null");
            return (Criteria) this;
        }
        
        public Criteria andStrDesOcupacionIsNotNull() {
            addCriterion("des_ocupacion is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrDesOcupacionGreaterThan(String value) {
            addCriterion("des_ocupacion >", value, "des_ocupacion");
            return (Criteria) this;
        }
        
        public Criteria andStrDesOcupacionGreaterThanOrEqualTo(String value) {
            addCriterion("des_ocupacion >=", value, "des_ocupacion");
            return (Criteria) this;
        }
        
        public Criteria andStrDesOcupacionLessThan(String value) {
            addCriterion("des_ocupacion <", value, "des_ocupacion");
            return (Criteria) this;
        }
        
        public Criteria andStrDesOcupacionLessThanOrEqualTo(String value) {
            addCriterion("des_ocupacion <=", value, "des_ocupacion");
            return (Criteria) this;
        }
        
        public Criteria andStrDesOcupacionIn(List<String> values) {
            addCriterion("des_ocupacion in", values, "des_ocupacion");
            return (Criteria) this;
        }
        
        public Criteria andStrDesOcupacionNotIn(List<String> values) {
            addCriterion("des_ocupacion not in", values, "des_ocupacion");
            return (Criteria) this;
        }
        
        public Criteria andStrDesOcupacionBetween(String value1, String value2) {
            addCriterion("des_ocupacion between", value1, value2, "des_ocupacion");
            return (Criteria) this;
        }
        
        public Criteria andStrDesOcupacionNotBetween(String value1, String value2) {
            addCriterion("des_ocupacion not between", value1, value2, "des_ocupacion");
            return (Criteria) this;
        }
        
        
        public Criteria andIntIndDonanteEqualTo(Integer value) {
            addCriterion("ind_donante =", value, "ind_donante");
            return (Criteria) this;
        }
        
        public Criteria andIntIndDonanteNotEqualTo(Integer value) {
            addCriterion("ind_donante <>", value, "ind_donante");
            return (Criteria) this;
        }
        
        
        public Criteria andIntIndDonanteIsNull() {
            addCriterion("ind_donante is null");
            return (Criteria) this;
        }
        
        public Criteria andIntIndDonanteIsNotNull() {
            addCriterion("ind_donante is not null");
            return (Criteria) this;
        }
        
        public Criteria andIntIndDonanteGreaterThan(Integer value) {
            addCriterion("ind_donante >", value, "ind_donante");
            return (Criteria) this;
        }
        
        public Criteria andIntIndDonanteGreaterThanOrEqualTo(Integer value) {
            addCriterion("ind_donante >=", value, "ind_donante");
            return (Criteria) this;
        }
        
        public Criteria andIntIndDonanteLessThan(Integer value) {
            addCriterion("ind_donante <", value, "ind_donante");
            return (Criteria) this;
        }
        
        public Criteria andIntIndDonanteLessThanOrEqualTo(Integer value) {
            addCriterion("ind_donante <=", value, "ind_donante");
            return (Criteria) this;
        }
        
        public Criteria andIntIndDonanteIn(List<Integer> values) {
            addCriterion("ind_donante in", values, "ind_donante");
            return (Criteria) this;
        }
        
        public Criteria andIntIndDonanteNotIn(List<Integer> values) {
            addCriterion("ind_donante not in", values, "ind_donante");
            return (Criteria) this;
        }
        
        public Criteria andIntIndDonanteBetween(Integer value1, Integer value2) {
            addCriterion("ind_donante between", value1, value2, "ind_donante");
            return (Criteria) this;
        }
        
        public Criteria andIntIndDonanteNotBetween(Integer value1, Integer value2) {
            addCriterion("ind_donante not between", value1, value2, "ind_donante");
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
        
        
        public Criteria andStrNumCelular2Like(String value) {
            addCriterion("upper(num_celular2) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "num_celular2");
            return (Criteria) this;
        }
        
        public Criteria andStrNumCelular2NotLike(String value) {
            addCriterion("num_celular2 not like", "%" + CadenaUtil.getStr(value) + "%", "num_celular2");
            return (Criteria) this;
        }
        
        public Criteria andStrNumCelular2EqualTo(String value) {
            addCriterion("num_celular2 =", CadenaUtil.getStr(value), "num_celular2");
            return (Criteria) this;
        }
        
        public Criteria andStrNumCelular2NotEqualTo(String value) {
            addCriterion("num_celular2 <>", CadenaUtil.getStr(value), "num_celular2");
            return (Criteria) this;
        }
        
        
        public Criteria andStrNumCelular2IsNull() {
            addCriterion("num_celular2 is null");
            return (Criteria) this;
        }
        
        public Criteria andStrNumCelular2IsNotNull() {
            addCriterion("num_celular2 is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrNumCelular2GreaterThan(String value) {
            addCriterion("num_celular2 >", value, "num_celular2");
            return (Criteria) this;
        }
        
        public Criteria andStrNumCelular2GreaterThanOrEqualTo(String value) {
            addCriterion("num_celular2 >=", value, "num_celular2");
            return (Criteria) this;
        }
        
        public Criteria andStrNumCelular2LessThan(String value) {
            addCriterion("num_celular2 <", value, "num_celular2");
            return (Criteria) this;
        }
        
        public Criteria andStrNumCelular2LessThanOrEqualTo(String value) {
            addCriterion("num_celular2 <=", value, "num_celular2");
            return (Criteria) this;
        }
        
        public Criteria andStrNumCelular2In(List<String> values) {
            addCriterion("num_celular2 in", values, "num_celular2");
            return (Criteria) this;
        }
        
        public Criteria andStrNumCelular2NotIn(List<String> values) {
            addCriterion("num_celular2 not in", values, "num_celular2");
            return (Criteria) this;
        }
        
        public Criteria andStrNumCelular2Between(String value1, String value2) {
            addCriterion("num_celular2 between", value1, value2, "num_celular2");
            return (Criteria) this;
        }
        
        public Criteria andStrNumCelular2NotBetween(String value1, String value2) {
            addCriterion("num_celular2 not between", value1, value2, "num_celular2");
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
        
        
        public Criteria andStrDesCorreoLike(String value) {
            addCriterion("upper(des_correo) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "des_correo");
            return (Criteria) this;
        }
        
        public Criteria andStrDesCorreoNotLike(String value) {
            addCriterion("des_correo not like", "%" + CadenaUtil.getStr(value) + "%", "des_correo");
            return (Criteria) this;
        }
        
        public Criteria andStrDesCorreoEqualTo(String value) {
            addCriterion("des_correo =", CadenaUtil.getStr(value), "des_correo");
            return (Criteria) this;
        }
        
        public Criteria andStrDesCorreoNotEqualTo(String value) {
            addCriterion("des_correo <>", CadenaUtil.getStr(value), "des_correo");
            return (Criteria) this;
        }
        
        
        public Criteria andStrDesCorreoIsNull() {
            addCriterion("des_correo is null");
            return (Criteria) this;
        }
        
        public Criteria andStrDesCorreoIsNotNull() {
            addCriterion("des_correo is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrDesCorreoGreaterThan(String value) {
            addCriterion("des_correo >", value, "des_correo");
            return (Criteria) this;
        }
        
        public Criteria andStrDesCorreoGreaterThanOrEqualTo(String value) {
            addCriterion("des_correo >=", value, "des_correo");
            return (Criteria) this;
        }
        
        public Criteria andStrDesCorreoLessThan(String value) {
            addCriterion("des_correo <", value, "des_correo");
            return (Criteria) this;
        }
        
        public Criteria andStrDesCorreoLessThanOrEqualTo(String value) {
            addCriterion("des_correo <=", value, "des_correo");
            return (Criteria) this;
        }
        
        public Criteria andStrDesCorreoIn(List<String> values) {
            addCriterion("des_correo in", values, "des_correo");
            return (Criteria) this;
        }
        
        public Criteria andStrDesCorreoNotIn(List<String> values) {
            addCriterion("des_correo not in", values, "des_correo");
            return (Criteria) this;
        }
        
        public Criteria andStrDesCorreoBetween(String value1, String value2) {
            addCriterion("des_correo between", value1, value2, "des_correo");
            return (Criteria) this;
        }
        
        public Criteria andStrDesCorreoNotBetween(String value1, String value2) {
            addCriterion("des_correo not between", value1, value2, "des_correo");
            return (Criteria) this;
        }
        
        
        public Criteria andStrDesDireccionLike(String value) {
            addCriterion("upper(des_direccion) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "des_direccion");
            return (Criteria) this;
        }
        
        public Criteria andStrDesDireccionNotLike(String value) {
            addCriterion("des_direccion not like", "%" + CadenaUtil.getStr(value) + "%", "des_direccion");
            return (Criteria) this;
        }
        
        public Criteria andStrDesDireccionEqualTo(String value) {
            addCriterion("des_direccion =", CadenaUtil.getStr(value), "des_direccion");
            return (Criteria) this;
        }
        
        public Criteria andStrDesDireccionNotEqualTo(String value) {
            addCriterion("des_direccion <>", CadenaUtil.getStr(value), "des_direccion");
            return (Criteria) this;
        }
        
        
        public Criteria andStrDesDireccionIsNull() {
            addCriterion("des_direccion is null");
            return (Criteria) this;
        }
        
        public Criteria andStrDesDireccionIsNotNull() {
            addCriterion("des_direccion is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrDesDireccionGreaterThan(String value) {
            addCriterion("des_direccion >", value, "des_direccion");
            return (Criteria) this;
        }
        
        public Criteria andStrDesDireccionGreaterThanOrEqualTo(String value) {
            addCriterion("des_direccion >=", value, "des_direccion");
            return (Criteria) this;
        }
        
        public Criteria andStrDesDireccionLessThan(String value) {
            addCriterion("des_direccion <", value, "des_direccion");
            return (Criteria) this;
        }
        
        public Criteria andStrDesDireccionLessThanOrEqualTo(String value) {
            addCriterion("des_direccion <=", value, "des_direccion");
            return (Criteria) this;
        }
        
        public Criteria andStrDesDireccionIn(List<String> values) {
            addCriterion("des_direccion in", values, "des_direccion");
            return (Criteria) this;
        }
        
        public Criteria andStrDesDireccionNotIn(List<String> values) {
            addCriterion("des_direccion not in", values, "des_direccion");
            return (Criteria) this;
        }
        
        public Criteria andStrDesDireccionBetween(String value1, String value2) {
            addCriterion("des_direccion between", value1, value2, "des_direccion");
            return (Criteria) this;
        }
        
        public Criteria andStrDesDireccionNotBetween(String value1, String value2) {
            addCriterion("des_direccion not between", value1, value2, "des_direccion");
            return (Criteria) this;
        }
        
        
        public Criteria andIntCntPuntosEqualTo(Integer value) {
            addCriterion("cnt_puntos =", value, "cnt_puntos");
            return (Criteria) this;
        }
        
        public Criteria andIntCntPuntosNotEqualTo(Integer value) {
            addCriterion("cnt_puntos <>", value, "cnt_puntos");
            return (Criteria) this;
        }
        
        
        public Criteria andIntCntPuntosIsNull() {
            addCriterion("cnt_puntos is null");
            return (Criteria) this;
        }
        
        public Criteria andIntCntPuntosIsNotNull() {
            addCriterion("cnt_puntos is not null");
            return (Criteria) this;
        }
        
        public Criteria andIntCntPuntosGreaterThan(Integer value) {
            addCriterion("cnt_puntos >", value, "cnt_puntos");
            return (Criteria) this;
        }
        
        public Criteria andIntCntPuntosGreaterThanOrEqualTo(Integer value) {
            addCriterion("cnt_puntos >=", value, "cnt_puntos");
            return (Criteria) this;
        }
        
        public Criteria andIntCntPuntosLessThan(Integer value) {
            addCriterion("cnt_puntos <", value, "cnt_puntos");
            return (Criteria) this;
        }
        
        public Criteria andIntCntPuntosLessThanOrEqualTo(Integer value) {
            addCriterion("cnt_puntos <=", value, "cnt_puntos");
            return (Criteria) this;
        }
        
        public Criteria andIntCntPuntosIn(List<Integer> values) {
            addCriterion("cnt_puntos in", values, "cnt_puntos");
            return (Criteria) this;
        }
        
        public Criteria andIntCntPuntosNotIn(List<Integer> values) {
            addCriterion("cnt_puntos not in", values, "cnt_puntos");
            return (Criteria) this;
        }
        
        public Criteria andIntCntPuntosBetween(Integer value1, Integer value2) {
            addCriterion("cnt_puntos between", value1, value2, "cnt_puntos");
            return (Criteria) this;
        }
        
        public Criteria andIntCntPuntosNotBetween(Integer value1, Integer value2) {
            addCriterion("cnt_puntos not between", value1, value2, "cnt_puntos");
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

        public Criteria andStrIndActivoEqualTo(String value) {
            addCriterion("ind_activo =", value, "ind_activo");
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
