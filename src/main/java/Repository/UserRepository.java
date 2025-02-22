package Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import Model.User;

public interface UserRepository extends MongoRepository<User, String> {

}
