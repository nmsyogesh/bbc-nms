package org.motechproject.nms.masterdata.service;

import org.motechproject.nms.masterdata.domain.CircleCsv;

public interface CircleCsvService {

    CircleCsv findById(Long id);

    void delete(CircleCsv record);
}
