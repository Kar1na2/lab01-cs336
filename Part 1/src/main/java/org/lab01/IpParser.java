package org.lab01;

import org.pcap4j.core.*;

/**
 * Class to run and parse pcap files
 */
public class IpParser {
    /**
     * First, fill in the todo! comments
     * in the methods "Ipv6Parser" and "Ipv4Parser"
     * then run the main method using
     * - ua3g_freeseating_ipv4.pcap
     * - ua3g_freeseating_ipv6.pcap
     * respectively and answer the questions listed on the assignment README
     *
     * @param args Command-line arguments (we do not need it)
     */
    public static void main(String[] args) {
        try {
            PcapHandle handle = Pcaps.openOffline("complete/ua3g_freeseating_ipv4.pcap");
            // Ipv4Parser(handle);

            PcapHandle handle2 = Pcaps.openOffline("complete/ua3g_freeseating_ipv6.pcap");
            // Ipv6Parser(handle2);
        } catch (PcapNativeException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * This will parse {@link PcapHandle} handles for specifically Ipv6 packets
     *
     * look at
     * - https://www.javadoc.io/static/org.pcap4j/pcap4j-distribution/1.8.2/org/pcap4j/packet/IpV6Packet.html
     * - https://www.javadoc.io/static/org.pcap4j/pcap4j-distribution/1.8.2/org/pcap4j/packet/IpV6Packet.IpV6Header.html
     * - https://www.javadoc.io/static/org.pcap4j/pcap4j-distribution/1.8.2/org/pcap4j/core/PcapHandle.html#getNextPacketEx()
     * - https://docs.oracle.com/javase/6/docs/api/java/net/Inet6Address.html
     *
     * @param handle {@link PcapHandle} handle
     */
    public static void Ipv6Parser(PcapHandle handle) {
        /**
         * todo!
         * Look through the documentations listed on top of the method and fetch the following information for
         * 10 packets
         * - Traffic Class
         * - Flow Label
         * - Hop Limit
         * - Source Address (how is it represented?)
         * - Destination Address
         * - Version
         */
    }

    /**
     * This will parse {@link PcapHandle} handles for specifically Ipv4 packets
     *
     * look at
     * - https://www.javadoc.io/static/org.pcap4j/pcap4j-distribution/1.8.2/org/pcap4j/core/PcapHandle.html#getNextPacketEx()
     * - https://www.javadoc.io/static/org.pcap4j/pcap4j-distribution/1.8.2/org/pcap4j/packet/IpV4Packet.html
     * - https://www.javadoc.io/static/org.pcap4j/pcap4j-distribution/1.8.2/org/pcap4j/packet/IpV4Packet.IpV4Header.html
     * - https://docs.oracle.com/javase/6/docs/api/java/net/Inet4Address.html?is-external=true
     *
     * @param handle {@link PcapHandle} handle
     */
    public static void Ipv4Parser(PcapHandle handle) {
        /**
         * todo!
         * Look through the documentations listed on top of the method and fetch the following information for
         * 10 packets
         * - Header length
         * - Type of Service
         * - Source Address (how is it represented?)
         * - Destination Address
         * - Identification
         * - Fragment Offset
         * - The payload or data
         * - Version
         */
    }
}