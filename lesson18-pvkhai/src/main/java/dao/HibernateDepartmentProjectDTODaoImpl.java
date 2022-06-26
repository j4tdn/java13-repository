package dao;

import java.util.List;

import org.hibernate.transform.Transformers;
import org.hibernate.type.DoubleType;
import org.hibernate.type.StringType;

import persistences.DepartmentProjectDTO;

public class HibernateDepartmentProjectDTODaoImpl extends AbstractHibernateDao implements DepartmentProjectDTODao{
	
	private static final String Q_Department_Project_GREATETHAN400 = "SELECT d.dept_name AS "+ DepartmentProjectDTO.DEPT_NAME +", \n"
							+ "p.pro_name AS "+ DepartmentProjectDTO.PRO_NAME +", \n"
							+ "p.budget AS "+ DepartmentProjectDTO.BUDGET +" \n"
							+ "FROM project p \n"
							+ "JOIN department d ON d.dept_id = p.dept_id \n"
							+ "WHERE budget > 400";	
	
	
	@SuppressWarnings({ "unchecked", "deprecation" })
	@Override
	public List<DepartmentProjectDTO> getProjectGreaterThan400() {
		return openSession().createNativeQuery(Q_Department_Project_GREATETHAN400)
			.addScalar(DepartmentProjectDTO.DEPT_NAME, StringType.INSTANCE)
			.addScalar(DepartmentProjectDTO.PRO_NAME, StringType.INSTANCE)
			.addScalar(DepartmentProjectDTO.BUDGET, DoubleType.INSTANCE)
			.setResultTransformer(Transformers.aliasToBean(DepartmentProjectDTO.class))
			.getResultList();
	}
	
	@SuppressWarnings({ "unchecked", "deprecation" })
	@Override
	public List<DepartmentProjectDTO> getProjectHighestBudget(int year) {
		String SQL = "SELECT d.dept_name AS "+ DepartmentProjectDTO.DEPT_NAME +",\r\n"
				+ "p.pro_name AS "+ DepartmentProjectDTO.PRO_NAME + ",\r\n"
				+ "p.budget AS "+ DepartmentProjectDTO.BUDGET +"\r\n"
				+ "FROM project p\r\n"
				+ "JOIN department d ON p.dept_id = d.dept_id\r\n"
				+ "JOIN project_employee pe ON pe.pro_id = p.pro_id\r\n"
				+ "WHERE YEAR(pe.start_date) = "+ year +"\r\n"
				+ "AND p.budget = (SELECT budget FROM project ORDER BY budget DESC limit 1)\r\n"
				+ "GROUP BY d.dept_name";
		
		return openSession().createNativeQuery(SQL)
				.addScalar(DepartmentProjectDTO.DEPT_NAME, StringType.INSTANCE)
				.addScalar(DepartmentProjectDTO.PRO_NAME, StringType.INSTANCE)
				.addScalar(DepartmentProjectDTO.BUDGET, DoubleType.INSTANCE)
				.setResultTransformer(Transformers.aliasToBean(DepartmentProjectDTO.class))
				.getResultList();
	}

	@Override
	@SuppressWarnings({ "unchecked", "deprecation" })
	public List<DepartmentProjectDTO> getTotalBudget() {
		String SQL = "SELECT d.dept_name AS "+DepartmentProjectDTO.DEPT_NAME+",\r\n"
				+ "		GROUP_CONCAT(CONCAT(p.pro_name,' ',p.budget)) AS "+DepartmentProjectDTO.PRO_NAME+",\r\n"
				+ "		SUM(p.budget) AS "+DepartmentProjectDTO.BUDGET+"\r\n"
				+ "FROM project p\r\n"
				+ "JOIN department d ON d.dept_id = p.dept_id\r\n"
				+ "GROUP BY p.dept_id";
		
		
		return openSession().createNativeQuery(SQL)
				.addScalar(DepartmentProjectDTO.DEPT_NAME, StringType.INSTANCE)
				.addScalar(DepartmentProjectDTO.PRO_NAME, StringType.INSTANCE)
				.addScalar(DepartmentProjectDTO.BUDGET, DoubleType.INSTANCE)
				.setResultTransformer(Transformers.aliasToBean(DepartmentProjectDTO.class))
				.getResultList();
	}
}
