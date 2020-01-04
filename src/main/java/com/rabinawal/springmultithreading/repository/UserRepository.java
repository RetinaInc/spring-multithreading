package com.rabinawal.springmultithreading.repository;

import com.rabinawal.springmultithreading.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
