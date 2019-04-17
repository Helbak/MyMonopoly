package code.service;

import code.dao.GamerRepository;
import code.dao.StepRepository;
import code.domain.Gamer;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@AllArgsConstructor
public class GamerServiceImpl implements GamerService{
    private GamerRepository gamerRepository;
    private StepService stepService;

    @Override
    @Transactional
   public void addGamer (Gamer gamer){
       gamerRepository.save(gamer);
   }
    @Override
    @Transactional
    public List<Gamer> findGamers(){
       return gamerRepository.findAll();
    }
    @Override
    @Transactional
    public Gamer getGamerById(Long id){
      List<Gamer> gamers= findGamers();
        for (Gamer gamer:gamers){
            if (id==gamer.getId())
                return gamer;
        }
        return null;
    }
    @Override
    @Transactional
    public void plusCash (Gamer gamer,int plusCash){
       int cash = gamer.getCash();
       gamer.setCash(cash+plusCash);
    }
    @Override
    @Transactional
    public void minusCash (Gamer gamer,int minusCash){
        int cash = gamer.getCash();
        gamer.setCash(cash-minusCash);
    }
    @Override
    @Transactional
    public void setStep (Gamer gamer, int goStep){
       long oldStep = gamer.getStep().getId();
       if(oldStep+goStep<=38){
           gamer.setStep(stepService.getStepById(oldStep+goStep));
       }
        if(oldStep+goStep>38){
            gamer.setStep(stepService.getStepById(oldStep+goStep-38));
        }
    }
}
