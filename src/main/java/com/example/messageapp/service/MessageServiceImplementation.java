package com.example.messageapp.service;

import com.example.messageapp.entity.Message;
import com.example.messageapp.repository.MessageRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageServiceImplementation implements MessageService {
    private final MessageRepository messageRepository;

    @Override
    public List<Message> getAllMessages() {
        return messageRepository.findAll();
    }

    @Override
    public List<Message> getAllMessagesByUserName(String senderName) {
        return messageRepository.findAllBySenderNameIgnoreCase(senderName);
    }

    @Override
    public void saveMessage(Message message) {
        messageRepository.save(message);
    }

    public MessageServiceImplementation(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }
}
