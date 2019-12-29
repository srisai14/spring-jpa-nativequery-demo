package com.srisai.springjpanativequerydemo.model;

import net.bytebuddy.dynamic.loading.InjectionClassLoader;
import org.hibernate.boot.registry.selector.spi.StrategySelector;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "USER_SEARCH")
public class UserSearch {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "GID")
    private Integer uid;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "EMAIL")
    private String email;

    public UserSearch() {
    }

    public UserSearch(Integer uid, String firstName, String lastName, String email) {
        this.uid = uid;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserSearch)) return false;
        UserSearch that = (UserSearch) o;
        return Objects.equals( getUid(), that.getUid() ) &&
                Objects.equals( getFirstName(), that.getFirstName() ) &&
                Objects.equals( getLastName(), that.getLastName() ) &&
                Objects.equals( getEmail(), that.getEmail() );
    }

    @Override
    public int hashCode() {
        return Objects.hash( getUid(), getFirstName(), getLastName(), getEmail() );
    }
}
