package org.r4z0r.game_lobby_server.DAOs;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import java.io.Serializable;
import java.util.List;

public abstract class AbstractDAO<T, ID extends Serializable> {
    private Class<T> persistentClass;

    @PersistenceContext
    protected EntityManager entityManager;

    public AbstractDAO(Class<T> persistentClass) {
        this.persistentClass = persistentClass;
    }

    public T findById(ID id) {
        return entityManager.find(persistentClass, id);
    }

    public List<T> findAll() {
        return entityManager.createQuery("from " + persistentClass.getName(), persistentClass).getResultList();
    }

    public T save(T entity) {
        entityManager.persist(entity);
        return entity;
    }

    public T update(T entity) {
        return entityManager.merge(entity);
    }

    public void delete(T entity) {
        entityManager.remove(entityManager.contains(entity) ? entity : entityManager.merge(entity));
    }

    public void deleteById(ID id) {
        T entity = findById(id);
        if (entity != null) {
            delete(entity);
        }
    }
}
