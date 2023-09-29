package com.example.messageapp.service;

import com.example.messageapp.entity.Message;

import java.util.List;

public interface MessageService {

    List<Message> getAllMessages();

    List<Message> getAllMessagesByUserName(String userName);

    void saveMessage(Message message);
}
