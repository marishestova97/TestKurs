package hello.model;

/**
 * Created by USER on 13.05.2017.
 */
@Entity
@Table(name="Type_of_Dance")
public class TypeOfDance {


        @Id
        @GeneratedValue(strategy= GenerationType.AUTO)
        private Integer id;

        @Column(name="code_dance")
        private int code_dance;
        private String nazvanie;



        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public int getN_person() {
            return code_dance;
        }

        public void setN_person(int code_dance) {
            this.code_dance = code_dance;
        }

        public String getName() {
            return nazvanie;
        }
        public void setName(String nazvanie) {
            this.nazvanie = nazvanie;
        }

    }

