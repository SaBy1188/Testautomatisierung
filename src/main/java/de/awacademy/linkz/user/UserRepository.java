package de.awacademy.linkz.user;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
   User findByUsernameIgnoreCase(String username);

   boolean existsByUsernameIgnoreCase(String username);
}