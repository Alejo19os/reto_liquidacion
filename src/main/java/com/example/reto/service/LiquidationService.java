package com.example.reto.service;

import org.springframework.stereotype.Service;

@Service
public class LiquidationService {

    public double calcularTarifa(double valorBase, double porcentaje) {
        return valorBase * (porcentaje / 100);
    }

    public double calcularLiquidacion(double valorBase, double porcentaje) {
        double tarifa = calcularTarifa(valorBase, porcentaje);
        return valorBase + tarifa;
    }
}
