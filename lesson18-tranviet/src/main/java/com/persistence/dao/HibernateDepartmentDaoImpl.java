package com.persistence.dao;

import com.persistence.persistence.Department;
import com.persistence.persistence.DepartmentDto;
import com.persistence.persistence.DepartmentProjectDto;
import com.persistence.persistence.Project;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.transform.Transformers;
import org.hibernate.type.DoubleType;
import org.hibernate.type.StringType;

import java.util.List;

public class HibernateDepartmentDaoImpl extends AbstractHibernateDao implements HibernateDepartmentDao{
    private static Session session;
    @Override
    public List<DepartmentProjectDto> projectsOfDepartments(Integer amount) {
        String Q_GET_PROJECTS_WITH_AMOUNT = "SELECT dp.dept_name AS " + DepartmentProjectDto.DEPARTMENT_NAME +  ",\n"
                + "p.pro_name AS " + DepartmentProjectDto.PROJECT_NAME + ",\n"
                + "p.budget AS " + DepartmentProjectDto.BUDGET + "\n"
                + " FROM project p\n"
                + "JOIN department dp \n"
                + "ON dp.dept_id = p.dept_id\n"
                + "WHERE budget > " + amount;
        System.out.println(Q_GET_PROJECTS_WITH_AMOUNT);
        return openSession().createNativeQuery(Q_GET_PROJECTS_WITH_AMOUNT)
                .addScalar(DepartmentProjectDto.DEPARTMENT_NAME, StringType.INSTANCE)
                .addScalar(DepartmentProjectDto.PROJECT_NAME, StringType.INSTANCE)
                .addScalar(DepartmentProjectDto.BUDGET, DoubleType.INSTANCE)
                .setResultTransformer(Transformers.aliasToBean(DepartmentProjectDto.class)).getResultList();
    }

    @Override
    public List<DepartmentDto> totalOfBudgetInYear(Integer year) {
        String Q_GET_SUM_BUDGET_IN_YEAR= "SELECT dp.dept_name AS " + DepartmentDto.DEPARTMENT_NAME + ", \n" +
                "GROUP_CONCAT(CONCAT(p.pro_name, ' - ', p.budget)) AS " + DepartmentDto.PROJECT_DETAILS + ",\n" +
                "SUM(budget) AS "  + DepartmentDto.SUM_BUDGET + " \n" +
                "from department dp\n" +
                "JOIN project p ON dp.dept_id = p.dept_id\n" +
                "GROUP BY(dp.dept_id);";
        System.out.println(Q_GET_SUM_BUDGET_IN_YEAR);
        return openSession().createNativeQuery(Q_GET_SUM_BUDGET_IN_YEAR)
                .addScalar(DepartmentDto.DEPARTMENT_NAME, StringType.INSTANCE)
                .addScalar(DepartmentDto.PROJECT_DETAILS, StringType.INSTANCE)
                .addScalar(DepartmentDto.SUM_BUDGET, DoubleType.INSTANCE)
                .setResultTransformer(Transformers.aliasToBean(DepartmentDto.class)).getResultList();
    }

    @Override
    public DepartmentProjectDto getDepartmentHasProjectWithHighestBudget() {
        String DEPARTMENT_PROJECT_HIGHEST_BUDGET = "SELECT dp.dept_name AS " + DepartmentProjectDto.DEPARTMENT_NAME +  ",\n"
                + "p.pro_name AS " + DepartmentProjectDto.PROJECT_NAME + ",\n"
                + "p.budget AS " + DepartmentProjectDto.BUDGET + "\n" +
                "FROM department dp\n" +
                "JOIN project p ON dp.dept_id = p.dept_id\n" +
                "WHERE budget = (\n" +
                "SELECT MAX(budget)\n" +
                "from department dp\n" +
                "JOIN project p ON dp.dept_id = p.dept_id\n" +
                ");";
        System.out.println(DEPARTMENT_PROJECT_HIGHEST_BUDGET);
        return (DepartmentProjectDto) openSession().createNativeQuery(DEPARTMENT_PROJECT_HIGHEST_BUDGET)
                .addScalar(DepartmentProjectDto.DEPARTMENT_NAME, StringType.INSTANCE)
                .addScalar(DepartmentProjectDto.PROJECT_NAME, StringType.INSTANCE)
                .addScalar(DepartmentProjectDto.BUDGET, DoubleType.INSTANCE)
                .setResultTransformer(Transformers.aliasToBean(DepartmentProjectDto.class)).uniqueResult();

    }

    @Override
    public boolean save(Department department) {
        boolean isSuccess = false;
        session = openSession();
        Transaction transaction = session.beginTransaction();
        try{
            session.save(department);
            transaction.commit();
            isSuccess = true;
        }
        catch (Exception ex){
            ex.printStackTrace();
            transaction.rollback();
        }
        finally {
            session.close();
        }
        return isSuccess;
    }



}
