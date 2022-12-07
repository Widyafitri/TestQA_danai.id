package com.adiwisista.qatest.utils;

public enum TestScenarios {

    //URL
    T1("TCC.001 Invalid URL"),
    T2("TCC.002 Valid URL"),
    T3("TCC.003 User Kosongkan Kode Perusahaan"),
    T4("TCC.004 User Kosongkan Username"),
    T5("TCC.005 User Kosongkan Password");


    private String testName;

    TestScenarios(String value) {
        testName = value;
    }

    public String getTestName() {
        return testName;
    }


}
