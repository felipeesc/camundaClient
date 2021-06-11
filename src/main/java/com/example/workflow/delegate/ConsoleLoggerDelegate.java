package com.example.workflow.delegate;

import lombok.extern.slf4j.Slf4j;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Slf4j
@Component("logger")
public class ConsoleLoggerDelegate implements JavaDelegate {

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        log.info(delegateExecution.getCurrentActivityName());
        log.info(" order = {}", delegateExecution.getVariable("order"));
    }
}
