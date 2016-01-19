package by.bsu.staspetrovich.repository;

import by.bsu.staspetrovich.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
