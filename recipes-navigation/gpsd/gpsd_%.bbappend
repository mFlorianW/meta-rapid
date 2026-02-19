FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

inherit useradd

SRC_URI += " \
    file://gpsd.default \
    file://98-ttyAMA0.rules \
    file://99-gpsd-ttyAMA0.rules \
    file://gpsd.conf \
"

EXTRA_OESCONS:append = " \
    gpsd_user='gpsd' \
    gpsd_group='gpsd' \
"

USERADD_PACKAGES = "${PN}"
USERADD_PARAM:${PN} = "-rg gpsd -s /usr/sbin/nologin gpsd"
GROUPADD_PARAM:${PN} = "-r gpsd"

do_install:append(){
    install -d ${D}${sysconfdir}/default
    install -m 0644 ${UNPACKDIR}/gpsd.default ${D}${sysconfdir}/default

    install -d ${D}${sysconfdir}/udev/rules.d
    install -m 0644 ${UNPACKDIR}/98-ttyAMA0.rules ${D}${sysconfdir}/udev/rules.d/
    install -m 0644 ${UNPACKDIR}/99-gpsd-ttyAMA0.rules ${D}${sysconfdir}/udev/rules.d/

    install -d ${D}${systemd_unitdir}/system/gpsd.service.d
    install -m 0644 ${UNPACKDIR}/gpsd.conf ${D}${systemd_unitdir}/system/gpsd.service.d/gpsd.conf
}

FILES:${PN} += "${systemd_system_unitdir}/gpsd.service.d/gpsd.conf"
