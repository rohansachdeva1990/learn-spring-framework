package org.rohan.restfulservice.messagetestapp.service;

import java.util.Collection;

import org.rohan.restfulservice.messagetestapp.model.ModelItf;

/**
 * 
 * This ServiceItf interface provides the interface to implemented by future 
 * model objects.
 * 
 * @author rohan
 *
 * @param <T>
 */
public interface ServiceItf<T extends ModelItf> {

    Collection<T> getAll();

    T get(long id);

    T create(T greeting);

    T update(T greeting);

    boolean delete(long id);
}
