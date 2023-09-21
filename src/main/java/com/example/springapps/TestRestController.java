package com.example.springapps;

import org.springframework.web.bind.annotation.*;

@RestController
public class TestRestController {

    @GetMapping("getTest")
    public String getTest(@RequestParam("rule")String rule)
    {
        System.out.println("inside getTest");
        if(rule.equalsIgnoreCase("rule1"))
        {
            return "rule1Data";
        }
        else if(rule.equalsIgnoreCase("rule2"))
        {
            return "rule2Data";
        }
        else if(rule.equalsIgnoreCase("rule3"))
        {
            return "rule3Data";
        }
        return "defaultRuleData";
    }

    @PostMapping ("postTest")
    public RuleResponseModel postTest(@RequestBody RuleRequestModel ruleRequestModel)
    {
        System.out.println("inside postTest");
        RuleResponseModel ruleResponseModel = new RuleResponseModel();
        ruleResponseModel.setId(ruleRequestModel.getId());
        ruleResponseModel.setMessage(ruleRequestModel.getMessage());

        if(ruleRequestModel.getMessage().equalsIgnoreCase("rule1"))
        {
            ruleResponseModel.setConfigName("template1");
            return ruleResponseModel;
        }
        else if(ruleRequestModel.getMessage().equalsIgnoreCase("rule2"))
        {
            ruleResponseModel.setConfigName("template2");
            return ruleResponseModel;
        }
        else if(ruleRequestModel.getMessage().equalsIgnoreCase("rule3"))
        {
            ruleResponseModel.setConfigName("template3");
            return ruleResponseModel;
        }
        ruleResponseModel.setConfigName("defaulttemplate");
        return ruleResponseModel;
    }

}
