package com.enigma.api.inventory.models;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ItemRequestTest {

    @Test
    void getterSetterTest() {
        String name = "a";
        int price = 1;
        int unitId = 1;

        ItemRequest itemRequest = new ItemRequest();
        itemRequest.setName(name);
        itemRequest.setPrice(price);
        itemRequest.setUnitId(unitId);

        assertNotNull(itemRequest.getName());
        assertEquals(price, itemRequest.getPrice());
        assertEquals(unitId, itemRequest.getUnitId());
    }
}
