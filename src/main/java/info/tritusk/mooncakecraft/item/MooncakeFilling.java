package info.tritusk.mooncakecraft.item;

import java.util.Locale;

public enum MooncakeFilling {

    /**
     * Simplified Chinese "莲蓉".
     */
    LOTUS_SEED_PASTE(6, 6.0F),

    /**
     * Simplified Chinese "豆沙".
     */
    SWEET_BEAN_PASTE(2, 4.0F),

    /**
     * Simplified Chinese "枣泥".
     */
    JUJUBE_PASTE(2, 4.0F),

    /**
     * Simplified Chinese "五仁".
     */
    FIVE_NUTS(1, 0.5F),

    /**
     * Simplified Chinese "蛋黄莲蓉".
     */
    LOTUS_SEED_PASTE_WITH_YOLK(10, 10.0F),

    /**
     * Simplified Chinese "双黄莲蓉".
     */
    LOTUS_SEED_PASTE_WITH_DOUBLE_YOLK(15, 15.0F);

    public static final MooncakeFilling[] VALUES = MooncakeFilling.values();

    final int hunger;
    final float saturation;
    final String localizationKey;

    MooncakeFilling(int hunger, float saturation) {
        this.hunger = hunger;
        this.saturation = saturation;
        this.localizationKey = this.name().toLowerCase(Locale.ENGLISH);
    }
}