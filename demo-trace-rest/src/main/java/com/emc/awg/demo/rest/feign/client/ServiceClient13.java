package com.emc.awg.demo.rest.feign.client;

import com.emc.awg.demo.model.Parcel;
import com.emc.awg.demo.rest.feign.FeignConfiguration;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "${account.service.name}", configuration =  FeignConfiguration.class, fallback = Fallback.class)
public interface ServiceClient13 {

    @RequestMapping(value = "/api/district13/message", method = RequestMethod.POST, consumes = "application/json")
    ResponseEntity<Boolean> district13(Parcel parcel);
}
