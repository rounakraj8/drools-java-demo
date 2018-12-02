package com.rounakraj8.drools.service;

import com.rounakraj8.drools.payload.Input;
import com.rounakraj8.drools.payload.Output;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.StatelessKieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalaryServiceImpl implements SalaryService {

    private final KieContainer kieContainer;

    @Autowired
    public SalaryServiceImpl(KieContainer kieContainer) {
        this.kieContainer = kieContainer;
    }

    @Override
    public Output getSalary(Input input) {
        Output output = new Output();
        StatelessKieSession statelessKieSession = kieContainer.newStatelessKieSession();
        statelessKieSession.setGlobal("output", output);
        statelessKieSession.execute(input);
        return output;
    }
}
