package com.composition.computer;

public class CPU {
    private String type;

    public CPU(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    // cpu 장착
    public void setCpu(String cpuName) {
        this.type = cpuName;
    }
}
