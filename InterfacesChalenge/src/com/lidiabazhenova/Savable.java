package com.lidiabazhenova;

import java.util.List;


public interface Savable {
    List<String> write();
    void read(List<String> savedValues);
}
