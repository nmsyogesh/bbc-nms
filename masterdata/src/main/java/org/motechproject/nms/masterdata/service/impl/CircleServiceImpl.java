package org.motechproject.nms.masterdata.service.impl;

import org.motechproject.nms.masterdata.domain.Circle;
import org.motechproject.nms.masterdata.repository.CircleDataService;
import org.motechproject.nms.masterdata.service.CircleService;
import org.springframework.beans.factory.annotation.Autowired;

public class CircleServiceImpl implements CircleService {

    @Autowired
    private CircleDataService circleDataService;

    @Override
    public void create(Circle record) {
        circleDataService.create(record);
    }
}
