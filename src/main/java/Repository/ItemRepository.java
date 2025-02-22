package Repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import Model.Item;

@Repository
public interface ItemRepository extends MongoRepository<Item, String>{
	List<Item> findByResId(String resId);
}
