package Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import Model.Restaurant;

public interface RestaurantRepository extends MongoRepository<Restaurant, String>{

}
