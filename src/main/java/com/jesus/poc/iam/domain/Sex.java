
package com.jesus.poc.iam.domain;
public enum Sex {
    MALE("M"), FEMALE("F"), UNDEFINED("U");

    private String label;
    private Sex(String label) {
        this.label = label;
    }

    public static Sex findByLabel(String label) {
        for (Sex s: Sex.values()) {
            if (s.label.equalsIgnoreCase(label)) {
                return s;
            }
        }
        return Sex.UNDEFINED;
    }
}
