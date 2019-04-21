package code.service;

import code.domain.Action;

import java.util.List;

public interface ActionService {
    void addAction (Action action);
    List<Action> findAction();
    Action getActionById(Long id);
}
