package com.example.FilmCritiq.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString(exclude = "movies")
public class Photos extends BasicEntity{
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long pnum;
  private String uuid; //Universally Unique IDentifier
  private String imgName;
  private String path;
  @ManyToOne(fetch = FetchType.LAZY)
  private Movies movies;
}