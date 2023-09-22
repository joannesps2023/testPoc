package com.example.springapps;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

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
        List<RuleResponseModel> ruleResponseWithRuleConfigDtlsList = new ArrayList<>();
        System.out.println("inside postTest");
        RuleResponseModel ruleResponseModel = new RuleResponseModel();
        ruleResponseModel.setId(ruleRequestModel.getId());
        ruleResponseModel.setMessage(ruleRequestModel.getMessage());


            RuleConfig ruleConfig = new RuleConfig();
            ruleConfig.setConfigName("config1");
            ruleConfig.setTemplateName("template1");
            ruleConfig.setId("gid1");
            RuleResponseModel ruleResponseWithRuleConfigDtls = new RuleResponseModel();
            ruleResponseWithRuleConfigDtls.setMessage(ruleRequestModel.getMessage());
            ruleResponseWithRuleConfigDtls.setId(ruleRequestModel.getId());
            ruleResponseWithRuleConfigDtls.setRuleConfig(ruleConfig);
            ruleResponseWithRuleConfigDtlsList.add(ruleResponseWithRuleConfigDtls);

        RuleConfig ruleConfig1 = new RuleConfig();
        ruleConfig1.setConfigName("config2");
        ruleConfig1.setTemplateName("template2");
        ruleConfig1.setId("gid2");
        RuleResponseModel ruleResponseWithRuleConfigDtls1 = new RuleResponseModel();
        ruleResponseWithRuleConfigDtls1.setMessage(ruleRequestModel.getMessage());
        ruleResponseWithRuleConfigDtls1.setId(ruleRequestModel.getId());
        ruleResponseWithRuleConfigDtls1.setRuleConfig(ruleConfig);
        ruleResponseWithRuleConfigDtlsList.add(ruleResponseWithRuleConfigDtls1);
        return "testString";
    }

}
