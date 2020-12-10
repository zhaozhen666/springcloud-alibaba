package com.zhao.sca.spi;

import org.apache.dubbo.common.extension.SPI;

@SPI("impl")
public interface PrintService {
    void printInfo();
}
