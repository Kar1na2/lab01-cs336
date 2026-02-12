package org.lab01-part1;

import org.pcap4j.core.*;
import org.pcap4j.packet.*;

/**
 *
 */
public class ProtocolParser {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        try {
            PcapHandle handle = Pcaps.openOffline("Part 1/tpncp_tcp.pcap");

            PcapHandle handle = Pcaps.openOffline("Part 1/tpncp_udp.pcap");

        } catch () {

        } finally {

        }
    }

    /**
     * This will parse {@link PcapHandle} handles for specific TCP packets
     *
     * @param handle
     */
    public static void TCPParser(PcapHandle handle) {

    }

    /**
     * This will parse {@link PcapHandle} handles for specific UDP packets
     *
     * @param handle
     */
    public static void UDPParser(PcapHandle handle) {

    }
}