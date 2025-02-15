package com.example.UnderTheSea_Server.jwt;

import com.example.UnderTheSea_Server.domain.User;
import com.example.UnderTheSea_Server.domain.UserStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RefreshTokenRepository extends JpaRepository<RefreshToken, Long> {
    Optional<RefreshToken> findByRefreshToken(String refreshToken);
//    boolean existsByKeyId(String userId);
//    void deleteByKeyId(String userId);
}