package dao;

import java.time.LocalDate;
import java.util.List;

import persistence.SaledItems;

public interface SalesdItemsDao {
	List<SaledItems> findItemBySalesDate(LocalDate date);
}	
