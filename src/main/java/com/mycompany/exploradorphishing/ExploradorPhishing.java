/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exploradorphishing;


import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Dlugo
 */
public class ExploradorPhishing {

    public static void main(String[] args) {
        
        Map<String, Integer> keywords = new HashMap<>();
        Map<String, Integer> keywordOccurrences = new HashMap<>();
        
        // Agregar palabras clave y sus puntajes
        
        keywords.put("Banco", 3);
        keywords.put("PayPal", 3);
        keywords.put("Correo electrónico", 3);
        keywords.put("Contraseña", 3);
        keywords.put("Actualización de seguridad", 2);
        keywords.put("Verificación de cuenta", 2);
        keywords.put("Phishing", 3);
        keywords.put("Fraude", 3);
        keywords.put("Spam", 2);
        keywords.put("Tarjeta de crédito", 2);
        keywords.put("Cuenta suspendida", 2);
        keywords.put("Oferta especial", 2);
        keywords.put("Ganador de premio", 2);
        keywords.put("Urgente", 3);
        keywords.put("Problema de facturación", 2);
        keywords.put("Restablecimiento de contraseña", 2);
        keywords.put("Soporte técnico", 2);
        keywords.put("Seguridad de la cuenta", 2);
        keywords.put("Procesamiento de pago", 2);
        keywords.put("Confirmación de pedido", 2);
        keywords.put("Promoción", 2);
        keywords.put("Descuento", 2);
        keywords.put("Banca en línea", 3);
        keywords.put("Compra sospechosa", 2);
        keywords.put("Verificación de identidad", 2);
        keywords.put("Recuperación de cuenta", 2);
        keywords.put("Google", 1);
        keywords.put("Apple", 1);
        keywords.put("Microsoft", 1);
        keywords.put("Amazon", 1);

        // Leer el archivo de texto
        String filePath = "C:\\texto_prueba.txt"; // Ruta del archivo a explorar
        int totalPoints = 0;


    }
}