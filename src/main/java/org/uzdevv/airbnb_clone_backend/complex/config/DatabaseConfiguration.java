package org.uzdevv.airbnb_clone_backend.complex.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories({"org.uzdevv.airbnb_clone_backend.user.repository"})
@EnableTransactionManagement
@EnableJpaAuditing
public class DatabaseConfiguration {
}
