package code.service;

import code.domain.Step;

import java.util.List;

public interface StepService {
    void addStep (Step step);
    List<Step> findSteps();
    Step getStepById(Long id);
}
