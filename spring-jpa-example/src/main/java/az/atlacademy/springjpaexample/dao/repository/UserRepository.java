package az.atlacademy.springjpaexample.dao.repository;

import az.atlacademy.springjpaexample.dao.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

}
