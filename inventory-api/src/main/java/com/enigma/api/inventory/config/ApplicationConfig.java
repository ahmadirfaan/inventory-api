package com.enigma.api.inventory.config;

import com.enigma.api.inventory.entities.Item;
import com.enigma.api.inventory.entities.Stock;
import com.enigma.api.inventory.entities.Unit;
import com.enigma.api.inventory.models.ItemRequest;
import com.enigma.api.inventory.models.StockRequest;
import com.enigma.api.inventory.models.UnitModel;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.modelmapper.spi.MatchingStrategy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // berfungsi untuk menampung beans(Global" Variable Object pada kode)
public class ApplicationConfig {

    @Bean
    public ModelMapper modelMapper() {
        ModelMapper modelMapper = new ModelMapper();

        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT); // DIGUNAKAN UNTUK BENAR-BENAR MEMBUAT NAMA FIELD OBJEKNYA HARUS SAMA

        modelMapper.typeMap(UnitModel.class, Unit.class).addMappings(mapper -> {
            mapper.skip(Unit::setId);
        });
        return modelMapper;
    }

}
