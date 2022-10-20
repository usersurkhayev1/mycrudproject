package myfirstproject.entity;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import javax.persistence.*;



@Entity
@Data
@Table(name = "account")
@AllArgsConstructor
@NoArgsConstructor
@ToString
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name = "id")
    private Long id;

    @Column(name = "userName")
    @Basic(optional = false)
    private String userName;

    @Column(name = "password")
    @Basic(optional = false)
    private String password;

    @Column(name = "firstName")
    @Basic(optional = false)
    private String firstName;

    @Column(name = "lastName")
    @Basic(optional = false)
    private String lastName;

    @Column(name = "email")
    @Basic(optional = false)
    private String email;


}
