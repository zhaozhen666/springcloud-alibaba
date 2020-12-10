package com.zhao.sca.spi.impl;

import com.zhao.sca.spi.PrintService;

public class PrintServiceImpl implements PrintService {
    @Override
    public void printInfo() {
        System.out.println("hello world!");
    }
}
