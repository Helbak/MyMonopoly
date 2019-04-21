package code.service;

import code.dao.ActionRepository;
import code.domain.Action;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@AllArgsConstructor
public class ActionServiceImpl implements ActionService{
    ActionRepository actionRepository;
    @Override
    @Transactional
   public void addAction (Action action){
    actionRepository.save(action);
   }
    @Override
    @Transactional
    public List<Action> findAction(){
       return actionRepository.findAll();
    }
    @Override
    @Transactional
    public Action getActionById(Long id){
        List<Action> actions= findAction();
        for (Action action:actions){
            if (id==action.getId())
                return action;
        }
        return null;
    }
}
