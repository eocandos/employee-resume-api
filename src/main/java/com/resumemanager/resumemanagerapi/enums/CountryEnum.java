package com.resumemanager.resumemanagerapi.enums;

public enum CountryEnum {
    COLOMBIA(0),
    UNKNOWN(100);

    private Integer code;

    CountryEnum(Integer code) {
        this.code = code;
    }

    public static CountryEnum getValue(Integer id) {
        for(CountryEnum e : values()) {
            if(e.code.equals(id)) return e;
        }
        return UNKNOWN;
    }

    public Integer getCode() {
        return code;
    }

}

