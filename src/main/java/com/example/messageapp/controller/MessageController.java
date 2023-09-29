package com.example.messageapp.controller;

import com.example.messageapp.entity.Message;
import com.example.messageapp.service.MessageService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class MessageController {

    private final MessageService messageService;


    @GetMapping("/messages")
    public String getAllMessages(Model model) {
        List<Message> allMessagesList = messageService.getAllMessages();
        model.addAttribute("allMessagesList", allMessagesList);
        return "messages";
    }

    @GetMapping("/messages/{senderName}")
    public String getAllMessagesBySenderName(@PathVariable String senderName, Model model){
        List<Message> allMessagesBySenderName = messageService.getAllMessagesByUserName(senderName);
        model.addAttribute("allMessagesBySenderName", allMessagesBySenderName);
        return "messages";
    }

    @GetMapping("/messages/add")
    public String showAddForm(Model model) {
        model.addAttribute("newMessage", new Message());
        return "addForm";
    }

    @PostMapping("/messages/add")
    public String saveMessage(@ModelAttribute("newMessage") Message message) {
        messageService.saveMessage(message);
        return "redirect:/messages";
    }

    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }
}
