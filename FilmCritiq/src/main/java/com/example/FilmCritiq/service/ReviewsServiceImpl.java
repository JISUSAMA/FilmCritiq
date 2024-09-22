package com.example.FilmCritiq.service;

import com.example.FilmCritiq.entity.Movies;
import com.example.FilmCritiq.repository.ReviewsRepository;
import com.example.FilmCritiq.dto.ReviewsDTO;
import com.example.FilmCritiq.entity.Reviews;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Log4j2
@RequiredArgsConstructor
public class ReviewsServiceImpl implements ReviewsService {
  private final ReviewsRepository reviewsRepository;

  @Override
  public List<ReviewsDTO> getListOfFeeds(Long fno) {
    List<Reviews> result = reviewsRepository.findByFeeds(
        Movies.builder().fno(fno).build());
    return result.stream().map(reviews -> entityToDto(reviews)).collect(Collectors.toList());
  }

  @Override
  public Long register(ReviewsDTO reviewsDTO) {
    log.info("reviewsDTO >> ",reviewsDTO);
    Reviews reviews = dtoToEntity(reviewsDTO);
    reviewsRepository.save(reviews);
    return reviews.getReviewsnum();
  }

  @Override
  public void modify(ReviewsDTO reviewsDTO) {
    Optional<Reviews> result = reviewsRepository.findById(reviewsDTO.getReviewsnum());
    if (result.isPresent()) {
      Reviews reviews = result.get();
      reviews.changeText(reviewsDTO.getText());
      reviewsRepository.save(reviews);
    }
  }

  @Override
  public void remove(Long reviewsnum) {
    log.info("remove reviewnum >> ",reviewsnum);
    reviewsRepository.deleteById(reviewsnum);
  }
}
