package com.emc.awg.demo.exception;

import com.shedhack.exception.core.BusinessCode;

/**
 * <pre>
 *     Business Codes which are shared with clients.
 * </pre>
 */
public enum GlobalBusinessCodes implements BusinessCode {

    C001("District is uprising."),
    C002("Tribute not willing to participate.");

    private final String description;

    GlobalBusinessCodes(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }

    public String getCode() {
        return this.name();
    }
}
