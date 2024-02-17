package com.als.controller;

import com.als.service.MarketingDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/marketingdetails")
public class MarketingDetailsController {

    private MarketingDetailsService marketingDetailsService;
    @Autowired
    public MarketingDetailsController(MarketingDetailsService marketingDetailsService) {
        this.marketingDetailsService = marketingDetailsService;
    }
}
