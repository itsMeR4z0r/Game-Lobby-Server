package org.r4z0r.game_lobby_server.services;

import org.r4z0r.game_lobby_server.DAOs.AbstractDAO;

import java.io.Serializable;
import java.util.List;

public abstract class AbstractService<T, ID extends Serializable> {

    protected abstract AbstractDAO<T, ID> getDAO();

    public T findById(ID id) {
        return getDAO().findById(id);
    }

    public List<T> findAll() {
        return getDAO().findAll();
    }

    public T save(T entity) {
        return getDAO().save(entity);
    }

    public T update(T entity) {
        return getDAO().update(entity);
    }

    public void delete(T entity) {
        getDAO().delete(entity);
    }

    public void deleteById(ID id) {
        getDAO().deleteById(id);
    }
}