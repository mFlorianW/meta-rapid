FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI += " \
    file://chrony.conf \
"

# Replace the upstream chrony.conf with our GPS+PPS configuration
do_install:append() {
    install -m 0644 ${UNPACKDIR}/chrony.conf ${D}${sysconfdir}/chrony.conf
}

FILES:${PN} += "${systemd_unitdir}/system/chronyd.service.d"
