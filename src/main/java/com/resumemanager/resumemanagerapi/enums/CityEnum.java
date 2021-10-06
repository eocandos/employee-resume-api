package com.resumemanager.resumemanagerapi.enums;

public enum CityEnum {
    BOGOTA(0),
    MEDELLIN(1),
    CALI(2),
    BARRANQUILLA(3),
    BUCARAMANGA(4),
    VALLEDUPAR(5),
    UNKNOWN(100);

    private Integer code;

    CityEnum(Integer code) {
        this.code = code;
    }

    public static CityEnum getValue(Integer id) {
        for(CityEnum e : values()) {
            if(e.code.equals(id)) return e;
        }
        return UNKNOWN;
    }

    public Integer getCode() {
        return code;
    }

}

