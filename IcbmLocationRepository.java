package com.yang.icbm.location;


import org.springframework.stereotype.Repository;

@Repository
public class IcbmLocationRepository {
    private IcbmLocation location = new IcbmLocation();

    public void setLocation(IcbmLocation location) {
        this.location = location;
    }

    public IcbmLocation getLocation() {
        return location;
    }

}