package dao;

import java.util.List;
import java.util.Optional;

import org.hibernate.transform.Transformers;
import org.hibernate.type.DoubleType;
import org.hibernate.type.IntegerType;
import org.hibernate.type.StringType;

import persistence.Department;
import persistence.DepartmentBudgetDto;
import persistence.DepartmentDetailBuget;

public class HibernateDepartmentDao extends AbstractHibernateDao implements DepartmentDao{
	private static final String Q_GET_ALL = "SELECT * FROM department";
	
	final String Q_GET_SUM_BUDGET_DEPARTMENT =
            "select d.dept_name as " + DepartmentBudgetDto.DEPARRTMENT_NAME + " , p.pro_name as " + DepartmentBudgetDto.PROJECT_NAME + ", " +
                    "p.budget as " + DepartmentBudgetDto.SUM_BUDGET + " from department as d inner" +
                    " join project as p on d.dept_id=p.dept_id where " +
                    "p.budget> :buget";
	
	  final String Q_GET_TOTAL_BUDGET_PROJECT =
              "with PE as (\n" +
              "select * from project_employee as p where year(cast(p.start_date as date ))='2021'\n" +
              ")\n" +
              "select d.dept_name as " + DepartmentDetailBuget.DEPARTMENT_NAME + "" +
              ", group_concat(concat(p.pro_name,' ',p.budget)) as " + DepartmentDetailBuget.PROJECT_DETAILS +
              ", sum(p.budget) as " + DepartmentDetailBuget.SUM_BUDGET +
              " from project as p inner join PE pe on p.pro_id= pe.pro_id inner join department as  d on p.dept_id=d.dept_id group by d.dept_name\n";
	
	
	
	final String Q_MAX_BUDGET_DEPARTMENT = "select d.dept_name as " + DepartmentBudgetDto.DEPARRTMENT_NAME+ " , p.pro_name as  "+ DepartmentBudgetDto.PROJECT_NAME+ " ,p.budget as "+ DepartmentBudgetDto.SUM_BUDGET+" from department " +
            "as d inner join project as p on d.dept_id=p.dept_id" +
            " where p.budget = (select max(budget) from project)";
	
	

	public List<Department> getAll() {
		return (List<Department>) openSession().createNamedQuery(Q_GET_ALL, Department.class)
								.getResultList();
	}
	
	@SuppressWarnings("unchecked")
	public List<DepartmentBudgetDto> getDeparmentProjectHaveBugetMoreThan(int buget){
		return (List<DepartmentBudgetDto>) openSession().createNativeQuery(Q_GET_SUM_BUDGET_DEPARTMENT)
														.setParameter("buget", buget, IntegerType.INSTANCE)
														.addScalar(DepartmentBudgetDto.DEPARRTMENT_NAME, StringType.INSTANCE)
										                .addScalar(DepartmentBudgetDto.PROJECT_NAME, StringType.INSTANCE)
										                .addScalar(DepartmentBudgetDto.SUM_BUDGET, DoubleType.INSTANCE)
										                .setResultTransformer(Transformers.aliasToBean(DepartmentBudgetDto.class))
										                .getResultList();
														
	}
	
	@SuppressWarnings({ "unchecked" })
	public List<DepartmentDetailBuget> getTotalOfBugetEachDepartment(){
		return (List<DepartmentDetailBuget>) openSession().createNativeQuery(Q_GET_TOTAL_BUDGET_PROJECT)
				 .addScalar(DepartmentDetailBuget.DEPARTMENT_NAME, StringType.INSTANCE)
	                .addScalar(DepartmentDetailBuget.PROJECT_DETAILS, StringType.INSTANCE)
	                .addScalar(DepartmentDetailBuget.SUM_BUDGET, DoubleType.INSTANCE)
	                .setResultTransformer(Transformers.aliasToBean(DepartmentDetailBuget.class))
	                .getResultList();
	}
	
	
	@SuppressWarnings("unchecked")
	public DepartmentBudgetDto getDepartmentProjectHaveHighestBuget(){
		 Optional<DepartmentBudgetDto> deparment =openSession().createNativeQuery(Q_MAX_BUDGET_DEPARTMENT)
				.addScalar(DepartmentBudgetDto.DEPARRTMENT_NAME, StringType.INSTANCE)
                .addScalar(DepartmentBudgetDto.PROJECT_NAME, StringType.INSTANCE)
                .addScalar(DepartmentBudgetDto.SUM_BUDGET, DoubleType.INSTANCE)
                .setResultTransformer(Transformers.aliasToBean(DepartmentBudgetDto.class))
                .uniqueResultOptional();
		 
		 return deparment.isPresent() ? deparment.get() :null;
	}

}