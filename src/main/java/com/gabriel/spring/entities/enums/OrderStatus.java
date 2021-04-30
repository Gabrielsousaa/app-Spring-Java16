package com.gabriel.spring.entities.enums;

public enum OrderStatus {
    
    WAITING_PAYMENT("WAITING_PAYMENT"),
    PAID("PAID"),
    SHIPPED("SHIPPED"),
    DELIVERED("DELIVERED"),
    CANCELED("CANCELED");
    
    private String code;

    private OrderStatus(String code) {
        this.code = code;
    }

    public String getCode(){
        return code;

    }

    public OrderStatus valueOfOrderStatus(String code){
        for (OrderStatus value : OrderStatus.values()) {
            if(value.getCode() == code){
                return value;
            }
            throw new IllegalArgumentException("Invalid OrderStatus code");
        }
        return null;

    }
    
}
