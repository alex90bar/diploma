package main.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Tag2Post {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(nullable = false)
  private Integer id;

  @ManyToOne(cascade = CascadeType.ALL)
  @JoinColumn(columnDefinition = "integer", name = "post_id", nullable = false)
  private Post post;

  @ManyToOne(cascade = CascadeType.ALL)
  @JoinColumn(columnDefinition = "integer", name = "tag_id", nullable = false)
  private Tag tag;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Post getPost() {
    return post;
  }

  public void setPost(Post post) {
    this.post = post;
  }

  public Tag getTag() {
    return tag;
  }

  public void setTag(Tag tag) {
    this.tag = tag;
  }
}
