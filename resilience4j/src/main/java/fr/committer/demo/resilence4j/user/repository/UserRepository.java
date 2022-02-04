package fr.committer.demo.resilence4j.user.repository;

import fr.committer.demo.resilence4j.user.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
}
