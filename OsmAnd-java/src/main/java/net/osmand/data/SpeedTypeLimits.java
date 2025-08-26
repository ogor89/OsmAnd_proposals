package net.osmand.data;

import java.util.HashMap;
import java.util.Map;

public class SpeedTypeLimits {
    public static final Map<String, Float> speedTypeMap = new HashMap<>();

    /*
     * Limits based on https://en.wikipedia.org/wiki/Speed_limits_by_country#Countries
     */
    static {
        speedTypeMap.put("AL:urban", 40f); // Albania
        speedTypeMap.put("AL:rural", 80f);
        speedTypeMap.put("AR:urban", 40f); // Argentina
        speedTypeMap.put("AR:rural", 80f);
        speedTypeMap.put("AU:urban", 40f); // Australia
        speedTypeMap.put("AU:rural", 100f);
        speedTypeMap.put("AT:urban", 50f); // Austria
        speedTypeMap.put("AT:rural", 100f);
        speedTypeMap.put("AZ:urban", 40f); // Azerbaijan
        speedTypeMap.put("AZ:rural", 0f);
        speedTypeMap.put("BD:urban", 40f); // Bangladesh
        speedTypeMap.put("BD:rural", 80f);
        speedTypeMap.put("BH:urban", 50f); // Bahrain
        speedTypeMap.put("BH:rural", 90f);
        speedTypeMap.put("BY:urban", 60f); // Belarus
        speedTypeMap.put("BY:rural", 90f);
        speedTypeMap.put("BE:urban", 50f); // Belgium
        speedTypeMap.put("BE:rural", 90f);
        speedTypeMap.put("BA:urban", 50f); // Bosnia and Herzegovina
        speedTypeMap.put("BA:rural", 80f);
        speedTypeMap.put("BR:urban", 40f); // Brazil
        speedTypeMap.put("BR:rural", 80f);
        speedTypeMap.put("BN:urban", 50f); // Brunei
        speedTypeMap.put("BN:rural", 80f);
        speedTypeMap.put("BG:urban", 50f); // Bulgaria
        speedTypeMap.put("BG:rural", 90f);
        speedTypeMap.put("CA:urban", 50f); // Canada
        speedTypeMap.put("CA:rural", 60f);
        speedTypeMap.put("CL:urban", 30f); // Chile
        speedTypeMap.put("CL:rural", 90f);
        speedTypeMap.put("CN:urban", 30f); // China
        speedTypeMap.put("CN:rural", 80f);
        speedTypeMap.put("HK:urban", 50f); // Hong Kong
        speedTypeMap.put("HK:rural", 70f);
        speedTypeMap.put("MO:urban", 20f); // Macau
        speedTypeMap.put("MO:rural", 0f);
        speedTypeMap.put("TW:urban", 40f); // Taiwan
        speedTypeMap.put("TW:rural", 80f);
        speedTypeMap.put("CR:urban", 45f); // Costa Rica
        speedTypeMap.put("CR:rural", 80f);
        speedTypeMap.put("HR:urban", 50f); // Croatia
        speedTypeMap.put("HR:rural", 80f);
        speedTypeMap.put("CY:urban", 30f); // Cyprus
        speedTypeMap.put("CY:rural", 100f);
        speedTypeMap.put("CZ:urban", 50f); // Czech Republic
        speedTypeMap.put("CZ:rural", 90f);
        speedTypeMap.put("DK:urban", 50f); // Denmark
        speedTypeMap.put("DK:rural", 80f);
        speedTypeMap.put("FO:urban", 50f); // Faroe Islands
        speedTypeMap.put("FO:rural", 80f);
        speedTypeMap.put("GL:urban", 40f); // Greenland
        speedTypeMap.put("GL:rural", 0f);
        speedTypeMap.put("EE:urban", 50f); // Estonia
        speedTypeMap.put("EE:rural", 90f);
        speedTypeMap.put("EG:urban", 60f); // Egypt
        speedTypeMap.put("EG:rural", 90f);
        speedTypeMap.put("FI:urban", 50f); // Finland
        speedTypeMap.put("FI:rural", 80f);
        speedTypeMap.put("AX:urban", 50f); // Åland
        speedTypeMap.put("AX:rural", 70f);
        speedTypeMap.put("FR:urban", 50f); // France
        speedTypeMap.put("FR:rural", 80f);
        speedTypeMap.put("GE:urban", 60f); // Georgia
        speedTypeMap.put("GE:rural", 80f);
        speedTypeMap.put("DE:urban", 50f); // Germany
        speedTypeMap.put("DE:rural", 80f);
        speedTypeMap.put("GR:urban", 50f); // Greece
        speedTypeMap.put("GR:rural", 80f);
        speedTypeMap.put("HU:urban", 50f); // Hungary
        speedTypeMap.put("HU:rural", 90f);
        speedTypeMap.put("IS:urban", 50f); // Iceland
        speedTypeMap.put("IS:rural", 90f);
        speedTypeMap.put("IN:urban", 50f); // India
        speedTypeMap.put("IN:rural", 60f);
        speedTypeMap.put("ID:urban", 40f); // Indonesia
        speedTypeMap.put("ID:rural", 80f);
        speedTypeMap.put("IR:urban", 50f); // Iran
        speedTypeMap.put("IR:rural", 70f);
        speedTypeMap.put("IE:urban", 50f); // Ireland
        speedTypeMap.put("IE:rural", 80f);
        speedTypeMap.put("IL:urban", 50f); // Israel
        speedTypeMap.put("IL:rural", 90f);
        speedTypeMap.put("IT:urban", 50f); // Italy
        speedTypeMap.put("IT:rural", 90f);
        speedTypeMap.put("JP:urban", 30f); // Japan
        speedTypeMap.put("JP:rural", 60f);
        speedTypeMap.put("JO:urban", 60f); // Jordan
        speedTypeMap.put("JO:rural", 80f);
        speedTypeMap.put("KZ:urban", 60f); // Kazakhstan
        speedTypeMap.put("KZ:rural", 0f);
        speedTypeMap.put("KR:urban", 30f); // South Korea
        speedTypeMap.put("KR:rural", 80f);
        speedTypeMap.put("LV:urban", 50f); // Latvia
        speedTypeMap.put("LV:rural", 80f);
        speedTypeMap.put("LB:urban", 50f); // Lebanon
        speedTypeMap.put("LB:rural", 0f);
        speedTypeMap.put("LI:urban", 50f); // Liechtenstein
        speedTypeMap.put("LI:rural", 0f);
        speedTypeMap.put("LT:urban", 50f); // Lithuania
        speedTypeMap.put("LT:rural", 90f);
        speedTypeMap.put("LU:urban", 50f); // Luxembourg
        speedTypeMap.put("LU:rural", 90f);
        speedTypeMap.put("MK:urban", 50f); // North Macedonia
        speedTypeMap.put("MK:rural", 0f);
        speedTypeMap.put("MY:urban", 30f); // Malaysia
        speedTypeMap.put("MY:rural", 70f);
        speedTypeMap.put("MT:urban", 30f); // Malta
        speedTypeMap.put("MT:rural", 0f);
        speedTypeMap.put("MX:urban", 50f); // Mexico
        speedTypeMap.put("MX:rural", 80f);
        speedTypeMap.put("MD:urban", 50f); // Moldova
        speedTypeMap.put("MD:rural", 90f);
        speedTypeMap.put("MA:urban", 40f); // Morocco
        speedTypeMap.put("MA:rural", 100f);
        speedTypeMap.put("NL:urban", 50f); // Netherlands
        speedTypeMap.put("NL:rural", 80f);
        speedTypeMap.put("NZ:urban", 30f); // New Zealand
        speedTypeMap.put("NZ:rural", 60f);
        speedTypeMap.put("NO:urban", 50f); // Norway
        speedTypeMap.put("NO:rural", 80f);
        speedTypeMap.put("PK:urban", 40f); // Pakistan
        speedTypeMap.put("PK:rural", 100f);
        speedTypeMap.put("PE:urban", 30f); // Peru
        speedTypeMap.put("PE:rural", 100f);
        speedTypeMap.put("PH:urban", 20f); // Philippines
        speedTypeMap.put("PH:rural", 40f);
        speedTypeMap.put("PL:urban", 50f); // Poland
        speedTypeMap.put("PL:rural", 90f);
        speedTypeMap.put("PT:urban", 50f); // Portugal
        speedTypeMap.put("PT:rural", 90f);
        speedTypeMap.put("RO:urban", 50f); // Romania
        speedTypeMap.put("RO:rural", 90f);
        speedTypeMap.put("RU:urban", 60f); // Russia
        speedTypeMap.put("RU:rural", 90f);
        speedTypeMap.put("SA:urban", 0f); // Saudi Arabia
        speedTypeMap.put("SA:rural", 0f);
        speedTypeMap.put("RS:urban", 50f); // Serbia
        speedTypeMap.put("RS:rural", 80f);
        speedTypeMap.put("SG:urban", 50f); // Singapore
        speedTypeMap.put("SG:rural", 60f);
        speedTypeMap.put("SK:urban", 50f); // Slovakia
        speedTypeMap.put("SK:rural", 90f);
        speedTypeMap.put("SI:urban", 50f); // Slovenia
        speedTypeMap.put("SI:rural", 80f);
        speedTypeMap.put("ZA:urban", 60f); // South Africa
        speedTypeMap.put("ZA:rural", 80f);
        speedTypeMap.put("ES:urban", 50f); // Spain
        speedTypeMap.put("ES:rural", 80f);
        speedTypeMap.put("SE:urban", 50f); // Sweden
        speedTypeMap.put("SE:rural", 70f);
        speedTypeMap.put("CH:urban", 50f); // Switzerland
        speedTypeMap.put("CH:rural", 80f);
        speedTypeMap.put("TH:urban", 60f); // Thailand
        speedTypeMap.put("TH:rural", 100f);
        speedTypeMap.put("TR:urban", 50f); // Turkey
        speedTypeMap.put("TR:rural", 85f);
        speedTypeMap.put("UA:urban", 50f); // Ukraine
        speedTypeMap.put("UA:rural", 90f);
        speedTypeMap.put("AE:urban", 80f); // United Arab Emirates
        speedTypeMap.put("AE:rural", 120f);
        // United Kingdom
        speedTypeMap.put("GB:urban", 48f); // 30 mph
        speedTypeMap.put("GB:rural", 96f); // 60 mph
        speedTypeMap.put("GI:urban", 30f); // Gibraltar
        speedTypeMap.put("GI:rural", 0f);
        // Isle of Man
        speedTypeMap.put("IM:urban", 48f); // 30 mph
        speedTypeMap.put("IM:rural", 0f);
        // United States
        speedTypeMap.put("US:urban", 32f); // 20 mph
        speedTypeMap.put("US:rural", 80f); // 50 mph
        speedTypeMap.put("VE:urban", 40f); // Venezuela
        speedTypeMap.put("VE:rural", 60f);
        speedTypeMap.put("VN:urban", 50f); // Vietnam
        speedTypeMap.put("VN:rural", 90f);
        speedTypeMap.put("ZW:urban", 60f); // Zimbabwe
        speedTypeMap.put("ZW:rural", 0f);
    }
}
