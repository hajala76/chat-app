package io.laratech.chat.service;

import java.util.HashSet;
import java.util.List;

import io.laratech.chat.exceptions.ChatAlreadyExistException;
import io.laratech.chat.exceptions.ChatNotFoundException;
import io.laratech.chat.exceptions.NoChatExistsInTheRepository;
import io.laratech.chat.model.Chat;
import io.laratech.chat.model.Message;

public interface ChatService {

    public Chat addChat(Chat chat) throws ChatAlreadyExistException;

    List<Chat> findallchats() throws NoChatExistsInTheRepository;

    Chat getById(int id)  throws ChatNotFoundException;

    HashSet<Chat> getChatByFirstUserName(String username)  throws ChatNotFoundException;

    HashSet<Chat> getChatBySecondUserName(String username)  throws ChatNotFoundException;

    HashSet<Chat> getChatByFirstUserNameOrSecondUserName(String username)  throws ChatNotFoundException;

    HashSet<Chat> getChatByFirstUserNameAndSecondUserName(String firstUserName, String secondUserName)  throws ChatNotFoundException;

    Chat addMessage(Message add, int chatId)  throws ChatNotFoundException;

    Message addMessage2(Message message);

    List<Message> getAllMessagesInChat(int chatId) throws NoChatExistsInTheRepository;
}
