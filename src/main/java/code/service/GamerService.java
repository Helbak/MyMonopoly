package code.service;

import code.domain.Gamer;

import java.util.List;

public interface GamerService {
    void addGamer (Gamer gamer);
    List<Gamer> findGamers();
    Gamer getGamerById(Long id);
    void plusCash (Gamer gamer, int plusCash);
    void minusCash (Gamer gamer,int minusCash);
    void setStep (Gamer gamer, int goStep);

}
