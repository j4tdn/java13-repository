package dao;

import java.util.List;

import org.hibernate.transform.Transformers;
import org.hibernate.type.DoubleType;
import org.hibernate.type.StringType;

import persistences.DepartmentProjectDTO;

public class HibernateDepartmentProjectDTODaoImpl extends AbstractHibernateDao implements DepartmentProjectDTODao{
	
	private static final String Q_Department_Project_GREATETHAN400 = "SELECT d.dept_name AS dept_name, \n"
							+ "p.pro_name AS pro_name, \n"
							+ "p.budget AS budget \n"
							+ "FROM project p \n"
							+ "JOIN department d ON d.dept_id = p.dept_id\n"
							+ "WHERE p.budget > 400";	
	
	@SuppressWarnings({ "unchecked", "deprecation" })
	@Override
	public List<DepartmentProjectDTO> getProjectGreaterThan400() {
		return openSession().createNativeQuery(Q_Department_Project_GREATETHAN400)
			.addScalar("dept_name", StringType.INSTANCE)
			.addScalar("pro_name", StringType.INSTANCE)
			.addScalar("budget", DoubleType.INSTANCE)
			.setResultTransformer(Transformers.aliasToBean(DepartmentProjectDTODao.class))
			.getResultList();
	}
}
