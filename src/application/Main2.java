package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.util.List;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("=== TEST 1: findById ===");
        Department dep = departmentDao.findById(1);
        System.out.println(dep);

        System.out.println("=== TEST 2: findAll ===");
        List<Department> departments = departmentDao.findAll();
        for (Department d : departments){
            System.out.println(d);
        }

        System.out.println("=== TEST 3: insert ===");
        Department newDep = new Department(null, "P&D");
        departmentDao.insert(newDep);
        System.out.println("Inserted Department with ID: " + newDep.getId());

        System.out.println("=== TEST 4: update ===");
        Department updatedDep = departmentDao.findById(1);
        updatedDep.setName("Quality Control");
        departmentDao.update(updatedDep);
        System.out.println("Update completed");

        System.out.println("=== TEST 5: delete ===");
        System.out.print("Enter id for delete test: ");
        Integer id = input.nextInt();
        departmentDao.deleteById(id);
        System.out.println("Delete completed");

        input.close();
    }
}
