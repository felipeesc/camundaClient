package com.example.workflow.delegate;

import lombok.extern.slf4j.Slf4j;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Slf4j
@Component("helloDelegate")
public class ClienteDelegate implements JavaDelegate {

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        log.info("Executando camunda");
        log.info(delegateExecution.getProcessBusinessKey());
        log.info(delegateExecution.getCurrentActivityName());
    }

}
