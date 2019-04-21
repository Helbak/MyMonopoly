package code.service;


import code.domain.Gamer;
import code.domain.Step;

import java.util.List;

public interface StepService {
    void addStep (Step step);
    List<Step> findSteps();
    Step getStepById(int id);
    Step getStepByPosition(int position);
    void createStep(int position);
}
