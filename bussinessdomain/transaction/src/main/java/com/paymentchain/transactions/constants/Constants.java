package com.paymentchain.transactions.constants;

public class Constants {

    public static class Status {
        private final String PENDIENTE = "01";
        private final String LIQUEDADA = "02";
        private final String RECHAZADA = "03";
        private final String CANCELADA = "04";
    }


    public static class Channel {
        private final String WEB = "WEB";
        private final String CAJERO = "CAJERO";
        private final String OFICINA = "OFICINA";
    }


}
