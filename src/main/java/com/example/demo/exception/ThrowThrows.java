package com.example.demo.exception;
/*
Usi throw per creare e lanciare un’eccezione.
Usi try-catch per intercettare e gestire un’eccezione.
*/
public class ThrowThrows {
    public static void main(String[] args) {
        Persona p = new Persona();
        try {
            p.setEta(10);
            System.out.println("Eta' valida: "  + p.getEta());// Questo causerà il lancio dell'eccezione
        } catch (CustomException e) {
            System.out.println("Errore: " + e.getMessage());
        }
    }
    public static class Persona {
        private int eta;
        public int getEta() {
            return eta;
        }
        public void setEta(int eta) throws CustomException {
            if (eta < 0 || eta > 150) {
                throw new CustomException("Età non valida: " + eta);
            }
            this.eta = eta;
        }
    }
}