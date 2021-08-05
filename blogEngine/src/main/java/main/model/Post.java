package main.model;

import java.time.LocalDateTime;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "posts")
public class Post {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(nullable = false)
  private Integer id;

  @Column(nullable = false)
  private Byte isActive;


  @Column(nullable = false)
  @Enumerated(value = EnumType.STRING)
  private ModerationStatus moderationStatus = ModerationStatus.NEW;

  @ManyToOne(cascade = CascadeType.ALL)
  private User moderator;

  @ManyToOne(cascade = CascadeType.ALL)
  @JoinColumn(columnDefinition = "integer", name = "user_id", nullable = false)
  private User user;

  @Column(nullable = false)
  private LocalDateTime time;

  @Column(nullable = false)
  private String title;

  @Column(columnDefinition = "TEXT", nullable = false)
  private String text;

  @Column(nullable = false)
  private Integer viewCount;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Byte getIsActive() {
    return isActive;
  }

  public void setIsActive(Byte isActive) {
    this.isActive = isActive;
  }

  public ModerationStatus getModerationStatus() {
    return moderationStatus;
  }

  public void setModerationStatus(ModerationStatus moderationStatus) {
    this.moderationStatus = moderationStatus;
  }

  public User getModerator() {
    return moderator;
  }

  public void setModerator(User moderator) {
    this.moderator = moderator;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public LocalDateTime getTime() {
    return time;
  }

  public void setTime(LocalDateTime time) {
    this.time = time;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public Integer getViewCount() {
    return viewCount;
  }

  public void setViewCount(Integer viewCount) {
    this.viewCount = viewCount;
  }
}

