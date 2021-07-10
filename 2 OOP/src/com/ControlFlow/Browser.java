package com.ControlFlow;

public class Browser {

    public void navigate (String address) {
        String ip = fidnIpAddress(address);
        String html = sendHttpAddress(ip);
        System.out.println(html);
    }

    private String fidnIpAddress(String address) {
        return "127.0.0.1";
    }
    private String sendHttpAddress(String ip) {
        return "<html></html>";
    }
}
