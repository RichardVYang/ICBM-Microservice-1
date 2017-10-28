package com.yang.icbm.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/* Data for set location
  {
"icbmId": "f1196aac-470e-11e6-beb8-9e71128cae77",
"longitude": -88.144040,
"latitude": 41.803488, 
"icbmCode": 1458203977,
"timestamp": 1468203975
}
 */

@RestController
@RequestMapping("/location")
public class IcbmController {
	
    @Autowired
    private IcbmLocationService service;

    @RequestMapping(method = RequestMethod.POST, value="/setLocation", produces = "application/json", consumes = "application/json")
    public IcbmLocation setLocation(@RequestBody IcbmLocation location) {
        return service.setLocation(location);
    }


   // http://localhost:8080/location/getLocation?icbmId=f1196aac-470e-11e6-beb8-9e71128cae77
    @RequestMapping(method = RequestMethod.GET, value="/getLocation", produces = "application/json")
    public IcbmLocation getLocation(@RequestParam(value = "icbmId", required = true) String icbmId) {
        return service.getLocation(icbmId);
    } 
    
    
    
} 
 
