package com.example.demostopwatch.demo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Service
public class DemoService {
    List<Integer> arrayList = new ArrayList<>();
    List<Integer> linkedList = new LinkedList<>();

    public void executeA_1() {
        for (int i = 0; i < 10_000_000; i++) {
            arrayList.add(i);
        }
    }

    public void executeB_1() {
        for (int i = 0; i < 10_000_000; i++) {
            linkedList.add(i);
        }
    }

    public void executeA_2() {
        for (int i = 0; i < 1_000; i++) {
            arrayList.add(500, 33);
        }
    }

    public void executeB_2() {
        for (int i = 0; i < 1_000_000; i++) {
            linkedList.add(500, 33);
        }
    }
}
