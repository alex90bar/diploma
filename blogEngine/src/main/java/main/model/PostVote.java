package main.model;

import java.time.LocalDateTime;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "post_votes")
public class PostVote {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(nullable = false)
  private Integer id;

  @ManyToOne(cascade = CascadeType.ALL)
  @JoinColumn(columnDefinition = "integer", name = "user_id", nullable = false)
  private User user;

  @ManyToOne(cascade = CascadeType.ALL)
  @JoinColumn(columnDefinition = "integer", name = "post_id", nullable = false)
  private Post post;

  @Column(nullable = false)
  private LocalDateTime time;

  @Column(nullable = false)
  private Byte value;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public Post getPost() {
    return post;
  }

  public void setPost(Post post) {
    this.post = post;
  }

  public LocalDateTime getTime() {
    return time;
  }

  public void setTime(LocalDateTime time) {
    this.time = time;
  }

  public Byte getValue() {
    return value;
  }

  public void setValue(Byte value) {
    this.value = value;
  }
}
