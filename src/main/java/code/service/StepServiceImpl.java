package code.service;

import code.dao.StepRepository;
import code.domain.Step;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@AllArgsConstructor
public class StepServiceImpl implements StepService{
    private StepRepository stepRepository;

    @Override
    @Transactional
    public void addStep (Step step){
    stepRepository.save(step);
    }
    @Override
    @Transactional
    public List<Step> findSteps(){
       return stepRepository.findAll();
    }
    public Step getStepById(Long id){
        List<Step> steps = findSteps();

        for (Step step:steps){
            if (id==step.getId())
                return step;
        }
        return null;
    }
}
