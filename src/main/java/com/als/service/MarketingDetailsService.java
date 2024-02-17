package com.als.service;

import com.als.repository.MarketingDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MarketingDetailsService {

    private MarketingDetailsRepository  marketingDetailsRepository;
    @Autowired
    public MarketingDetailsService(MarketingDetailsRepository marketingDetailsRepository) {
        this.marketingDetailsRepository = marketingDetailsRepository;
    }
}
