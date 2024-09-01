package training.ipaddress;

public class CheckIpAddress {
    public static void main(String[] args) {
        System.out.println(checkIpAddress("192.168.100.1/16", "192.168.101.100"));
    }

    private static boolean checkIpAddress(String ip1, String ip2) {
        String[] ipIpPrefix = ip1.split("/");
        long mask = 0xffffffffL << (32 - Long.parseLong(ipIpPrefix[1]));
        String[] ipSplit1 = ipIpPrefix[0].split("\\.");
        long lIp1 = ((Long.parseLong(ipSplit1[0]) << 8 | Long.parseLong(ipSplit1[1])) << 8 |
                Long.parseLong(ipSplit1[2])) << 8 | Long.parseLong(ipSplit1[3]);
        String[] ipSplit2 = ip2.split("\\.");
        long lIp2 = ((Long.parseLong(ipSplit2[0]) << 8 | Long.parseLong(ipSplit2[1])) << 8 |
                Long.parseLong(ipSplit2[2])) << 8 | Long.parseLong(ipSplit2[3]);
        return (lIp1 & mask) == (lIp2 & mask);
    }
}
