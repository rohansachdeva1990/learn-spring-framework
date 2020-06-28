package org.rohan.restfulservice.messagetestapp.service;

import java.util.Collection;

import org.rohan.restfulservice.messagetestapp.model.impl.Message;

/**
 * 
 * The MessageService interface defines the business logic for modelling
 * Message.
 * 
 * @author rohan
 *
 */
public interface MessageService extends ServiceItf<Message> {

    Collection<Message> getAll();

    Message get(long id);

    Message create(Message message);

    Message update(Message message);

    boolean delete(long id);
}
