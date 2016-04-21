package com.emc.awg.demo.rest.feign.client;

import com.emc.awg.demo.model.Parcel;
import com.emc.awg.demo.rest.feign.FeignConfiguration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@org.springframework.cloud.netflix.feign.FeignClient(name = "${account.service.name}", configuration =  FeignConfiguration.class)
public interface ServiceClient {

    @RequestMapping(value = "/api/accounts/{id}/balance", method = RequestMethod.GET)
    ResponseEntity<Integer> getBalance(@PathVariable("id") long id);

    @RequestMapping(value = "/api/district1/message", method = RequestMethod.POST, consumes = "application/json")
    ResponseEntity<Boolean> district1(@RequestBody Parcel parcel);

    @RequestMapping(value = "/api/district2/message", method = RequestMethod.POST, consumes = "application/json")
    ResponseEntity<Boolean> district2(@RequestBody Parcel parcel);

    @RequestMapping(value = "/api/district3/message", method = RequestMethod.POST, consumes = "application/json")
    ResponseEntity<Boolean> district3(Parcel parcel);

    @RequestMapping(value = "/api/district4/message", method = RequestMethod.POST, consumes = "application/json")
    ResponseEntity<Boolean> district4(Parcel parcel);

    @RequestMapping(value = "/api/district5/message", method = RequestMethod.POST, consumes = "application/json")
    ResponseEntity<Boolean> district5(Parcel parcel);

    @RequestMapping(value = "/api/district6/message", method = RequestMethod.POST, consumes = "application/json")
    ResponseEntity<Boolean> district6(Parcel parcel);

    @RequestMapping(value = "/api/district7/message", method = RequestMethod.POST, consumes = "application/json")
    ResponseEntity<Boolean> district7(Parcel parcel);

    @RequestMapping(value = "/api/district8/message", method = RequestMethod.POST, consumes = "application/json")
    ResponseEntity<Boolean> district8(Parcel parcel);

    @RequestMapping(value = "/api/district9/message", method = RequestMethod.POST, consumes = "application/json")
    ResponseEntity<Boolean> district9(Parcel parcel);

    @RequestMapping(value = "/api/district10/message", method = RequestMethod.POST, consumes = "application/json")
    ResponseEntity<Boolean> district10(Parcel parcel);

    @RequestMapping(value = "/api/district11/message", method = RequestMethod.POST, consumes = "application/json")
    ResponseEntity<Boolean> district11(Parcel parcel);

    @RequestMapping(value = "/api/district12/message", method = RequestMethod.POST, consumes = "application/json")
    ResponseEntity<Boolean> district12(Parcel parcel);

    @RequestMapping(value = "/api/district5/message", method = RequestMethod.POST, consumes = "application/json")
    ResponseEntity<Boolean> district13(Parcel parcel);
}
