package com.yang.icbm.location;


import org.springframework.stereotype.Repository;

@Repository
public class IcbmLocationRepository {
    private IcbmLocation location = new IcbmLocation();

    public void setLocation(IcbmLocation location) {
        System.out.println("Entering IcbmLocationRepository::setLocation method...");
        this.location = location;
    }

    public IcbmLocation getLocation() {
        System.out.println("Entering IcbmLocationRepository::getLocation method...");
        return location;
    }

}
