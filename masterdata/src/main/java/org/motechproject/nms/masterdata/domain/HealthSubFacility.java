package org.motechproject.nms.masterdata.domain;

import org.motechproject.mds.annotations.Entity;
import org.motechproject.mds.annotations.Field;

/**
 * Created by abhishek on 24/1/15.
 */

@Entity(recordHistory = true)
public class HealthSubFacility extends LocationUnitMetaData {


    @Field
    private long sId;


    @Field
    private Long phcId;

    @Field
    private String talukaCode;

    @Field
    private Long districtCode;

    @Field
    private Long stateCode;


    public HealthSubFacility(String name, long sId) {
        super(name);
        this.sId = sId;
    }

    public long getsId() {
        return sId;
    }

    public void setsId(long sId) {
        this.sId = sId;
    }
}
