public class User {
    @NotNull (message - "Name cannot be null")
    private String name;
    
    @AssertTrue
    private boolean working;

    @Size (min = 10, max = 200, message = "About Me must be between 10 and 200 characters")
    private String aboutMe;

    @Min (value = 18, message = "Age should not be less than 18")
    private int age;

    @Email (message = "Email should be valid")
    private String email;

    // Standard setters and getters
}
