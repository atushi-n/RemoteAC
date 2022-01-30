package com.example.remoteac;


public enum Pattern {
    PowerOFF(new int[]{3405, 1652, 483, 1195, 483, 1195, 483, 387, 483, 387, 483, 387, 483, 1195, 483, 387, 483, 387, 483, 1195, 483, 1195, 483, 387, 483, 1195, 483, 387, 483, 387, 483, 1195, 483, 1195, 483, 387, 483, 1195, 483, 1195, 483, 326, 483, 387, 483, 1195, 483, 387, 483, 326, 483, 1195, 483, 326, 483, 387, 483, 326, 483, 387, 483, 326, 483, 387, 483, 326, 483, 387, 483, 326, 483, 387, 483, 326, 483, 387, 483, 326, 483, 326, 483, 326, 483, 8940, 3405, 1652, 483, 1195, 483, 1195, 483, 387, 483, 387, 483, 326, 483, 1195, 483, 326, 483, 326, 483, 1195, 483, 1195, 483, 387, 483, 1195, 483, 326, 483, 387, 483, 1195, 483, 1195, 483, 326, 483, 1195, 483, 1195, 483, 326, 483, 387, 483, 1195, 483, 387, 483, 326, 483, 1195, 483, 387, 483, 387, 483, 387, 483, 387, 483, 387, 483, 387, 483, 326, 483, 387, 483, 326, 483, 387, 483, 326, 483, 387, 483, 387, 483, 387, 483, 387, 483, 387, 483, 387, 483, 387, 483, 387, 483, 387, 483, 387, 483, 387, 483, 387, 483, 387, 483, 387, 483, 387, 483, 1195, 483, 1195, 483, 387, 483, 1195, 483, 387, 483, 387, 483, 387, 483, 387, 483, 1195, 483, 1195, 483, 387, 483, 387, 483, 387, 483, 387, 483, 1195, 483, 1195, 483, 387, 483, 1195, 483, 326, 483, 387, 483, 326, 483, 1195, 483, 326, 483, 1195, 483, 1195, 483, 387, 483, 387, 483, 1195, 483, 1195, 483, 387, 483, 326, 483, 326, 483, 387, 483, 387, 483, 326, 483, 387, 483, 387, 483, 387, 483, 387, 483, 387, 483, 387, 483, 326, 483, 387, 483, 387, 483, 387, 483, 387, 483, 387, 483, 326, 483, 387, 483, 326, 483, 326, 483, 387, 483, 326, 483, 326, 483, 326, 483, 326, 483, 326, 483, 387, 483, 326, 483, 326, 483, 387, 483, 326, 483, 387, 483, 326, 483, 326, 483, 1195, 483, 387, 483, 387, 483, 387, 483, 387, 483, 387, 483, 326, 483, 326, 483, 326, 483, 326, 483, 326, 483, 326, 483, 326, 483, 326, 483, 326, 483, 1195, 483, 326, 483, 326, 483, 326, 483, 326, 483, 326, 483, 326, 483, 326, 483, 326, 483, 326, 483, 326, 483, 326, 483, 1195, 483})
    ,
    On26Power1(new int[]{3499, 1650, 496, 1222, 496, 1222, 496, 364, 496, 364, 496, 364, 496, 1222, 496, 364, 496, 364, 496, 1222, 496, 1222, 496, 364, 496, 1222, 496, 364, 496, 364, 496, 1222, 496, 1222, 496, 364, 496, 1222, 496, 1222, 496, 364, 496, 364, 496, 1222, 496, 364, 496, 364, 496, 1222, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 1222, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 1222, 496, 1222, 496, 364, 496, 364, 496, 364, 496, 364, 496, 1222, 496, 364, 496, 1222, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 1222, 496, 1222, 496, 364, 496, 1222, 496, 1222, 496, 364, 496, 364, 496, 1222, 496, 364, 496, 364, 496, 1222, 496, 364, 496, 364, 496, 1222, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 1222, 496, 1222, 496, 364, 496, 1222, 496, 364, 496, 1222, 496, 1222, 496, 13242, 3499, 1650, 496, 1222, 496, 1222, 496, 364, 496, 364, 496, 364, 496, 1222, 496, 364, 496, 364, 496, 1222, 496, 1222, 496, 364, 496, 1222, 496, 364, 496, 364, 496, 1222, 496, 1222, 496, 364, 496, 1222, 496, 1222, 496, 364, 496, 364, 496, 1222, 496, 364, 496, 364, 496, 1222, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 1222, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 1222, 496, 1222, 496, 364, 496, 364, 496, 364, 496, 364, 496, 1222, 496, 364, 496, 1222, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 1222, 496, 1222, 496, 364, 496, 1222, 496, 1222, 496, 364, 496, 364, 496, 1222, 496, 364, 496, 364, 496, 1222, 496, 364, 496, 364, 496, 1222, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 364, 496, 1222, 496, 1222, 496, 364, 496, 1222, 496, 364, 496, 1222, 496, 1222, 496});

    private int[] pattern;

    Pattern(int[] pattern) {
        this.pattern = pattern;
    }

    public int[] getP() {
        return this.pattern;
    }


}