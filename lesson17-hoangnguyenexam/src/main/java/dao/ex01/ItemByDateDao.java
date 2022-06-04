package dao.ex01;

import java.time.LocalDate;
import java.util.List;

import persistence.ItemByDate;

public interface ItemByDateDao {
	List<ItemByDate> getItemsByDate(LocalDate date);
}
