package code.service;

import code.dao.CardRepository;
import code.domain.Card;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
public class CardSeviceImpl implements CardService{
    private CardRepository cardRepository;
    @Override
    @Transactional
public void addCard (Card card){
cardRepository.save(card);
    }
    public     List<Card> findCards(){
        return cardRepository.findAll();
    }

    public Card getCardById(Long id){
        List<Card> cards = findCards();

        for (Card card:cards){
            if (id==card.getId())
                return card;
        }
        return null;
    }
}
