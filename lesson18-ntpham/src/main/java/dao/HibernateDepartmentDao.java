package dao;

import java.util.List;

import org.hibernate.transform.Transformers;
import org.hibernate.type.IntegerType;
import org.hibernate.type.StringType;

import persistence.DepartmentDto;
import persistence.DepartmentHighestBudgetDto;

public class HibernateDepartmentDao extends AbstractHibernateDao implements DepartmentDao{
	private static final String Q_GET_LIST_TOTAL_BUDGET_OF_DEPARTMENT_IN_2020 = 
			" SELECT dp.dept_name" + DepartmentDto.DEPT_NAME + ",\n"
			+ "		GROUP_CONCAT(CONCAT(pr.pro_name, ' ' , pr.budget) SEPARATOR ',')" + DepartmentDto.PROJECT_DETAILS + ",\n"
			+ "		SUM(pr.budget)" + DepartmentDto.BUDGET + "\n"
			+ " FROM project pr\n"
			+ " JOIN department dp\n"
			+ " ON pr.dept_id = dp.dept_id\n"
			+ " GROUP BY dp.dept_id";
	
	private static final String Q_GET_DEPARTMENT_HAS_HIGHEST_BUDGET_IN_2020 = 
			"SELECT dp.dept_name," + DepartmentHighestBudgetDto.DEPT_NAME + "\n"
			+ "pr.pro_name," + DepartmentHighestBudgetDto.PRO_NAME + "\n"
			+ "MAX(pr.budget)" + DepartmentHighestBudgetDto.BUDGET + "\n"
			+ "FROM department dp\n"
			+ "JOIN project pr\n"
			+ "ON dp.dept_id = pr.dept_id\n"
			+ "JOIN project_employee pr_emp\n"
			+ "ON pr_emp.pro_id = pr.pro_id\n"
			+ "WHERE YEAR(pr_emp.start_date) = 2021";
	
	@SuppressWarnings({ "unchecked", "deprecation" })
	@Override
	public List<DepartmentDto> getTotalBudgetIn2020() {
		return openSession()
				.createNativeQuery(Q_GET_LIST_TOTAL_BUDGET_OF_DEPARTMENT_IN_2020)
				.addScalar(DepartmentDto.DEPT_NAME, StringType.INSTANCE)
				.addScalar(DepartmentDto.PROJECT_DETAILS, StringType.INSTANCE)
				.addScalar(DepartmentDto.BUDGET, IntegerType.INSTANCE)
				.setResultTransformer(Transformers.aliasToBean(DepartmentDto.class))
				.getResultList();
	}
	
	@SuppressWarnings("deprecation")
	@Override
	public DepartmentHighestBudgetDto getDepartmentHasHighestBudgetIn2020() {
		return (DepartmentHighestBudgetDto) openSession()
				.createNativeQuery(Q_GET_DEPARTMENT_HAS_HIGHEST_BUDGET_IN_2020)
				.addScalar(DepartmentHighestBudgetDto.DEPT_NAME, StringType.INSTANCE)
				.addScalar(DepartmentHighestBudgetDto.PRO_NAME, StringType.INSTANCE)
				.addScalar(DepartmentHighestBudgetDto.BUDGET, IntegerType.INSTANCE)
				.setResultTransformer(Transformers.aliasToBean(DepartmentHighestBudgetDto.class))
				.getSingleResult();
	}
}
