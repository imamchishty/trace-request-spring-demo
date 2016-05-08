package com.emc.awg.demo.rest.controller;

import com.emc.awg.demo.model.Parcel;
import com.emc.awg.demo.model.SecretDocument;
import com.emc.awg.demo.rest.feign.client.ServiceClient;
import com.emc.awg.demo.rest.feign.client.ServiceClient13;
import com.shedhack.exception.core.BusinessException;
import com.shedhack.thread.context.annotation.ThreadContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by imamchishty on 20/04/2016.
 */
@RestController
public class DistrictController {

    private static final int DISTRICTS = 13;

    @Autowired
    private ServiceClient client;

    @Autowired
    private ServiceClient13 client13;

    AtomicInteger count = new AtomicInteger(0);

    AtomicBoolean error = new AtomicBoolean(false);

    @ThreadContext
    @RequestMapping(value = "/api/districts", method = RequestMethod.GET)
    ResponseEntity<Boolean> secret(@RequestParam(required = false) boolean errorFlag,
                                   @RequestParam(required = false) boolean shuffle) {

        count.set(0);
        error.set(errorFlag);

        List<String> districts = Arrays.asList("district1", "district2", "district3", "district4", "district5", "district6",
                "district7", "district8", "district9", "district10", "district11", "district12", "district13");

        if(shuffle)
        Collections.shuffle(districts);

        return new ResponseEntity<>(whichDistrict(new Parcel(new SecretDocument("we have someone on the inside"), districts)), HttpStatus.OK);
    }

    @ThreadContext
    @RequestMapping(value = "/api/district1/message", method = RequestMethod.POST)
    ResponseEntity<Boolean> district1(@RequestBody Parcel parcel) {
        return new ResponseEntity<>(whichDistrict(parcel), HttpStatus.OK);
    }

    @ThreadContext
    @RequestMapping(value = "/api/district2/message", method = RequestMethod.POST)
    ResponseEntity<Boolean> district2(@RequestBody Parcel parcel) {
        return new ResponseEntity<>(whichDistrict(parcel), HttpStatus.OK);
    }

    @ThreadContext
    @RequestMapping(value = "/api/district3/message", method = RequestMethod.POST)
    ResponseEntity<Boolean> district3(@RequestBody Parcel parcel) {
        return new ResponseEntity<>(whichDistrict(parcel), HttpStatus.OK);
    }

    @ThreadContext
    @RequestMapping(value = "/api/district4/message", method = RequestMethod.POST)
    ResponseEntity<Boolean> district4(@RequestBody Parcel parcel) {
        return new ResponseEntity<>(whichDistrict(parcel), HttpStatus.OK);
    }

    @ThreadContext
    @RequestMapping(value = "/api/district5/message", method = RequestMethod.POST)
    ResponseEntity<Boolean> district5(@RequestBody Parcel parcel) {
        return new ResponseEntity<>(whichDistrict(parcel), HttpStatus.OK);
    }

    @ThreadContext
    @RequestMapping(value = "/api/district6/message", method = RequestMethod.POST)
    ResponseEntity<Boolean> district6(@RequestBody Parcel parcel) {
        return new ResponseEntity<>(whichDistrict(parcel), HttpStatus.OK);
    }

    @ThreadContext
    @RequestMapping(value = "/api/district7/message", method = RequestMethod.POST)
    ResponseEntity<Boolean> district7(@RequestBody Parcel parcel) {
        return new ResponseEntity<>(whichDistrict(parcel), HttpStatus.OK);
    }

    @ThreadContext
    @RequestMapping(value = "/api/district8/message", method = RequestMethod.POST)
    ResponseEntity<Boolean> district8(@RequestBody Parcel parcel) {
        return new ResponseEntity<>(whichDistrict(parcel), HttpStatus.OK);
    }

    @ThreadContext
    @RequestMapping(value = "/api/district9/message", method = RequestMethod.POST)
    ResponseEntity<Boolean> district9(@RequestBody Parcel parcel) {
        return new ResponseEntity<>(whichDistrict(parcel), HttpStatus.OK);
    }

    @ThreadContext
    @RequestMapping(value = "/api/district10/message", method = RequestMethod.POST)
    ResponseEntity<Boolean> district10(@RequestBody Parcel parcel) {
        return new ResponseEntity<>(whichDistrict(parcel), HttpStatus.OK);
    }

    @ThreadContext
    @RequestMapping(value = "/api/district11/message", method = RequestMethod.POST)
    ResponseEntity<Boolean> district11(@RequestBody Parcel parcel) {
        return new ResponseEntity<>(whichDistrict(parcel), HttpStatus.OK);
    }

    @ThreadContext
    @RequestMapping(value = "/api/district12/message", method = RequestMethod.POST)
    ResponseEntity<Boolean> district12(@RequestBody Parcel parcel) {
        return new ResponseEntity<>(whichDistrict(parcel), HttpStatus.OK);
    }

    @ThreadContext
    @RequestMapping(value = "/api/district13/message", method = RequestMethod.POST)
    ResponseEntity<Boolean> district13(@RequestBody Parcel parcel) {

        if(error.get()) {
            throw new BusinessException.Builder("Secret message intercepted").build();
        }
        return new ResponseEntity<>(whichDistrict(parcel), HttpStatus.OK);
    }

    private Boolean whichDistrict(Parcel parcel) {

        if(count.get() >= DISTRICTS) {
            return Boolean.TRUE;
        }


        String district = parcel.getDistricts().get(count.getAndIncrement());

        switch (district){
            case "district1":
                return client.district1(parcel).getBody();

            case "district2":
                return client.district2(parcel).getBody();

            case "district3":
                return client.district3(parcel).getBody();

            case "district4":
                return client.district4(parcel).getBody();

            case "district5":
                return client.district5(parcel).getBody();

            case "district6":
                return client.district6(parcel).getBody();

            case "district7":
                return client.district7(parcel).getBody();

            case "district8":
                return client.district8(parcel).getBody();

            case "district9":
                return client.district9(parcel).getBody();

            case "district10":
                return client.district10(parcel).getBody();

            case "district11":
                return client.district11(parcel).getBody();

            case "district12":
                return client.district12(parcel).getBody();

            case "district13":
                return client13.district13(parcel).getBody();
            default:
                return Boolean.FALSE;
        }
    }
}
