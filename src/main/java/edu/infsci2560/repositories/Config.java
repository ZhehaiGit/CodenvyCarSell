package edu.infsci2560.repositories;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.EntityManagerFactoryInfo;

@Configurable
@EnableJpaRepositories("com.acme.repositories")
class Config {

  @Bean
  public EntityManagerFactoryInfo entityManagerFactory() {
    return null;
  }
}
