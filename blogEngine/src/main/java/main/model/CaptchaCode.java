package main.model;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "captcha_codes")
public class CaptchaCode {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(nullable = false)
  private Integer id;

  @Column(nullable = false)
  private LocalDateTime time;

  @Column(columnDefinition = "TINYTEXT", nullable = false)
  private String code;

  @Column(columnDefinition = "TINYTEXT", nullable = false)
  private String secretCode;

}
