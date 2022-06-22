package service;

import java.util.List;
import java.util.Optional;

import persistence.Item;

public interface ItemService {
	List<Item> getAll();
	
	Optional<Item> get(int id);
	
	void demoHibernate1stLevelCache();
}
