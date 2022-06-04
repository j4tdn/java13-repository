package service;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

import dao.JdbcSaledItemsDao;
import dao.SalesdItemsDao;
import persistence.SaledItems;

public class SaledItemServiceImpl implements SaledItemsService {

	private SalesdItemsDao salesdItemsDao;
	public SaledItemServiceImpl() {
		salesdItemsDao = new JdbcSaledItemsDao();
	}
	
	public List<SaledItems> findItemBySalesDate(LocalDate date) {
		Objects.requireNonNull(date, "Sale Date cannot be NULL");
		return salesdItemsDao.findItemBySalesDate(date);
	}
}
