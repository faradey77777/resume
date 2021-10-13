package com.testing.resume.service;

import java.util.Locale;

public class NameService {

    public static NameService getInstance() {
        return new NameService();
    }

    public String convertName(String name) {
        return name.toUpperCase(Locale.ROOT);
    }
}
