package code.service;

import code.dao.StepRepository;

import code.domain.Step;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
public class StepServiceImpl implements StepService {
    private StepRepository stepRepository;

    @Override
    @Transactional
    public void addStep(Step step) {
        stepRepository.save(step);
    }

    @Override
    @Transactional
    public List<Step> findSteps() {
        return stepRepository.findAll();
    }

    @Override
    @Transactional
    public Step getStepById(int id) {
        List<Step> steps = findSteps();

        for (Step step : steps) {
            if (id == step.getId())
                return step;
        }
        return null;
    }

    @Override
    @Transactional
    public Step getStepByPosition(int position) {
        List<Step> steps = findSteps();

        for (Step step : steps) {
            if (position == step.getPosition()) {
                return step;
            }
        }
        return null;
    }

    @Override
    @Transactional
    public void createStep(int position) {
        Step step = new Step(position);
        stepRepository.save(step);
    }
}
