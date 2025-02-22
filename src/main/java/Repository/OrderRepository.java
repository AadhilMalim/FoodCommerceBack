package Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import Model.Order;

public interface OrderRepository extends MongoRepository<Order, String>{

}
