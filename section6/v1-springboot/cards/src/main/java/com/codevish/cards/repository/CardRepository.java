package com.codevish.cards.repository;

import com.codevish.cards.entity.Cards;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CardRepository extends JpaRepository<Cards, Long> {

    Optional<Cards> findByMobileNumber(String mobileNumber);
}
