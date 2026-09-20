package com.example.reto.component;


import com.example.reto.service.LiquidationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class LiquidationComponent implements CommandLineRunner {

    @Autowired
    private LiquidationService liquidacionService;

    @Override
    public void run(String... args) {

        double valorBase = 1000000;
        double porcentaje = 10;

        double tarifa = liquidacionService.calcularTarifa(
                valorBase,
                porcentaje
        );

        double liquidacion = liquidacionService.calcularLiquidacion(
                valorBase,
                porcentaje
        );

        System.out.println("===== SIMULADOR DE TARIFAS =====");
        System.out.println("Valor base: $" + valorBase);
        System.out.println("Porcentaje: " + porcentaje + "%");
        System.out.println("Tarifa: $" + tarifa);
        System.out.println("Liquidación total: $" + liquidacion);
    }
}
