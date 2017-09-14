package com.yang.icbm.location;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/location")
public class IcbmController {

    @Autowired
    private IcbmLocationService service;

    @RequestMapping(method = RequestMethod.POST, value = "/setLocation", produces = "application/json", consumes = "application/json")
    public IcbmLocation setLocation(@RequestBody IcbmLocation location) {
        return service.setLocation(location);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/getLocation", produces = "application/json")
    public IcbmLocation getLocation() {

        return service.getLocation();
    }

}
