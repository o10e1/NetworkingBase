package pl.o10e1.NetworkingBase.StartUp;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;

@Entity
@Table
public class StartUp {
    @Id
    @SequenceGenerator(
            name="startUp_sequence",
            sequenceName = "startUp_student",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )
    private long id;
    private String CompanyName;
    private String PersonName;
    private String PersonLastName;
    private String PersonPhoneNumber;

    public StartUp(String companyName, String personName, String personLastName, String personPhoneNumber) {
        CompanyName = companyName;
        PersonName = personName;
        PersonLastName = personLastName;
        PersonPhoneNumber = personPhoneNumber;
    }

    public StartUp() {

    }

    public void setId(long id) {
        this.id = id;
    }

    public void setCompanyName(String companyName) {
        CompanyName = companyName;
    }

    public void setCersonName(String cersonName) {
        PersonName = cersonName;
    }

    public void setPersonLastName(String personLastName) {
        PersonLastName = personLastName;
    }

    public void setPersonPhoneNumber(String personPhoneNumber) {
        PersonPhoneNumber = personPhoneNumber;
    }

    public long getId() {
        return id;
    }

    public String getCompanyName() {
        return CompanyName;
    }

    public String getCersonName() {
        return PersonName;
    }

    public String getPersonLastName() {
        return PersonLastName;
    }

    public String getPersonPhoneNumber() {
        return PersonPhoneNumber;
    }

    @Override
    public String toString() {
        return "StartUp{" +
                "id=" + id +
                ", CompanyName='" + CompanyName + '\'' +
                ", CersonName='" + PersonName + '\'' +
                ", PersonLastName='" + PersonLastName + '\'' +
                ", PersonPhoneNumber='" + PersonPhoneNumber + '\'' +
                '}';
    }
}
