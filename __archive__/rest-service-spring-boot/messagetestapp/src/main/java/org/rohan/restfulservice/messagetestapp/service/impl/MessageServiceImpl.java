package org.rohan.restfulservice.messagetestapp.service.impl;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.rohan.restfulservice.messagetestapp.model.impl.Message;
import org.rohan.restfulservice.messagetestapp.service.MessageService;
import org.springframework.stereotype.Service;

/**
 * 
 * The MessageServiceImpl class provides the business logic implementation. For now the
 * data is being managed by some temporary collection. At the time of actual implementation 
 * with the database, we can replace this with the database service operations using JPA.
 * 
 * @author rohan
 *
 */
@Service
public class MessageServiceImpl implements MessageService {

    /**
     * Temporary work around to generate dummy data.
     */
    private static long nextId = 1;
    private static Map<Long, Message> messageMap = new HashMap<Long, Message>();
    static {
        save(new Message("This is message 1 !!"));
        save(new Message("This is message 2 !!"));
    }

    @Override
    public Collection<Message> getAll() {
        return messageMap.values();
    }

    @Override
    public Message get(long id) {
        return messageMap.get(id);
    }

    @Override
    public Message create(Message message) {
        return save(message);
    }

    @Override
    public Message update(Message message) {
        return edit(message);
    }

    @Override
    public boolean delete(long id) {
        return remove(id);
    }

    // ---------------------------- Helper Methods

    private static Message save(Message message) {
        message.setId(nextId);
        nextId++;
        messageMap.put(message.getId(), message);
        return message;
    }

    private static Message edit(Message message) {
        Message editedMessage = null;
        long idToBeUpdated = message.getId();
        if (1 <= idToBeUpdated) {
            Message oldMessage = messageMap.get(idToBeUpdated);
            if (null != oldMessage) {
                messageMap.put(idToBeUpdated, message);
                editedMessage = message;
            }
        }
        else {
            editedMessage = save(message);
        }
        return editedMessage;
    }

    private static boolean remove(long id) {
        Message deletedMessage = messageMap.remove(id);
        return (null != deletedMessage) ? true : false;
    }
}
