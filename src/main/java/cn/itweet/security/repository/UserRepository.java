package cn.itweet.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import cn.itweet.model.security.User;

/**
 * Created by whoami on 20.11.16.
 */
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
