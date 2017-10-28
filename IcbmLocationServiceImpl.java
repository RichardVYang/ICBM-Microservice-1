package com.yang.icbm.application.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
@Repository
public class IcbmLocationServiceImpl implements IcbmLocationService {

    @Autowired
    private IcbmLocationRepository repository;
    
    @Override
	public IcbmLocation setLocation(IcbmLocation vo) {
		if (null == vo)
			throw new RuntimeException("IcbmLocationVo is null");

		Location location = new Location();
		location.setIcbmCode(vo.getIcbmCode());
		location.setIcbmId(vo.getIcbmId());
		location.setLatitude(vo.getLatitude());
		location.setLongitude(vo.getLongitude());
		location.setTimestamp(vo.getTimestamp());

		repository.saveAndFlush(location);

		vo = getLocation(vo.getIcbmId());
		
        return vo;
	}
    
    @Override
	public IcbmLocation getLocation(String icbmId) {

		Optional<Location>OptLocation = repository.findByIcbmId(icbmId);
		if (!OptLocation.isPresent())
			throw new RuntimeException("repository.findByIcbmId("+icbmId+") returns empty");
		
		IcbmLocation vo = new IcbmLocation();	
		Location location = OptLocation.get();
		vo.setIcbmCode(location.getIcbmCode());
		vo.setIcbmId(location.getIcbmId());
		vo.setLatitude(location.getLatitude());
		vo.setLongitude(location.getLongitude());
		vo.setTimestamp(location.getTimestamp());

		return vo;
	
	} 


}
