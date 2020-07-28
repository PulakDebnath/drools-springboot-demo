package com.pd.exp.droolsdemo;

import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuestnrController {
    @Autowired
    private KieSession session;

    @PostMapping("/questnr")
    public String getQuestionnaireVersionName(@RequestBody RequestMsg req) {
        session.insert(req);
        session.fireAllRules();
        return req.questnrVerName;
    }

}
