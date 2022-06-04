package service;

import java.time.LocalDate;
import java.util.List;

import persistence.SaledItems;

public interface SaledItemsService {
	List<SaledItems> findItemBySalesDate(LocalDate date);
}
