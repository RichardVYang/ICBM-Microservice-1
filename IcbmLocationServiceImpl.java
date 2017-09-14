package com.yang.icbm.location;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IcbmLocationServiceImpl implements IcbmLocationService {

    @Autowired
    private IcbmLocationRepository repository;


    @Override
    public IcbmLocation getLocation() {
        System.out.println("Entering IcbmLocationServiceImpl::getLocation method...");

        return repository.getLocation();
    }

    @Override
    public IcbmLocation setLocation(IcbmLocation location) {
        System.out.println("Entering IcbmLocationServiceImpl::setLocation method...");
        repository.setLocation(location);
        System.out.println("Successfully setting location. About to return location back...");
        return location;
    }


}
