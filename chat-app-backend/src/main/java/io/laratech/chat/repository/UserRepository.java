package io.laratech.chat.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.laratech.chat.model.User;

@Repository
public interface UserRepository  extends JpaRepository<User, String> {
}
