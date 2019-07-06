package com.penance.pfinance.repositories;

import com.penance.pfinance.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AppUserRepository extends JpaRepository<AppUser, Long> {
    Optional<AppUser> findById(Long id);
}
