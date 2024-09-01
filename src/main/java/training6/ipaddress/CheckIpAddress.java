package training6.ipaddress;

public class CheckIpAddress {
    public static void main(String[] args) {
        System.out.println(checkIpAddress("192.168.100.1/16", "192.168.101.100"));
    }

    public static boolean checkIpAddress(String ip1, String ip2) {
        String[] ipPrefix = ip1.split("/");
        String[] ipSet1 = ipPrefix[0].split("\\.");
        String[] ipSet2 = ip2.split("\\.");

        long mask = 0xffffffffL << (32 - Long.parseLong(ipPrefix[1]));

        long lIp1 = ((Long.parseLong(ipSet1[0]) << 8 | Long.parseLong(ipSet1[1])) << 8
                | Long.parseLong(ipSet1[2])) << 8 | Long.parseLong(ipSet1[3]);

        long lIp2 = ((Long.parseLong(ipSet2[0]) << 8 | Long.parseLong(ipSet2[1])) << 8
                | Long.parseLong(ipSet2[2])) << 8 | Long.parseLong(ipSet2[3]);

        return (lIp1 & mask) == (lIp2 & mask);
    }
}
