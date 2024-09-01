package org.ipaddress;

public class CheckIpAddress {
    public static void main(String[] args) {
        System.out.println(checkIpAddress("192.168.100.1/16", "192.168.101.100"));
    }
    //
    public static boolean checkIpAddress(String sidr, String ipAddress) {

        String[] ipWithSidr= sidr.split("/");
        int prefix = Integer.parseInt(ipWithSidr[1]);
        long mask = 0xffffffffL << (32 - prefix);

        String[] firstIp = ipWithSidr[0].split("\\.");
        long first = ((Long.parseLong(firstIp[0]) << 8 | Long.parseLong(firstIp[1])) << 8 |  Long.parseLong(firstIp[2])) << 8
                | Long.parseLong(firstIp[3]);
        System.out.println("first = " +Long.toBinaryString(first));
        System.out.println("mask = " +Long.toBinaryString(mask));
        String[] secondIp = ipAddress.split("\\.");
        long second = ((Long.parseLong(secondIp[0]) << 8 | Long.parseLong(secondIp[1])) << 8 |  Long.parseLong(secondIp[2])) << 8
                | Long.parseLong(secondIp[3]);
        System.out.println("second = " + Long.toBinaryString(second));

        return (first & mask) == (second & mask);
    }
}
