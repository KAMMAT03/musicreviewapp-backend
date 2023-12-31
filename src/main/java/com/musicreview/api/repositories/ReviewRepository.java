package com.musicreview.api.repositories;

import com.musicreview.api.models.Review;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Long> {
    Page<Review> findAllByAlbumIdOrderByDateOfPublicationDesc(String albumId, Pageable pageable);
    Page<Review> findAllByUserIdOrderByDateOfPublicationDesc(long userId, Pageable pageable);
}
