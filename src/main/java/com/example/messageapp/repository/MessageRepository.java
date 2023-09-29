package com.example.messageapp.repository;

import com.example.messageapp.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MessageRepository extends JpaRepository<Message, Integer> {
    List<Message> findAllBySenderNameIgnoreCase(String senderName);
}
