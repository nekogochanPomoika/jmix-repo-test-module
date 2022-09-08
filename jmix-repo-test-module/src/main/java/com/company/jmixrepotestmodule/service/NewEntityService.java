package com.company.jmixrepotestmodule.service;

import com.company.jmixrepotestmodule.repository.NewEntityRepository;
import org.springframework.stereotype.Service;

@Service
public class NewEntityService {
    private final NewEntityRepository newEntityRepository;

    public NewEntityService(NewEntityRepository newEntityRepository) {
        this.newEntityRepository = newEntityRepository;
    }
}
