package com.epam.training.greeting.util;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class HostnameUtils {

  public static String getLocalAddress() throws UnknownHostException {
    InetAddress localHost = Inet4Address.getLocalHost();

    String hostAddress = localHost.getHostAddress();
    String hostName = localHost.getHostName();

    return String.format("%s - %s", hostAddress, hostName);
  }
}
