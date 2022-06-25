package com.persistence.data;

import com.persistence.persistence.Item;
import com.persistence.persistence.ItemGroup;

import java.util.Arrays;
import java.util.List;

public class ItemGroupData {
    public static List<ItemGroup> itemgroups_data = Arrays.asList(
            new ItemGroup(10, "IG10"),
            new ItemGroup(44, "IG44"),
            new ItemGroup(55, "IG55"),
            new ItemGroup(66, "IG66")
    );
}
