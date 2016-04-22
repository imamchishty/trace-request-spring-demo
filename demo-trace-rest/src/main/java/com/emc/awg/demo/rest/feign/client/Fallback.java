package com.emc.awg.demo.rest.feign.client;

import com.emc.awg.demo.model.Parcel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class Fallback implements ServiceClient13{


    public ResponseEntity<Boolean> district13(Parcel parcel) {
        return backup();
    }

    private ResponseEntity<Boolean> backup() {
        return new ResponseEntity<>(Boolean.TRUE, HttpStatus.OK);
    }
}
