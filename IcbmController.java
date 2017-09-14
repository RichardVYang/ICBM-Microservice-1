package com.yang.icbm.location;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/location")
public class IcbmController {

    @Autowired
    private IcbmLocationService service;

    /*
      @ResponseBody
  @RequestMapping("/setLocation")
     */

  //  @RequestMapping(method = RequestMethod.POST, value = "/setLocation", produces = "application/json", consumes = "application/json")

    @RequestMapping(method = RequestMethod.POST, value = "/setLocation", produces = "application/json", consumes = "application/json")
    public IcbmLocation setLocation(@RequestBody IcbmLocation location) { //   public IcbmLocation setLocation(@RequestBody IcbmLocation location) {
        System.out.println("Entering IcbmController::setNewLocation method...");

        return service.setLocation(location);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/getLocation", produces = "application/json")
    public IcbmLocation getLocation() {
        System.out.println("Entering IcbmController::getLocation method...");

        return service.getLocation();
    }

}
