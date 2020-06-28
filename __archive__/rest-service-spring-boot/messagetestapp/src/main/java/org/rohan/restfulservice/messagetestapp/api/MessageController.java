package org.rohan.restfulservice.messagetestapp.api;

import java.util.Collection;

import org.rohan.restfulservice.messagetestapp.model.impl.Message;
import org.rohan.restfulservice.messagetestapp.service.MessageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * The MessageController class is a web service controller. The "RestController"
 * informs spring to convert the data returned from {@link MessageController} to
 * JSON or XML Response with an associated HTTP Code.
 * 
 * @author rohan
 */
@RestController()
public class MessageController {

    private final Logger logger = LoggerFactory.getLogger(MessageController.class);

    @Autowired
    private MessageService messageService;

    @RequestMapping(value = "/api/messages", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Collection<Message>> getMessages() {
        if (logger.isDebugEnabled()) {
            logger.debug("Fetching all the message records...");
        }

        Collection<Message> messages = messageService.getAll();

        if (logger.isInfoEnabled()) {
            logger.info("Fetched all the message records successfully.");
        }

        return new ResponseEntity<Collection<Message>>(messages, HttpStatus.OK);
    }

    @RequestMapping(value = "/api/messages/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Message> getMessage(@PathVariable("id") long id) {

        if (logger.isDebugEnabled()) {
            logger.debug("Fetching message record for id: " + id + "...");
        }

        logger.info("Fetching message record for id: " + id);
        Message message = messageService.get(id);
        if (null == message) {
            logger.warn("Failed to fetch... no message exists for id: " + id);
            return new ResponseEntity<Message>(HttpStatus.NOT_FOUND);
        }

        if (logger.isInfoEnabled()) {
            logger.info("Fetched message record for id: " + id + " successfully.");
        }
        return new ResponseEntity<Message>(message, HttpStatus.OK);
    }

    @RequestMapping(value = "/api/messages", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Message> createMessage(@RequestBody Message message) {

        if (logger.isDebugEnabled()) {
            logger.debug("Creating message record for message id: " + message.getId() + " and message text: " + message.getText());
        }

        Message savedMessage = messageService.create(message);

        if (logger.isInfoEnabled()) {
            logger.info("Created message record for message id: " + message.getId() + " and message text: " + message.getText() + " successfully.");
        }

        return new ResponseEntity<Message>(savedMessage, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/api/messages", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Message> updateMessage(@RequestBody Message message) {

        if (logger.isDebugEnabled()) {
            logger.debug("Updating message record for message id: " + message.getId() + " and message text: " + message.getText() + "...");
        }

        Message updatedMessage = messageService.update(message);
        if (null == updatedMessage) {
            logger.warn("Failed to update.. something went wrong with the server");
            return new ResponseEntity<Message>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

        if (logger.isInfoEnabled()) {
            logger.info("Updated message record for message id: " + message.getId() + " and message text: " + message.getText() + " successfully.");
        }

        return new ResponseEntity<Message>(updatedMessage, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/api/messages/{id}", method = RequestMethod.DELETE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Message> deleteMessage(@PathVariable("id") long id, @RequestBody Message message) {

        if (logger.isDebugEnabled()) {
            logger.debug("deleting message record for message id: " + id + "...");
        }

        boolean deleted = messageService.delete(id);
        if (!deleted) {
            logger.warn("Failed to delete.. something went wrong with the server");
            return new ResponseEntity<Message>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

        if (logger.isInfoEnabled()) {
            logger.info("Deleted message record for message id: " + id + " successfully.");
        }
        return new ResponseEntity<Message>(HttpStatus.NO_CONTENT);
    }
}
