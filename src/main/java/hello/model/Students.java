package hello.model;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="Students")

public class Students {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long n_students;

    private String name;
    private String surname;
    private String patronymic;
    private Date date_of_birth;
    private String telephone;

    public Long getN_students() {
        return n_students;
    }

    public void setN_students(Long n_students) {
        this.n_students = n_students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }


    public Date getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(Date date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

}





