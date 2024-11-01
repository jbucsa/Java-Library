// Add Necessary header files

@Entity
@Table( name = "emp")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    @Embedded
    private Dept dept;
    private String phoneno;

    // Constructor, Getters, and Setters

}

