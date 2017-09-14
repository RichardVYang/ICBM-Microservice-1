package com.yang.icbm.location;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IcbmLocationServiceImpl implements IcbmLocationService {

    @Autowired
    private IcbmLocationRepository repository;


    @Override
    public IcbmLocation getLocation() {

        return repository.getLocation();
    }

    @Override
    public IcbmLocation setLocation(IcbmLocation location) {
        repository.setLocation(location);
        return location;
    }


}
