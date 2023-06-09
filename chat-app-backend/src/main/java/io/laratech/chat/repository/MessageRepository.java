package io.laratech.chat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.laratech.chat.model.Message;

@Repository
public interface MessageRepository extends JpaRepository<Message, Integer> {
}
