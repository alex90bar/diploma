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
@Table(name = "post_comments")
public class PostComment {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(nullable = false)
  private Integer id;

  @ManyToOne(cascade = CascadeType.ALL)
  private PostComment parentId;

  @ManyToOne(cascade = CascadeType.ALL)
  @JoinColumn(columnDefinition = "integer", name = "post_id", nullable = false)
  private Post post;

  @ManyToOne(cascade = CascadeType.ALL)
  @JoinColumn(columnDefinition = "integer", name = "user_id", nullable = false)
  private User user;

  @Column(nullable = false)
  private LocalDateTime time;

  @Column(columnDefinition = "TEXT", nullable = false)
  private String text;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public PostComment getParentId() {
    return parentId;
  }

  public void setParentId(PostComment parentId) {
    this.parentId = parentId;
  }

  public Post getPost() {
    return post;
  }

  public void setPost(Post post) {
    this.post = post;
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

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }
}
