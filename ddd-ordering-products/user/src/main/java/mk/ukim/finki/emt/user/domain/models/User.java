package mk.ukim.finki.emt.user.domain.models;

import lombok.Getter;
import mk.ukim.finki.emt.sharedkernel.domain.base.AbstractEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Getter
@Table(name="users")
public class User extends AbstractEntity<UserId> {

    @Column(name="user_name", nullable = false)
    private String name;

    @Column(name="user_password", nullable = false)
    private String password;

}
