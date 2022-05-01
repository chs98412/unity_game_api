package game_pangpang.pangpang.repository;

import game_pangpang.pangpang.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {
}