package gradle_study.dao;

import java.util.List;

import gradle_study.dto.Department;
import gradle_study.dto.Employee;

public interface DepartmentDao {
	List<Department> selectDepartmentByAll();
	Department selectDepartmentByNo(Department department);
	int insertDepartment(Department department);
	int updateDepartment(Department department);
	int deleteDepartment(Department department);
	
	List<Employee> selectDepartmentByDeptno(Department dept);
	

}
