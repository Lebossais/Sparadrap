package DAO;

import Configuration.SQL.Singleton;

import java.sql.Connection;
import java.util.List;

public abstract class DAO<T> {

    protected Connection connect = Singleton.getInstanceDB();

    /**
     * Méthode de création d'un Objet T
     * @param obj
     * @return Validation de la création
     */
    public abstract boolean create(T obj);

    /**
     * Méthode de suppression d'un Objet t
     * @param obj
     * @return validation de la suppression
     */
    public abstract boolean delete(T obj);

    /**
     * Méthode de Mise à Jour d'un Objet T
     * @param obj
     * @return validation de la Mise à Jour
     */
    public abstract boolean update(T obj);

    /**
     * Méthode de recherche spécifique d'un objet T
     * @param pId
     * @return l'objet T recherché
     */
    public abstract T find(Integer pId);

    /**
     * Méthode de recherche de tous les objet T
     * @return liste de tous les objets T
     */
    public abstract List<T> findALL();
}
