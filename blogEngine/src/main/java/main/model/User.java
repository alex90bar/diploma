package main.model;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "users")
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(nullable = false)
  private Integer id;

  @Column(nullable = false)
  private Byte isModerator;

  @Column(nullable = false)
  private LocalDateTime regTime;

  @Column(nullable = false)
  private String name;

  @Column(nullable = false)
  private String email;

  private String password;

  private String code;

  @Column(columnDefinition = "TEXT")
  private String photo;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Byte getIsModerator() {
    return isModerator;
  }

  public void setIsModerator(Byte isModerator) {
    this.isModerator = isModerator;
  }

  public LocalDateTime getRegTime() {
    return regTime;
  }

  public void setRegTime(LocalDateTime regTime) {
    this.regTime = regTime;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getPhoto() {
    return photo;
  }

  public void setPhoto(String photo) {
    this.photo = photo;
  }
}
