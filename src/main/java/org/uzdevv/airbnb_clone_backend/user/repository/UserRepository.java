package org.uzdevv.airbnb_clone_backend.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.uzdevv.airbnb_clone_backend.user.domain.User;

import java.util.Optional;
import java.util.UUID;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);
    Optional<User> findByPublicId(UUID publicId);
}
