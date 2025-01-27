
import jakarta.persistence.*

@Entity
@Table(name = "users")
public class User{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "email")
    private String email;

    @Column(name = "phone_number")
    private int phoneNumber;

    @Column(name = "password")
    private String password;

    @Column(name = "role")
    private String role;

    @Column(name = "created_on")
    private date createdOn;

    @Column(name = "updated_on")
    private date updatedOn;



    public User() {
        super();
    }

    public User(int userId, String fullName, String email, int phoneNumber, String password, String role, date createdOn, date updatedOn) {
        super();
        this.userId = userId;
        this.fullName = fullName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.role = role;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(date createdOn) {
        this.createdOn = createdOn;
    }

    public date getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(date updatedOn) {
        this.updatedOn = updatedOn;
    }

    @Override
    public String toString() {
        return "User [userId=" + userId + ", fullName=" + fullName + ", email=" + email + ", phoneNumber=" + phoneNumber + ", password=" + password + ", role=" + role + ", createdOn=" + createdOn + ", updatedOn=" + updatedOn + "]";
    }
}