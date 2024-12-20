package com.example.FilmCritiq.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString(exclude = {"movies", "clubMember"})
public class Reviews extends BasicEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long reviewsnum;
  @ManyToOne(fetch = FetchType.LAZY)
  private Movies movies;
  @ManyToOne(fetch = FetchType.LAZY)
  private ClubMember clubMember;
  private String text; //한줄평
  public void changeText(String text) {this.text = text;}
}