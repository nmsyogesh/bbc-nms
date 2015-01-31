package org.motechproject.nms.masterdata.domain;

import org.motechproject.mds.annotations.Entity;
import org.motechproject.mds.annotations.Field;

import java.util.Set;

/**
 * Created by abhishek on 24/1/15.
 */
@Entity(recordHistory = true)
public class Taluka extends LocationUnitMetaData {

    @Field
    private String talukaCode;

    @Field
    private Set<HealthBlock> healthBlock;

    @Field
    private Set<Village> village;

    @Field
    private Long districtCode;

    @Field
    private Long stateCode;

    public Taluka(String name, String talukaCode, Set<HealthBlock> healthBlock, Set<Village> village, Long districtCode, Long stateCode) {
        super(name);
        this.talukaCode = talukaCode;
        this.healthBlock = healthBlock;
        this.village = village;
        this.districtCode = districtCode;
        this.stateCode = stateCode;
    }

    public Set<HealthBlock> getHealthBlock() {
        return healthBlock;
    }

    public void setHealthBlock(Set<HealthBlock> healthBlock) {
        this.healthBlock = healthBlock;
    }

    public Set<Village> getVillage() {
        return village;
    }

    public void setVillage(Set<Village> village) {
        this.village = village;
    }

    public String getTalukaCode() {
        return talukaCode;
    }

    public void setTalukaCode(String talukaCode) {
        this.talukaCode = talukaCode;
    }

    public Long getDistrictCode() {
        return districtCode;
    }

    public void setDistrictCode(Long districtCode) {
        this.districtCode = districtCode;
    }

    public Long getStateCode() {
        return stateCode;
    }

    public void setStateCode(Long stateCode) {
        this.stateCode = stateCode;
    }
}
