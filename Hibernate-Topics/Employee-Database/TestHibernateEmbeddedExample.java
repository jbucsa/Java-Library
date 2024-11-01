// Add Necessary header files

public class TestHibernateEmbeddedExample{
    public static void main (String args[]){

        Employee employee = new Employee();
        
        employee.setName("Mark");
        employee.setPhoneno("5556669999")

        Dept dept = new Dept();
        dept.setDeptno(20);
        dept.setDname("Physics");
        dept.setLocation("Chicago");
        employee.setDept(dept);

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();

        session.save(employee);

        session.getTransaction().commit();
        session.close();
    }
}
