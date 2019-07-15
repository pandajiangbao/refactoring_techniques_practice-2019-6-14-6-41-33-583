package com.tws.refactoring.extract_variable;

public class BannerRender {
    String renderBanner(String platform, String browser) {
        boolean onMac = platform.toUpperCase().contains("MAC");
        boolean isIe = browser.toUpperCase().contains("IE");
        if (onMac && isIe) {
            return "IE on Mac?";
        }
        return "banner";
    }
}
