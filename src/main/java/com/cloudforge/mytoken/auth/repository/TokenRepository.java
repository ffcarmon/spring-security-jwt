package com.cloudforge.mytoken.auth.repository;

import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface TokenRepository extends CrudRepository<Token, Long> {
    List<Token> findAllValidIsFalseOrRevokedIsFalseByUserId(Long id);

    Optional<Token> findByToken(String jwtToken);
}
