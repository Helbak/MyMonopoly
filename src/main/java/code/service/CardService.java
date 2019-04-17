package code.service;

import code.domain.Card;

import java.util.List;

public interface CardService {
    void addCard (Card card);
    List<Card> findCards();
    Card getCardById(Long id);
}
