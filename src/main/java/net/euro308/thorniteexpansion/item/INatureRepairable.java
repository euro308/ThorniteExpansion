package net.euro308.thorniteexpansion.item;

public interface INatureRepairable {
    // Optional method to customize repair rate per item
    default int getNatureRepairAmount() {
        return 1; // Default repair amount
    }
}
