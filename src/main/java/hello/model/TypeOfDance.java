package hello.model;

import javax.persistence.*;

@Entity
@Table(name="Type_of_Dance")
public class TypeOfDance {
        @Id
        @GeneratedValue(strategy= GenerationType.AUTO)
        @Column(name="code_dance")
        private int code_dance;
        private String nazvanie;

    public int getCode_dance() {
        return code_dance;
    }

    public void setCode_dance(int code_dance) {
        this.code_dance = code_dance;
    }

    public String getNazvanie() {
        return nazvanie;
    }

    public void setNazvanie(String nazvanie) {
        this.nazvanie = nazvanie;
    }
}

