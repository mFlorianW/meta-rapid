DESCRIPTION = "Develop package group for the Rapid Laptimer"
LICENCE = "CLOSED"
SUMMARY = "This package group adds various packages for development to an image to run the rapid laptimer"

inherit packagegroup

RDEPENDS:${PN} = " \
    lsof \
    picocom \
    dnsmasq \
    gps-utils \
    pps-tools \
    vim \
    util-linux \
    chronyc \
    htop \
    can-utils \
"
