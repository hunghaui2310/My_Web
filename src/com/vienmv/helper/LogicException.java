package com.vienmv.helper;

import org.apache.log4j.Logger;

public class LogicException extends Exception {
    private static final Logger logger = Logger.getLogger(LogicException.class);

    private String errorCode;
    private String description;

    public LogicException() {
        super();
    }


    public LogicException(String errorCode, String description) {
        super();
        this.errorCode = errorCode;
        this.description = description;
    }
    public LogicException(String description) {
        super();
        this.description = description;
    }
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
