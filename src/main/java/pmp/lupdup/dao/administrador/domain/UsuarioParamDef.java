package pmp.lupdup.dao.administrador.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

import pmp.lupdup.dao.donantes.domain.DonanteParamDef.Criteria;
import pmp.lupdup.general.util.CadenaUtil;

public class UsuarioParamDef {
	
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;
    
    public UsuarioParamDef() {
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
        
                
        
        public Criteria andSrlIdUsuarioEqualTo(Integer value) {
            addCriterion("id_usuario =", value, "id_usuario");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdUsuarioNotEqualTo(Integer value) {
            addCriterion("id_usuario <>", value, "id_usuario");
            return (Criteria) this;
        }
        
        
        public Criteria andSrlIdUsuarioIsNull() {
            addCriterion("id_usuario is null");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdUsuarioIsNotNull() {
            addCriterion("id_usuario is not null");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdUsuarioGreaterThan(Integer value) {
            addCriterion("id_usuario >", value, "id_usuario");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdUsuarioGreaterThanOrEqualTo(Integer value) {
            addCriterion("id_usuario >=", value, "id_usuario");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdUsuarioLessThan(Integer value) {
            addCriterion("id_usuario <", value, "id_usuario");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdUsuarioLessThanOrEqualTo(Integer value) {
            addCriterion("id_usuario <=", value, "id_usuario");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdUsuarioIn(List<Integer> values) {
            addCriterion("id_usuario in", values, "id_usuario");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdUsuarioNotIn(List<Integer> values) {
            addCriterion("id_usuario not in", values, "id_usuario");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdUsuarioBetween(Integer value1, Integer value2) {
            addCriterion("id_usuario between", value1, value2, "id_usuario");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdUsuarioNotBetween(Integer value1, Integer value2) {
            addCriterion("id_usuario not between", value1, value2, "id_usuario");
            return (Criteria) this;
        }
        
        
        public Criteria andIntIdDonanteEqualTo(Integer value) {
            addCriterion("id_perfil =", value, "id_perfil");
            return (Criteria) this;
        }
        
        public Criteria andIntIdDonanteNotEqualTo(Integer value) {
            addCriterion("id_perfil <>", value, "id_perfil");
            return (Criteria) this;
        }
        
        
        public Criteria andIntIdDonanteIsNull() {
            addCriterion("id_perfil is null");
            return (Criteria) this;
        }
        
        public Criteria andIntIdDonanteIsNotNull() {
            addCriterion("id_perfil is not null");
            return (Criteria) this;
        }
        
        public Criteria andIntIdDonanteGreaterThan(Integer value) {
            addCriterion("id_perfil >", value, "id_perfil");
            return (Criteria) this;
        }
        
        public Criteria andIntIdDonanteGreaterThanOrEqualTo(Integer value) {
            addCriterion("id_perfil >=", value, "id_perfil");
            return (Criteria) this;
        }
        
        public Criteria andIntIdDonanteLessThan(Integer value) {
            addCriterion("id_perfil <", value, "id_perfil");
            return (Criteria) this;
        }
        
        public Criteria andIntIdDonanteLessThanOrEqualTo(Integer value) {
            addCriterion("id_perfil <=", value, "id_perfil");
            return (Criteria) this;
        }
        
        public Criteria andIntIdDonanteIn(List<Integer> values) {
            addCriterion("id_perfil in", values, "id_perfil");
            return (Criteria) this;
        }
        
        public Criteria andIntIdDonanteNotIn(List<Integer> values) {
            addCriterion("id_perfil not in", values, "id_perfil");
            return (Criteria) this;
        }
        
        public Criteria andIntIdDonanteBetween(Integer value1, Integer value2) {
            addCriterion("id_perfil between", value1, value2, "id_perfil");
            return (Criteria) this;
        }
        
        public Criteria andIntIdDonanteNotBetween(Integer value1, Integer value2) {
            addCriterion("id_perfil not between", value1, value2, "id_perfil");
            return (Criteria) this;
        }
        
        
        public Criteria andIntIdPerfilEqualTo(Integer value) {
            addCriterion("id_perfil =", value, "id_perfil");
            return (Criteria) this;
        }
        
        public Criteria andIntIdPerfilNotEqualTo(Integer value) {
            addCriterion("id_perfil <>", value, "id_perfil");
            return (Criteria) this;
        }
        
        
        public Criteria andIntIdPerfilIsNull() {
            addCriterion("id_perfil is null");
            return (Criteria) this;
        }
        
        public Criteria andIntIdPerfilIsNotNull() {
            addCriterion("id_perfil is not null");
            return (Criteria) this;
        }
        
        public Criteria andIntIdPerfilGreaterThan(Integer value) {
            addCriterion("id_perfil >", value, "id_perfil");
            return (Criteria) this;
        }
        
        public Criteria andIntIdPerfilGreaterThanOrEqualTo(Integer value) {
            addCriterion("id_perfil >=", value, "id_perfil");
            return (Criteria) this;
        }
        
        public Criteria andIntIdPerfilLessThan(Integer value) {
            addCriterion("id_perfil <", value, "id_perfil");
            return (Criteria) this;
        }
        
        public Criteria andIntIdPerfilLessThanOrEqualTo(Integer value) {
            addCriterion("id_perfil <=", value, "id_perfil");
            return (Criteria) this;
        }
        
        public Criteria andIntIdPerfilIn(List<Integer> values) {
            addCriterion("id_perfil in", values, "id_perfil");
            return (Criteria) this;
        }
        
        public Criteria andIntIdPerfilNotIn(List<Integer> values) {
            addCriterion("id_perfil not in", values, "id_perfil");
            return (Criteria) this;
        }
        
        public Criteria andIntIdPerfilBetween(Integer value1, Integer value2) {
            addCriterion("id_perfil between", value1, value2, "id_perfil");
            return (Criteria) this;
        }
        
        public Criteria andIntIdPerfilNotBetween(Integer value1, Integer value2) {
            addCriterion("id_perfil not between", value1, value2, "id_perfil");
            return (Criteria) this;
        }
        
        
        public Criteria andStrNomUsuarioLike(String value) {
            addCriterion("upper(nom_usuario) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "nom_usuario");
            return (Criteria) this;
        }
        
        public Criteria andStrNomUsuarioNotLike(String value) {
            addCriterion("nom_usuario not like", "%" + CadenaUtil.getStr(value) + "%", "nom_usuario");
            return (Criteria) this;
        }
        
        public Criteria andStrNomUsuarioEqualTo(String value) {
            addCriterion("nom_usuario =", CadenaUtil.getStr(value), "nom_usuario");
            return (Criteria) this;
        }
        
        public Criteria andStrNomUsuarioNotEqualTo(String value) {
            addCriterion("nom_usuario <>", CadenaUtil.getStr(value), "nom_usuario");
            return (Criteria) this;
        }
        
        
        public Criteria andStrNomUsuarioIsNull() {
            addCriterion("nom_usuario is null");
            return (Criteria) this;
        }
        
        public Criteria andStrNomUsuarioIsNotNull() {
            addCriterion("nom_usuario is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrNomUsuarioGreaterThan(String value) {
            addCriterion("nom_usuario >", value, "nom_usuario");
            return (Criteria) this;
        }
        
        public Criteria andStrNomUsuarioGreaterThanOrEqualTo(String value) {
            addCriterion("nom_usuario >=", value, "nom_usuario");
            return (Criteria) this;
        }
        
        public Criteria andStrNomUsuarioLessThan(String value) {
            addCriterion("nom_usuario <", value, "nom_usuario");
            return (Criteria) this;
        }
        
        public Criteria andStrNomUsuarioLessThanOrEqualTo(String value) {
            addCriterion("nom_usuario <=", value, "nom_usuario");
            return (Criteria) this;
        }
        
        public Criteria andStrNomUsuarioIn(List<String> values) {
            addCriterion("nom_usuario in", values, "nom_usuario");
            return (Criteria) this;
        }
        
        public Criteria andStrNomUsuarioNotIn(List<String> values) {
            addCriterion("nom_usuario not in", values, "nom_usuario");
            return (Criteria) this;
        }
        
        public Criteria andStrNomUsuarioBetween(String value1, String value2) {
            addCriterion("nom_usuario between", value1, value2, "nom_usuario");
            return (Criteria) this;
        }
        
        public Criteria andStrNomUsuarioNotBetween(String value1, String value2) {
            addCriterion("nom_usuario not between", value1, value2, "nom_usuario");
            return (Criteria) this;
        }
        
        
        public Criteria andStrClvUsuarioLike(String value) {
            addCriterion("upper(clv_usuario) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "clv_usuario");
            return (Criteria) this;
        }
        
        public Criteria andStrClvUsuarioNotLike(String value) {
            addCriterion("clv_usuario not like", "%" + CadenaUtil.getStr(value) + "%", "clv_usuario");
            return (Criteria) this;
        }
        
        public Criteria andStrClvUsuarioEqualTo(String value) {
            addCriterion("clv_usuario =", CadenaUtil.getStr(value), "clv_usuario");
            return (Criteria) this;
        }
        
        public Criteria andStrClvUsuarioNotEqualTo(String value) {
            addCriterion("clv_usuario <>", CadenaUtil.getStr(value), "clv_usuario");
            return (Criteria) this;
        }
        
        
        public Criteria andStrClvUsuarioIsNull() {
            addCriterion("clv_usuario is null");
            return (Criteria) this;
        }
        
        public Criteria andStrClvUsuarioIsNotNull() {
            addCriterion("clv_usuario is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrClvUsuarioGreaterThan(String value) {
            addCriterion("clv_usuario >", value, "clv_usuario");
            return (Criteria) this;
        }
        
        public Criteria andStrClvUsuarioGreaterThanOrEqualTo(String value) {
            addCriterion("clv_usuario >=", value, "clv_usuario");
            return (Criteria) this;
        }
        
        public Criteria andStrClvUsuarioLessThan(String value) {
            addCriterion("clv_usuario <", value, "clv_usuario");
            return (Criteria) this;
        }
        
        public Criteria andStrClvUsuarioLessThanOrEqualTo(String value) {
            addCriterion("clv_usuario <=", value, "clv_usuario");
            return (Criteria) this;
        }
        
        public Criteria andStrClvUsuarioIn(List<String> values) {
            addCriterion("clv_usuario in", values, "clv_usuario");
            return (Criteria) this;
        }
        
        public Criteria andStrClvUsuarioNotIn(List<String> values) {
            addCriterion("clv_usuario not in", values, "clv_usuario");
            return (Criteria) this;
        }
        
        public Criteria andStrClvUsuarioBetween(String value1, String value2) {
            addCriterion("clv_usuario between", value1, value2, "clv_usuario");
            return (Criteria) this;
        }
        
        public Criteria andStrClvUsuarioNotBetween(String value1, String value2) {
            addCriterion("clv_usuario not between", value1, value2, "clv_usuario");
            return (Criteria) this;
        }
        
        
        public Criteria andStrNomResponsableLike(String value) {
            addCriterion("upper(nom_responsable) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "nom_responsable");
            return (Criteria) this;
        }
        
        public Criteria andStrNomResponsableNotLike(String value) {
            addCriterion("nom_responsable not like", "%" + CadenaUtil.getStr(value) + "%", "nom_responsable");
            return (Criteria) this;
        }
        
        public Criteria andStrNomResponsableEqualTo(String value) {
            addCriterion("nom_responsable =", CadenaUtil.getStr(value), "nom_responsable");
            return (Criteria) this;
        }
        
        public Criteria andStrNomResponsableNotEqualTo(String value) {
            addCriterion("nom_responsable <>", CadenaUtil.getStr(value), "nom_responsable");
            return (Criteria) this;
        }
        
        
        public Criteria andStrNomResponsableIsNull() {
            addCriterion("nom_responsable is null");
            return (Criteria) this;
        }
        
        public Criteria andStrNomResponsableIsNotNull() {
            addCriterion("nom_responsable is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrNomResponsableGreaterThan(String value) {
            addCriterion("nom_responsable >", value, "nom_responsable");
            return (Criteria) this;
        }
        
        public Criteria andStrNomResponsableGreaterThanOrEqualTo(String value) {
            addCriterion("nom_responsable >=", value, "nom_responsable");
            return (Criteria) this;
        }
        
        public Criteria andStrNomResponsableLessThan(String value) {
            addCriterion("nom_responsable <", value, "nom_responsable");
            return (Criteria) this;
        }
        
        public Criteria andStrNomResponsableLessThanOrEqualTo(String value) {
            addCriterion("nom_responsable <=", value, "nom_responsable");
            return (Criteria) this;
        }
        
        public Criteria andStrNomResponsableIn(List<String> values) {
            addCriterion("nom_responsable in", values, "nom_responsable");
            return (Criteria) this;
        }
        
        public Criteria andStrNomResponsableNotIn(List<String> values) {
            addCriterion("nom_responsable not in", values, "nom_responsable");
            return (Criteria) this;
        }
        
        public Criteria andStrNomResponsableBetween(String value1, String value2) {
            addCriterion("nom_responsable between", value1, value2, "nom_responsable");
            return (Criteria) this;
        }
        
        public Criteria andStrNomResponsableNotBetween(String value1, String value2) {
            addCriterion("nom_responsable not between", value1, value2, "nom_responsable");
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
        
        
        public Criteria andStrDesTelefonoLike(String value) {
            addCriterion("upper(des_telefono) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "des_telefono");
            return (Criteria) this;
        }
        
        public Criteria andStrDesTelefonoNotLike(String value) {
            addCriterion("des_telefono not like", "%" + CadenaUtil.getStr(value) + "%", "des_telefono");
            return (Criteria) this;
        }
        
        public Criteria andStrDesTelefonoEqualTo(String value) {
            addCriterion("des_telefono =", CadenaUtil.getStr(value), "des_telefono");
            return (Criteria) this;
        }
        
        public Criteria andStrDesTelefonoNotEqualTo(String value) {
            addCriterion("des_telefono <>", CadenaUtil.getStr(value), "des_telefono");
            return (Criteria) this;
        }
        
        
        public Criteria andStrDesTelefonoIsNull() {
            addCriterion("des_telefono is null");
            return (Criteria) this;
        }
        
        public Criteria andStrDesTelefonoIsNotNull() {
            addCriterion("des_telefono is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrDesTelefonoGreaterThan(String value) {
            addCriterion("des_telefono >", value, "des_telefono");
            return (Criteria) this;
        }
        
        public Criteria andStrDesTelefonoGreaterThanOrEqualTo(String value) {
            addCriterion("des_telefono >=", value, "des_telefono");
            return (Criteria) this;
        }
        
        public Criteria andStrDesTelefonoLessThan(String value) {
            addCriterion("des_telefono <", value, "des_telefono");
            return (Criteria) this;
        }
        
        public Criteria andStrDesTelefonoLessThanOrEqualTo(String value) {
            addCriterion("des_telefono <=", value, "des_telefono");
            return (Criteria) this;
        }
        
        public Criteria andStrDesTelefonoIn(List<String> values) {
            addCriterion("des_telefono in", values, "des_telefono");
            return (Criteria) this;
        }
        
        public Criteria andStrDesTelefonoNotIn(List<String> values) {
            addCriterion("des_telefono not in", values, "des_telefono");
            return (Criteria) this;
        }
        
        public Criteria andStrDesTelefonoBetween(String value1, String value2) {
            addCriterion("des_telefono between", value1, value2, "des_telefono");
            return (Criteria) this;
        }
        
        public Criteria andStrDesTelefonoNotBetween(String value1, String value2) {
            addCriterion("des_telefono not between", value1, value2, "des_telefono");
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
        
        
        public Criteria andStrDesCelularLike(String value) {
            addCriterion("upper(des_celular) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "des_celular");
            return (Criteria) this;
        }
        
        public Criteria andStrDesCelularNotLike(String value) {
            addCriterion("des_celular not like", "%" + CadenaUtil.getStr(value) + "%", "des_celular");
            return (Criteria) this;
        }
        
        public Criteria andStrDesCelularEqualTo(String value) {
            addCriterion("des_celular =", CadenaUtil.getStr(value), "des_celular");
            return (Criteria) this;
        }
        
        public Criteria andStrDesCelularNotEqualTo(String value) {
            addCriterion("des_celular <>", CadenaUtil.getStr(value), "des_celular");
            return (Criteria) this;
        }
        
        
        public Criteria andStrDesCelularIsNull() {
            addCriterion("des_celular is null");
            return (Criteria) this;
        }
        
        public Criteria andStrDesCelularIsNotNull() {
            addCriterion("des_celular is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrDesCelularGreaterThan(String value) {
            addCriterion("des_celular >", value, "des_celular");
            return (Criteria) this;
        }
        
        public Criteria andStrDesCelularGreaterThanOrEqualTo(String value) {
            addCriterion("des_celular >=", value, "des_celular");
            return (Criteria) this;
        }
        
        public Criteria andStrDesCelularLessThan(String value) {
            addCriterion("des_celular <", value, "des_celular");
            return (Criteria) this;
        }
        
        public Criteria andStrDesCelularLessThanOrEqualTo(String value) {
            addCriterion("des_celular <=", value, "des_celular");
            return (Criteria) this;
        }
        
        public Criteria andStrDesCelularIn(List<String> values) {
            addCriterion("des_celular in", values, "des_celular");
            return (Criteria) this;
        }
        
        public Criteria andStrDesCelularNotIn(List<String> values) {
            addCriterion("des_celular not in", values, "des_celular");
            return (Criteria) this;
        }
        
        public Criteria andStrDesCelularBetween(String value1, String value2) {
            addCriterion("des_celular between", value1, value2, "des_celular");
            return (Criteria) this;
        }
        
        public Criteria andStrDesCelularNotBetween(String value1, String value2) {
            addCriterion("des_celular not between", value1, value2, "des_celular");
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
