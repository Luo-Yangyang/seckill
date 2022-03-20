package com.nowcoder.seckill.entity;

public class SerialNumber {

    private String name;

    private Integer value;

    private Integer step;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Integer getStep() {
        return step;
    }

    public void setStep(Integer step) {
        this.step = step;
    }

    @Override
    public String toString() {
        return "SerialNumber{" +
                "name='" + name + '\'' +
                ", value=" + value +
                ", step=" + step +
                '}';
    }
}