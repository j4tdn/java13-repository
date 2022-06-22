package dao;

import java.util.List;
import java.util.Optional;

import persistence.Item;

public interface ItemDao {
	List<Item> getAll();
	
	// opt 1
	Optional<Item> get(int id);
	
	// opt 2
	Optional<Item> find(int id);
	
	void firstLevelCache();
}
