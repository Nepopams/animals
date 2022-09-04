package com.company.entities.plants;

import com.company.PropertiesIsland;
import com.company.entities.BaseEntity;
import com.company.entities.LiveObject;

//класс для растений
public class Plant extends BaseEntity {
    public static String icon = PropertiesIsland.getPlantIcon();
    public Plant() {
    }

    @Override
    public String getKind() {
        return "grass";
    }

    @Override
    public int getFood() {
        return 1;
    }
}
