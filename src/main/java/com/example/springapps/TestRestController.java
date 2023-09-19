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
    public String postTest(@RequestBody RuleRequestModel ruleRequestModel)
    {
        System.out.println("inside postTest");
        if(ruleRequestModel.getMessage().equalsIgnoreCase("rule1"))
        {
            return "rule1Data";
        }
        else if(ruleRequestModel.getMessage().equalsIgnoreCase("rule2"))
        {
            return "rule2Data";
        }
        else if(ruleRequestModel.getMessage().equalsIgnoreCase("rule3"))
        {
            return "rule3Data";
        }
        return "defaultRuleData";
    }
}
