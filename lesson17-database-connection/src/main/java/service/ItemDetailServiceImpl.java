package service;

import dao.ItemDetailDao;
import dao.JdbcItemDetailDao;

public class ItemDetailServiceImpl implements ItemDetailService{

	private ItemDetailDao itemDetailDao;
	
	public ItemDetailServiceImpl() {
		itemDetailDao = new JdbcItemDetailDao();
	}
	
	@Override
	public boolean doTransfer() {
		return itemDetailDao.doTransfer();
	}

}
